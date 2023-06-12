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
 * Класс проверки методов класса {@link LisuAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class LisuAlphabetTest
{
	/**
	 * Проверка метода {@link LisuAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		LisuAlphabet alphabet = new LisuAlphabet();
		List<Character> expectedList = List.of(
			'ꓐ', 'ꓑ', 'ꓒ', 'ꓓ', 'ꓔ', 'ꓕ', 
			'ꓖ', 'ꓗ', 'ꓘ', 'ꓙ', 'ꓚ', 'ꓛ', 
			'ꓜ', 'ꓝ', 'ꓞ', 'ꓟ', 'ꓠ', 'ꓡ', 
			'ꓢ', 'ꓣ', 'ꓤ', 'ꓥ', 'ꓦ', 'ꓧ', 
			'ꓨ', 'ꓩ', 'ꓪ', 'ꓫ', 'ꓬ', 'ꓭ', 
			'ꓮ', 'ꓯ', 'ꓰ', 'ꓱ', 'ꓲ', 'ꓳ', 
			'ꓴ', 'ꓵ', 'ꓶ', 'ꓷ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link LisuAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		LisuAlphabet alphabet1 = new LisuAlphabet();
		LisuAlphabet alphabet2 = new LisuAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link LisuAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		LisuAlphabet alphabet1 = new LisuAlphabet();
		LisuAlphabet alphabet2 = new LisuAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
