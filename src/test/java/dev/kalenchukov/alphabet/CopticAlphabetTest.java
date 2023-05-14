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
 * Класс проверки методов класса {@link CopticAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class CopticAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new CopticAlphabet();

	/**
	 * Проверка метода {@link CopticAlphabet#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'Ⲁ', 'ⲁ', 'Ⲃ', 'ⲃ', 'Ⲅ', 'ⲅ', 
			'Ⲇ', 'ⲇ', 'Ⲉ', 'ⲉ', 'Ⲋ', 'ⲋ', 
			'Ⲍ', 'ⲍ', 'Ⲏ', 'ⲏ', 'Ⲑ', 'ⲑ', 
			'Ⲓ', 'ⲓ', 'Ⲕ', 'ⲕ', 'Ⲗ', 'ⲗ', 
			'Ⲙ', 'ⲙ', 'Ⲛ', 'ⲛ', 'Ⲝ', 'ⲝ', 
			'Ⲟ', 'ⲟ', 'Ⲡ', 'ⲡ', 'Ⲣ', 'ⲣ', 
			'Ⲥ', 'ⲥ', 'Ⲧ', 'ⲧ', 'Ⲩ', 'ⲩ', 
			'Ⲫ', 'ⲫ', 'Ⲭ', 'ⲭ', 'Ⲯ', 'ⲯ', 
			'Ⲱ', 'ⲱ', 'Ⲳ', 'ⲳ', 'Ⲵ', 'ⲵ', 
			'Ⲷ', 'ⲷ', 'Ⲹ', 'ⲹ', 'Ⲻ', 'ⲻ', 
			'Ⲽ', 'ⲽ', 'Ⲿ', 'ⲿ', 'Ⳁ', 'ⳁ', 
			'Ⳃ', 'ⳃ', 'Ⳅ', 'ⳅ', 'Ⳇ', 'ⳇ', 
			'Ⳉ', 'ⳉ', 'Ⳋ', 'ⳋ', 'Ⳍ', 'ⳍ', 
			'Ⳏ', 'ⳏ', 'Ⳑ', 'ⳑ', 'Ⳓ', 'ⳓ', 
			'Ⳕ', 'ⳕ', 'Ⳗ', 'ⳗ', 'Ⳙ', 'ⳙ', 
			'Ⳛ', 'ⳛ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link CopticAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new CopticAlphabet());
	}

	/**
	 * Проверка метода {@link CopticAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new CopticAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
