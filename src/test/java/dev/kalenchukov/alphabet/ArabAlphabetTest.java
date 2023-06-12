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
 * Класс проверки методов класса {@link ArabAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class ArabAlphabetTest
{
	/**
	 * Проверка метода {@link ArabAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		ArabAlphabet alphabet = new ArabAlphabet();
		List<Character> expectedList = List.of(
			'ﺎ', 'ﺍ', 'ﺐ', 'ﺒ', 'ﺑ', 'ﺏ', 
			'ﺖ', 'ﺘ', 'ﺗ', 'ﺕ', 'ﺚ', 'ﺜ', 
			'ﺛ', 'ﺙ', 'ﺞ', 'ﺠ', 'ﺟ', 'ﺝ', 
			'ﺢ', 'ﺤ', 'ﺣ', 'ﺡ', 'ﺦ', 'ﺨ', 
			'ﺧ', 'ﺥ', 'ﺪ', 'ﺩ', 'ﺬ', 'ﺫ', 
			'ﺮ', 'ﺭ', 'ﺰ', 'ﺯ', 'ﺲ', 'ﺴ', 
			'ﺳ', 'ﺱ', 'ﺶ', 'ﺸ', 'ﺷ', 'ﺵ', 
			'ﺺ', 'ﺼ', 'ﺻ', 'ﺹ', 'ﺾ', 'ﻀ', 
			'ﺿ', 'ﺽ', 'ﻂ', 'ﻄ', 'ﻃ', 'ﻁ', 
			'ﻆ', 'ﻈ', 'ﻇ', 'ﻅ', 'ﻊ', 'ﻌ', 
			'ﻋ', 'ﻉ', 'ﻎ', 'ﻐ', 'ﻏ', 'ﻍ', 
			'ﻒ', 'ﻔ', 'ﻓ', 'ﻑ', 'ﻖ', 'ﻘ', 
			'ﻗ', 'ﻕ', 'ﻚ', 'ﻜ', 'ﻛ', 'ﻙ', 
			'ﻞ', 'ﻠ', 'ﻟ', 'ﻝ', 'ﻢ', 'ﻤ', 
			'ﻣ', 'ﻡ', 'ﻦ', 'ﻨ', 'ﻧ', 'ﻥ', 
			'ﻪ', 'ﻬ', 'ﻫ', 'ﻩ', 'ﻮ', 'ﻭ', 
			'ﻲ', 'ﻴ', 'ﻳ', 'ﻱ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link ArabAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		ArabAlphabet alphabet1 = new ArabAlphabet();
		ArabAlphabet alphabet2 = new ArabAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link ArabAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		ArabAlphabet alphabet1 = new ArabAlphabet();
		ArabAlphabet alphabet2 = new ArabAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
