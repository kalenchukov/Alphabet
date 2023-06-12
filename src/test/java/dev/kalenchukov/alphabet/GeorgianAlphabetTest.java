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
 * Класс проверки методов класса {@link GeorgianAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class GeorgianAlphabetTest
{
	/**
	 * Проверка метода {@link GeorgianAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		GeorgianAlphabet alphabet = new GeorgianAlphabet();
		List<Character> expectedList = List.of(
			'ა', 'ბ', 'გ', 'დ', 'ე', 'ვ', 
			'ზ', 'თ', 'ი', 'კ', 'ლ', 'მ', 
			'ნ', 'ო', 'პ', 'ჟ', 'რ', 'ს', 
			'ტ', 'უ', 'ფ', 'ქ', 'ღ', 'ყ', 
			'შ', 'ჩ', 'ც', 'ძ', 'წ', 'ჭ', 
			'ხ', 'ჯ', 'ჰ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link GeorgianAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		GeorgianAlphabet alphabet1 = new GeorgianAlphabet();
		GeorgianAlphabet alphabet2 = new GeorgianAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link GeorgianAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		GeorgianAlphabet alphabet1 = new GeorgianAlphabet();
		GeorgianAlphabet alphabet2 = new GeorgianAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
