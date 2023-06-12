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
 * Класс проверки методов класса {@link NewTaiLueAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class NewTaiLueAlphabetTest
{
	/**
	 * Проверка метода {@link NewTaiLueAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		NewTaiLueAlphabet alphabet = new NewTaiLueAlphabet();
		List<Character> expectedList = List.of(
			'ᦀ', 'ᦁ', 'ᦂ', 'ᦃ', 'ᦄ', 'ᦅ', 
			'ᦆ', 'ᦇ', 'ᦈ', 'ᦉ', 'ᦊ', 'ᦋ', 
			'ᦌ', 'ᦍ', 'ᦎ', 'ᦏ', 'ᦐ', 'ᦑ', 
			'ᦒ', 'ᦓ', 'ᦔ', 'ᦕ', 'ᦖ', 'ᦗ', 
			'ᦘ', 'ᦙ', 'ᦚ', 'ᦛ', 'ᦜ', 'ᦝ', 
			'ᦞ', 'ᦟ', 'ᦡ', 'ᦢ', 'ᦣ', 'ᦤ', 
			'ᦥ', 'ᦦ', 'ᦧ', 'ᦨ', 'ᦩ', 'ᦪ', 
			'ᦫ', 'ᦰ', 'ᦱ', 'ᦲ', 'ᦳ', 'ᦴ', 
			'ᦵ', 'ᦶ', 'ᦷ', 'ᦸ', 'ᦹ', 'ᦺ', 
			'ᦻ', 'ᦼ', 'ᦽ', 'ᦾ', 'ᦿ', 'ᧀ', 
			'ᧁ', 'ᧂ', 'ᧃ', 'ᧄ', 'ᧅ', 'ᧆ', 
			'ᧇ', 'ᧈ', 'ᧉ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
