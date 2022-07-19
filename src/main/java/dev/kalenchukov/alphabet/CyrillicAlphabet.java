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
 * Класс кириллического алфавита.
 */
public class CyrillicAlphabet extends AbstractAlphabet
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
		'\u0410', '\u0411', '\u0412', '\u0413', '\u0414', '\u0415', '\u0416', '\u0405', '\u0417',
		'\u0418', '\u0406', '\u041A', '\u041B', '\u041C', '\u041D', '\u041E', '\u041F', '\u0420',
		'\u0421', '\u0422', '\uA64A', '\u0424', '\u0425', '\u0460', '\u0426', '\u0427', '\u0428',
		'\u0429', '\u042A', '\u042B', '\u042C', '\u0462', '\u042E', '\uA656', '\u0464', '\u0466',
		'\u046A', '\u0468', '\u046C', '\u046E', '\u0470', '\u0472', '\u0474'
	);

	/**
	 * Конструктор для {@code CyrillicAlphabet}.
	 */
	public CyrillicAlphabet()
	{
		super(LETTERS);
	}
}
