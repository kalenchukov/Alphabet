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
 * Класс проверки методов класса {@link TibetanAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class TibetanAlphabetTest
{
	/**
	 * Проверка метода {@link TibetanAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		TibetanAlphabet alphabet = new TibetanAlphabet();
		List<Character> expectedList = List.of(
			'ཀ', 'ཁ', 'ག', 'ང', 'ཅ', 'ཆ', 
			'ཇ', 'ཉ', 'ཏ', 'ཐ', 'ད', 'ན', 
			'པ', 'ཕ', 'བ', 'མ', 'ཙ', 'ཚ', 
			'ཛ', 'ཝ', 'ཞ', 'ཟ', 'འ', 'ཡ', 
			'ར', 'ལ', 'ཤ', 'ས', 'ཧ', 'ཨ', 
			'ཀྵ', 'ཪ', 'ཫ', 'ཬ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link TibetanAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		TibetanAlphabet alphabet1 = new TibetanAlphabet();
		TibetanAlphabet alphabet2 = new TibetanAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link TibetanAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		TibetanAlphabet alphabet1 = new TibetanAlphabet();
		TibetanAlphabet alphabet2 = new TibetanAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
