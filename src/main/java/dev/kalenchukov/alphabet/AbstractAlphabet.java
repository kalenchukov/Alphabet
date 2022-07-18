/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
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
	protected final List<@NotNull Character> letters;

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
	@NotNull
	@Override
	public List<@NotNull Character> getLetters()
	{
		return this.letters;
	}

	/**
	 * @see Alphabetical#getLetters(Integer, Integer)
	 */
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

		return alphabet.subList(from - 1, to);
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
	protected Integer getPositionLetter(@NotNull final List<@NotNull Character> alphabet, @NotNull final Character letter)
	{
		Objects.requireNonNull(letter);

		for (int position = 0; position < alphabet.size(); position++)
		{
			if (alphabet.get(position).equals(letter)) {
				return position + 1;
			}
		}

		return null;
	}
}
