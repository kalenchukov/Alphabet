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

public class BulgarianAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BulgarianAlphabet.UpperCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 
			'Ж', 'З', 'И', 'Й', 'К', 'Л', 
			'М', 'Н', 'О', 'П', 'Р', 'С', 
			'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 
			'Ш', 'Щ', 'Ъ', 'Ь', 'Ю', 'Я'
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

		assertTrue(ALPHABET.equals(new BulgarianAlphabet.UpperCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BulgarianAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
