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
 * Класс проверки методов класса {@link ChineseAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class ChineseAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link ChineseAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		ChineseAlphabet.UpperCase alphabet = new ChineseAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'A', 'B', 'C', 'D', 'E', 'F', 
			'G', 'H', 'J', 'K', 'L', 'M', 
			'N', 'O', 'P', 'Q', 'R', 'S', 
			'T', 'U', 'Ü', 'W', 'X', 'Y', 
			'Z'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link ChineseAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		ChineseAlphabet.UpperCase alphabet1 = new ChineseAlphabet.UpperCase();
		ChineseAlphabet.UpperCase alphabet2 = new ChineseAlphabet.UpperCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link ChineseAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		ChineseAlphabet.UpperCase alphabet1 = new ChineseAlphabet.UpperCase();
		ChineseAlphabet.UpperCase alphabet2 = new ChineseAlphabet.UpperCase();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
