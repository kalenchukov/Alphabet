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
 * Класс проверки методов класса {@link BashkirAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class BashkirAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link BashkirAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		BashkirAlphabet.UpperCase alphabet = new BashkirAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'А', 'Б', 'В', 'Г', 'Ғ', 'Д', 
			'Ҙ', 'Е', 'Ё', 'Ж', 'З', 'И', 
			'Й', 'К', 'Ҡ', 'Л', 'М', 'Н', 
			'Ң', 'О', 'Ө', 'П', 'Р', 'С', 
			'Ҫ', 'Т', 'У', 'Ү', 'Ф', 'Х', 
			'Һ', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 
			'Ы', 'Ь', 'Э', 'Ә', 'Ю', 'Я'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link BashkirAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BashkirAlphabet.UpperCase alphabet1 = new BashkirAlphabet.UpperCase();
		BashkirAlphabet.UpperCase alphabet2 = new BashkirAlphabet.UpperCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link BashkirAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BashkirAlphabet.UpperCase alphabet1 = new BashkirAlphabet.UpperCase();
		BashkirAlphabet.UpperCase alphabet2 = new BashkirAlphabet.UpperCase();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
