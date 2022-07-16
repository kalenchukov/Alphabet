/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Интерфейс для реализации алфавита.
 */
public interface Alphabetical
{
	/**
	 * Возвращает буквы алфавита.
	 *
	 * @return Массив букв алфавита.
	 */
	@NotNull
	Character @NotNull [] getLetters();

	/**
	 * Возвращает срез букв алфавита.
	 *
	 * @param from Начальная позиция букв в алфавите.
	 * @param to Конечная позиция букв в алфавите.
	 * @return Массив из среза букв алфавита.
	 * @throws IllegalArgumentException Если начальная позиция {@code from} больше {@code to}.
	 * @throws IndexOutOfBoundsException Если позиция {@code from} или {@code to} выходят за пределы алфавита.
	 */
	@NotNull
	Character @NotNull [] getLetters(@NotNull Integer from, @NotNull Integer to);

	/**
	 * Возвращает позицию буквы в алфавите.
	 *
	 * @param letter Буква.
	 * @return Позицию буквы в алфавите или {@code null} если буквы нет в алфавите.
	 */
	@Nullable
	Integer getPositionLetter(@NotNull Character letter);

	/**
	 * Возвращает букву алфавита.
	 *
	 * @param position Позиция буквы в алфавите.
	 * @return Буква алфавита или {@code null} если буквы в позиции нет.
	 */
	@Nullable
	Character getLetter(@NotNull Integer position);

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 *
	 * @param letter Буква.
	 * @return {@code True} если буква принадлежит алфавиту, иначе {@code false}.
	 */
	boolean isLetter(@NotNull final Character letter);
}
