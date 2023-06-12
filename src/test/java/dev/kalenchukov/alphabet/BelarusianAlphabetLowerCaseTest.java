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

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link BelarusianAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class BelarusianAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link BelarusianAlphabet.LowerCase#get()}.
	 */
	@Test
	public void get()
	{
		BelarusianAlphabet.LowerCase alphabet = new BelarusianAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'і', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ў', 'ф', 'х', 'ц', 'ч', 'ш',
			'ы', 'ь', 'э', 'ю', 'я'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link BelarusianAlphabet.LowerCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BelarusianAlphabet.LowerCase alphabet1 = new BelarusianAlphabet.LowerCase();
		BelarusianAlphabet.LowerCase alphabet2 = new BelarusianAlphabet.LowerCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link BelarusianAlphabet.LowerCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BelarusianAlphabet.LowerCase alphabet1 = new BelarusianAlphabet.LowerCase();
		BelarusianAlphabet.LowerCase alphabet2 = new BelarusianAlphabet.LowerCase();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}