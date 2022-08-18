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

public class DevanagariAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new DevanagariAlphabet();

	/**
	 * Проверяет получение букв алфавита.
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
	 * Проверка сравнения объектов.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(ALPHABET.equals(null));

		assertTrue(ALPHABET.equals(ALPHABET));

		assertFalse(ALPHABET.equals(new RussianAlphabet()));

		assertTrue(ALPHABET.equals(new DevanagariAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new DevanagariAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
