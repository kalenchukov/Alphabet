/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Collections;
import java.util.List;
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
	protected final List<@NotNull Character> lettersUpperCase;

	/**
	 * Строчные буквы алфавита.
	 */
	@NotNull
	protected final List<@NotNull Character> lettersLowerCase;

	/**
	 * Конструктор для {@code AbstractAlphabetCase}.
	 *
	 * @param letters Буквы алфавита.
	 * @param lettersUpperCase Прописные буквы алфавита.
	 * @param lettersLowerCase Строчные буквы алфавита.
	 */
	protected AbstractAlphabetCase(@NotNull final List<@NotNull Character> letters,
								   @NotNull final List<@NotNull Character> lettersUpperCase,
								   @NotNull final List<@NotNull Character> lettersLowerCase)
	{
		super(letters);

		this.lettersUpperCase = Objects.requireNonNull(lettersUpperCase);
		this.lettersLowerCase = Objects.requireNonNull(lettersLowerCase);
	}

	/**
	 * @see AlphabeticalCase#getLettersUpperCase()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getLettersUpperCase()
	{
		return Collections.unmodifiableList(this.lettersUpperCase);
	}

	/**
	 * @see AlphabeticalCase#getLettersUpperCase(Integer, Integer)
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getLettersUpperCase(@NotNull final Integer from, @NotNull final Integer to)
	{
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);

		return super.getLetters(this.lettersUpperCase, from, to);
	}

	/**
	 * @see AlphabeticalCase#getLettersLowerCase()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getLettersLowerCase()
	{
		return Collections.unmodifiableList(this.lettersLowerCase);
	}

	/**
	 * @see AlphabeticalCase#getLettersLowerCase(Integer, Integer)
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getLettersLowerCase(@NotNull final Integer from, @NotNull final Integer to)
	{
		Objects.requireNonNull(from);
		Objects.requireNonNull(to);

		return super.getLetters(this.lettersLowerCase, from, to);
	}

	/**
	 * @see AlphabeticalCase#hasLetterUpperCase(Character)
	 */
	@Override
	public boolean hasLetterUpperCase(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return super.getPosition(this.lettersUpperCase, letter) != null;
	}

	/**
	 * @see AlphabeticalCase#hasLetterLowerCase(Character)
	 */
	@Override
	public boolean hasLetterLowerCase(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return super.getPosition(this.lettersLowerCase, letter) != null;
	}

	/**
	 * @see AlphabeticalCase#getPositionUpperCase(Character)
	 */
	@Nullable
	@Override
	public Integer getPositionUpperCase(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return super.getPosition(this.lettersUpperCase, letter);
	}

	/**
	 * @see AlphabeticalCase#getPositionLowerCase(Character)
	 */
	@Nullable
	@Override
	public Integer getPositionLowerCase(@NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		return super.getPosition(this.lettersLowerCase, letter);
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
			return super.getLetters(this.lettersUpperCase, position, position).get(0);
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
			return super.getLetters(this.lettersLowerCase, position, position).get(0);
		}
		catch (IllegalArgumentException | IndexOutOfBoundsException exception)
		{
			return null;
		}
	}

	/**
	 * @see AlphabeticalCase#getLettersReverseUpperCase()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getLettersReverseUpperCase()
	{
		return Collections.unmodifiableList(super.getLettersReverse(this.lettersUpperCase));
	}

	/**
	 * @see AlphabeticalCase#getLettersReverseLowerCase()
	 */
	@Unmodifiable
	@NotNull
	@Override
	public List<@NotNull Character> getLettersReverseLowerCase()
	{
		return Collections.unmodifiableList(super.getLettersReverse(this.lettersLowerCase));
	}
}
