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

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link BatakAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class BatakAlphabetTest
{
	/**
	 * Проверка метода {@link BatakAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		BatakAlphabet alphabet = new BatakAlphabet();
		List<Character> expectedList = List.of(
			'ᯀ', 'ᯁ', 'ᯂ', 'ᯃ', 'ᯄ', 'ᯅ', 
			'ᯆ', 'ᯇ', 'ᯈ', 'ᯉ', 'ᯊ', 'ᯋ', 
			'ᯌ', 'ᯍ', 'ᯎ', 'ᯏ', 'ᯐ', 'ᯑ', 
			'ᯒ', 'ᯓ', 'ᯔ', 'ᯕ', 'ᯖ', 'ᯗ', 
			'ᯘ', 'ᯙ', 'ᯚ', 'ᯛ', 'ᯜ', 'ᯝ', 
			'ᯞ', 'ᯟ', 'ᯠ', 'ᯡ', 'ᯢ', 'ᯣ', 
			'ᯤ', 'ᯥ', '᯦', 'ᯧ', 'ᯨ', 'ᯩ', 
			'ᯪ', 'ᯫ', 'ᯬ', 'ᯭ', 'ᯮ', 'ᯯ', 
			'ᯰ', 'ᯱ', '᯲', '᯳'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link BatakAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BatakAlphabet alphabet1 = new BatakAlphabet();
		BatakAlphabet alphabet2 = new BatakAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link BatakAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BatakAlphabet alphabet1 = new BatakAlphabet();
		BatakAlphabet alphabet2 = new BatakAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
