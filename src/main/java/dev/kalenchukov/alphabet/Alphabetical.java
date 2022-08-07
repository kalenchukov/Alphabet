/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * Интерфейс для реализации алфавита.
 */
public interface Alphabetical
{
	/**
	 * Возвращает буквы алфавита.
	 *
	 * @return Коллекция букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> get();

	/**
	 * Возвращает срез букв алфавита.
	 *
	 * @param from Начальная позиция букв в алфавите.
	 * @param to Конечная позиция букв в алфавите.
	 * @return Коллекция из среза букв алфавита.
	 * @throws IllegalArgumentException Если начальная позиция {@code from} больше {@code to}.
	 * @throws IndexOutOfBoundsException Если позиция {@code from} или {@code to} выходят за пределы алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> get(@NotNull Integer from, @NotNull Integer to);

	/**
	 * Возвращает буквы алфавита в обратном порядке.
	 *
	 * @return Коллекция букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getReverse();

	/**
	 * Возвращает буквы алфавита в перемешанном порядке.
	 *
	 * @return Коллекция букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getShuffle();

	/**
	 * Возвращает позицию буквы в алфавите.
	 *
	 * @param letter Буква.
	 * @return Позицию буквы в алфавите или {@code null} если буквы нет в алфавите.
	 */
	@Nullable
	Integer getPosition(@NotNull Character letter);

	/**
	 * Возвращает букву алфавита.
	 *
	 * @param position Позиция буквы в алфавите.
	 * @return Буква алфавита или {@code null} если буквы в позиции нет.
	 */
	@Nullable
	Character getLetter(@NotNull Integer position);

	/**
	 * Проверяет содержание буквы в алфавите.
	 *
	 * @param letter Буква.
	 * @return {@code True}, если буква содержится в алфавите, иначе {@code false}.
	 */
	boolean contains(@NotNull final Character letter);

	/**
	 * Возвращает массив из букв алфавита.
	 *
	 * @return Массив.
	 */
	@NotNull
	Character @NotNull [] toArray();

	/**
	 * Возвращает строковое представление букв алфавита.
	 *
	 * @param separator Разделитель букв.
	 * @return Строку из букв алфавита.
	 */
	@NotNull
	String toString(@NotNull final String separator);
}
