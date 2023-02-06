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
 * Класс проверки методов класса {@link TamilAlphabet}.
 */
public class TamilAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new TamilAlphabet();

	/**
	 * Проверка метода {@link TamilAlphabet#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'அ', 'ஆ', 'இ', 'ஈ', 'உ', 'ஊ', 
			'எ', 'ஏ', 'ஐ', 'ஒ', 'ஓ', 'ஔ', 
			'க', 'ங', 'ச', 'ஜ', 'ஞ', 'ட', 
			'ண', 'த', 'ந', 'ன', 'ப', 'ம', 
			'ய', 'ர', 'ற', 'ல', 'ள', 'ழ', 
			'வ', 'ஶ', 'ஷ', 'ஸ', 'ஹ', 'ா', 
			'ி', 'ீ', 'ு', 'ூ', 'ெ', 'ே', 
			'ை', 'ொ', 'ோ', 'ௌ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link TamilAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(ALPHABET.equals(null));

		assertTrue(ALPHABET.equals(ALPHABET));

		assertFalse(ALPHABET.equals(new RussianAlphabet()));

		assertTrue(ALPHABET.equals(new TamilAlphabet()));
	}

	/**
	 * Проверка метода {@link TamilAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new TamilAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
