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
 * Класс проверки методов класса {@link OriyaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class OriyaAlphabetTest
{
	private static final Alphabetical ALPHABET = new OriyaAlphabet();

	/**
	 * Проверка метода {@link OriyaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> expected = List.of(
			'ଅ', 'ଆ', 'ଇ', 'ଈ', 'ଉ', 'ଊ', 
			'ଋ', 'ୠ', 'ଌ', 'ୡ', 'ଏ', 'ଐ', 
			'ଓ', 'ଔ', 'କ', 'ଖ', 'ଗ', 'ଘ', 
			'ଙ', 'ଚ', 'ଛ', 'ଜ', 'ଝ', 'ଞ', 
			'ଟ', 'ଠ', 'ଡ', 'ଢ', 'ଣ', 'ତ', 
			'ଥ', 'ଦ', 'ଧ', 'ନ', 'ପ', 'ଫ', 
			'ବ', 'ଵ', 'ଭ', 'ମ', 'ଯ', 'ର', 
			'ଳ', 'ୱ', 'ଶ', 'ଷ', 'ସ', 'ହ', 
			'ୟ', 'ଲ'
		);

		List<Character> actual = ALPHABET.get();

		assertArrayEquals(expected.toArray(), actual.toArray());
	}

	/**
	 * Проверка метода {@link OriyaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new OriyaAlphabet());
	}

	/**
	 * Проверка метода {@link OriyaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new OriyaAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
