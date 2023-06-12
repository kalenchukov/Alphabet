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
 * Класс проверки методов класса {@link InternationalPhoneticAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class InternationalPhoneticAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link InternationalPhoneticAlphabet.LowerCase#get()}.
	 */
	@Test
	public void get()
	{
		InternationalPhoneticAlphabet.LowerCase alphabet = new InternationalPhoneticAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'p', 'b', 't', 'd', 'ʈ', 'ɖ', 
			'c', 'ɟ', 'k', 'ɡ', 'q', 'm', 
			'ɱ', 'n', 'ɳ', 'ɲ', 'ŋ', 'r', 
			'ʀ', 'ⱱ', 'ɾ', 'ɽ', 'ɸ', 'β', 
			'f', 'v', 'θ', 'ð', 's', 'z', 
			'ʃ', 'ʒ', 'ʂ', 'ʐ', 'ç', 'ʝ', 
			'x', 'ɣ', 'χ', 'ʁ', 'ħ', 'h', 
			'ɦ', 'ɬ', 'ɮ', 'ʋ', 'ɹ', 'ɻ', 
			'j', 'ɰ', 'l', 'ɭ', 'ʎ', 'i', 
			'y', 'ɨ', 'ʉ', 'ɯ', 'u', 'ʊ', 
			'e', 'ø', 'ɘ', 'ɵ', 'ɤ', 'o', 
			'ə', 'ɛ', 'œ', 'ɜ', 'ɞ', 'ʌ', 
			'ɔ', 'æ', 'ɐ', 'a', 'ɑ', 'ɒ', 
			'ɓ', 'ɗ', 'ʄ', 'ɠ', 'ʍ', 'w', 
			'ɥ', 'ɕ', 'ʑ', 'ɺ', 'ɧ', 'ʰ', 
			'̩', '̼', 'ʷ', 'ʲ', 'ˠ', 'ˤ', 
			'̪', '̺', 'ⁿ', 'ˡ', 'ɚ', 'ɝ', 
			'ɫ', 'ɬ', 'ɷ', 'ɼ', 'ɿ', 'ʅ', 
			'ʆ', 'ʇ', 'ʓ', 'ʚ', 'ʞ', 'ʠ', 
			'ʣ', 'ʤ', 'ʥ', 'ʦ', 'ʧ', 'ʨ', 
			'ʩ', 'ʪ', 'ʫ', 'ʮ', 'ʯ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link InternationalPhoneticAlphabet.LowerCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		InternationalPhoneticAlphabet.LowerCase alphabet1 = new InternationalPhoneticAlphabet.LowerCase();
		InternationalPhoneticAlphabet.LowerCase alphabet2 = new InternationalPhoneticAlphabet.LowerCase();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link InternationalPhoneticAlphabet.LowerCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		InternationalPhoneticAlphabet.LowerCase alphabet1 = new InternationalPhoneticAlphabet.LowerCase();
		InternationalPhoneticAlphabet.LowerCase alphabet2 = new InternationalPhoneticAlphabet.LowerCase();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
