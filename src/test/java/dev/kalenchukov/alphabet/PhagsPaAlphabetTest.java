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
 * Класс проверки методов класса {@link PhagsPaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class PhagsPaAlphabetTest
{
	/**
	 * Проверка метода {@link PhagsPaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		PhagsPaAlphabet alphabet = new PhagsPaAlphabet();
		List<Character> expectedList = List.of(
			'ꡀ', 'ꡁ', 'ꡂ', 'ꡃ', 'ꡄ', 'ꡅ', 
			'ꡆ', 'ꡇ', 'ꡈ', 'ꡉ', 'ꡊ', 'ꡋ', 
			'ꡌ', 'ꡍ', 'ꡎ', 'ꡏ', 'ꡐ', 'ꡑ', 
			'ꡒ', 'ꡓ', 'ꡔ', 'ꡕ', 'ꡖ', 'ꡗ', 
			'ꡘ', 'ꡙ', 'ꡚ', 'ꡛ', 'ꡜ', 'ꡝ', 
			'ꡞ', 'ꡟ', 'ꡠ', 'ꡡ', 'ꡢ', 'ꡣ', 
			'ꡤ', 'ꡥ', 'ꡦ', 'ꡧ', 'ꡨ', 'ꡩ', 
			'ꡪ', 'ꡫ', 'ꡬ', 'ꡭ', 'ꡮ', 'ꡯ', 
			'ꡰ', 'ꡱ', 'ꡲ', 'ꡳ', '꡴', '꡵', 
			'꡶', '꡷'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link PhagsPaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		PhagsPaAlphabet alphabet1 = new PhagsPaAlphabet();
		PhagsPaAlphabet alphabet2 = new PhagsPaAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link PhagsPaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		PhagsPaAlphabet alphabet1 = new PhagsPaAlphabet();
		PhagsPaAlphabet alphabet2 = new PhagsPaAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
