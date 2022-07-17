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
 * Класс абстрактного алфавита с прописными и строчными буквами.
 */
public abstract class AbstractAlphabetCase extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Прописные буквы алфавита.
	 */
	@NotNull
	protected final Character @NotNull [] lettersUpperCase;

	/**
	 * Строчные буквы алфавита.
	 */
	@NotNull
	protected final Character @NotNull [] lettersLowerCase;

	/**
	 * Конструктор для {@code AbstractAlphabetCase}.
	 *
	 * @param letters Буквы алфавита.
	 * @param lettersUpperCase Прописные буквы алфавита.
	 * @param lettersLowerCase Строчные буквы алфавита.
	 */
	protected AbstractAlphabetCase(@NotNull final Character @NotNull [] letters,
								   @NotNull final Character @NotNull [] lettersUpperCase,
								   @NotNull final Character @NotNull [] lettersLowerCase)
	{
		super(letters);

		this.lettersUpperCase = Objects.requireNonNull(lettersUpperCase);
		this.lettersLowerCase = Objects.requireNonNull(lettersLowerCase);
	}

	/**
	 * @see AlphabeticalCase#getLettersUpperCase()
	 */
	@NotNull
	@Override
	public Character @NotNull [] getLettersUpperCase()
	{
		return this.lettersUpperCase;
	}

	/**
	 * @see AlphabeticalCase#getLettersUpperCase(Integer, Integer)
	 */
	@NotNull
	@Override
	public Character @NotNull [] getLettersUpperCase(@NotNull final Integer from, @NotNull final Integer to)
	{
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);

		return super.getLetters(this.lettersUpperCase, from, to);
	}

	/**
	 * @see AlphabeticalCase#getLettersLowerCase()
	 */
	@NotNull
	@Override
	public Character @NotNull [] getLettersLowerCase()
	{
		return this.lettersLowerCase;
	}

	/**
	 * @see AlphabeticalCase#getLettersLowerCase(Integer, Integer)
	 */
	@NotNull
	@Override
	public Character @NotNull [] getLettersLowerCase(@NotNull final Integer from, @NotNull final Integer to)
	{
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);

		return super.getLetters(this.lettersLowerCase, from, to);
	}

	/**
	 * @see AlphabeticalCase#isLetterUpperCase(Character)
	 */
	@Override
	public boolean isLetterUpperCase(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return super.getPositionLetter(this.lettersUpperCase, letter) != null;
	}

	/**
	 * @see AlphabeticalCase#isLetterLowerCase(Character)
	 */
	@Override
	public boolean isLetterLowerCase(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return super.getPositionLetter(this.lettersLowerCase, letter) != null;
	}

	/**
	 * @see Alphabetical#getPositionLetter(Character)
	 */
	@Nullable
	@Override
	public Integer getPositionLetter(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		Integer position = super.getPositionLetter(this.lettersLowerCase, letter);

		if (position != null) {
			return position;
		}

		return super.getPositionLetter(this.lettersUpperCase, letter);
	}

	/**
	 * @see AlphabeticalCase#getLetterUpperCase(Integer)
	 */
	@Nullable
	@Override
	public Character getLetterUpperCase(@NotNull final Integer position)
	{
		Objects.requireNonNull(position);

		try
		{
			return super.getLetters(this.lettersUpperCase, position, position)[0];
		}
		catch (IllegalArgumentException | IndexOutOfBoundsException exception)
		{
			return null;
		}
	}

	/**
	 * @see AlphabeticalCase#getLetterUpperCase(Integer)
	 */
	@Nullable
	@Override
	public Character getLetterLowerCase(@NotNull final Integer position)
	{
		Objects.requireNonNull(position);

		try
		{
			return super.getLetters(this.lettersLowerCase, position, position)[0];
		}
		catch (IllegalArgumentException | IndexOutOfBoundsException exception)
		{
			return null;
		}
	}
}
