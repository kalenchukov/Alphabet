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
 * Класс проверки методов класса {@link ArmenianAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class ArmenianAlphabetTest
{
	/**
	 * Проверка метода {@link ArmenianAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		ArmenianAlphabet alphabet = new ArmenianAlphabet();
		List<Character> expectedList = List.of(
			'Ա', 'ա', 'Բ', 'բ', 'Գ', 'գ', 
			'Դ', 'դ', 'Ե', 'ե', 'Զ', 'զ', 
			'Է', 'է', 'Ը', 'ը', 'Թ', 'թ', 
			'Ժ', 'ժ', 'Ի', 'ի', 'Լ', 'լ', 
			'Խ', 'խ', 'Ծ', 'ծ', 'Կ', 'կ', 
			'Հ', 'հ', 'Ձ', 'ձ', 'Ղ', 'ղ', 
			'Ճ', 'ճ', 'Մ', 'մ', 'Յ', 'յ', 
			'Ն', 'ն', 'Շ', 'շ', 'Ո', 'ո', 
			'Չ', 'չ', 'Պ', 'պ', 'Ջ', 'ջ', 
			'Ռ', 'ռ', 'Ս', 'ս', 'Վ', 'վ', 
			'Տ', 'տ', 'Ր', 'ր', 'Ց', 'ց', 
			'Ւ', 'ւ', 'Փ', 'փ', 'Ք', 'ք', 
			'Օ', 'օ', 'Ֆ', 'ֆ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link ArmenianAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		ArmenianAlphabet alphabet1 = new ArmenianAlphabet();
		ArmenianAlphabet alphabet2 = new ArmenianAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link ArmenianAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		ArmenianAlphabet alphabet1 = new ArmenianAlphabet();
		ArmenianAlphabet alphabet2 = new ArmenianAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
