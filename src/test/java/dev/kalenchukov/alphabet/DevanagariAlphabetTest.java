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
 * Класс проверки методов класса {@link DevanagariAlphabet}.
 */
public class DevanagariAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new DevanagariAlphabet();

	/**
	 * Проверка метода {@link DevanagariAlphabet#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'क', 'ख', 'ग', 'घ', 'ङ', 'च', 
			'छ', 'ज', 'झ', 'ञ', 'ट', 'ठ', 
			'ड', 'ढ', 'ण', 'त', 'थ', 'द', 
			'ध', 'न', 'प', 'फ', 'ब', 'भ', 
			'म', 'य', 'र', 'ल', 'व', 'श', 
			'ष', 'स', 'ह', 'क़', 'ख़', 'ग़', 
			'ज़', 'ड़', 'ढ़', 'फ़', 'य़', 'अ', 
			'आ', 'ा', 'इ', 'ि', 'ई', 'ी', 
			'उ', 'ु', 'ऊ', 'ू', 'ऋ', 'ृ', 
			'ॠ', 'ॄ', 'ऌ', 'ॢ', 'ॡ', 'ॣ', 
			'ए', 'े', 'ऐ', 'ै', 'ऒ', 'ॊ', 
			'ओ', 'ो', 'औ', 'ौ', 'ँ', 'ं', 
			'ः', '्', 'ॅ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link DevanagariAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new DevanagariAlphabet());
	}

	/**
	 * Проверка метода {@link DevanagariAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new DevanagariAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
