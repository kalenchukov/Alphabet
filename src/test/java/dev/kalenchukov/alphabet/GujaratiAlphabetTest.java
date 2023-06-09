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
 * Класс проверки методов класса {@link GujaratiAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class GujaratiAlphabetTest
{
	private static final Alphabetical ALPHABET = new GujaratiAlphabet();

	/**
	 * Проверка метода {@link GujaratiAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> expected = List.of(
			'ક', 'ખ', 'ગ', 'ઘ', 'ઙ', 'ચ', 
			'છ', 'જ', 'ઝ', 'ઞ', 'ટ', 'ઠ', 
			'ડ', 'ઢ', 'ણ', 'ત', 'થ', 'દ', 
			'ધ', 'ન', 'પ', 'ફ', 'બ', 'ભ', 
			'મ', 'ય', 'ર', 'લ', 'વ', 'શ', 
			'ષ', 'સ', 'હ', 'ળ', 'અ', 'આ', 
			'ઇ', 'ઈ', 'ઉ', 'ઊ', 'ઋ', 'એ', 
			'ઐ', 'ઓ', 'ઔ', '્', 'ં', 'ઃ'
		);

		List<Character> actual = ALPHABET.get();

		assertArrayEquals(expected.toArray(), actual.toArray());
	}

	/**
	 * Проверка метода {@link GujaratiAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new GujaratiAlphabet());
	}

	/**
	 * Проверка метода {@link GujaratiAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new GujaratiAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
