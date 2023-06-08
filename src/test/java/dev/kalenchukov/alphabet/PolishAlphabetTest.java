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
 * Класс проверки методов класса {@link PolishAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class PolishAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new PolishAlphabet();

	/**
	 * Проверка метода {@link PolishAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> letters = List.of(
			'A', 'a', 'Ą', 'ą', 'B', 'b', 
			'C', 'c', 'Ć', 'ć', 'D', 'd', 
			'E', 'e', 'Ę', 'ę', 'F', 'f', 
			'G', 'g', 'H', 'h', 'I', 'i', 
			'J', 'j', 'K', 'k', 'L', 'l', 
			'Ł', 'ł', 'M', 'm', 'N', 'n', 
			'Ń', 'ń', 'O', 'o', 'Ó', 'ó', 
			'P', 'p', 'R', 'r', 'S', 's', 
			'Ś', 'ś', 'T', 't', 'U', 'u', 
			'W', 'w', 'Y', 'y', 'Z', 'z', 
			'Ź', 'ź', 'Ż', 'ż'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link PolishAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new PolishAlphabet());
	}

	/**
	 * Проверка метода {@link PolishAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new PolishAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
