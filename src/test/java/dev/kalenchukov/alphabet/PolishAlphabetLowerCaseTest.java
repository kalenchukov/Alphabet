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

public class PolishAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new PolishAlphabet.LowerCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'a', 'ą', 'b', 'c', 'ć', 'd', 
			'e', 'ę', 'f', 'g', 'h', 'i', 
			'j', 'k', 'l', 'ł', 'm', 'n', 
			'ń', 'o', 'ó', 'p', 'r', 's', 
			'ś', 't', 'u', 'w', 'y', 'z', 
			'ź', 'ż'
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

		assertFalse(ALPHABET.equals(new RussianAlphabet.LowerCase()));

		assertTrue(ALPHABET.equals(new PolishAlphabet.LowerCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new PolishAlphabet.LowerCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.LowerCase().hashCode());
	}
}
