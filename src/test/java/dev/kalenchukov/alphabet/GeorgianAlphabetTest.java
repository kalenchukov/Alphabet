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

public class GeorgianAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new GeorgianAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ა', 'ბ', 'გ', 'დ', 'ე', 'ვ', 
			'ზ', 'თ', 'ი', 'კ', 'ლ', 'მ', 
			'ნ', 'ო', 'პ', 'ჟ', 'რ', 'ს', 
			'ტ', 'უ', 'ფ', 'ქ', 'ღ', 'ყ', 
			'შ', 'ჩ', 'ც', 'ძ', 'წ', 'ჭ', 
			'ხ', 'ჯ', 'ჰ'
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

		assertTrue(ALPHABET.equals(new GeorgianAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new GeorgianAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
