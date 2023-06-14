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
 * Класс проверки методов класса {@link SamaritanAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class SamaritanAlphabetTest
{
	/**
	 * Проверка метода {@link SamaritanAlphabet#toList()}.
	 */
	@Test
	public void toList()
	{
		Alphabetical alphabet = new SamaritanAlphabet();
		List<Character> expectedList = List.of(
			'ࠀ', 'ࠁ', 'ࠂ', 'ࠃ', 'ࠄ', 'ࠅ', 
			'ࠆ', 'ࠇ', 'ࠈ', 'ࠉ', 'ࠊ', 'ࠋ', 
			'ࠌ', 'ࠍ', 'ࠎ', 'ࠏ', 'ࠐ', 'ࠑ', 
			'ࠒ', 'ࠓ', 'ࠔ', 'ࠕ', 'ࠖ', 'ࠗ', 
			'࠘', '࠙', 'ࠚ', 'ࠛ', 'ࠜ', 'ࠝ', 
			'ࠞ', 'ࠟ', 'ࠠ', 'ࠡ', 'ࠢ', 'ࠣ', 
			'ࠤ', 'ࠥ', 'ࠦ', 'ࠧ', 'ࠨ', 'ࠩ', 
			'ࠪ', 'ࠫ', 'ࠬ', '࠭', '࠰', '࠱', 
			'࠲', '࠳', '࠴', '࠵', '࠶', '࠷', 
			'࠸', '࠹', '࠺', '࠻', '࠼', '࠽', 
			'࠾'
		);

		List<Character> actualList = alphabet.toList();

		assertThat(actualList).containsSequence(expectedList);
	}
}
