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
 * Класс проверки методов класса {@link OlChikiAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class OlChikiAlphabetTest
{
	/**
	 * Проверка метода {@link OlChikiAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		OlChikiAlphabet alphabet = new OlChikiAlphabet();
		List<Character> expectedList = List.of(
			'᱐', '᱑', '᱒', '᱓', '᱔', '᱕', 
			'᱖', '᱗', '᱘', '᱙', 'ᱚ', 'ᱛ', 
			'ᱜ', 'ᱝ', 'ᱞ', 'ᱟ', 'ᱠ', 'ᱡ', 
			'ᱢ', 'ᱣ', 'ᱤ', 'ᱥ', 'ᱦ', 'ᱧ', 
			'ᱨ', 'ᱩ', 'ᱪ', 'ᱫ', 'ᱬ', 'ᱭ', 
			'ᱮ', 'ᱯ', 'ᱰ', 'ᱱ', 'ᱲ', 'ᱳ', 
			'ᱴ', 'ᱵ', 'ᱶ', 'ᱷ', 'ᱸ', 'ᱹ', 
			'ᱺ', 'ᱻ', 'ᱼ', 'ᱽ', '᱾', '᱿'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link OlChikiAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		OlChikiAlphabet alphabet1 = new OlChikiAlphabet();
		OlChikiAlphabet alphabet2 = new OlChikiAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link OlChikiAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		OlChikiAlphabet alphabet1 = new OlChikiAlphabet();
		OlChikiAlphabet alphabet2 = new OlChikiAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
