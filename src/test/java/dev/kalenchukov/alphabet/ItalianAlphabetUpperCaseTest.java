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
 * Класс проверки методов класса {@link ItalianAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class ItalianAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link ItalianAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		ItalianAlphabet.UpperCase alphabet = new ItalianAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'A', 'B', 'C', 'D', 'E', 'F', 
			'G', 'H', 'I', 'L', 'M', 'N', 
			'O', 'P', 'Q', 'R', 'S', 'T', 
			'U', 'V'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link ItalianAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		ItalianAlphabet.UpperCase alphabet1 = new ItalianAlphabet.UpperCase();
		ItalianAlphabet.UpperCase alphabet2 = new ItalianAlphabet.UpperCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link ItalianAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		ItalianAlphabet.UpperCase alphabet1 = new ItalianAlphabet.UpperCase();
		ItalianAlphabet.UpperCase alphabet2 = new ItalianAlphabet.UpperCase();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
