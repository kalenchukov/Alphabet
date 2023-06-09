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

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link LaoAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class LaoAlphabetTest
{
	private static final Alphabetical ALPHABET = new LaoAlphabet();

	/**
	 * Проверка метода {@link LaoAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> expected = List.of(
			'ກ', 'ຂ', 'ຄ', 'ງ', 'ຈ', 'ສ', 
			'ຊ', 'ຍ', 'ດ', 'ຕ', 'ຖ', 'ທ', 
			'ນ', 'ບ', 'ປ', 'ຜ', 'ຝ', 'ພ', 
			'ຟ', 'ມ', 'ຢ', 'ລ', 'ວ', 'ຫ', 
			'ອ', 'ຮ', 'ຯ', 'ະ', 'ັ', 'າ', 
			'ຳ', 'ິ', 'ີ', 'ຶ', 'ື', 'ຸ', 
			'ູ', 'ົ', 'ຼ', 'ຽ', 'ເ', 'ແ', 
			'ໂ', 'ໃ', 'ໄ', 'ໆ'
		);

		List<Character> actual = ALPHABET.get();

		assertArrayEquals(expected.toArray(), actual.toArray());
	}

	/**
	 * Проверка метода {@link LaoAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new LaoAlphabet());
	}

	/**
	 * Проверка метода {@link LaoAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new LaoAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
