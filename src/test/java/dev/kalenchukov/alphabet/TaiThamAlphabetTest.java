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
 * Класс проверки методов класса {@link TaiThamAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class TaiThamAlphabetTest
{
	/**
	 * Проверка метода {@link TaiThamAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		TaiThamAlphabet alphabet = new TaiThamAlphabet();
		List<Character> expectedList = List.of(
			'ᨠ', 'ᨡ', 'ᨢ', 'ᨣ', 'ᨤ', 'ᨥ', 
			'ᨦ', 'ᨧ', 'ᨨ', 'ᨩ', 'ᨪ', 'ᨫ', 
			'ᨬ', 'ᨭ', 'ᨮ', 'ᨯ', 'ᨰ', 'ᨱ', 
			'ᨲ', 'ᨳ', 'ᨴ', 'ᨵ', 'ᨶ', 'ᨷ', 
			'ᨸ', 'ᨹ', 'ᨺ', 'ᨻ', 'ᨼ', 'ᨽ', 
			'ᨾ', 'ᨿ', 'ᩀ', 'ᩁ', 'ᩂ', 'ᩃ', 
			'ᩄ', 'ᩅ', 'ᩆ', 'ᩇ', 'ᩈ', 'ᩉ', 
			'ᩊ', 'ᩋ', 'ᩌ', 'ᩐ', 'ᩑ', 'ᩒ', 
			'ᩓ', 'ᩔ', 'ᩕ', 'ᩖ', 'ᩗ', 'ᩘ', 
			'ᩙ', 'ᩚ', 'ᩛ', 'ᩜ', 'ᩝ', 'ᩞ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link TaiThamAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		TaiThamAlphabet alphabet1 = new TaiThamAlphabet();
		TaiThamAlphabet alphabet2 = new TaiThamAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link TaiThamAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		TaiThamAlphabet alphabet1 = new TaiThamAlphabet();
		TaiThamAlphabet alphabet2 = new TaiThamAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
