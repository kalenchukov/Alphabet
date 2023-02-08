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

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link EsperantoAlphabet.UpperCase}.
 */
public class EsperantoAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new EsperantoAlphabet.UpperCase();

	/**
	 * Проверка метода {@link EsperantoAlphabet.UpperCase#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'A', 'B', 'C', 'Ĉ', 'D', 'E', 
			'F', 'G', 'Ĝ', 'H', 'Ĥ', 'I', 
			'J', 'Ĵ', 'K', 'L', 'M', 'N', 
			'O', 'P', 'R', 'S', 'Ŝ', 'T', 
			'U', 'Ŭ', 'V', 'Z'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link EsperantoAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertFalse(ALPHABET.equals(new RussianAlphabet.UpperCase()));

		assertTrue(ALPHABET.equals(new EsperantoAlphabet.UpperCase()));
	}

	/**
	 * Проверка метода {@link EsperantoAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new EsperantoAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
