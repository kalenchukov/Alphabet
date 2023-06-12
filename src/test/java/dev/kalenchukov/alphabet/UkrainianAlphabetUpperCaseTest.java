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
 * Класс проверки методов класса {@link UkrainianAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class UkrainianAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link UkrainianAlphabet.UpperCase#get()}.
	 */
	@Test
	public void get()
	{
		UkrainianAlphabet.UpperCase alphabet = new UkrainianAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'А', 'Б', 'В', 'Г', 'Ґ', 'Д', 
			'Е', 'Є', 'Ж', 'З', 'И', 'І', 
			'Ї', 'Й', 'К', 'Л', 'М', 'Н', 
			'О', 'П', 'Р', 'С', 'Т', 'У', 
			'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 
			'Ь', 'Ю', 'Я'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
