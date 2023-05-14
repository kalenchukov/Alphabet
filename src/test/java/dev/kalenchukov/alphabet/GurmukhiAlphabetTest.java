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
 * Класс проверки методов класса {@link GurmukhiAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class GurmukhiAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new GurmukhiAlphabet();

	/**
	 * Проверка метода {@link GurmukhiAlphabet#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ੳ', 'ਅ', 'ੲ', 'ਸ', 'ਹ', 'ਕ', 
			'ਖ', 'ਗ', 'ਘ', 'ਙ', 'ਚ', 'ਛ', 
			'ਜ', 'ਝ', 'ਞ', 'ਟ', 'ਠ', 'ਡ', 
			'ਢ', 'ਣ', 'ਤ', 'ਥ', 'ਦ', 'ਧ', 
			'ਨ', 'ਪ', 'ਫ', 'ਬ', 'ਭ', 'ਮ', 
			'ਯ', 'ਰ', 'ਲ', 'ਵ', 'ੜ', 'ਸ਼', 
			'ਖ਼', 'ਗ਼', 'ਜ਼', 'ਫ਼', 'ਲ਼', 'ਅ', 
			'ਆ', 'ਇ', 'ਈ', 'ਉ', 'ਊ', 'ਏ', 
			'ਐ', 'ਓ', 'ਔ', 'ੱ', 'ਂ', 'ੰ', 
			'ਃ', '੍', 'ੴ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link GurmukhiAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new GurmukhiAlphabet());
	}

	/**
	 * Проверка метода {@link GurmukhiAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new GurmukhiAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
