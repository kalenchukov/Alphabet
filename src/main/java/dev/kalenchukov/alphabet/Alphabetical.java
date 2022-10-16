/*
 * Copyright 2022 Алексей Каленчуков
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Map;

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
	List<@NotNull Character> get(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) Integer from,
								 @NotNull @Range(from = 1, to = Integer.MAX_VALUE) Integer to);

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
	 * Возвращает случайные буквы алфавита.
	 *
	 * @param count Количество букв.
	 * @return Коллекция букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getRandom(@NotNull @Range(from = 0, to = Integer.MAX_VALUE) Integer count);

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
	Character getLetter(@NotNull @Range(from = 0, to = Integer.MAX_VALUE) Integer position);

	/**
	 * Подсчитывает количество вхождений каждой буквы в строку.
	 *
	 * @param string Строка.
	 * @return Коллекцию из букв и количества вхождений.<br>
	 * <ul>
	 *     <li>Ket - буква</li>
	 *     <li>Value - количество вхождений</li>
	 * </ul>
	 */
	@NotNull
	Map<@NotNull Character, @NotNull Integer> statistics(@NotNull String string);

	/**
	 * Проверяет принадлежность всех букв алфавиту.
	 *
	 * @param string Строка.
	 * @return {@code True}, если все буквы принадлежат алфавиту, иначе {@code false}.
	 */
	boolean allMatch(@NotNull String string);

	/**
	 * Проверяет принадлежность хотя бы одной буквы алфавиту.
	 *
	 * @param string Строка.
	 * @return {@code True}, если хотя бы одна буква принадлежит алфавиту, иначе {@code false}.
	 */
	boolean anyMatch(@NotNull String string);

	/**
	 * Проверяет не принадлежность всех букв алфавиту.
	 *
	 * @param string Строка.
	 * @return {@code True}, если все буквы не принадлежат алфавиту, иначе {@code false}.
	 */
	boolean noneMatch(@NotNull String string);

	/**
	 * Проверяет содержание буквы в алфавите.
	 *
	 * @param letter Буква.
	 * @return {@code True}, если буква содержится в алфавите, иначе {@code false}.
	 */
	boolean contains(@NotNull Character letter);

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
	String toString(@NotNull String separator);
}
