/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import java.util.*;

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
	 * @param letters Буквы алфавита.
	 */
	protected AbstractAlphabet(@NotNull final List<@NotNull Character> letters)
	{
		this.letters = Objects.requireNonNull(letters);
	}

	/**
	 * @see Alphabetical#get()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> get()
	{
		return Collections.unmodifiableList(this.letters);
	}

	/**
	 * @see Alphabetical#get(Integer, Integer)
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> get(@NotNull final Integer from, @NotNull final Integer to)
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
	 * @see Alphabetical#getLetter(Integer)
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
	 * @see Alphabetical#contains(Character)
	 */
	@Override
	public boolean contains(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return this.letters.contains(letter);
	}

	/**
	 * @see Alphabetical#getPosition(Character)
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
	 * @see Alphabetical#getReverse()
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
	 * @see Alphabetical#getShuffle()
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
	 * @see Alphabetical#getRandom(Integer)
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
	 * @see Alphabetical#statistics(String)
	 */
	@NotNull
	@Override
	public Map<@NotNull Character, @NotNull Integer> statistics(@NotNull final String string)
	{
		Map<Character, Integer> statistics = new HashMap<>(this.letters.size());

		this.letters.forEach(letter -> statistics.put(letter, 0));

		final Character[] symbols = string.chars()
										  .mapToObj(i -> (char) i)
										  .toArray(Character[]::new);

		Arrays.stream(symbols).forEach(symbol -> {
			if (statistics.containsKey(symbol)) {
				statistics.put(symbol, statistics.get(symbol) + 1);
			}
		});

		return statistics;
	}

	/**
	 * @see Alphabetical#toArray()
	 */
	@NotNull
	@Override
	public Character @NotNull [] toArray()
	{
		return this.letters.toArray(Character[]::new);
	}

	/**
	 * @see Alphabetical#toString(String)
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
	 * @see Object#toString()
	 */
	@Override
	@NotNull
	public String toString()
	{
		return this.toString("");
	}
}
