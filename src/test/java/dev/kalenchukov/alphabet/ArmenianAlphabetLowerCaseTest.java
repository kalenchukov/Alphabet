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
 * Класс проверки методов класса {@link ArmenianAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class ArmenianAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link ArmenianAlphabet.LowerCase#get()}.
	 */
	@Test
	public void get()
	{
		ArmenianAlphabet.LowerCase alphabet = new ArmenianAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'ա', 'բ', 'գ', 'դ', 'ե', 'զ', 
			'է', 'ը', 'թ', 'ժ', 'ի', 'լ', 
			'խ', 'ծ', 'կ', 'հ', 'ձ', 'ղ', 
			'ճ', 'մ', 'յ', 'ն', 'շ', 'ո', 
			'չ', 'պ', 'ջ', 'ռ', 'ս', 'վ', 
			'տ', 'ր', 'ց', 'ւ', 'փ', 'ք', 
			'օ', 'ֆ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link ArmenianAlphabet.LowerCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		ArmenianAlphabet.LowerCase alphabet1 = new ArmenianAlphabet.LowerCase();
		ArmenianAlphabet.LowerCase alphabet2 = new ArmenianAlphabet.LowerCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link ArmenianAlphabet.LowerCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		ArmenianAlphabet.LowerCase alphabet1 = new ArmenianAlphabet.LowerCase();
		ArmenianAlphabet.LowerCase alphabet2 = new ArmenianAlphabet.LowerCase();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
