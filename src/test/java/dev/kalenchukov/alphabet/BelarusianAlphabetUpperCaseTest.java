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
 * Класс проверки методов класса {@link BelarusianAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class BelarusianAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link BelarusianAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		BelarusianAlphabet.UpperCase alphabet = new BelarusianAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'І', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ў', 'Ф', 'Х', 'Ц', 'Ч', 'Ш',
			'Ы', 'Ь', 'Э', 'Ю', 'Я'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link BelarusianAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BelarusianAlphabet.UpperCase alphabet1 = new BelarusianAlphabet.UpperCase();
		BelarusianAlphabet.UpperCase alphabet2 = new BelarusianAlphabet.UpperCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link BelarusianAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BelarusianAlphabet.UpperCase alphabet1 = new BelarusianAlphabet.UpperCase();
		BelarusianAlphabet.UpperCase alphabet2 = new BelarusianAlphabet.UpperCase();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}