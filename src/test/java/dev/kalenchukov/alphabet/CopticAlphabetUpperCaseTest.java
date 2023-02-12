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

/**
 * Класс проверки методов класса {@link CopticAlphabet.UpperCase}.
 */
public class CopticAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new CopticAlphabet.UpperCase();

	/**
	 * Проверка метода {@link CopticAlphabet.UpperCase#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'Ⲁ', 'Ⲃ', 'Ⲅ', 'Ⲇ', 'Ⲉ', 'Ⲋ', 
			'Ⲍ', 'Ⲏ', 'Ⲑ', 'Ⲓ', 'Ⲕ', 'Ⲗ', 
			'Ⲙ', 'Ⲛ', 'Ⲝ', 'Ⲟ', 'Ⲡ', 'Ⲣ', 
			'Ⲥ', 'Ⲧ', 'Ⲩ', 'Ⲫ', 'Ⲭ', 'Ⲯ', 
			'Ⲱ', 'Ⲳ', 'Ⲵ', 'Ⲷ', 'Ⲹ', 'Ⲻ', 
			'Ⲽ', 'Ⲿ', 'Ⳁ', 'Ⳃ', 'Ⳅ', 'Ⳇ', 
			'Ⳉ', 'Ⳋ', 'Ⳍ', 'Ⳏ', 'Ⳑ', 'Ⳓ', 
			'Ⳕ', 'Ⳗ', 'Ⳙ', 'Ⳛ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link CopticAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet.UpperCase());;

		assertEquals(ALPHABET, new CopticAlphabet.UpperCase());;
	}

	/**
	 * Проверка метода {@link CopticAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new CopticAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
