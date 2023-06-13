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
 * Класс проверки методов класса {@link HungarianAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class HungarianAlphabetTest
{
	/**
	 * Проверка метода {@link HungarianAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		Alphabetical alphabet = new HungarianAlphabet();
		List<Character> expectedList = List.of(
			'A', 'Á', 'B', 'C', 'D', 'E', 
			'É', 'F', 'G', 'H', 'I', 'Í', 
			'J', 'K', 'L', 'M', 'N', 'O', 
			'Ó', 'Ö', 'Ő', 'P', 'Q', 'R', 
			'S', 'T', 'U', 'Ú', 'Ü', 'Ű', 
			'V', 'W', 'X', 'Y', 'Z'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
