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

public class MongolianAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new MongolianAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ᠠ', 'ᠡ', 'ᠢ', 'ᠣ', 'ᠤ', 'ᠥ', 
			'ᠦ', 'ᠧ', 'ᠨ', 'ᠩ', 'ᠪ', 'ᠫ', 
			'ᠬ', 'ᠭ', 'ᠮ', 'ᠯ', 'ᠰ', 'ᠱ', 
			'ᠲ', 'ᠳ', 'ᠴ', 'ᠵ', 'ᠶ', 'ᠷ', 
			'ᠸ', 'ᠹ', 'ᠺ', 'ᠻ', 'ᠼ', 'ᠽ', 
			'ᠾ', 'ᠿ', 'ᡀ', 'ᡁ', 'ᡂ'
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

		assertTrue(ALPHABET.equals(new MongolianAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new MongolianAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
