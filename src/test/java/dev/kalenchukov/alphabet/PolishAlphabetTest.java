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

public class PolishAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new PolishAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'A', 'a', 'Ą', 'ą', 'B', 'b', 
			'C', 'c', 'Ć', 'ć', 'D', 'd', 
			'E', 'e', 'Ę', 'ę', 'F', 'f', 
			'G', 'g', 'H', 'h', 'I', 'i', 
			'J', 'j', 'K', 'k', 'L', 'l', 
			'Ł', 'ł', 'M', 'm', 'N', 'n', 
			'Ń', 'ń', 'O', 'o', 'Ó', 'ó', 
			'P', 'p', 'R', 'r', 'S', 's', 
			'Ś', 'ś', 'T', 't', 'U', 'u', 
			'W', 'w', 'Y', 'y', 'Z', 'z', 
			'Ź', 'ź', 'Ż', 'ż'
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

		assertTrue(ALPHABET.equals(new PolishAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new PolishAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
