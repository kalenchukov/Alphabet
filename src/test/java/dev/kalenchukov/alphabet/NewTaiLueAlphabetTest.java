/*
 * Copyright 2022 Алексей Каленчуков
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
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NewTaiLueAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new NewTaiLueAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ᦀ', 'ᦁ', 'ᦂ', 'ᦃ', 'ᦄ', 'ᦅ', 
			'ᦆ', 'ᦇ', 'ᦈ', 'ᦉ', 'ᦊ', 'ᦋ', 
			'ᦌ', 'ᦍ', 'ᦎ', 'ᦏ', 'ᦐ', 'ᦑ', 
			'ᦒ', 'ᦓ', 'ᦔ', 'ᦕ', 'ᦖ', 'ᦗ', 
			'ᦘ', 'ᦙ', 'ᦚ', 'ᦛ', 'ᦜ', 'ᦝ', 
			'ᦞ', 'ᦟ', 'ᦡ', 'ᦢ', 'ᦣ', 'ᦤ', 
			'ᦥ', 'ᦦ', 'ᦧ', 'ᦨ', 'ᦩ', 'ᦪ', 
			'ᦫ', 'ᦰ', 'ᦱ', 'ᦲ', 'ᦳ', 'ᦴ', 
			'ᦵ', 'ᦶ', 'ᦷ', 'ᦸ', 'ᦹ', 'ᦺ', 
			'ᦻ', 'ᦼ', 'ᦽ', 'ᦾ', 'ᦿ', 'ᧀ', 
			'ᧁ', 'ᧂ', 'ᧃ', 'ᧄ', 'ᧅ', 'ᧆ', 
			'ᧇ', 'ᧈ', 'ᧉ'
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

		assertFalse(ALPHABET.equals(new RussianAlphabet()));

		assertTrue(ALPHABET.equals(new NewTaiLueAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new NewTaiLueAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}