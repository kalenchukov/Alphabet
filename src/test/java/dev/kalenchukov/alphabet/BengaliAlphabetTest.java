/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BengaliAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BengaliAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'অ', 'আ', 'ই', 'ঈ', 'উ', 'ঊ', 
			'ঋ', 'এ', 'ঐ', 'ও', 'ঔ', 'ক', 
			'খ', 'গ', 'ঘ', 'ঙ', 'চ', 'ছ', 
			'জ', 'ঝ', 'ঞ', 'ট', 'ঠ', 'ড', 
			'ঢ', 'ণ', 'ত', 'থ', 'দ', 'ধ', 
			'ন', 'প', 'ফ', 'ব', 'ভ', 'ম', 
			'য', 'র', 'ল', 'শ', 'ষ', 'স', 
			'হ', 'য়', 'ড়', 'ঢ়', 'ৎ', 'ঁ', 
			'ং', 'ঃ', '্'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка сравнения объектов.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(ALPHABET.equals(null));

		assertTrue(ALPHABET.equals(ALPHABET));

		assertFalse(ALPHABET.equals(new RussianAlphabet()));

		assertTrue(ALPHABET.equals(new BengaliAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BengaliAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
