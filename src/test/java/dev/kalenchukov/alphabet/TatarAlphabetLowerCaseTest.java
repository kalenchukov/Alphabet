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
 * Класс проверки методов класса {@link TatarAlphabet.LowerCase}.
 *
 * @author Алексей Каленчуков
 */
public class TatarAlphabetLowerCaseTest
{
	/**
	 * Проверка метода {@link TatarAlphabet.LowerCase#toList()}.
	 */
	@Test
	public void toList()
	{
		Alphabetical alphabet = new TatarAlphabet.LowerCase();
		List<Character> expectedList = List.of(
			'а', 'ә', 'б', 'в', 'г', 'д', 
			'е', 'ё', 'ж', 'җ', 'з', 'и', 
			'й', 'к', 'л', 'м', 'н', 'ң', 
			'о', 'ө', 'п', 'р', 'с', 'т', 
			'у', 'ү', 'ф', 'х', 'һ', 'ц', 
			'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 
			'э', 'ю', 'я'
		);

		List<Character> actualList = alphabet.toList();

		assertThat(actualList).containsSequence(expectedList);
	}
}
