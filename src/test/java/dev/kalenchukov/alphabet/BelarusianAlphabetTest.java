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
 * Класс проверки методов класса {@link BelarusianAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class BelarusianAlphabetTest
{
	/**
	 * Проверка метода {@link BelarusianAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		BelarusianAlphabet alphabet = new BelarusianAlphabet();
		List<Character> expectedList = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'І', 'і',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ў', 'ў', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц',
			'Ч', 'ч', 'Ш', 'ш', 'Ы', 'ы', 'Ь', 'ь', 'Э', 'э',
			'Ю', 'ю', 'Я', 'я'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link BelarusianAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BelarusianAlphabet alphabet1 = new BelarusianAlphabet();
		BelarusianAlphabet alphabet2 = new BelarusianAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link BelarusianAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BelarusianAlphabet alphabet1 = new BelarusianAlphabet();
		BelarusianAlphabet alphabet2 = new BelarusianAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}