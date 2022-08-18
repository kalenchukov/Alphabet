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

public class BalineseAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BalineseAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ᬅ', 'ᬆ', 'ᬇ', 'ᬈ', 'ᬉ', 'ᬊ', 
			'ᬋ', 'ᬌ', 'ᬍ', 'ᬎ', 'ᬏ', 'ᬐ', 
			'ᬑ', 'ᬒ', 'ᬓ', 'ᬔ', 'ᬕ', 'ᬖ', 
			'ᬗ', 'ᬘ', 'ᬙ', 'ᬚ', 'ᬛ', 'ᬜ', 
			'ᬝ', 'ᬞ', 'ᬟ', 'ᬠ', 'ᬡ', 'ᬢ', 
			'ᬣ', 'ᬤ', 'ᬥ', 'ᬦ', 'ᬧ', 'ᬨ', 
			'ᬩ', 'ᬪ', 'ᬫ', 'ᬬ', 'ᬭ', 'ᬮ', 
			'ᬯ', 'ᬰ', 'ᬱ', 'ᬲ', 'ᬳ', 'ᬀ', 
			'ᬁ', 'ᬂ', 'ᬃ', 'ᬄ', '᬴', 'ᬵ', 
			'ᬶ', 'ᬷ', 'ᬸ', 'ᬹ', 'ᬺ', 'ᬻ', 
			'ᬼ', 'ᬽ', 'ᬾ', 'ᬿ', 'ᭀ', 'ᭁ', 
			'ᭂ', 'ᭃ', '᭄', 'ᭅ', 'ᭆ', 'ᭇ', 
			'ᭈ', 'ᭉ', 'ᭊ', 'ᭋ'
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

		assertTrue(ALPHABET.equals(new BalineseAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BalineseAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
