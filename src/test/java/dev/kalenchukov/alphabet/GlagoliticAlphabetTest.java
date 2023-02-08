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
 * Класс проверки методов класса {@link GlagoliticAlphabet}.
 */
public class GlagoliticAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new GlagoliticAlphabet();

	/**
	 * Проверка метода {@link GlagoliticAlphabet#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'Ⰰ', 'Ⰱ', 'Ⰲ', 'Ⰳ', 'Ⰴ', 'Ⰵ', 
			'Ⰶ', 'Ⰷ', 'Ⰸ', 'Ⰹ', 'Ⰺ', 'Ⰻ', 
			'Ⰼ', 'Ⰽ', 'Ⰾ', 'Ⰿ', 'Ⱀ', 'Ⱁ', 
			'Ⱂ', 'Ⱃ', 'Ⱄ', 'Ⱅ', 'Ⱛ', 'Ⱆ', 
			'Ⱇ', 'Ⱈ', 'Ⱉ', 'Ⱊ', 'Ⱋ', 'Ⱌ', 
			'Ⱍ', 'Ⱎ', 'Ⱏ', 'Ⱐ', 'Ⱑ', 'Ⱒ', 
			'Ⱓ', 'Ⱔ', 'Ⱖ', 'Ⱗ', 'Ⱘ', 'Ⱙ', 
			'Ⱚ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link GlagoliticAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new GlagoliticAlphabet());
	}

	/**
	 * Проверка метода {@link GlagoliticAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new GlagoliticAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
