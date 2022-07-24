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
 * Интерфейс для реализации алфавита с прописными и строчными буквами.
 */
public interface AlphabeticalCase extends Alphabetical
{
	/**
	 * Возвращает прописные буквы алфавита.
	 *
	 * @return Коллекция прописных букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getLettersUpperCase();

	/**
	 * Возвращает срез прописных букв алфавита.
	 *
	 * @param from Начальная позиция букв в алфавите.
	 * @param to Конечная позиция букв в алфавите.
	 * @return Коллекция из среза прописных букв алфавита.
	 * @throws IllegalArgumentException Если начальная позиция {@code from} больше {@code to}.
	 * @throws IndexOutOfBoundsException Если позиция {@code from} или {@code to} выходят за пределы алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getLettersUpperCase(@NotNull Integer from, @NotNull Integer to);

	/**
	 * Возвращает строчные буквы алфавита.
	 *
	 * @return Коллекция строчных букв алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getLettersLowerCase();

	/**
	 * Возвращает срез строчных букв алфавита.
	 *
	 * @param from Начальная позиция букв в алфавите.
	 * @param to Конечная позиция букв в алфавите.
	 * @return Коллекция из среза строчных букв алфавита.
	 * @throws IllegalArgumentException Если начальная позиция {@code from} больше {@code to}.
	 * @throws IndexOutOfBoundsException Если позиция {@code from} или {@code to} выходят за пределы алфавита.
	 */
	@Unmodifiable
	@NotNull
	List<@NotNull Character> getLettersLowerCase(@NotNull Integer from, @NotNull Integer to);

	/**
	 * Возвращает прописную букву алфавита.
	 *
	 * @param position Позиция буквы в алфавите.
	 * @return Прописная буква алфавита или {@code null} если буквы в позиции нет.
	 */
	@Nullable
	Character getLetterUpperCase(@NotNull Integer position);

	/**
	 * Возвращает строчную букву алфавита.
	 *
	 * @param position Позиция буквы в алфавите.
	 * @return Строчная буква алфавита или {@code null} если буквы в позиции нет.
	 */
	@Nullable
	Character getLetterLowerCase(@NotNull Integer position);

	/**
	 * Возвращает позицию прописной буквы в алфавите.
	 *
	 * @param letter Буква.
	 * @return Позицию прописной буквы в алфавите или {@code null} если буквы нет в алфавите.
	 */
	@Nullable
	Integer getPositionUpperCase(@NotNull Character letter);

	/**
	 * Возвращает позицию прописной буквы в алфавите.
	 *
	 * @param letter Буква.
	 * @return Позицию прописной буквы в алфавите или {@code null} если буквы нет в алфавите.
	 */
	@Nullable
	Integer getPositionLowerCase(@NotNull Character letter);

	/**
	 * Проверяет принадлежность буквы к алфавиту прописных букв.
	 *
	 * @param letter Буква.
	 * @return {@code True} если буква принадлежит алфавиту прописных букв, иначе {@code false}.
	 */
	boolean hasLetterUpperCase(@NotNull final Character letter);

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 *
	 * @param letter Буква.
	 * @return {@code True} если буква принадлежит алфавиту строчных букв, иначе {@code false}.
	 */
	boolean hasLetterLowerCase(@NotNull final Character letter);
}
