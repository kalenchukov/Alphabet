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
 * Класс проверки методов класса {@link MeeteiMayekAlphabet}.
 *
 * @author Aleksey Kalenchukov
 */
public class MeeteiMayekAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new MeeteiMayekAlphabet();

	/**
	 * Проверка метода {@link MeeteiMayekAlphabet#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ꯀ', 'ꯁ', 'ꯂ', 'ꯃ', 'ꯄ', 'ꯅ', 
			'ꯆ', 'ꯇ', 'ꯈ', 'ꯉ', 'ꯊ', 'ꯋ', 
			'ꯌ', 'ꯍ', 'ꯎ', 'ꯏ', 'ꯐ', 'ꯑ', 
			'ꯒ', 'ꯓ', 'ꯔ', 'ꯕ', 'ꯖ', 'ꯗ', 
			'ꯘ', 'ꯙ', 'ꯚ', 'ꯛ', 'ꯜ', 'ꯝ', 
			'ꯞ', 'ꯟ', 'ꯠ', 'ꯡ', 'ꯢ', 'ꯣ', 
			'ꯤ', 'ꯥ', 'ꯦ', 'ꯧ', 'ꯨ', 'ꯩ', 
			'ꯪ', '꯫', '꯬', '꯭'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link MeeteiMayekAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new MeeteiMayekAlphabet());
	}

	/**
	 * Проверка метода {@link MeeteiMayekAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new MeeteiMayekAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
