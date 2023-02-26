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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Класс абстрактного алфавита.
 */
public abstract class AbstractAlphabet implements Alphabetical
{
	/**
	 * Буквы алфавита.
	 */
	@NotNull
	private final List<@NotNull Character> letters;

	/**
	 * Конструктор для {@code AbstractAlphabet}.
	 *
	 * @param letters буквы алфавита.
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
	public List<@NotNull Character> get()
	{
		return Collections.unmodifiableList(this.letters);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param from {@inheritDoc}
	 * @param to {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> get(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer from,
										@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer to)
	{
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);

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
	public Character getLetter(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer position)
	{
		Objects.requireNonNull(position);

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
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean allMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(this.stringToArrayCharacter(string))
					 .allMatch(this.letters::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean anyMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(this.stringToArrayCharacter(string))
					 .anyMatch(this.letters::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean noneMatch(@NotNull final String string)
	{
		Objects.requireNonNull(string);

		if (string.isEmpty()) {
			return false;
		}

		return Arrays.stream(this.stringToArrayCharacter(string))
					 .noneMatch(this.letters::contains);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param letter {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean contains(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

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
	public Integer getPosition(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

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
	@NotNull
	@Unmodifiable
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
	@NotNull
	@Unmodifiable
	@Override
	public List<@NotNull Character> getShuffle()
	{
		final int coefficient = (int) (this.letters.size() * 2.5);

		List<Character> letters = new ArrayList<>(this.letters);
		Random random = new Random();

		for (int iterationShuffle = 0; iterationShuffle < coefficient; iterationShuffle++)
		{
			int indexFrom = random.nextInt(this.letters.size());
			int indexIn = random.nextInt(this.letters.size());

			final char charTemp = letters.get(indexIn);

			letters.set(indexIn, letters.get(indexFrom));
			letters.set(indexFrom, charTemp);
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
	public List<@NotNull Character> getRandom(@NotNull @Range(from = 0, to = Integer.MAX_VALUE) final Integer count)
	{
		Objects.requireNonNull(count);

		List<Character> letters = new ArrayList<>(count);
		Random random = new Random();

		for (int iteration = 1; iteration <= count; iteration++)
		{
			final int rnd = random.nextInt(this.letters.size()) + 1;

			letters.add(this.getLetter(rnd));
		}

		return Collections.unmodifiableList(letters);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param value {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@NotNull
	@Override
	public String clear(@NotNull final String value)
	{
		StringBuilder string = new StringBuilder();

		Stream.of(this.stringToArrayCharacter(value)).forEach(character -> {
			if (this.letters.contains(character)) {
				string.append(character);
			}
		});

		return string.toString();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@NotNull
	@Override
	public Map<@NotNull Character, @NotNull Integer> statistics(@NotNull final String string)
	{
		Map<Character, Integer> statistics = new HashMap<>(this.letters.size());

		this.letters.forEach(letter -> statistics.put(letter, 0));

		Arrays.stream(this.stringToArrayCharacter(string))
			  .forEach(symbol -> {
					if (statistics.containsKey(symbol)) {
						statistics.put(symbol, statistics.get(symbol) + 1);
					}
			  });

		return statistics;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param string {@inheritDoc}
	 * @return {@inheritDoc}
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
		StringBuilder string = new StringBuilder();

		for (int index = 0; index < this.letters.size(); index++)
		{
			string.append(this.letters.get(index));

			if (index != this.letters.size() - 1) {
				string.append(separator);
			}
		}

		return string.toString();
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
	 * Преобразовывает строку в массив символов.
	 *
	 * @param string строка.
	 * @return массив символов.
	 */
	@NotNull
	private Character @NotNull [] stringToArrayCharacter(@NotNull final String string)
	{
		return string.chars()
					 .mapToObj(i -> (char) i)
					 .toArray(Character[]::new);
	}
}
