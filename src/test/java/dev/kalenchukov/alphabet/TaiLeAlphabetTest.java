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
 * Класс проверки методов класса {@link TaiLeAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class TaiLeAlphabetTest
{
	/**
	 * Проверка метода {@link TaiLeAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		TaiLeAlphabet alphabet = new TaiLeAlphabet();
		List<Character> expectedList = List.of(
			'ᥐ', 'ᥑ', 'ᥒ', 'ᥓ', 'ᥔ', 'ᥕ', 
			'ᥖ', 'ᥗ', 'ᥘ', 'ᥙ', 'ᥚ', 'ᥛ', 
			'ᥜ', 'ᥝ', 'ᥞ', 'ᥟ', 'ᥠ', 'ᥡ', 
			'ᥢ', 'ᥣ', 'ᥤ', 'ᥥ', 'ᥦ', 'ᥧ', 
			'ᥨ', 'ᥩ', 'ᥪ', 'ᥫ', 'ᥬ', 'ᥭ', 
			'ᥰ', 'ᥱ', 'ᥲ', 'ᥳ', 'ᥴ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link TaiLeAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		TaiLeAlphabet alphabet1 = new TaiLeAlphabet();
		TaiLeAlphabet alphabet2 = new TaiLeAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link TaiLeAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		TaiLeAlphabet alphabet1 = new TaiLeAlphabet();
		TaiLeAlphabet alphabet2 = new TaiLeAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
