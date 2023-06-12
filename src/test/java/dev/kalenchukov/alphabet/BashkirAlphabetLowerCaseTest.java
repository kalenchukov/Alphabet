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
 * Класс проверки методов класса {@link BashkirAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class BashkirAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link BashkirAlphabet.LowerCase#get()}.
	 */
	@Test
	public void get()
	{
		BashkirAlphabet.LowerCase alphabet = new BashkirAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'а', 'б', 'в', 'г', 'ғ', 'д', 
			'ҙ', 'е', 'ё', 'ж', 'з', 'и', 
			'й', 'к', 'ҡ', 'л', 'м', 'н', 
			'ң', 'о', 'ө', 'п', 'р', 'с', 
			'ҫ', 'т', 'у', 'ү', 'ф', 'х', 
			'һ', 'ц', 'ч', 'ш', 'щ', 'ъ', 
			'ы', 'ь', 'э', 'ә', 'ю', 'я'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link BashkirAlphabet.LowerCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BashkirAlphabet.LowerCase alphabet1 = new BashkirAlphabet.LowerCase();
		BashkirAlphabet.LowerCase alphabet2 = new BashkirAlphabet.LowerCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link BashkirAlphabet.LowerCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BashkirAlphabet.LowerCase alphabet1 = new BashkirAlphabet.LowerCase();
		BashkirAlphabet.LowerCase alphabet2 = new BashkirAlphabet.LowerCase();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
