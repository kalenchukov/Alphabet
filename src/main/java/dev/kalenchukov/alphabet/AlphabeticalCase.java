/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Интерфейс для реализации алфавита с прописными и строчными буквами.
 */
public interface AlphabeticalCase extends Alphabetical
{
	/**
	 * Возвращает прописные буквы алфавита.
	 *
	 * @return Массив прописных букв алфавита.
	 */
	@NotNull
	Character @NotNull [] getLettersUpperCase();

	/**
	 * Возвращает строчные буквы алфавита.
	 *
	 * @return Массив строчных букв алфавита.
	 */
	@NotNull
	Character @NotNull [] getLettersLowerCase();

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
	 * Проверяет принадлежность буквы к алфавиту прописных букв.
	 *
	 * @param letter Буква.
	 * @return {@code True} если буква принадлежит алфавиту прописных букв, иначе {@code false}.
	 */
	boolean isLetterUpperCase(@NotNull final Character letter);

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 *
	 * @param letter Буква.
	 * @return {@code True} если буква принадлежит алфавиту строчных букв, иначе {@code false}.
	 */
	boolean isLetterLowerCase(@NotNull final Character letter);
}
