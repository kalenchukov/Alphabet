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
 * Класс проверки методов класса {@link BamumAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class BamumAlphabetTest
{
	/**
	 * Проверка метода {@link BamumAlphabet#toList()}.
	 */
	@Test
	public void toList()
	{
		Alphabetical alphabet = new BamumAlphabet();
		List<Character> expectedList = List.of(
			'ꚠ', 'ꚡ', 'ꚢ', 'ꚣ', 'ꚤ', 'ꚥ', 
			'ꚦ', 'ꚧ', 'ꚨ', 'ꚩ', 'ꚪ', 'ꚫ', 
			'ꚬ', 'ꚭ', 'ꚮ', 'ꚯ', 'ꚰ', 'ꚱ', 
			'ꚲ', 'ꚳ', 'ꚴ', 'ꚵ', 'ꚶ', 'ꚷ', 
			'ꚸ', 'ꚹ', 'ꚺ', 'ꚻ', 'ꚼ', 'ꚽ', 
			'ꚾ', 'ꚿ', 'ꛀ', 'ꛁ', 'ꛂ', 'ꛃ', 
			'ꛄ', 'ꛅ', 'ꛆ', 'ꛇ', 'ꛈ', 'ꛉ', 
			'ꛊ', 'ꛋ', 'ꛌ', 'ꛍ', 'ꛎ', 'ꛏ', 
			'ꛐ', 'ꛑ', 'ꛒ', 'ꛓ', 'ꛔ', 'ꛕ', 
			'ꛖ', 'ꛗ', 'ꛘ', 'ꛙ', 'ꛚ', 'ꛛ', 
			'ꛜ', 'ꛝ', 'ꛞ', 'ꛟ', 'ꛠ', 'ꛡ', 
			'ꛢ', 'ꛣ', 'ꛤ', 'ꛥ', 'ꛦ', 'ꛧ', 
			'ꛨ', 'ꛩ', 'ꛪ', 'ꛫ', 'ꛬ', 'ꛭ', 
			'ꛮ', 'ꛯ'
		);

		List<Character> actualList = alphabet.toList();

		assertThat(actualList).containsSequence(expectedList);
	}
}
