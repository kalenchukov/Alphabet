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
 * Класс проверки методов класса {@link MalayalamAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class MalayalamAlphabetTest
{
	/**
	 * Проверка метода {@link MalayalamAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		MalayalamAlphabet alphabet = new MalayalamAlphabet();
		List<Character> expectedList = List.of(
			'അ', 'ആ', 'ഇ', 'ഈ', 'ഉ', 'ഊ', 
			'ഋ', 'ഌ', 'എ', 'ഏ', 'ഐ', 'ഒ', 
			'ഓ', 'ഔ', 'ക', 'ഖ', 'ഗ', 'ഘ', 
			'ങ', 'ച', 'ഛ', 'ജ', 'ഝ', 'ഞ', 
			'ട', 'ഠ', 'ഡ', 'ഢ', 'ണ', 'ത', 
			'ഥ', 'ദ', 'ധ', 'ന', 'പ', 'ഫ', 
			'ബ', 'ഭ', 'മ', 'യ', 'ര', 'ല', 
			'വ', 'ശ', 'ഷ', 'സ', 'ഹ', 'ള', 
			'ഴ', 'റ', 'ല', 'ള', 'ഴ', 'വ', 
			'ശ', 'ഷ', 'സ', 'ഹ', 'ഺ', 'ഽ', 
			'ാ', 'ി', 'ീ', 'ു', 'ൂ', 'ൃ', 
			'ൄ', 'െ', 'േ', 'ൈ', 'ൊ', 'ോ', 
			'ൌ', '്', 'ൎ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link MalayalamAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		MalayalamAlphabet alphabet1 = new MalayalamAlphabet();
		MalayalamAlphabet alphabet2 = new MalayalamAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link MalayalamAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		MalayalamAlphabet alphabet1 = new MalayalamAlphabet();
		MalayalamAlphabet alphabet2 = new MalayalamAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
