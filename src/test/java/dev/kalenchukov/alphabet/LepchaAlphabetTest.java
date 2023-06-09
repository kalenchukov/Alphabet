/*
 * Copyright © 2022-2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.kalenchukov.alphabet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link LepchaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class LepchaAlphabetTest
{
	private static final Alphabetical ALPHABET = new LepchaAlphabet();

	/**
	 * Проверка метода {@link LepchaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> expected = List.of(
			'ᰀ', 'ᰁ', 'ᰂ', 'ᰃ', 'ᰄ', 'ᰅ', 
			'ᰆ', 'ᰇ', 'ᰈ', 'ᰉ', 'ᰊ', 'ᰋ', 
			'ᰌ', 'ᰍ', 'ᰎ', 'ᰏ', 'ᰐ', 'ᰑ', 
			'ᰒ', 'ᰓ', 'ᰔ', 'ᰕ', 'ᰖ', 'ᰗ', 
			'ᰘ', 'ᰙ', 'ᰚ', 'ᰛ', 'ᰜ', 'ᰝ', 
			'ᰞ', 'ᰟ', 'ᰠ', 'ᰡ', 'ᰢ', 'ᰣ', 
			'ᰤ', 'ᰥ', 'ᰦ', 'ᰧ', 'ᰨ', 'ᰩ', 
			'ᰪ', 'ᰫ', 'ᰬ', 'ᰭ', 'ᰮ', 'ᰯ', 
			'ᰰ', 'ᰱ', 'ᰲ', 'ᰳ', 'ᰴ', 'ᰵ', 
			'ᰶ', '᰷', 'ᱍ', 'ᱎ', 'ᱏ'
		);

		List<Character> actual = ALPHABET.get();

		assertArrayEquals(expected.toArray(), actual.toArray());
	}

	/**
	 * Проверка метода {@link LepchaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new LepchaAlphabet());
	}

	/**
	 * Проверка метода {@link LepchaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new LepchaAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
