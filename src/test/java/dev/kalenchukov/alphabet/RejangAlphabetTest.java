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
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RejangAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new RejangAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ꤰ', 'ꤱ', 'ꤲ', 'ꤳ', 'ꤴ', 'ꤵ', 
			'ꤶ', 'ꤷ', 'ꤸ', 'ꤹ', 'ꤺ', 'ꤻ', 
			'ꤼ', 'ꤽ', 'ꤾ', 'ꤿ', 'ꥀ', 'ꥁ', 
			'ꥂ', 'ꥃ', 'ꥄ', 'ꥅ', 'ꥆ', 'ꥇ', 
			'ꥈ', 'ꥉ', 'ꥊ', 'ꥋ', 'ꥌ', 'ꥍ', 
			'ꥎ', 'ꥏ', 'ꥐ', 'ꥑ', 'ꥒ', '꥓', 
			'꥟'
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

		assertTrue(ALPHABET.equals(new RejangAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new RejangAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
