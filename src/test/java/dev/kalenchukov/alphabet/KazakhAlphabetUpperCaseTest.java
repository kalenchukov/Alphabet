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
 * Класс проверки методов класса {@link KazakhAlphabet.UpperCase}.
 *
 * @author Алексей Каленчуков
 */
public class KazakhAlphabetUpperCaseTest
{
	/**
	 * Проверка метода {@link KazakhAlphabet.UpperCase#toList()}.
	 */
	@Test
	public void toList()
	{
		Alphabetical alphabet = new KazakhAlphabet.UpperCase();
		List<Character> expectedList = List.of(
			'А', 'Ә', 'Б', 'В', 'Г', 'Ғ', 
			'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 
			'Й', 'К', 'Қ', 'Л', 'М', 'Н', 
			'Ң', 'О', 'Ө', 'П', 'Р', 'С', 
			'Т', 'У', 'Ұ', 'Ү', 'Ф', 'Х', 
			'Һ', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 
			'Ы', 'І', 'Ь', 'Э', 'Ю', 'Я'
		);

		List<Character> actualList = alphabet.toList();

		assertThat(actualList).containsSequence(expectedList);
	}
}
