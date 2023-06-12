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
 * Класс проверки методов класса {@link JavaneseAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class JavaneseAlphabetTest
{
	/**
	 * Проверка метода {@link JavaneseAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		JavaneseAlphabet alphabet = new JavaneseAlphabet();
		List<Character> expectedList = List.of(
			'ꦀ', 'ꦁ', 'ꦂ', 'ꦃ', 'ꦄ', 'ꦅ', 
			'ꦆ', 'ꦇ', 'ꦈ', 'ꦉ', 'ꦊ', 'ꦋ', 
			'ꦌ', 'ꦍ', 'ꦎ', 'ꦏ', 'ꦐ', 'ꦑ', 
			'ꦒ', 'ꦓ', 'ꦔ', 'ꦕ', 'ꦖ', 'ꦗ', 
			'ꦘ', 'ꦙ', 'ꦚ', 'ꦛ', 'ꦜ', 'ꦝ', 
			'ꦞ', 'ꦟ', 'ꦠ', 'ꦡ', 'ꦢ', 'ꦣ', 
			'ꦤ', 'ꦥ', 'ꦦ', 'ꦧ', 'ꦨ', 'ꦩ', 
			'ꦪ', 'ꦫ', 'ꦬ', 'ꦭ', 'ꦮ', 'ꦯ', 
			'ꦰ', 'ꦱ', 'ꦲ', '꦳', 'ꦴ', 'ꦵ', 
			'ꦶ', 'ꦷ', 'ꦸ', 'ꦹ', 'ꦺ', 'ꦻ', 
			'ꦼ', 'ꦽ', 'ꦾ', 'ꦿ', '꧀', '꧁', 
			'꧂', '꧃', '꧄', '꧅', '꧆', '꧇', 
			'꧈', '꧉', '꧊', '꧋', '꧌', '꧍'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link JavaneseAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		JavaneseAlphabet alphabet1 = new JavaneseAlphabet();
		JavaneseAlphabet alphabet2 = new JavaneseAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link JavaneseAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		JavaneseAlphabet alphabet1 = new JavaneseAlphabet();
		JavaneseAlphabet alphabet2 = new JavaneseAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
