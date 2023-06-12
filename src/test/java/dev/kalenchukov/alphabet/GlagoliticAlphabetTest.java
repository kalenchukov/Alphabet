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
 * Класс проверки методов класса {@link GlagoliticAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class GlagoliticAlphabetTest
{
	/**
	 * Проверка метода {@link GlagoliticAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		GlagoliticAlphabet alphabet = new GlagoliticAlphabet();
		List<Character> expectedList = List.of(
			'Ⰰ', 'Ⰱ', 'Ⰲ', 'Ⰳ', 'Ⰴ', 'Ⰵ', 
			'Ⰶ', 'Ⰷ', 'Ⰸ', 'Ⰹ', 'Ⰺ', 'Ⰻ', 
			'Ⰼ', 'Ⰽ', 'Ⰾ', 'Ⰿ', 'Ⱀ', 'Ⱁ', 
			'Ⱂ', 'Ⱃ', 'Ⱄ', 'Ⱅ', 'Ⱛ', 'Ⱆ', 
			'Ⱇ', 'Ⱈ', 'Ⱉ', 'Ⱊ', 'Ⱋ', 'Ⱌ', 
			'Ⱍ', 'Ⱎ', 'Ⱏ', 'Ⱐ', 'Ⱑ', 'Ⱒ', 
			'Ⱓ', 'Ⱔ', 'Ⱖ', 'Ⱗ', 'Ⱘ', 'Ⱙ', 
			'Ⱚ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link GlagoliticAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		GlagoliticAlphabet alphabet1 = new GlagoliticAlphabet();
		GlagoliticAlphabet alphabet2 = new GlagoliticAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link GlagoliticAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		GlagoliticAlphabet alphabet1 = new GlagoliticAlphabet();
		GlagoliticAlphabet alphabet2 = new GlagoliticAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
