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
 * Класс проверки методов класса {@link CopticAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class CopticAlphabetTest
{
	/**
	 * Проверка метода {@link CopticAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		Alphabetical alphabet = new CopticAlphabet();
		List<Character> expectedList = List.of(
			'Ⲁ', 'ⲁ', 'Ⲃ', 'ⲃ', 'Ⲅ', 'ⲅ', 
			'Ⲇ', 'ⲇ', 'Ⲉ', 'ⲉ', 'Ⲋ', 'ⲋ', 
			'Ⲍ', 'ⲍ', 'Ⲏ', 'ⲏ', 'Ⲑ', 'ⲑ', 
			'Ⲓ', 'ⲓ', 'Ⲕ', 'ⲕ', 'Ⲗ', 'ⲗ', 
			'Ⲙ', 'ⲙ', 'Ⲛ', 'ⲛ', 'Ⲝ', 'ⲝ', 
			'Ⲟ', 'ⲟ', 'Ⲡ', 'ⲡ', 'Ⲣ', 'ⲣ', 
			'Ⲥ', 'ⲥ', 'Ⲧ', 'ⲧ', 'Ⲩ', 'ⲩ', 
			'Ⲫ', 'ⲫ', 'Ⲭ', 'ⲭ', 'Ⲯ', 'ⲯ', 
			'Ⲱ', 'ⲱ', 'Ⲳ', 'ⲳ', 'Ⲵ', 'ⲵ', 
			'Ⲷ', 'ⲷ', 'Ⲹ', 'ⲹ', 'Ⲻ', 'ⲻ', 
			'Ⲽ', 'ⲽ', 'Ⲿ', 'ⲿ', 'Ⳁ', 'ⳁ', 
			'Ⳃ', 'ⳃ', 'Ⳅ', 'ⳅ', 'Ⳇ', 'ⳇ', 
			'Ⳉ', 'ⳉ', 'Ⳋ', 'ⳋ', 'Ⳍ', 'ⳍ', 
			'Ⳏ', 'ⳏ', 'Ⳑ', 'ⳑ', 'Ⳓ', 'ⳓ', 
			'Ⳕ', 'ⳕ', 'Ⳗ', 'ⳗ', 'Ⳙ', 'ⳙ', 
			'Ⳛ', 'ⳛ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
