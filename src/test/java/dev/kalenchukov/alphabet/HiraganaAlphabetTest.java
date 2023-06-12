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
 * Класс проверки методов класса {@link HiraganaAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class HiraganaAlphabetTest
{
	/**
	 * Проверка метода {@link HiraganaAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		HiraganaAlphabet alphabet = new HiraganaAlphabet();
		List<Character> expectedList = List.of(
			'か', 'き', 'く', 'け', 'こ', 'さ', 
			'し', 'す', 'せ', 'そ', 'た', 'ち', 
			'つ', 'て', 'と', 'な', 'に', 'ぬ', 
			'ね', 'の', 'は', 'ひ', 'ふ', 'へ', 
			'ほ', 'ま', 'み', 'む', 'め', 'も', 
			'や', 'ゆ', 'よ', 'ら', 'り', 'る', 
			'れ', 'ろ', 'わ', 'を', 'ん', 'が', 
			'ぎ', 'ぐ', 'げ', 'ご', 'ざ', 'じ', 
			'ず', 'ぜ', 'ぞ', 'だ', 'ぢ', 'づ', 
			'で', 'ど', 'ば', 'び', 'ぶ', 'べ', 
			'ぼ', 'ぱ', 'ぴ', 'ぷ', 'ぺ', 'ぽ', 
			'ゃ', 'ゅ', 'ょ'
		);

		List<Character> actualList = alphabet.get();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link HiraganaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		HiraganaAlphabet alphabet1 = new HiraganaAlphabet();
		HiraganaAlphabet alphabet2 = new HiraganaAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link HiraganaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		HiraganaAlphabet alphabet1 = new HiraganaAlphabet();
		HiraganaAlphabet alphabet2 = new HiraganaAlphabet();

		Integer expectedHashCode = alphabet1.hashCode();
		Integer actualHashCode = alphabet2.hashCode();

		assertEquals(expectedHashCode, actualHashCode);
	}
}
