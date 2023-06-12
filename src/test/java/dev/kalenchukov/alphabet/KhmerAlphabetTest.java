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
 * Класс проверки методов класса {@link KhmerAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class KhmerAlphabetTest
{
	/**
	 * Проверка метода {@link KhmerAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		KhmerAlphabet alphabet = new KhmerAlphabet();
		List<Character> expectedList = List.of(
			'ក', 'ខ', 'គ', 'ឃ', 'ង', 'ច', 
			'ឆ', 'ជ', 'ឈ', 'ញ', 'ដ', 'ឋ', 
			'ឌ', 'ឍ', 'ណ', 'ត', 'ថ', 'ទ', 
			'ធ', 'ន', 'ប', 'ផ', 'ព', 'ភ', 
			'ម', 'យ', 'រ', 'ល', 'វ', 'ស', 
			'ហ', 'ឡ', 'អ', 'ឣ', 'ឤ', 'ឥ', 
			'ឦ', 'ឧ', 'ឩ', 'ឪ', 'ឫ', 'ឬ', 
			'ឭ', 'ឮ', 'ឯ', 'ឰ', 'ឱ', 'ឳ', 
			'ា', 'ិ', 'ី', 'ឹ', 'ឺ', 'ុ', 
			'ូ', 'ួ', 'ើ', 'ឿ', 'ៀ', 'េ', 
			'ែ', 'ៃ', 'ោ', 'ៅ', 'ំ', 'ះ', 
			'ៈ', '៉', '៊', '់', '៌', '៍', 
			'៎', '៏', '័', '៑', '្', '៓', 
			'។', '៕', '៖', 'ៗ', '៘', '៙', 
			'៚', '៛', 'ៜ', '៝'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
