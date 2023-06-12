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

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link BengaliAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class BengaliAlphabetTest
{
	/**
	 * Проверка метода {@link BengaliAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		BengaliAlphabet alphabet = new BengaliAlphabet();
		List<Character> expectedList = List.of(
			'অ', 'আ', 'ই', 'ঈ', 'উ', 'ঊ', 
			'ঋ', 'এ', 'ঐ', 'ও', 'ঔ', 'ক', 
			'খ', 'গ', 'ঘ', 'ঙ', 'চ', 'ছ', 
			'জ', 'ঝ', 'ঞ', 'ট', 'ঠ', 'ড', 
			'ঢ', 'ণ', 'ত', 'থ', 'দ', 'ধ', 
			'ন', 'প', 'ফ', 'ব', 'ভ', 'ম', 
			'য', 'র', 'ল', 'শ', 'ষ', 'স', 
			'হ', 'য়', 'ড়', 'ঢ়', 'ৎ', 'ঁ', 
			'ং', 'ঃ', '্'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link BengaliAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		BengaliAlphabet alphabet1 = new BengaliAlphabet();
		BengaliAlphabet alphabet2 = new BengaliAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link BengaliAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		BengaliAlphabet alphabet1 = new BengaliAlphabet();
		BengaliAlphabet alphabet2 = new BengaliAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
