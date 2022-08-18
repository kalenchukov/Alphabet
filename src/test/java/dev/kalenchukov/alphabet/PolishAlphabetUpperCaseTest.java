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

public class PolishAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new PolishAlphabet.UpperCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'A', 'Ą', 'B', 'C', 'Ć', 'D', 
			'E', 'Ę', 'F', 'G', 'H', 'I', 
			'J', 'K', 'L', 'Ł', 'M', 'N', 
			'Ń', 'O', 'Ó', 'P', 'R', 'S', 
			'Ś', 'T', 'U', 'W', 'Y', 'Z', 
			'Ź', 'Ż'
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

		assertTrue(ALPHABET.equals(new PolishAlphabet.UpperCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new PolishAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
