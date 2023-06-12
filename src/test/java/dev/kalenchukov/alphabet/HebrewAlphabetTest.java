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
 * Класс проверки методов класса {@link HebrewAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class HebrewAlphabetTest
{
	/**
	 * Проверка метода {@link HebrewAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		HebrewAlphabet alphabet = new HebrewAlphabet();
		List<Character> expectedList = List.of(
			'א', 'ב', 'ג', 'ד', 'ה', 'ו', 
			'ז', 'ח', 'ט', 'י', 'כ', 'ך', 
			'ל', 'מ', 'ם', 'נ', 'ן', 'ס', 
			'ע', 'פ', 'ף', 'צ', 'ץ', 'ק', 
			'ר', 'ש', 'ת'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link HebrewAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		HebrewAlphabet alphabet1 = new HebrewAlphabet();
		HebrewAlphabet alphabet2 = new HebrewAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link HebrewAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		HebrewAlphabet alphabet1 = new HebrewAlphabet();
		HebrewAlphabet alphabet2 = new HebrewAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
