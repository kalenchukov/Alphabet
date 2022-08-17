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

public class ItalianAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new ItalianAlphabet.UpperCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'A', 'B', 'C', 'D', 'E', 'F', 
			'G', 'H', 'I', 'L', 'M', 'N', 
			'O', 'P', 'Q', 'R', 'S', 'T', 
			'U', 'V'
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

		assertFalse(ALPHABET.equals(new RussianAlphabet.UpperCase()));

		assertTrue(ALPHABET.equals(new ItalianAlphabet.UpperCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new ItalianAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
