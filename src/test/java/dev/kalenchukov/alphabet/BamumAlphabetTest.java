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

public class BamumAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BamumAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ꚠ', 'ꚡ', 'ꚢ', 'ꚣ', 'ꚤ', 'ꚥ', 
			'ꚦ', 'ꚧ', 'ꚨ', 'ꚩ', 'ꚪ', 'ꚫ', 
			'ꚬ', 'ꚭ', 'ꚮ', 'ꚯ', 'ꚰ', 'ꚱ', 
			'ꚲ', 'ꚳ', 'ꚴ', 'ꚵ', 'ꚶ', 'ꚷ', 
			'ꚸ', 'ꚹ', 'ꚺ', 'ꚻ', 'ꚼ', 'ꚽ', 
			'ꚾ', 'ꚿ', 'ꛀ', 'ꛁ', 'ꛂ', 'ꛃ', 
			'ꛄ', 'ꛅ', 'ꛆ', 'ꛇ', 'ꛈ', 'ꛉ', 
			'ꛊ', 'ꛋ', 'ꛌ', 'ꛍ', 'ꛎ', 'ꛏ', 
			'ꛐ', 'ꛑ', 'ꛒ', 'ꛓ', 'ꛔ', 'ꛕ', 
			'ꛖ', 'ꛗ', 'ꛘ', 'ꛙ', 'ꛚ', 'ꛛ', 
			'ꛜ', 'ꛝ', 'ꛞ', 'ꛟ', 'ꛠ', 'ꛡ', 
			'ꛢ', 'ꛣ', 'ꛤ', 'ꛥ', 'ꛦ', 'ꛧ', 
			'ꛨ', 'ꛩ', 'ꛪ', 'ꛫ', 'ꛬ', 'ꛭ', 
			'ꛮ', 'ꛯ'
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

		assertTrue(ALPHABET.equals(new BamumAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BamumAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
