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

public class ArmenianAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new ArmenianAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'Ա', 'ա', 'Բ', 'բ', 'Գ', 'գ', 
			'Դ', 'դ', 'Ե', 'ե', 'Զ', 'զ', 
			'Է', 'է', 'Ը', 'ը', 'Թ', 'թ', 
			'Ժ', 'ժ', 'Ի', 'ի', 'Լ', 'լ', 
			'Խ', 'խ', 'Ծ', 'ծ', 'Կ', 'կ', 
			'Հ', 'հ', 'Ձ', 'ձ', 'Ղ', 'ղ', 
			'Ճ', 'ճ', 'Մ', 'մ', 'Յ', 'յ', 
			'Ն', 'ն', 'Շ', 'շ', 'Ո', 'ո', 
			'Չ', 'չ', 'Պ', 'պ', 'Ջ', 'ջ', 
			'Ռ', 'ռ', 'Ս', 'ս', 'Վ', 'վ', 
			'Տ', 'տ', 'Ր', 'ր', 'Ց', 'ց', 
			'Ւ', 'ւ', 'Փ', 'փ', 'Ք', 'ք', 
			'Օ', 'օ', 'Ֆ', 'ֆ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка сравнения объектов.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(ALPHABET.equals(null));

		assertTrue(ALPHABET.equals(ALPHABET));

		assertFalse(ALPHABET.equals(new RussianAlphabet()));

		assertTrue(ALPHABET.equals(new ArmenianAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new ArmenianAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
