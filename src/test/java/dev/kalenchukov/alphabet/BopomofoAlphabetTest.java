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
 * Класс проверки методов класса {@link BopomofoAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class BopomofoAlphabetTest
{
	/**
	 * Проверка метода {@link BopomofoAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		BopomofoAlphabet alphabet = new BopomofoAlphabet();
		List<Character> expectedList = List.of(
			'ㄅ', 'ㄆ', 'ㄇ', 'ㄈ', 'ㄉ', 'ㄊ', 
			'ㄋ', 'ㄌ', 'ㄍ', 'ㄎ', 'ㄏ', 'ㄐ', 
			'ㄑ', 'ㄒ', 'ㄓ', 'ㄔ', 'ㄕ', 'ㄖ', 
			'ㄗ', 'ㄘ', 'ㄙ', 'ㄚ', 'ㄛ', 'ㄜ', 
			'ㄝ', 'ㄞ', 'ㄟ', 'ㄠ', 'ㄡ', 'ㄢ', 
			'ㄣ', 'ㄤ', 'ㄥ', 'ㄦ', 'ㄧ', 'ㄨ', 
			'ㄩ', 'ㄪ', 'ㄫ', 'ㄬ', 'ㄭ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link BopomofoAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BopomofoAlphabet alphabet1 = new BopomofoAlphabet();
		BopomofoAlphabet alphabet2 = new BopomofoAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link BopomofoAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BopomofoAlphabet alphabet1 = new BopomofoAlphabet();
		BopomofoAlphabet alphabet2 = new BopomofoAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
