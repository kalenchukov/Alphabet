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
 * Класс проверки методов класса {@link SundaneseAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class SundaneseAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new SundaneseAlphabet();

	/**
	 * Проверка метода {@link SundaneseAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> letters = List.of(
			'ᮃ', 'ᮄ', 'ᮅ', 'ᮆ', 'ᮇ', 'ᮈ', 
			'ᮉ', 'ᮊ', 'ᮋ', 'ᮌ', 'ᮍ', 'ᮎ', 
			'ᮏ', 'ᮐ', 'ᮑ', 'ᮒ', 'ᮓ', 'ᮔ', 
			'ᮕ', 'ᮖ', 'ᮗ', 'ᮘ', 'ᮙ', 'ᮚ', 
			'ᮛ', 'ᮜ', 'ᮝ', 'ᮞ', 'ᮟ', 'ᮠ', 
			'ᮡ', 'ᮢ', 'ᮣ', 'ᮤ', 'ᮥ', 'ᮦ', 
			'ᮧ', 'ᮨ', 'ᮩ', '᮪', '᮫', 'ᮬ', 
			'ᮭ', 'ᮮ', 'ᮯ', '᮰', '᮱', '᮲', 
			'᮳', '᮴', '᮵', '᮶', '᮷', '᮸', 
			'᮹', 'ᮺ', 'ᮻ', 'ᮼ', 'ᮽ', 'ᮾ', 
			'ᮿ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link SundaneseAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new SundaneseAlphabet());
	}

	/**
	 * Проверка метода {@link SundaneseAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new SundaneseAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
