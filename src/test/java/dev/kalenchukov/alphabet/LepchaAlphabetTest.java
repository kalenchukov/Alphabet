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
 * Класс проверки методов класса {@link LepchaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class LepchaAlphabetTest
{
	/**
	 * Проверка метода {@link LepchaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		LepchaAlphabet alphabet = new LepchaAlphabet();
		List<Character> expectedList = List.of(
			'ᰀ', 'ᰁ', 'ᰂ', 'ᰃ', 'ᰄ', 'ᰅ', 
			'ᰆ', 'ᰇ', 'ᰈ', 'ᰉ', 'ᰊ', 'ᰋ', 
			'ᰌ', 'ᰍ', 'ᰎ', 'ᰏ', 'ᰐ', 'ᰑ', 
			'ᰒ', 'ᰓ', 'ᰔ', 'ᰕ', 'ᰖ', 'ᰗ', 
			'ᰘ', 'ᰙ', 'ᰚ', 'ᰛ', 'ᰜ', 'ᰝ', 
			'ᰞ', 'ᰟ', 'ᰠ', 'ᰡ', 'ᰢ', 'ᰣ', 
			'ᰤ', 'ᰥ', 'ᰦ', 'ᰧ', 'ᰨ', 'ᰩ', 
			'ᰪ', 'ᰫ', 'ᰬ', 'ᰭ', 'ᰮ', 'ᰯ', 
			'ᰰ', 'ᰱ', 'ᰲ', 'ᰳ', 'ᰴ', 'ᰵ', 
			'ᰶ', '᰷', 'ᱍ', 'ᱎ', 'ᱏ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link LepchaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		LepchaAlphabet alphabet1 = new LepchaAlphabet();
		LepchaAlphabet alphabet2 = new LepchaAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link LepchaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		LepchaAlphabet alphabet1 = new LepchaAlphabet();
		LepchaAlphabet alphabet2 = new LepchaAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
