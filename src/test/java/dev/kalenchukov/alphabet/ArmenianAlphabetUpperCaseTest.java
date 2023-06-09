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
 * Класс проверки методов класса {@link ArmenianAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class ArmenianAlphabetUpperCaseTest
{
	private static final Alphabetical ALPHABET = new ArmenianAlphabet.UpperCase();

	/**
	 * Проверка метода {@link ArmenianAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> expected = List.of(
			'Ա', 'Բ', 'Գ', 'Դ', 'Ե', 'Զ', 
			'Է', 'Ը', 'Թ', 'Ժ', 'Ի', 'Լ', 
			'Խ', 'Ծ', 'Կ', 'Հ', 'Ձ', 'Ղ', 
			'Ճ', 'Մ', 'Յ', 'Ն', 'Շ', 'Ո', 
			'Չ', 'Պ', 'Ջ', 'Ռ', 'Ս', 'Վ', 
			'Տ', 'Ր', 'Ց', 'Ւ', 'Փ', 'Ք', 
			'Օ', 'Ֆ'
		);

		List<Character> actual = ALPHABET.get();

		assertArrayEquals(expected.toArray(), actual.toArray());
	}

	/**
	 * Проверка метода {@link ArmenianAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet.UpperCase());;

		assertEquals(ALPHABET, new ArmenianAlphabet.UpperCase());;
	}

	/**
	 * Проверка метода {@link ArmenianAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new ArmenianAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
