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
 * Класс проверки методов класса {@link ThaanaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class ThaanaAlphabetTest
{
	/**
	 * Проверка метода {@link ThaanaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		ThaanaAlphabet alphabet = new ThaanaAlphabet();
		List<Character> expectedList = List.of(
			'ހ', 'ށ', 'ނ', 'ރ', 'ބ', 'ޅ', 
			'ކ', 'އ', 'ވ', 'މ', 'ފ', 'ދ', 
			'ތ', 'ލ', 'ގ', 'ޏ', 'ސ', 'ޑ', 
			'ޒ', 'ޓ', 'ޔ', 'ޕ', 'ޖ', 'ޗ', 
			'ޘ', 'ޙ', 'ޚ', 'ޛ', 'ޜ', 'ޝ', 
			'ޞ', 'ޟ', 'ޠ', 'ޡ', 'ޢ', 'ޣ', 
			'ޤ', 'ޥ', 'ަ', 'ާ', 'ި', 'ީ', 
			'ު', 'ޫ', 'ެ', 'ޭ', 'ޮ', 'ޯ', 
			'ް', 'ޱ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link ThaanaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		ThaanaAlphabet alphabet1 = new ThaanaAlphabet();
		ThaanaAlphabet alphabet2 = new ThaanaAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link ThaanaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		ThaanaAlphabet alphabet1 = new ThaanaAlphabet();
		ThaanaAlphabet alphabet2 = new ThaanaAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
