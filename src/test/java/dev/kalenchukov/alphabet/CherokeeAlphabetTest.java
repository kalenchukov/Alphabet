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
 * Класс проверки методов класса {@link CherokeeAlphabet}.
 */
public class CherokeeAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new CherokeeAlphabet();

	/**
	 * Проверка метода {@link CherokeeAlphabet#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'Ꭰ', 'Ꭱ', 'Ꭲ', 'Ꭳ', 'Ꭴ', 'Ꭵ', 
			'Ꭶ', 'Ꭷ', 'Ꭸ', 'Ꭹ', 'Ꭺ', 'Ꭻ', 
			'Ꭼ', 'Ꭽ', 'Ꭾ', 'Ꭿ', 'Ꮀ', 'Ꮁ', 
			'Ꮂ', 'Ꮃ', 'Ꮄ', 'Ꮅ', 'Ꮆ', 'Ꮇ', 
			'Ꮈ', 'Ꮉ', 'Ꮊ', 'Ꮋ', 'Ꮌ', 'Ꮍ', 
			'Ꮎ', 'Ꮏ', 'Ꮐ', 'Ꮑ', 'Ꮒ', 'Ꮓ', 
			'Ꮔ', 'Ꮕ', 'Ꮖ', 'Ꮗ', 'Ꮘ', 'Ꮙ', 
			'Ꮚ', 'Ꮛ', 'Ꮜ', 'Ꮝ', 'Ꮞ', 'Ꮟ', 
			'Ꮠ', 'Ꮡ', 'Ꮢ', 'Ꮣ', 'Ꮤ', 'Ꮥ', 
			'Ꮦ', 'Ꮧ', 'Ꮨ', 'Ꮩ', 'Ꮪ', 'Ꮫ', 
			'Ꮬ', 'Ꮭ', 'Ꮮ', 'Ꮯ', 'Ꮰ', 'Ꮱ', 
			'Ꮲ', 'Ꮳ', 'Ꮴ', 'Ꮵ', 'Ꮶ', 'Ꮷ', 
			'Ꮸ', 'Ꮹ', 'Ꮺ', 'Ꮻ', 'Ꮼ', 'Ꮽ', 
			'Ꮾ', 'Ꮿ', 'Ᏸ', 'Ᏹ', 'Ᏺ', 'Ᏻ', 
			'Ᏼ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link CherokeeAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(ALPHABET.equals(null));

		assertTrue(ALPHABET.equals(ALPHABET));

		assertFalse(ALPHABET.equals(new RussianAlphabet()));

		assertTrue(ALPHABET.equals(new CherokeeAlphabet()));
	}

	/**
	 * Проверка метода {@link CherokeeAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new CherokeeAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
