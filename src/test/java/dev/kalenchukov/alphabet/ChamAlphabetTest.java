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
 * Класс проверки методов класса {@link ChamAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class ChamAlphabetTest
{
	/**
	 * Проверка метода {@link ChamAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		ChamAlphabet alphabet = new ChamAlphabet();
		List<Character> expectedList = List.of(
			'ꨀ', 'ꨁ', 'ꨂ', 'ꨃ', 'ꨄ', 'ꨅ', 
			'ꨆ', 'ꨇ', 'ꨈ', 'ꨉ', 'ꨊ', 'ꨋ', 
			'ꨌ', 'ꨍ', 'ꨎ', 'ꨏ', 'ꨐ', 'ꨑ', 
			'ꨒ', 'ꨓ', 'ꨔ', 'ꨕ', 'ꨖ', 'ꨗ', 
			'ꨘ', 'ꨙ', 'ꨚ', 'ꨛ', 'ꨜ', 'ꨝ', 
			'ꨞ', 'ꨟ', 'ꨠ', 'ꨡ', 'ꨢ', 'ꨣ', 
			'ꨤ', 'ꨥ', 'ꨦ', 'ꨧ', 'ꨨ', 'ꨩ', 
			'ꨪ', 'ꨫ', 'ꨬ', 'ꨭ', 'ꨮ', 'ꨯ', 
			'ꨰ', 'ꨱ', 'ꨲ', 'ꨳ', 'ꨴ', 'ꨵ', 
			'ꨶ', 'ꩀ', 'ꩁ', 'ꩂ', 'ꩃ', 'ꩄ', 
			'ꩅ', 'ꩆ', 'ꩇ', 'ꩈ', 'ꩉ', 'ꩊ', 
			'ꩋ', 'ꩌ', 'ꩍ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link ChamAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		ChamAlphabet alphabet1 = new ChamAlphabet();
		ChamAlphabet alphabet2 = new ChamAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link ChamAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		ChamAlphabet alphabet1 = new ChamAlphabet();
		ChamAlphabet alphabet2 = new ChamAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
