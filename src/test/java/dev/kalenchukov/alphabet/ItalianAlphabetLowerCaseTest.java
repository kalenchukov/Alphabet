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

public class ItalianAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new ItalianAlphabet.LowerCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'a', 'b', 'c', 'd', 'e', 'f', 
			'g', 'h', 'i', 'l', 'm', 'n', 
			'o', 'p', 'q', 'r', 's', 't', 
			'u', 'v'
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

		assertTrue(ALPHABET.equals(new ItalianAlphabet.LowerCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new ItalianAlphabet.LowerCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.LowerCase().hashCode());
	}
}
