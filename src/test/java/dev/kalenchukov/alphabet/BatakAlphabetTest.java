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

public class BatakAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BatakAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ᯀ', 'ᯁ', 'ᯂ', 'ᯃ', 'ᯄ', 'ᯅ', 
			'ᯆ', 'ᯇ', 'ᯈ', 'ᯉ', 'ᯊ', 'ᯋ', 
			'ᯌ', 'ᯍ', 'ᯎ', 'ᯏ', 'ᯐ', 'ᯑ', 
			'ᯒ', 'ᯓ', 'ᯔ', 'ᯕ', 'ᯖ', 'ᯗ', 
			'ᯘ', 'ᯙ', 'ᯚ', 'ᯛ', 'ᯜ', 'ᯝ', 
			'ᯞ', 'ᯟ', 'ᯠ', 'ᯡ', 'ᯢ', 'ᯣ', 
			'ᯤ', 'ᯥ', '᯦', 'ᯧ', 'ᯨ', 'ᯩ', 
			'ᯪ', 'ᯫ', 'ᯬ', 'ᯭ', 'ᯮ', 'ᯯ', 
			'ᯰ', 'ᯱ', '᯲', '᯳'
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

		assertTrue(ALPHABET.equals(new BatakAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BatakAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
