/*
 * Copyright © 2022-2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
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
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Map;

/**
 * Интерфейс для реализации алфавита.
 *
 * @author Алексей Каленчуков
 */
public interface Alphabetical
{
	/**
	 * Возвращает букву алфавита.
	 *
	 * @param position позиция буквы в алфавите.
	 * @return буква алфавита или {@code null} если буквы в позиции {@code position} нет.
	 */
	@Nullable
	Character get(int position);

	/**
	 * Возвращает первую букву алфавита.
	 *
	 * @return буква алфавита.
	 */
	char getFirst();

	/**
	 * Возвращает последнюю букву алфавита.
	 *
	 * @return буква алфавита.
	 */
	char getLast();

	/**
	 * Возвращает буквы алфавита в обратном порядке.
	 *
	 * @return коллекция букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getReverse();

	/**
	 * Возвращает буквы алфавита в перемешанном порядке.
	 *
	 * @return коллекция букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getShuffle();

	/**
	 * Возвращает случайные буквы алфавита.
	 *
	 * @param count количество букв.
	 * @return коллекция букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getRandom(int count);

	/**
	 * Возвращает позицию буквы в алфавите.
	 *
	 * @param letter буква.
	 * @return позицию буквы в алфавите или {@code null} если буквы нет в алфавите.
	 */
	@Nullable
	Integer getPosition(char letter);

	/**
	 * Возвращает строку в которой удалены все символы не принадлежащие алфавиту.
	 *
	 * @param string строка.
	 * @return строку.
	 */
	@NotNull
	String clearMismatches(@NotNull String string);

	/**
	 * Возвращает строку в которой удалены все символы принадлежащие алфавиту.
	 *
	 * @param string строка.
	 * @return строку.
	 */
	@NotNull
	String clearMatches(@NotNull String string);

	/**
	 * Подсчитывает количество вхождений каждой буквы в строку.
	 *
	 * @param string строка.
	 * @return коллекцию из букв и количества вхождений.<br>
	 * <ul>
	 *     <li>key - буква</li>
	 *     <li>value - количество вхождений</li>
	 * </ul>
	 */
	@NotNull
	Map<@NotNull Character, @NotNull Integer> statistics(@NotNull String string);

	/**
	 * Проверяет принадлежность всех букв алфавиту.
	 *
	 * @param string строка.
	 * @return {@code true}, если все буквы из {@code string} принадлежат алфавиту, иначе {@code false}.
	 */
	boolean allMatch(@NotNull String string);

	/**
	 * Проверяет принадлежность хотя бы одной буквы алфавиту.
	 *
	 * @param string строка.
	 * @return {@code true}, если хотя бы одна буква из {@code string} принадлежит алфавиту, иначе {@code false}.
	 */
	boolean anyMatch(@NotNull String string);

	/**
	 * Проверяет не принадлежность всех букв алфавиту.
	 *
	 * @param string строка.
	 * @return {@code true}, если все буквы из {@code string} не принадлежат алфавиту, иначе {@code false}.
	 */
	boolean noneMatch(@NotNull String string);

	/**
	 * Проверяет содержание буквы в алфавите.
	 *
	 * @param letter буква.
	 * @return {@code true}, если буква {@code letter} содержится в алфавите, иначе {@code false}.
	 */
	boolean contains(char letter);

	/**
	 * Проверяет, расположены ли буквы в алфавитном порядке или обратном алфавитном порядке.
	 *
	 * @param string строка.
	 * @return {@code true}, если буквы из {@code string} расположены в алфавитном порядке или
	 * обратном алфавитном порядке, иначе {@code false}.
	 */
	boolean isSorted(@NotNull String string);

	/**
	 * Проверяет, расположены ли буквы в алфавитном порядке.
	 *
	 * @param string строка.
	 * @return {@code true}, если буквы из {@code string} расположены в алфавитном порядке, иначе {@code false}.
	 */
	boolean isSortedAsc(@NotNull String string);

	/**
	 * Проверяет, расположены ли буквы в обратном алфавитном порядке.
	 *
	 * @param string строка.
	 * @return {@code true}, если буквы из {@code string} расположены в обратном алфавитном порядке, иначе {@code false}.
	 */
	boolean isSortedDesc(@NotNull String string);

	/**
	 * Возвращает коллекция из букв алфавита.
	 *
	 * @return коллекция букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> toList();

	/**
	 * Возвращает коллекцию из среза букв алфавита.
	 *
	 * @param from начальная позиция букв в алфавите.
	 * @param to конечная позиция букв в алфавите.
	 * @return коллекция из среза букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> toList(int from, int to);

	/**
	 * Возвращает массив из букв алфавита.
	 *
	 * @return массив букв алфавита.
	 */
	@NotNull
	Character @NotNull [] toArray();

	/**
	 * Проверяет равенство объектов.
	 *
	 * @param obj сравниваемый объект.
	 * @return {@code true}, если данный объект равен {@code obj}, иначе {@code false}.
	 * @see Object#equals(Object)
	 */
	boolean equals(@Nullable Object obj);

	/**
	 * Возвращает значение объекта в виде числа.
	 *
	 * @return число.
	 * @see Object#hashCode()
	 */
	int hashCode();

	/**
	 * Возвращает значение объекта в виде строки.
	 *
	 * @return строку.
	 * @see Object#toString()
	 */
	@NotNull
	String toString();

	/**
	 * Возвращает значение объекта в виде строки.
	 *
	 * @param separator разделитель.
	 * @return строку.
	 */
	@NotNull
	String toString(@NotNull String separator);
}
