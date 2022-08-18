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

public class TurkishAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new TurkishAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'A', 'a', 'B', 'b', 'C', 'c', 
			'Ç', 'ç', 'D', 'd', 'E', 'e', 
			'F', 'f', 'G', 'g', 'Ğ', 'ğ', 
			'H', 'h', 'I', 'ı', 'İ', 'i', 
			'J', 'j', 'K', 'k', 'L', 'l', 
			'M', 'm', 'N', 'n', 'O', 'o', 
			'Ö', 'ö', 'P', 'p', 'R', 'r', 
			'S', 's', 'Ş', 'ş', 'T', 't', 
			'U', 'u', 'Ü', 'ü', 'V', 'v', 
			'Y', 'y', 'Z', 'z'
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

		assertTrue(ALPHABET.equals(new TurkishAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new TurkishAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
