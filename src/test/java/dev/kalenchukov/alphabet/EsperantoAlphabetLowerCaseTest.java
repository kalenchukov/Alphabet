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
 * Класс проверки методов класса {@link EsperantoAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class EsperantoAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link EsperantoAlphabet.LowerCase#get()}.
	 */
	@Test
	public void get()
	{
		EsperantoAlphabet.LowerCase alphabet = new EsperantoAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'a', 'b', 'c', 'ĉ', 'd', 'e', 
			'f', 'g', 'ĝ', 'h', 'ĥ', 'i', 
			'j', 'ĵ', 'k', 'l', 'm', 'n', 
			'o', 'p', 'r', 's', 'ŝ', 't', 
			'u', 'ŭ', 'v', 'z'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link EsperantoAlphabet.LowerCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		EsperantoAlphabet.LowerCase alphabet1 = new EsperantoAlphabet.LowerCase();
		EsperantoAlphabet.LowerCase alphabet2 = new EsperantoAlphabet.LowerCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link EsperantoAlphabet.LowerCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		EsperantoAlphabet.LowerCase alphabet1 = new EsperantoAlphabet.LowerCase();
		EsperantoAlphabet.LowerCase alphabet2 = new EsperantoAlphabet.LowerCase();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
