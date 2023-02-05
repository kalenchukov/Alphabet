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

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CopticAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new CopticAlphabet.LowerCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ⲁ', 'ⲃ', 'ⲅ', 'ⲇ', 'ⲉ', 'ⲋ', 
			'ⲍ', 'ⲏ', 'ⲑ', 'ⲓ', 'ⲕ', 'ⲗ', 
			'ⲙ', 'ⲛ', 'ⲝ', 'ⲟ', 'ⲡ', 'ⲣ', 
			'ⲥ', 'ⲧ', 'ⲩ', 'ⲫ', 'ⲭ', 'ⲯ', 
			'ⲱ', 'ⲳ', 'ⲵ', 'ⲷ', 'ⲹ', 'ⲻ', 
			'ⲽ', 'ⲿ', 'ⳁ', 'ⳃ', 'ⳅ', 'ⳇ', 
			'ⳉ', 'ⳋ', 'ⳍ', 'ⳏ', 'ⳑ', 'ⳓ', 
			'ⳕ', 'ⳗ', 'ⳙ', 'ⳛ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка сравнения объектов.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(ALPHABET.equals(null));

		assertTrue(ALPHABET.equals(ALPHABET));

		assertFalse(ALPHABET.equals(new RussianAlphabet.LowerCase()));

		assertTrue(ALPHABET.equals(new CopticAlphabet.LowerCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new CopticAlphabet.LowerCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.LowerCase().hashCode());
	}
}
