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
 * Класс проверки методов класса {@link GurmukhiAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class GurmukhiAlphabetTest
{
	/**
	 * Проверка метода {@link GurmukhiAlphabet#toList()}.
	 */
	@Test
	public void toList()
	{
		Alphabetical alphabet = new GurmukhiAlphabet();
		List<Character> expectedList = List.of(
			'ੳ', 'ਅ', 'ੲ', 'ਸ', 'ਹ', 'ਕ', 
			'ਖ', 'ਗ', 'ਘ', 'ਙ', 'ਚ', 'ਛ', 
			'ਜ', 'ਝ', 'ਞ', 'ਟ', 'ਠ', 'ਡ', 
			'ਢ', 'ਣ', 'ਤ', 'ਥ', 'ਦ', 'ਧ', 
			'ਨ', 'ਪ', 'ਫ', 'ਬ', 'ਭ', 'ਮ', 
			'ਯ', 'ਰ', 'ਲ', 'ਵ', 'ੜ', 'ਸ਼', 
			'ਖ਼', 'ਗ਼', 'ਜ਼', 'ਫ਼', 'ਲ਼', 'ਅ', 
			'ਆ', 'ਇ', 'ਈ', 'ਉ', 'ਊ', 'ਏ', 
			'ਐ', 'ਓ', 'ਔ', 'ੱ', 'ਂ', 'ੰ', 
			'ਃ', '੍', 'ੴ'
		);

		List<Character> actualList = alphabet.toList();

		assertThat(actualList).containsSequence(expectedList);
	}
}
