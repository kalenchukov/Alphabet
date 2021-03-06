/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;

/**
 * Класс русского алфавита.
 */
public class RussianAlphabet extends AbstractAlphabetCase
{
	/**
	 * Коды прописных букв в Unicode.
	 */
	@NotNull
	public static final Character @NotNull [] LETTERS_UPPER_CASE = new Character[] {
		'\u0410', '\u0411', '\u0412', '\u0413', '\u0414', '\u0415',
		'\u0401', '\u0416', '\u0417', '\u0418', '\u0419', '\u041A',
		'\u041B', '\u041C', '\u041D', '\u041E', '\u041F', '\u0420',
		'\u0421', '\u0422', '\u0423', '\u0424', '\u0425', '\u0426',
		'\u0427', '\u0428', '\u0429', '\u042A', '\u042B', '\u042C',
		'\u042D', '\u042E', '\u042F'
	};

	/**
	 * Коды строчных букв в Unicode.
	 */
	@NotNull
	public static final Character @NotNull [] LETTERS_LOWER_CASE = new Character[] {
		'\u0430', '\u0431', '\u0432', '\u0433', '\u0434', '\u0435',
		'\u0451', '\u0436', '\u0437', '\u0438', '\u0439', '\u043A',
		'\u043B', '\u043C', '\u043D', '\u043E', '\u043F', '\u0440',
		'\u0441', '\u0442', '\u0443', '\u0444', '\u0445', '\u0446',
		'\u0447', '\u0448', '\u0449', '\u044A', '\u044B', '\u044C',
		'\u044D', '\u044E', '\u044F'
	};

	/**
	 * Коды букв в Unicode.
	 */
	@NotNull
	public static final Character @NotNull [] LETTERS = new Character[] {
		'\u0410', '\u0430', '\u0411', '\u0431', '\u0412', '\u0432',
		'\u0413', '\u0433', '\u0414', '\u0434', '\u0415', '\u0435',
		'\u0401', '\u0451', '\u0416', '\u0436', '\u0417', '\u0437',
		'\u0418', '\u0438', '\u0419', '\u0439', '\u041A', '\u043A',
		'\u041B', '\u043B', '\u041C', '\u043C', '\u041D', '\u043D',
		'\u041E', '\u043E', '\u041F', '\u043F', '\u0420', '\u0440',
		'\u0421', '\u0441', '\u0422', '\u0442', '\u0423', '\u0443',
		'\u0424', '\u0444', '\u0425', '\u0445', '\u0426', '\u0446',
		'\u0427', '\u0447', '\u0428', '\u0448', '\u0429', '\u0449',
		'\u042A', '\u044A', '\u042B', '\u044B', '\u042C', '\u044C',
		'\u042D', '\u044D', '\u042E', '\u044E', '\u042F', '\u044F'
	};

	/**
	 * Конструктор для {@code RussianAlphabet}.
	 */
	public RussianAlphabet()
	{
		super(LETTERS, LETTERS_UPPER_CASE, LETTERS_LOWER_CASE);
	}
}
