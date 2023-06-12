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
 * Класс проверки методов класса {@link TaiVietAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class TaiVietAlphabetTest
{
	/**
	 * Проверка метода {@link TaiVietAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		TaiVietAlphabet alphabet = new TaiVietAlphabet();
		List<Character> expectedList = List.of(
			'ꪀ', 'ꪁ', 'ꪂ', 'ꪃ', 'ꪄ', 'ꪅ', 
			'ꪆ', 'ꪇ', 'ꪈ', 'ꪉ', 'ꪊ', 'ꪋ', 
			'ꪌ', 'ꪍ', 'ꪎ', 'ꪏ', 'ꪐ', 'ꪑ', 
			'ꪒ', 'ꪓ', 'ꪔ', 'ꪕ', 'ꪖ', 'ꪗ', 
			'ꪘ', 'ꪙ', 'ꪚ', 'ꪛ', 'ꪜ', 'ꪝ', 
			'ꪞ', 'ꪟ', 'ꪠ', 'ꪡ', 'ꪢ', 'ꪣ', 
			'ꪤ', 'ꪥ', 'ꪦ', 'ꪧ', 'ꪨ', 'ꪩ', 
			'ꪪ', 'ꪫ', 'ꪬ', 'ꪭ', 'ꪮ', 'ꪯ', 
			'ꪰ', 'ꪱ', 'ꪲ', 'ꪳ', 'ꪴ', 'ꪵ', 
			'ꪶ', 'ꪷ', 'ꪸ', 'ꪹ', 'ꪺ', 'ꪻ', 
			'ꪼ', 'ꪽ', 'ꪾ', '꪿', 'ꫀ', '꫁', 
			'ꫂ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link TaiVietAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		TaiVietAlphabet alphabet1 = new TaiVietAlphabet();
		TaiVietAlphabet alphabet2 = new TaiVietAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link TaiVietAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		TaiVietAlphabet alphabet1 = new TaiVietAlphabet();
		TaiVietAlphabet alphabet2 = new TaiVietAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
