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
 * Класс проверки методов класса {@link BashkirAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class BashkirAlphabetTest
{
	/**
	 * Проверка метода {@link BashkirAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		Alphabetical alphabet = new BashkirAlphabet();
		List<Character> expectedList = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 
			'Г', 'г', 'Ғ', 'ғ', 'Д', 'д', 
			'Ҙ', 'ҙ', 'Е', 'е', 'Ё', 'ё', 
			'Ж', 'ж', 'З', 'з', 'И', 'и', 
			'Й', 'й', 'К', 'к', 'Ҡ', 'ҡ', 
			'Л', 'л', 'М', 'м', 'Н', 'н', 
			'Ң', 'ң', 'О', 'о', 'Ө', 'ө', 
			'П', 'п', 'Р', 'р', 'С', 'с', 
			'Ҫ', 'ҫ', 'Т', 'т', 'У', 'у', 
			'Ү', 'ү', 'Ф', 'ф', 'Х', 'х', 
			'Һ', 'һ', 'Ц', 'ц', 'Ч', 'ч', 
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 
			'Ы', 'ы', 'Ь', 'ь', 'Э', 'э', 
			'Ә', 'ә', 'Ю', 'ю', 'Я', 'я'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
