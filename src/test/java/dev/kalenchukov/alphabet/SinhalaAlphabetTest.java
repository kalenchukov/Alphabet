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
 * Класс проверки методов класса {@link SinhalaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class SinhalaAlphabetTest
{
	/**
	 * Проверка метода {@link SinhalaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		SinhalaAlphabet alphabet = new SinhalaAlphabet();
		List<Character> expectedList = List.of(
			'අ', 'ආ', 'ඇ', 'ඈ', 'ඉ', 'ඊ', 
			'උ', 'ඌ', 'ඍ', 'ඎ', 'ඏ', 'ඐ', 
			'එ', 'ඒ', 'ඓ', 'ඔ', 'ඕ', 'ඖ', 
			'ක', 'ඛ', 'ග', 'ඝ', 'ඞ', 'ඟ', 
			'ච', 'ඡ', 'ජ', 'ඣ', 'ඤ', 'ට', 
			'ඨ', 'ඩ', 'ඪ', 'ණ', 'ඬ', 'ත', 
			'ථ', 'ද', 'ධ', 'න', 'ඳ', 'ප', 
			'ඵ', 'බ', 'භ', 'ම', 'ඹ', 'ය', 
			'ර', 'ල', 'ව', 'ළ', 'ශ', 'ෂ', 
			'ස', 'හ', 'ෆ', '්', 'ා', 'ැ', 
			'ෑ', 'ි', 'ී', 'ු', 'ූ', 'ෘ', 
			'ෙ', 'ේ', 'ෛ', 'ො', 'ෝ', 'ෞ', 
			'ෟ', 'ෲ', 'ෳ', '෴'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link SinhalaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		SinhalaAlphabet alphabet1 = new SinhalaAlphabet();
		SinhalaAlphabet alphabet2 = new SinhalaAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link SinhalaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		SinhalaAlphabet alphabet1 = new SinhalaAlphabet();
		SinhalaAlphabet alphabet2 = new SinhalaAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
