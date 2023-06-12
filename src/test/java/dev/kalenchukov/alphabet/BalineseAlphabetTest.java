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
 * Класс проверки методов класса {@link BalineseAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class BalineseAlphabetTest
{
	/**
	 * Проверка метода {@link BalineseAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		BalineseAlphabet alphabet = new BalineseAlphabet();
		List<Character> expectedList = List.of(
			'ᬅ', 'ᬆ', 'ᬇ', 'ᬈ', 'ᬉ', 'ᬊ', 
			'ᬋ', 'ᬌ', 'ᬍ', 'ᬎ', 'ᬏ', 'ᬐ', 
			'ᬑ', 'ᬒ', 'ᬓ', 'ᬔ', 'ᬕ', 'ᬖ', 
			'ᬗ', 'ᬘ', 'ᬙ', 'ᬚ', 'ᬛ', 'ᬜ', 
			'ᬝ', 'ᬞ', 'ᬟ', 'ᬠ', 'ᬡ', 'ᬢ', 
			'ᬣ', 'ᬤ', 'ᬥ', 'ᬦ', 'ᬧ', 'ᬨ', 
			'ᬩ', 'ᬪ', 'ᬫ', 'ᬬ', 'ᬭ', 'ᬮ', 
			'ᬯ', 'ᬰ', 'ᬱ', 'ᬲ', 'ᬳ', 'ᬀ', 
			'ᬁ', 'ᬂ', 'ᬃ', 'ᬄ', '᬴', 'ᬵ', 
			'ᬶ', 'ᬷ', 'ᬸ', 'ᬹ', 'ᬺ', 'ᬻ', 
			'ᬼ', 'ᬽ', 'ᬾ', 'ᬿ', 'ᭀ', 'ᭁ', 
			'ᭂ', 'ᭃ', '᭄', 'ᭅ', 'ᭆ', 'ᭇ', 
			'ᭈ', 'ᭉ', 'ᭊ', 'ᭋ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link BalineseAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BalineseAlphabet alphabet1 = new BalineseAlphabet();
		BalineseAlphabet alphabet2 = new BalineseAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link BalineseAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BalineseAlphabet alphabet1 = new BalineseAlphabet();
		BalineseAlphabet alphabet2 = new BalineseAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
