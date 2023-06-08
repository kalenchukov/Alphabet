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
 * Класс проверки методов класса {@link TaiThamAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class TaiThamAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new TaiThamAlphabet();

	/**
	 * Проверка метода {@link TaiThamAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> letters = List.of(
			'ᨠ', 'ᨡ', 'ᨢ', 'ᨣ', 'ᨤ', 'ᨥ', 
			'ᨦ', 'ᨧ', 'ᨨ', 'ᨩ', 'ᨪ', 'ᨫ', 
			'ᨬ', 'ᨭ', 'ᨮ', 'ᨯ', 'ᨰ', 'ᨱ', 
			'ᨲ', 'ᨳ', 'ᨴ', 'ᨵ', 'ᨶ', 'ᨷ', 
			'ᨸ', 'ᨹ', 'ᨺ', 'ᨻ', 'ᨼ', 'ᨽ', 
			'ᨾ', 'ᨿ', 'ᩀ', 'ᩁ', 'ᩂ', 'ᩃ', 
			'ᩄ', 'ᩅ', 'ᩆ', 'ᩇ', 'ᩈ', 'ᩉ', 
			'ᩊ', 'ᩋ', 'ᩌ', 'ᩐ', 'ᩑ', 'ᩒ', 
			'ᩓ', 'ᩔ', 'ᩕ', 'ᩖ', 'ᩗ', 'ᩘ', 
			'ᩙ', 'ᩚ', 'ᩛ', 'ᩜ', 'ᩝ', 'ᩞ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link TaiThamAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new TaiThamAlphabet());
	}

	/**
	 * Проверка метода {@link TaiThamAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new TaiThamAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
