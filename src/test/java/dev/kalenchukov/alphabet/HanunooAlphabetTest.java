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
 * Класс проверки методов класса {@link HanunooAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class HanunooAlphabetTest
{
	/**
	 * Проверка метода {@link HanunooAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		Alphabetical alphabet = new HanunooAlphabet();
		List<Character> expectedList = List.of(
			'ᜠ', 'ᜡ', 'ᜢ', 'ᜣ', 'ᜤ', 'ᜥ', 
			'ᜦ', 'ᜧ', 'ᜨ', 'ᜩ', 'ᜪ', 'ᜫ', 
			'ᜬ', 'ᜭ', 'ᜮ', 'ᜯ', 'ᜰ', 'ᜱ', 
			'ᜲ', 'ᜳ', '᜴', '᜵', '᜶'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
