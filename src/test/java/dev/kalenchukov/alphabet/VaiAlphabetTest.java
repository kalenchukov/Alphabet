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

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link VaiAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class VaiAlphabetTest
{
	/**
	 * Проверка метода {@link VaiAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		VaiAlphabet alphabet = new VaiAlphabet();
		List<Character> expectedList = List.of(
			'ꔀ', 'ꔁ', 'ꔂ', 'ꔃ', 'ꔄ', 'ꔅ', 
			'ꔆ', 'ꔇ', 'ꔈ', 'ꔉ', 'ꔊ', 'ꔋ', 
			'ꔌ', 'ꔍ', 'ꔎ', 'ꔏ', 'ꔐ', 'ꔑ', 
			'ꔒ', 'ꔓ', 'ꔔ', 'ꔕ', 'ꔖ', 'ꔗ', 
			'ꔘ', 'ꔙ', 'ꔚ', 'ꔛ', 'ꔜ', 'ꔝ', 
			'ꔞ', 'ꔟ', 'ꔠ', 'ꔡ', 'ꔢ', 'ꔣ', 
			'ꔤ', 'ꔥ', 'ꔦ', 'ꔧ', 'ꔨ', 'ꔩ', 
			'ꔪ', 'ꔫ', 'ꔬ', 'ꔭ', 'ꔮ', 'ꔯ', 
			'ꔰ', 'ꔱ', 'ꔲ', 'ꔳ', 'ꔴ', 'ꔵ', 
			'ꔶ', 'ꔷ', 'ꔸ', 'ꔹ', 'ꔺ', 'ꔻ', 
			'ꔼ', 'ꔽ', 'ꔾ', 'ꔿ', 'ꕀ', 'ꕁ', 
			'ꕂ', 'ꕃ', 'ꕄ', 'ꕅ', 'ꕆ', 'ꕇ', 
			'ꕈ', 'ꕉ', 'ꕊ', 'ꕋ', 'ꕌ', 'ꕍ', 
			'ꕎ', 'ꕏ', 'ꕐ', 'ꕑ', 'ꕒ', 'ꕓ', 
			'ꕔ', 'ꕕ', 'ꕖ', 'ꕗ', 'ꕘ', 'ꕙ', 
			'ꕚ', 'ꕛ', 'ꕜ', 'ꕝ', 'ꕞ', 'ꕟ', 
			'ꕠ', 'ꕡ', 'ꕢ', 'ꕣ', 'ꕤ', 'ꕥ', 
			'ꕦ', 'ꕧ', 'ꕨ', 'ꕩ', 'ꕪ', 'ꕫ', 
			'ꕬ', 'ꕭ', 'ꕮ', 'ꕯ', 'ꕰ', 'ꕱ', 
			'ꕲ', 'ꕳ', 'ꕴ', 'ꕵ', 'ꕶ', 'ꕷ', 
			'ꕸ', 'ꕹ', 'ꕺ', 'ꕻ', 'ꕼ', 'ꕽ', 
			'ꕾ', 'ꕿ', 'ꖀ', 'ꖁ', 'ꖂ', 'ꖃ', 
			'ꖄ', 'ꖅ', 'ꖆ', 'ꖇ', 'ꖈ', 'ꖉ', 
			'ꖊ', 'ꖋ', 'ꖌ', 'ꖍ', 'ꖎ', 'ꖏ', 
			'ꖐ', 'ꖑ', 'ꖒ', 'ꖓ', 'ꖔ', 'ꖕ', 
			'ꖖ', 'ꖗ', 'ꖘ', 'ꖙ', 'ꖚ', 'ꖛ', 
			'ꖜ', 'ꖝ', 'ꖞ', 'ꖟ', 'ꖠ', 'ꖡ', 
			'ꖢ', 'ꖣ', 'ꖤ', 'ꖥ', 'ꖦ', 'ꖧ', 
			'ꖨ', 'ꖩ', 'ꖪ', 'ꖫ', 'ꖬ', 'ꖭ', 
			'ꖮ', 'ꖯ', 'ꖰ', 'ꖱ', 'ꖲ', 'ꖳ', 
			'ꖴ', 'ꖵ', 'ꖶ', 'ꖷ', 'ꖸ', 'ꖹ', 
			'ꖺ', 'ꖻ', 'ꖼ', 'ꖽ', 'ꖾ', 'ꖿ', 
			'ꗀ', 'ꗁ', 'ꗂ', 'ꗃ', 'ꗄ', 'ꗅ', 
			'ꗆ', 'ꗇ', 'ꗈ', 'ꗉ', 'ꗊ', 'ꗋ', 
			'ꗌ', 'ꗍ', 'ꗎ', 'ꗏ', 'ꗐ', 'ꗑ', 
			'ꗒ', 'ꗓ', 'ꗔ', 'ꗕ', 'ꗖ', 'ꗗ', 
			'ꗘ', 'ꗙ', 'ꗚ', 'ꗛ', 'ꗜ', 'ꗝ', 
			'ꗞ', 'ꗟ', 'ꗠ', 'ꗡ', 'ꗢ', 'ꗣ', 
			'ꗤ', 'ꗥ', 'ꗦ', 'ꗧ', 'ꗨ', 'ꗩ', 
			'ꗪ', 'ꗫ', 'ꗬ', 'ꗭ', 'ꗮ', 'ꗯ', 
			'ꗰ', 'ꗱ', 'ꗲ', 'ꗳ', 'ꗴ', 'ꗵ', 
			'ꗶ', 'ꗷ', 'ꗸ', 'ꗹ', 'ꗺ', 'ꗻ', 
			'ꗼ', 'ꗽ', 'ꗾ', 'ꗿ', 'ꘀ', 'ꘁ', 
			'ꘂ', 'ꘃ', 'ꘄ', 'ꘅ', 'ꘆ', 'ꘇ', 
			'ꘈ', 'ꘉ', 'ꘊ', 'ꘋ', 'ꘌ', '꘍', 
			'꘎', '꘏', 'ꘐ', 'ꘑ', 'ꘒ', 'ꘓ', 
			'ꘔ', 'ꘕ', 'ꘖ', 'ꘗ', 'ꘘ', 'ꘙ', 
			'ꘚ', 'ꘛ', 'ꘜ', 'ꘝ', 'ꘞ', 'ꘟ', 
			'꘠', '꘡', '꘢', '꘣', '꘤', '꘥', 
			'꘦', '꘧', '꘨', '꘩', 'ꘪ', 'ꘫ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link VaiAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		VaiAlphabet alphabet1 = new VaiAlphabet();
		VaiAlphabet alphabet2 = new VaiAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link VaiAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		VaiAlphabet alphabet1 = new VaiAlphabet();
		VaiAlphabet alphabet2 = new VaiAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
