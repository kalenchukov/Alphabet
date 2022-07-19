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
 * Класс английского алфавита.
 */
public class EnglishAlphabet extends AbstractAlphabetCase
{
	/**
	 * Коды прописных букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS_UPPER_CASE = List.of(
		'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046',
		'\u0047', '\u0048', '\u0049', '\u004A', '\u004B', '\u004C',
		'\u004D', '\u004E', '\u004F', '\u0050', '\u0051', '\u0052',
		'\u0053', '\u0054', '\u0055', '\u0056', '\u0057', '\u0058',
		'\u0059', '\u005A'
	);

	/**
	 * Коды строчных букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS_LOWER_CASE = List.of(
		'\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066',
		'\u0067', '\u0068', '\u0069', '\u006A', '\u006B', '\u006C',
		'\u006D', '\u006E', '\u006F', '\u0070', '\u0071', '\u0072',
		'\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078',
		'\u0079', '\u007A'
	);

	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
		'\u0041', '\u0061', '\u0042', '\u0062', '\u0043', '\u0063',
		'\u0044', '\u0064', '\u0045', '\u0065', '\u0046', '\u0066',
		'\u0047', '\u0067', '\u0048', '\u0068', '\u0049', '\u0069',
		'\u004A', '\u006A', '\u004B', '\u006B', '\u004C', '\u006C',
		'\u004D', '\u006D', '\u004E', '\u006E', '\u004F', '\u006F',
		'\u0050', '\u0070', '\u0051', '\u0071', '\u0052', '\u0072',
		'\u0053', '\u0073', '\u0054', '\u0074', '\u0055', '\u0075',
		'\u0056', '\u0076', '\u0057', '\u0077', '\u0058', '\u0078',
		'\u0059', '\u0079', '\u005A', '\u007A'
	);

	/**
	 * Конструктор для {@code EnglishAlphabet}.
	 */
	public EnglishAlphabet()
	{
		super(LETTERS, LETTERS_UPPER_CASE, LETTERS_LOWER_CASE);
	}
}
