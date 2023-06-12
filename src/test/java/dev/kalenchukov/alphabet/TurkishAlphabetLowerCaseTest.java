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
 * Класс проверки методов класса {@link TurkishAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class TurkishAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link TurkishAlphabet.LowerCase#get()}.
	 */
	@Test
	public void get()
	{
		TurkishAlphabet.LowerCase alphabet = new TurkishAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'a', 'b', 'c', 'ç', 'd', 'e', 
			'f', 'g', 'ğ', 'h', 'ı', 'i', 
			'j', 'k', 'l', 'm', 'n', 'o', 
			'ö', 'p', 'r', 's', 'ş', 't', 
			'u', 'ü', 'v', 'y', 'z'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
