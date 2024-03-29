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
 * Класс проверки методов класса {@link ThaiAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class ThaiAlphabetTest
{
	/**
	 * Проверка метода {@link ThaiAlphabet#toList()}.
	 */
	@Test
	public void toList()
	{
		Alphabetical alphabet = new ThaiAlphabet();
		List<Character> expectedList = List.of(
			'ก', 'ข', 'ฃ', 'ค', 'ฅ', 'ฆ', 
			'ง', 'จ', 'ฉ', 'ช', 'ซ', 'ฌ', 
			'ญ', 'ฎ', 'ฏ', 'ฐ', 'ฑ', 'ฒ', 
			'ณ', 'ด', 'ต', 'ถ', 'ท', 'ธ', 
			'น', 'บ', 'ป', 'ผ', 'ฝ', 'พ', 
			'ฟ', 'ภ', 'ม', 'ย', 'ร', 'ล', 
			'ว', 'ศ', 'ษ', 'ส', 'ห', 'ฬ', 
			'อ', 'ฮ', 'ะ', 'ั', 'า', 'ำ', 
			'ิ', 'ี', 'ึ', 'ื', 'ุ', 'ู', 
			'ฺ', 'เ', 'แ', 'โ', 'ใ', 'ไ', 
			'ๅ', 'ๆ', '็', '่', '้', '๊', 
			'๋', '์', 'ํ', '๎', '๏'
		);

		List<Character> actualList = alphabet.toList();

		assertThat(actualList).containsSequence(expectedList);
	}
}
