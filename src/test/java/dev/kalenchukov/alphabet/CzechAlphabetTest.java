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
 * Класс проверки методов класса {@link CzechAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class CzechAlphabetTest
{
	/**
	 * Проверка метода {@link CzechAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		CzechAlphabet alphabet = new CzechAlphabet();
		List<Character> expectedList = List.of(
			'A', 'Á', 'B', 'C', 'Č', 'D', 
			'Ď', 'E', 'É', 'Ě', 'F', 'G', 
			'H', 'I', 'Í', 'J', 'K', 'L', 
			'M', 'N', 'Ň', 'O', 'Ó', 'P', 
			'Q', 'R', 'Ř', 'S', 'Š', 'T', 
			'Ť', 'U', 'Ú', 'Ů', 'V', 'W', 
			'X', 'Y', 'Ý', 'Z', 'Ž'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link CzechAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		CzechAlphabet alphabet1 = new CzechAlphabet();
		CzechAlphabet alphabet2 = new CzechAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link CzechAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		CzechAlphabet alphabet1 = new CzechAlphabet();
		CzechAlphabet alphabet2 = new CzechAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
