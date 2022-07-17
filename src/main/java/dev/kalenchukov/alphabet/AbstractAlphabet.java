/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Objects;

/**
 * Класс абстрактного алфавита.
 */
public abstract class AbstractAlphabet implements Alphabetical
{
	/**
	 * Буквы алфавита.
	 */
	@NotNull
	protected final Character @NotNull [] letters;

	/**
	 * Конструктор для {@code AbstractAlphabet}.
	 *
	 * @param letters Буквы алфавита.
	 */
	protected AbstractAlphabet(@NotNull final Character @NotNull [] letters)
	{
		this.letters = Objects.requireNonNull(letters);
	}

	/**
	 * @see Alphabetical#getLetters()
	 */
	@NotNull
	@Override
	public Character @NotNull [] getLetters()
	{
		return this.letters;
	}

	/**
	 * @see Alphabetical#getLetters(Integer, Integer)
	 */
	@NotNull
	@Override
	public Character @NotNull [] getLetters(@NotNull final Integer from, @NotNull final Integer to)
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
			return this.getLetters(this.letters, position, position)[0];
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
	 * @return Массив из среза букв алфавита.
	 * @throws IllegalArgumentException Если начальная позиция {@code from} больше {@code to}.
	 * @throws IndexOutOfBoundsException Если позиция {@code from} или {@code to} выходят за пределы алфавита.
	 */
	@NotNull
	protected Character @NotNull [] getLetters(@NotNull final Character @NotNull [] alphabet,
											   @NotNull final Integer from,
											   @NotNull final Integer to)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);

		if (from > to) {
			throw new IllegalArgumentException();
		}

		if (from < 1 || to > alphabet.length) {
			throw new IndexOutOfBoundsException();
		}

		return Arrays.copyOfRange(alphabet, from - 1, to);
	}

	/**
	 * @see Alphabetical#isLetter(Character)
	 */
	@Override
	public boolean isLetter(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return this.getPositionLetter(this.letters, letter) != null;
	}

	/**
	 * @see Alphabetical#getPositionLetter(Character)
	 */
	@Nullable
	@Override
	public Integer getPositionLetter(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return this.getPositionLetter(this.letters, letter);
	}

	/**
	 * Возвращает позицию буквы в алфавите.
	 *
	 * @param alphabet Алфавит.
	 * @param letter Буква.
	 * @return Позицию буквы в алфавите.
	 */
	@Nullable
	protected Integer getPositionLetter(@NotNull final Character @NotNull [] alphabet, @NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		for (int position = 0; position < alphabet.length; position++)
		{
			if (alphabet[position].equals(letter)) {
				return position + 1;
			}
		}

		return null;
	}
}
