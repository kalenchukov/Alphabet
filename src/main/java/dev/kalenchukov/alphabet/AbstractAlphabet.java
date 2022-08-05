/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
	 * @see Alphabetical#getLetters()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getLetters()
	{
		return Collections.unmodifiableList(this.letters);
	}

	/**
	 * @see Alphabetical#getLetters(Integer, Integer)
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getLetters(@NotNull final Integer from, @NotNull final Integer to)
	{
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);

		return this.getLetters(this.letters, from, to);
	}

	/**
	 * @see Alphabetical#getLetter(Integer)
	 */
	@Nullable
	@Override
	public Character getLetter(@NotNull final Integer position)
	{
		Objects.requireNonNull(position);

		try
		{
			return this.getLetters(this.letters, position, position).get(0);
		}
		catch (IllegalArgumentException | IndexOutOfBoundsException exception)
		{
			return null;
		}
	}

	/**
	 * Возвращает срез букв алфавита.
	 *
	 * @param alphabet Алфавит.
	 * @param from Начальная позиция букв в алфавите.
	 * @param to Конечная позиция букв в алфавите.
	 * @return Коллекция из среза букв алфавита.
	 * @throws IllegalArgumentException Если начальная позиция {@code from} больше {@code to}.
	 * @throws IndexOutOfBoundsException Если позиция {@code from} или {@code to} выходят за пределы алфавита.
	 */
	@Unmodifiable
	@NotNull
	protected List<@NotNull Character> getLetters(@NotNull final List<@NotNull Character> alphabet,
												  @NotNull final Integer from,
												  @NotNull final Integer to)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);

		if (from > to) {
			throw new IllegalArgumentException();
		}

		if (from < 1 || to > alphabet.size()) {
			throw new IndexOutOfBoundsException();
		}

		return Collections.unmodifiableList(alphabet.subList(from - 1, to));
	}

	/**
	 * @see Alphabetical#hasLetter(Character)
	 */
	@Override
	public boolean hasLetter(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return this.getPosition(letter) != null;
	}

	/**
	 * @see Alphabetical#getPosition(Character)
	 */
	@Nullable
	@Override
	public Integer getPosition(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		for (int position = 0; position < this.letters.size(); position++)
		{
			if (this.letters.get(position).equals(letter)) {
				return position + 1;
			}
		}

		return null;
	}

	/**
	 * @see Alphabetical#getLettersReverse()
	 */
	@NotNull
	@Unmodifiable
	@Override
	public List<@NotNull Character> getLettersReverse()
	{
		List<Character> alphabetReverse = new ArrayList<>(this.letters.size());

		for (int i = this.letters.size() - 1; i >= 0; i--) {
			alphabetReverse.add(this.letters.get(i));
		}

		return Collections.unmodifiableList(alphabetReverse);
	}

	/**
	 * @see Alphabetical#getLettersShuffle()
	 */
	@NotNull
	@Unmodifiable
	@Override
	public List<@NotNull Character> getLettersShuffle()
	{
		final int coefficientShuffle = (int) (this.letters.size() * 2.5);

		List<Character> letters = new ArrayList<>(this.letters);
		Random random = new Random();

		for (int iterationShuffle = 0; iterationShuffle < coefficientShuffle; iterationShuffle++)
		{
			int indexFrom = random.nextInt(this.letters.size());
			int indexIn = random.nextInt(this.letters.size());

			final char charTemp = letters.get(indexIn);

			letters.set(indexIn, letters.get(indexFrom));
			letters.set(indexFrom, charTemp);
		}

		return Collections.unmodifiableList(letters);
	}
}
