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
 * Класс проверки методов класса {@link HangulAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class HangulAlphabetTest
{
	/**
	 * Проверка метода {@link HangulAlphabet#toList()}.
	 */
	@Test
	public void toList()
	{
		Alphabetical alphabet = new HangulAlphabet();
		List<Character> expectedList = List.of(
			'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 
			'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 
			'ㅍ', 'ㅎ', 'ㅏ', 'ㅓ', 'ㅗ', 'ㅜ', 
			'ㅡ', 'ㅣ', 'ㅑ', 'ㅕ', 'ㅛ', 'ㅠ', 
			'ㄲ', 'ㄸ', 'ㅃ', 'ㅆ', 'ㅉ', 'ㄳ', 
			'ㄵ', 'ㄶ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 
			'ㄾ', 'ㄿ', 'ㅀ', 'ㅄ', 'ㅐ', 'ㅒ', 
			'ㅔ', 'ㅖ', 'ㅘ', 'ㅙ', 'ㅚ', 'ㅝ', 
			'ㅞ', 'ㅟ', 'ㅢ'
		);

		List<Character> actualList = alphabet.toList();

		assertThat(actualList).containsSequence(expectedList);
	}
}
