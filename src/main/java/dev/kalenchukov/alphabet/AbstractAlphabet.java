/*
 * Copyright © 2022-2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.kalenchukov.alphabet;

import dev.kalenchukov.stringi.Stringi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * Класс абстрактного алфавита.
 *
 * @author Алексей Каленчуков
 */
public abstract class AbstractAlphabet implements Alphabetical
{
	/**
	 * Буквы алфавита.
	 */
	@Unmodifiable
	@NotNull
	private final List<@NotNull Character> letters;

	/**
	 * Конструктор для {@code AbstractAlphabet}.
	 *
	 * @param letters буквы алфавита.
	 * @throws NullPointerException если в качестве {@code letters} передан {@code null}.
	 */
	protected AbstractAlphabet(@NotNull final List<@NotNull Character> letters)
	{
		this.letters = Objects.requireNonNull(letters);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> toList()
	{
		return this.letters;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param from {@inheritDoc}
	 * @param to {@inheritDoc}
	 * @return {@inheritDoc}
	 * @throws IllegalArgumentException если {@code from} больше {@code to}.
	 * @throws IndexOutOfBoundsException если {@code from} или {@code to} выходят за пределы количества букв в алфавите.
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> toList(final int from, final int to)
	{
		if (from > to) {
			throw new IllegalArgumentException();
		}

		if (from < 1 || to > this.letters.size()) {
			throw new IndexOutOfBoundsException();
		}

		return Collections.unmodifiableList(this.letters.subList(from - 1, to));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param position {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Nullable
	@Override
	public Character get(final int position)
	{
		try {
			return this.letters.get(position - 1);
		}
		catch (IndexOutOfBoundsException exception) {
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	public char getFirst()
	{
		return this.letters.get(0);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	public char getLast()
	{
		return this.letters.get(this.letters.size() - 1);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 * @throws NullPointerException если в качестве {@code string} передан {@code null}.
	 */
	@Override
	public boolean allMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(Stringi.toCharArray(string))
					 .allMatch(this.letters::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 * @throws NullPointerException если в качестве {@code string} передан {@code null}.
	 */
	@Override
	public boolean anyMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(Stringi.toCharArray(string))
					 .anyMatch(this.letters::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 * @throws NullPointerException если в качестве {@code string} передан {@code null}.
	 */
	@Override
	public boolean noneMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(Stringi.toCharArray(string))
					 .noneMatch(this.letters::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param letter {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean contains(final char letter)
	{
		return this.letters.contains(letter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param letter {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Nullable
	@Override
	public Integer getPosition(final char letter)
	{
		if (this.letters.contains(letter)) {
			return this.letters.indexOf(letter) + 1;
		}

		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getReverse()
	{
		List<Character> alphabetReverse = new ArrayList<>(this.letters.size());

		for (int i = this.letters.size() - 1; i >= 0; i--) {
			alphabetReverse.add(this.letters.get(i));
		}

		return Collections.unmodifiableList(alphabetReverse);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getShuffle()
	{
		final int coefficient = (int) (this.letters.size() * 2.5);
		final List<Character> letters = new ArrayList<>(this.letters);

		for (int iterationShuffle = 0; iterationShuffle < coefficient; iterationShuffle++)
		{
			int rndIndexFrom = ThreadLocalRandom.current().nextInt(this.letters.size());
			int rndIndexIn = ThreadLocalRandom.current().nextInt(this.letters.size());
			final char charTemp = letters.get(rndIndexIn);

			letters.set(rndIndexIn, letters.get(rndIndexFrom));
			letters.set(rndIndexFrom, charTemp);
		}

		return Collections.unmodifiableList(letters);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param count {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getRandom(final int count)
	{
		final List<Character> letters = new ArrayList<>(count);

		for (int i = 1; i <= count; i++) {
			final int rndIndex = ThreadLocalRandom.current().nextInt(this.letters.size());
			letters.add(this.get(rndIndex + 1));
		}

		return Collections.unmodifiableList(letters);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@NotNull
	@Override
	public String clearMismatches(@NotNull final String string)
	{
		StringBuilder newString = new StringBuilder();

		Stream.of(Stringi.toCharArray(string)).forEach(character -> {
			if (this.letters.contains(character)) {
				newString.append(character);
			}
		});

		return newString.toString();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@NotNull
	@Override
	public String clearMatches(@NotNull final String string)
	{
		StringBuilder newString = new StringBuilder();

		Stream.of(Stringi.toCharArray(string)).forEach(character -> {
			if (!this.letters.contains(character)) {
				newString.append(character);
			}
		});

		return newString.toString();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
	@NotNull
	@Override
	public Map<@NotNull Character, @NotNull Integer> statistics(@NotNull final String string)
	{
		Map<Character, Integer> statistics = new HashMap<>(this.letters.size());

		this.letters.forEach(letter -> statistics.put(letter, 0));

		Arrays.stream(Stringi.toCharArray(string))
			  .forEach(symbol -> {
					if (statistics.containsKey(symbol)) {
						statistics.put(symbol, statistics.get(symbol) + 1);
					}
			  });

		return Collections.unmodifiableMap(statistics);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 * @throws NullPointerException если в качестве {@code string} передан {@code null}.
	 */
	@Override
	public boolean isSorted(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		return this.isSortedAsc(string) || this.isSortedDesc(string);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 * @throws NullPointerException если в качестве {@code string} передан {@code null}.
	 */
	@Override
	public boolean isSortedAsc(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (!this.allMatch(string)) {
			return false;
		}

		if (string.length() == 1) {
			return true;
		}

		int lastIndex = -1;

		for (char digit : string.toCharArray())
		{
			int nextIndex = this.letters.indexOf(digit);

			if (lastIndex > nextIndex) {
				return false;
			}

			lastIndex = nextIndex;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 * @throws NullPointerException если в качестве {@code string} передан {@code null}.
	 */
	@Override
	public boolean isSortedDesc(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (!this.allMatch(string)) {
			return false;
		}

		if (string.length() == 1) {
			return true;
		}

		int lastIndex = this.letters.size() + 1;

		for (char digit : string.toCharArray())
		{
			int nextIndex = this.letters.indexOf(digit);

			if (lastIndex < nextIndex) {
				return false;
			}

			lastIndex = nextIndex;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@NotNull
	@Override
	public Character @NotNull [] toArray()
	{
		return this.letters.toArray(Character[]::new);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param separator {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	@NotNull
	public String toString(@NotNull final String separator)
	{
		return Stringi.glue(this.letters, separator);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	@NotNull
	public String toString()
	{
		return this.toString("");
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param obj {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean equals(@Nullable final Object obj)
	{
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Alphabetical)) {
			return false;
		}

		final Alphabetical alphabet = (Alphabetical) obj;

		if (!Objects.equals(this.toList(), alphabet.toList())) {
			return false;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	public int hashCode()
	{
		return this.toList().hashCode();
	}
}
