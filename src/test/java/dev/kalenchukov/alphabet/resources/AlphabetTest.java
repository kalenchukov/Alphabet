/*
 * Copyright © 2023 Алексей Каленчуков
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

package dev.kalenchukov.alphabet.resources;

import dev.kalenchukov.alphabet.RussianAlphabet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки констант и методов перечисления {@link Alphabet}.
 */
public class AlphabetTest
{
	/**
	 * Проверка метода {@link Alphabet#getAlphabet()}.
	 */
	@Test
	public void getAlphabet()
	{
		assertEquals(new RussianAlphabet(), Alphabet.RUSSIAN.getAlphabet());
	}

	/**
	 * Проверка метода {@link Alphabet#toString()}.
	 */
	@Test
	public void testToString()
	{
		assertEquals("SYLOTI NAGRI", Alphabet.SYLOTI_NAGRI.toString());
	}
}