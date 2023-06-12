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
 * Класс проверки методов класса {@link FrenchAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class FrenchAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link FrenchAlphabet.LowerCase#get()}.
	 */
	@Test
	public void get()
	{
		FrenchAlphabet.LowerCase alphabet = new FrenchAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'a', 'b', 'c', 'd', 'e', 'f', 
			'g', 'h', 'i', 'j', 'k', 'l', 
			'm', 'n', 'o', 'p', 'q', 'r', 
			's', 't', 'u', 'v', 'w', 'x', 
			'y', 'z'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link FrenchAlphabet.LowerCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		FrenchAlphabet.LowerCase alphabet1 = new FrenchAlphabet.LowerCase();
		FrenchAlphabet.LowerCase alphabet2 = new FrenchAlphabet.LowerCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link FrenchAlphabet.LowerCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		FrenchAlphabet.LowerCase alphabet1 = new FrenchAlphabet.LowerCase();
		FrenchAlphabet.LowerCase alphabet2 = new FrenchAlphabet.LowerCase();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
