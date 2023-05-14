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

import org.jetbrains.annotations.NotNull;
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
	@NotNull
	public static final Alphabetical ALPHABET = new HiraganaAlphabet();

	/**
	 * Проверка метода {@link HiraganaAlphabet#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
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

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link HiraganaAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new HiraganaAlphabet());
	}

	/**
	 * Проверка метода {@link HiraganaAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new HiraganaAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
