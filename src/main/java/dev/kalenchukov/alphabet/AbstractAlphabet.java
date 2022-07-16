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
	 * @see Alphabetical#isLetter(Character)
	 */
	@Override
	public boolean isLetter(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return this.getPositionLetter(letter) != null;
	}

	/**
	 * @see Alphabetical#getPositionLetter(Character)
	 */
	@Nullable
	@Override
	public Integer getPositionLetter(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		for (int position = 0; position < this.letters.length; position++)
		{
			if (this.letters[position].equals(letter)) {
				return position + 1;
			}
		}

		return null;
	}
}
