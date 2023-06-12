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
 * Класс проверки методов класса {@link TagalogAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class TagalogAlphabetTest
{
	/**
	 * Проверка метода {@link TagalogAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		TagalogAlphabet alphabet = new TagalogAlphabet();
		List<Character> expectedList = List.of(
			'ᜀ', 'ᜁ', 'ᜂ', 'ᜃ', 'ᜄ', 'ᜅ', 
			'ᜆ', 'ᜇ', 'ᜈ', 'ᜉ', 'ᜊ', 'ᜋ', 
			'ᜌ', 'ᜎ', 'ᜏ', 'ᜐ', 'ᜑ', 'ᜒ', 
			'ᜓ', '᜔'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link TagalogAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		TagalogAlphabet alphabet1 = new TagalogAlphabet();
		TagalogAlphabet alphabet2 = new TagalogAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link TagalogAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		TagalogAlphabet alphabet1 = new TagalogAlphabet();
		TagalogAlphabet alphabet2 = new TagalogAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
