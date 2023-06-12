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
 * Класс проверки методов класса {@link MongolianAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class MongolianAlphabetTest
{
	/**
	 * Проверка метода {@link MongolianAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		MongolianAlphabet alphabet = new MongolianAlphabet();
		List<Character> expectedList = List.of(
			'ᠠ', 'ᠡ', 'ᠢ', 'ᠣ', 'ᠤ', 'ᠥ', 
			'ᠦ', 'ᠧ', 'ᠨ', 'ᠩ', 'ᠪ', 'ᠫ', 
			'ᠬ', 'ᠭ', 'ᠮ', 'ᠯ', 'ᠰ', 'ᠱ', 
			'ᠲ', 'ᠳ', 'ᠴ', 'ᠵ', 'ᠶ', 'ᠷ', 
			'ᠸ', 'ᠹ', 'ᠺ', 'ᠻ', 'ᠼ', 'ᠽ', 
			'ᠾ', 'ᠿ', 'ᡀ', 'ᡁ', 'ᡂ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link MongolianAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		MongolianAlphabet alphabet1 = new MongolianAlphabet();
		MongolianAlphabet alphabet2 = new MongolianAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link MongolianAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		MongolianAlphabet alphabet1 = new MongolianAlphabet();
		MongolianAlphabet alphabet2 = new MongolianAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
