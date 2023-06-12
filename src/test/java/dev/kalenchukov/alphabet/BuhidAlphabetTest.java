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
 * Класс проверки методов класса {@link BuhidAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class BuhidAlphabetTest
{
	/**
	 * Проверка метода {@link BuhidAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		BuhidAlphabet alphabet = new BuhidAlphabet();
		List<Character> expectedList = List.of(
			'ᝀ', 'ᝁ', 'ᝂ', 'ᝃ', 'ᝄ', 'ᝅ', 
			'ᝆ', 'ᝇ', 'ᝈ', 'ᝉ', 'ᝊ', 'ᝋ', 
			'ᝌ', 'ᝍ', 'ᝎ', 'ᝏ', 'ᝐ', 'ᝑ', 
			'ᝒ', 'ᝓ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link BuhidAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BuhidAlphabet alphabet1 = new BuhidAlphabet();
		BuhidAlphabet alphabet2 = new BuhidAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link BuhidAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BuhidAlphabet alphabet1 = new BuhidAlphabet();
		BuhidAlphabet alphabet2 = new BuhidAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
