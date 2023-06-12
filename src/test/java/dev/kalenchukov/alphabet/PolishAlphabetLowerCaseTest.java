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
 * Класс проверки методов класса {@link PolishAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class PolishAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link PolishAlphabet.LowerCase#get()}.
	 */
	@Test
	public void get()
	{
		PolishAlphabet.LowerCase alphabet = new PolishAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'a', 'ą', 'b', 'c', 'ć', 'd', 
			'e', 'ę', 'f', 'g', 'h', 'i', 
			'j', 'k', 'l', 'ł', 'm', 'n', 
			'ń', 'o', 'ó', 'p', 'r', 's', 
			'ś', 't', 'u', 'w', 'y', 'z', 
			'ź', 'ż'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link PolishAlphabet.LowerCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		PolishAlphabet.LowerCase alphabet1 = new PolishAlphabet.LowerCase();
		PolishAlphabet.LowerCase alphabet2 = new PolishAlphabet.LowerCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link PolishAlphabet.LowerCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		PolishAlphabet.LowerCase alphabet1 = new PolishAlphabet.LowerCase();
		PolishAlphabet.LowerCase alphabet2 = new PolishAlphabet.LowerCase();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
