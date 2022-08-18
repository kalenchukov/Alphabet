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

public class ArabAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new ArabAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ﺎ', 'ﺍ', 'ﺐ', 'ﺒ', 'ﺑ', 'ﺏ', 
			'ﺖ', 'ﺘ', 'ﺗ', 'ﺕ', 'ﺚ', 'ﺜ', 
			'ﺛ', 'ﺙ', 'ﺞ', 'ﺠ', 'ﺟ', 'ﺝ', 
			'ﺢ', 'ﺤ', 'ﺣ', 'ﺡ', 'ﺦ', 'ﺨ', 
			'ﺧ', 'ﺥ', 'ﺪ', 'ﺩ', 'ﺬ', 'ﺫ', 
			'ﺮ', 'ﺭ', 'ﺰ', 'ﺯ', 'ﺲ', 'ﺴ', 
			'ﺳ', 'ﺱ', 'ﺶ', 'ﺸ', 'ﺷ', 'ﺵ', 
			'ﺺ', 'ﺼ', 'ﺻ', 'ﺹ', 'ﺾ', 'ﻀ', 
			'ﺿ', 'ﺽ', 'ﻂ', 'ﻄ', 'ﻃ', 'ﻁ', 
			'ﻆ', 'ﻈ', 'ﻇ', 'ﻅ', 'ﻊ', 'ﻌ', 
			'ﻋ', 'ﻉ', 'ﻎ', 'ﻐ', 'ﻏ', 'ﻍ', 
			'ﻒ', 'ﻔ', 'ﻓ', 'ﻑ', 'ﻖ', 'ﻘ', 
			'ﻗ', 'ﻕ', 'ﻚ', 'ﻜ', 'ﻛ', 'ﻙ', 
			'ﻞ', 'ﻠ', 'ﻟ', 'ﻝ', 'ﻢ', 'ﻤ', 
			'ﻣ', 'ﻡ', 'ﻦ', 'ﻨ', 'ﻧ', 'ﻥ', 
			'ﻪ', 'ﻬ', 'ﻫ', 'ﻩ', 'ﻮ', 'ﻭ', 
			'ﻲ', 'ﻴ', 'ﻳ', 'ﻱ'
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

		assertTrue(ALPHABET.equals(new ArabAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new ArabAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
