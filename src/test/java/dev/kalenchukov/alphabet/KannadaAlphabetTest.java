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
 * Класс проверки методов класса {@link KannadaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class KannadaAlphabetTest
{
	/**
	 * Проверка метода {@link KannadaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		KannadaAlphabet alphabet = new KannadaAlphabet();
		List<Character> expectedList = List.of(
			'ಅ', 'ಆ', 'ಇ', 'ಈ', 'ಉ', 'ಊ', 
			'ಋ', 'ೠ', 'ಎ', 'ಏ', 'ಐ', 'ಒ', 
			'ಓ', 'ಔ', 'ಕ', 'ಖ', 'ಗ', 'ಘ', 
			'ಙ', 'ಚ', 'ಛ', 'ಜ', 'ಝ', 'ಞ', 
			'ಟ', 'ಠ', 'ಡ', 'ಢ', 'ಣ', 'ತ', 
			'ಥ', 'ದ', 'ಧ', 'ನ', 'ಪ', 'ಫ', 
			'ಬ', 'ಭ', 'ಮ', 'ಯ', 'ರ', 'ಱ', 
			'ಲ', 'ವ', 'ಶ', 'ಷ', 'ಸ', 'ಹ', 
			'ಳ', 'ೞ', 'ೀ', 'ು', 'ೂ', 'ೃ', 
			'ೄ', 'ೆ', 'ೇ', 'ೈ', 'ೊ', 'ೋ', 
			'ೌ', '್'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link KannadaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		KannadaAlphabet alphabet1 = new KannadaAlphabet();
		KannadaAlphabet alphabet2 = new KannadaAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link KannadaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		KannadaAlphabet alphabet1 = new KannadaAlphabet();
		KannadaAlphabet alphabet2 = new KannadaAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
