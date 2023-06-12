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
 * Класс проверки методов класса {@link TagbanwaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class TagbanwaAlphabetTest
{
	/**
	 * Проверка метода {@link TagbanwaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		TagbanwaAlphabet alphabet = new TagbanwaAlphabet();
		List<Character> expectedList = List.of(
			'ᝠ', 'ᝡ', 'ᝢ', 'ᝣ', 'ᝤ', 'ᝥ', 
			'ᝦ', 'ᝧ', 'ᝨ', 'ᝩ', 'ᝪ', 'ᝫ', 
			'ᝬ', 'ᝮ', 'ᝯ', 'ᝰ', 'ᝲ', 'ᝳ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link TagbanwaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		TagbanwaAlphabet alphabet1 = new TagbanwaAlphabet();
		TagbanwaAlphabet alphabet2 = new TagbanwaAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link TagbanwaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		TagbanwaAlphabet alphabet1 = new TagbanwaAlphabet();
		TagbanwaAlphabet alphabet2 = new TagbanwaAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
