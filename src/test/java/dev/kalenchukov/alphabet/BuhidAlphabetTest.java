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
	 * Проверка метода {@link BuhidAlphabet#toList()}.
	 */
	@Test
	public void toList()
	{
		Alphabetical alphabet = new BuhidAlphabet();
		List<Character> expectedList = List.of(
			'ᝀ', 'ᝁ', 'ᝂ', 'ᝃ', 'ᝄ', 'ᝅ', 
			'ᝆ', 'ᝇ', 'ᝈ', 'ᝉ', 'ᝊ', 'ᝋ', 
			'ᝌ', 'ᝍ', 'ᝎ', 'ᝏ', 'ᝐ', 'ᝑ', 
			'ᝒ', 'ᝓ'
		);

		List<Character> actualList = alphabet.toList();

		assertThat(actualList).containsSequence(expectedList);
	}
}
