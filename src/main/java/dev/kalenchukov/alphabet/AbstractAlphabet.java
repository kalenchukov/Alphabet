/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

	/**
	 * @see Alphabetical#getLetter(Integer)
	 */
	@Nullable
	@Override
	public Character getLetter(@NotNull final Integer position)
	{
		Objects.requireNonNull(position);

		return this.getLetter(this.letters, position);
	}

	@Nullable
	protected Character getLetter(@NotNull final Character @NotNull [] alphabet, @NotNull final Integer position)
	{
		Objects.requireNonNull(position);
		Objects.requireNonNull(alphabet);

		if (position < 1 || position > alphabet.length) {
			return null;
		}

		return alphabet[position - 1];
	}
}
