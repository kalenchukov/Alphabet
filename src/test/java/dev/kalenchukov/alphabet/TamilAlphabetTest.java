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
 * Класс проверки методов класса {@link TamilAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class TamilAlphabetTest
{
	/**
	 * Проверка метода {@link TamilAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		TamilAlphabet alphabet = new TamilAlphabet();
		List<Character> expectedList = List.of(
			'அ', 'ஆ', 'இ', 'ஈ', 'உ', 'ஊ', 
			'எ', 'ஏ', 'ஐ', 'ஒ', 'ஓ', 'ஔ', 
			'க', 'ங', 'ச', 'ஜ', 'ஞ', 'ட', 
			'ண', 'த', 'ந', 'ன', 'ப', 'ம', 
			'ய', 'ர', 'ற', 'ல', 'ள', 'ழ', 
			'வ', 'ஶ', 'ஷ', 'ஸ', 'ஹ', 'ா', 
			'ி', 'ீ', 'ு', 'ூ', 'ெ', 'ே', 
			'ை', 'ொ', 'ோ', 'ௌ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link TamilAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		TamilAlphabet alphabet1 = new TamilAlphabet();
		TamilAlphabet alphabet2 = new TamilAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link TamilAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		TamilAlphabet alphabet1 = new TamilAlphabet();
		TamilAlphabet alphabet2 = new TamilAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
