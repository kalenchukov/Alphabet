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
 * Класс проверки методов класса {@link EsperantoAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class EsperantoAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link EsperantoAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		EsperantoAlphabet.UpperCase alphabet = new EsperantoAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'A', 'B', 'C', 'Ĉ', 'D', 'E', 
			'F', 'G', 'Ĝ', 'H', 'Ĥ', 'I', 
			'J', 'Ĵ', 'K', 'L', 'M', 'N', 
			'O', 'P', 'R', 'S', 'Ŝ', 'T', 
			'U', 'Ŭ', 'V', 'Z'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link EsperantoAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		EsperantoAlphabet.UpperCase alphabet1 = new EsperantoAlphabet.UpperCase();
		EsperantoAlphabet.UpperCase alphabet2 = new EsperantoAlphabet.UpperCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link EsperantoAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		EsperantoAlphabet.UpperCase alphabet1 = new EsperantoAlphabet.UpperCase();
		EsperantoAlphabet.UpperCase alphabet2 = new EsperantoAlphabet.UpperCase();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
