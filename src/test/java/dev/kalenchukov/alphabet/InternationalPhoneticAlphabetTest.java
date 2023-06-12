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
 * Класс проверки методов класса {@link InternationalPhoneticAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class InternationalPhoneticAlphabetTest
{
	/**
	 * Проверка метода {@link InternationalPhoneticAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		InternationalPhoneticAlphabet alphabet = new InternationalPhoneticAlphabet();
		List<Character> expectedList = List.of(
			'p', 'b', 't', 'd', 'ʈ', 'ɖ', 
			'c', 'ɟ', 'k', 'ɡ', 'q', 'ɢ', 
			'ʔ', 'm', 'ɱ', 'n', 'ɳ', 'ɲ', 
			'ŋ', 'ɴ', 'ʙ', 'r', 'ʀ', 'ⱱ', 
			'ɾ', 'ɽ', 'ɸ', 'β', 'f', 'v', 
			'θ', 'ð', 's', 'z', 'ʃ', 'ʒ', 
			'ʂ', 'ʐ', 'ç', 'ʝ', 'x', 'ɣ', 
			'χ', 'ʁ', 'ħ', 'ʕ', 'h', 'ɦ', 
			'ɬ', 'ɮ', 'ʋ', 'ɹ', 'ɻ', 'j', 
			'ɰ', 'l', 'ɭ', 'ʎ', 'ʟ', 'i', 
			'y', 'ɨ', 'ʉ', 'ɯ', 'u', 'ɪ', 
			'ʏ', 'ʊ', 'e', 'ø', 'ɘ', 'ɵ', 
			'ɤ', 'o', 'ə', 'ɛ', 'œ', 'ɜ', 
			'ɞ', 'ʌ', 'ɔ', 'æ', 'ɐ', 'a', 
			'ɶ', 'ɑ', 'ɒ', 'ʘ', 'ǀ', 'ǃ', 
			'ǂ', 'ǁ', 'ɓ', 'ɗ', 'ʄ', 'ɠ', 
			'ʛ', 'ʼ', 'ʍ', 'w', 'ɥ', 'ʜ', 
			'ʢ', 'ʡ', 'ɕ', 'ʑ', 'ɺ', 'ɧ', 
			'ˈ', 'ˌ', 'ː', 'ˑ', '̆', '|', 
			'‖', '.', '‿', '͡', '̥', '̬', 
			'ʰ', '̹', '̜', '̟', '̠', '̈', 
			'̽', '̩', '̯', '˞', '̤', '̰', 
			'̼', 'ʷ', 'ʲ', 'ˠ', 'ˤ', '̴', 
			'̝', '̞', '̘', '̙', '̪', '̺', 
			'̻', '̃', 'ⁿ', 'ˡ', '̚', 'ɚ', 
			'ɝ', 'ɫ', 'ɬ', 'ɷ', 'ɼ', 'ɿ', 
			'ʅ', 'ʆ', 'ʇ', 'ʓ', 'ʖ', 'ʗ', 
			'ʚ', 'ʞ', 'ʠ', 'ʣ', 'ʤ', 'ʥ', 
			'ʦ', 'ʧ', 'ʨ', 'ʩ', 'ʪ', 'ʫ', 
			'ʬ', 'ʭ', 'ʮ', 'ʯ'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link InternationalPhoneticAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		InternationalPhoneticAlphabet alphabet1 = new InternationalPhoneticAlphabet();
		InternationalPhoneticAlphabet alphabet2 = new InternationalPhoneticAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link InternationalPhoneticAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		InternationalPhoneticAlphabet alphabet1 = new InternationalPhoneticAlphabet();
		InternationalPhoneticAlphabet alphabet2 = new InternationalPhoneticAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}
