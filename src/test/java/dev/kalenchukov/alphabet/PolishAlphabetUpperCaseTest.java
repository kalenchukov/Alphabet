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
 * Класс проверки методов класса {@link PolishAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class PolishAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link PolishAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		PolishAlphabet.UpperCase alphabet = new PolishAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'A', 'Ą', 'B', 'C', 'Ć', 'D', 
			'E', 'Ę', 'F', 'G', 'H', 'I', 
			'J', 'K', 'L', 'Ł', 'M', 'N', 
			'Ń', 'O', 'Ó', 'P', 'R', 'S', 
			'Ś', 'T', 'U', 'W', 'Y', 'Z', 
			'Ź', 'Ż'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link PolishAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		PolishAlphabet.UpperCase alphabet1 = new PolishAlphabet.UpperCase();
		PolishAlphabet.UpperCase alphabet2 = new PolishAlphabet.UpperCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link PolishAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		PolishAlphabet.UpperCase alphabet1 = new PolishAlphabet.UpperCase();
		PolishAlphabet.UpperCase alphabet2 = new PolishAlphabet.UpperCase();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
