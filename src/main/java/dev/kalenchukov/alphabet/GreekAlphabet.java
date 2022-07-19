/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * Класс греческого алфавита.
 */
public class GreekAlphabet extends AbstractAlphabetCase
{
	/**
	 * Коды прописных букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS_UPPER_CASE = List.of(
		'\u0391', '\u0392', '\u0393', '\u0394', '\u0395', '\u0396',
		'\u0397', '\u0398', '\u0399', '\u039A', '\u039B', '\u039C',
		'\u039D', '\u039E', '\u039F', '\u03A0', '\u03A1', '\u03A3',
		'\u03A4', '\u03A5', '\u03A6', '\u03A7', '\u03A8', '\u03A9'
	);

	/**
	 * Коды строчных букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS_LOWER_CASE = List.of(
		'\u03B1', '\u03B2', '\u03B3', '\u03B4', '\u03B5', '\u03B6',
		'\u03B7', '\u03B8', '\u03B9', '\u03BA', '\u03BB', '\u03BC',
		'\u03BD', '\u03BE', '\u03BF', '\u03C0', '\u03C1', '\u03C3',
		'\u03C2', '\u03C4', '\u03C5', '\u03C6', '\u03C7', '\u03C8',
		'\u03C9'
	);

	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
		'\u0391', '\u03B1', '\u0392', '\u03B2', '\u0393', '\u03B3',
		'\u0394', '\u03B4', '\u0395', '\u03B5', '\u0396', '\u03B6',
		'\u0397', '\u03B7', '\u0398', '\u03B8', '\u0399', '\u03B9',
		'\u039A', '\u03BA', '\u039B', '\u03BB', '\u039C', '\u03BC',
		'\u039D', '\u03BD', '\u039E', '\u03BE', '\u039F', '\u03BF',
		'\u03A0', '\u03C0', '\u03A1', '\u03C1', '\u03A3', '\u03C3',
		'\u03C2', '\u03A4', '\u03C4', '\u03A5', '\u03C5', '\u03A6',
		'\u03C6', '\u03A7', '\u03C7', '\u03A8', '\u03C8', '\u03A9',
		'\u03C9'
	);

	/**
	 * Конструктор для {@code GreekAlphabet}.
	 */
	public GreekAlphabet()
	{
		super(LETTERS, LETTERS_UPPER_CASE, LETTERS_LOWER_CASE);
	}
}
