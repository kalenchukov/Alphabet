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
 * Класс проверки методов класса {@link FrenchAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class FrenchAlphabetTest
{
	/**
	 * Проверка метода {@link FrenchAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		FrenchAlphabet alphabet = new FrenchAlphabet();
		List<Character> expectedList = List.of(
			'A', 'a', 'B', 'b', 'C', 'c', 
			'D', 'd', 'E', 'e', 'F', 'f', 
			'G', 'g', 'H', 'h', 'I', 'i', 
			'J', 'j', 'K', 'k', 'L', 'l', 
			'M', 'm', 'N', 'n', 'O', 'o', 
			'P', 'p', 'Q', 'q', 'R', 'r', 
			'S', 's', 'T', 't', 'U', 'u', 
			'V', 'v', 'W', 'w', 'X', 'x', 
			'Y', 'y', 'Z', 'z'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link FrenchAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		FrenchAlphabet alphabet1 = new FrenchAlphabet();
		FrenchAlphabet alphabet2 = new FrenchAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link FrenchAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		FrenchAlphabet alphabet1 = new FrenchAlphabet();
		FrenchAlphabet alphabet2 = new FrenchAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
