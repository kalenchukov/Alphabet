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
 * Класс проверки методов класса {@link ItalianAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class ItalianAlphabetTest
{
	/**
	 * Проверка метода {@link ItalianAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		ItalianAlphabet alphabet = new ItalianAlphabet();
		List<Character> expectedList = List.of(
			'A', 'a', 'B', 'b', 'C', 'c', 
			'D', 'd', 'E', 'e', 'F', 'f', 
			'G', 'g', 'H', 'h', 'I', 'i', 
			'L', 'l', 'M', 'm', 'N', 'n', 
			'O', 'o', 'P', 'p', 'Q', 'q', 
			'R', 'r', 'S', 's', 'T', 't', 
			'U', 'u', 'V', 'v'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link ItalianAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		ItalianAlphabet alphabet1 = new ItalianAlphabet();
		ItalianAlphabet alphabet2 = new ItalianAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link ItalianAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		ItalianAlphabet alphabet1 = new ItalianAlphabet();
		ItalianAlphabet alphabet2 = new ItalianAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
