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
 * Класс проверки методов класса {@link MyanmarAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class MyanmarAlphabetTest
{
	/**
	 * Проверка метода {@link MyanmarAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		MyanmarAlphabet alphabet = new MyanmarAlphabet();
		List<Character> expectedList = List.of(
			'က', 'ခ', 'ဂ', 'ဃ', 'င', 'စ', 
			'ဆ', 'ဇ', 'ဈ', 'ည', 'ဋ', 'ဌ', 
			'ဍ', 'ဎ', 'ဏ', 'တ', 'ထ', 'ဒ', 
			'ဓ', 'န', 'ပ', 'ဖ', 'ဗ', 'ဘ', 
			'မ', 'ယ', 'ရ', 'လ', 'ဝ', 'သ', 
			'ဟ', 'ဠ', 'အ', 'ဢ', 'ဣ', 'ဤ', 
			'ဥ', 'ဦ', 'ဧ', 'ဨ', 'ဩ', 'ဪ', 
			'ါ', 'ာ', 'ိ', 'ီ', 'ု', 'ူ', 
			'ေ', 'ဲ', 'ဳ', 'ဴ', 'ဵ', 'ံ', 
			'့', 'း', '္', '်', 'ျ', 'ြ', 
			'ွ', 'ှ', 'ဿ', '၀', '၁', '၂', 
			'၃', '၄', '၅', '၆', '၇', '၈', 
			'၉', '၊', '။', '၌', '၍', '၎', 
			'၏', 'ၐ', 'ၑ', 'ၒ', 'ၓ', 'ၔ', 
			'ၕ', 'ၖ', 'ၗ', 'ၘ', 'ၙ', 'ၚ', 
			'ၛ', 'ၜ', 'ၝ', 'ၞ', 'ၟ', 'ၠ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
