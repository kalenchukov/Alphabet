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
 * Класс проверки методов класса {@link TatarAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class TatarAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link TatarAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		TatarAlphabet.UpperCase alphabet = new TatarAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'А', 'Ә', 'Б', 'В', 'Г', 'Д', 
			'Е', 'Ё', 'Ж', 'Җ', 'З', 'И', 
			'Й', 'К', 'Л', 'М', 'Н', 'Ң', 
			'О', 'Ө', 'П', 'Р', 'С', 'Т', 
			'У', 'Ү', 'Ф', 'Х', 'Һ', 'Ц', 
			'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 
			'Э', 'Ю', 'Я'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link TatarAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		TatarAlphabet.UpperCase alphabet1 = new TatarAlphabet.UpperCase();
		TatarAlphabet.UpperCase alphabet2 = new TatarAlphabet.UpperCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link TatarAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		TatarAlphabet.UpperCase alphabet1 = new TatarAlphabet.UpperCase();
		TatarAlphabet.UpperCase alphabet2 = new TatarAlphabet.UpperCase();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
