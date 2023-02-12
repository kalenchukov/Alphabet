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
 * Класс проверки методов класса {@link BashkirAlphabet.UpperCase}.
 */
public class BashkirAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BashkirAlphabet.UpperCase();

	/**
	 * Проверка метода {@link BashkirAlphabet.UpperCase#get()}.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'А', 'Б', 'В', 'Г', 'Ғ', 'Д', 
			'Ҙ', 'Е', 'Ё', 'Ж', 'З', 'И', 
			'Й', 'К', 'Ҡ', 'Л', 'М', 'Н', 
			'Ң', 'О', 'Ө', 'П', 'Р', 'С', 
			'Ҫ', 'Т', 'У', 'Ү', 'Ф', 'Х', 
			'Һ', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 
			'Ы', 'Ь', 'Э', 'Ә', 'Ю', 'Я'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link BashkirAlphabet.UpperCase#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet.UpperCase());;

		assertEquals(ALPHABET, new BashkirAlphabet.UpperCase());;
	}

	/**
	 * Проверка метода {@link BashkirAlphabet.UpperCase#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BashkirAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
