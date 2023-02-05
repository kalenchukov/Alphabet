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
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Objects;

/**
 * Класс букв батакского алфавита.
 */
public class BatakAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1BC0', '\u1BC1', '\u1BC2', '\u1BC3', '\u1BC4', '\u1BC5', 
			'\u1BC6', '\u1BC7', '\u1BC8', '\u1BC9', '\u1BCA', '\u1BCB', 
			'\u1BCC', '\u1BCD', '\u1BCE', '\u1BCF', '\u1BD0', '\u1BD1', 
			'\u1BD2', '\u1BD3', '\u1BD4', '\u1BD5', '\u1BD6', '\u1BD7', 
			'\u1BD8', '\u1BD9', '\u1BDA', '\u1BDB', '\u1BDC', '\u1BDD', 
			'\u1BDE', '\u1BDF', '\u1BE0', '\u1BE1', '\u1BE2', '\u1BE3', 
			'\u1BE4', '\u1BE5', '\u1BE6', '\u1BE7', '\u1BE8', '\u1BE9', 
			'\u1BEA', '\u1BEB', '\u1BEC', '\u1BED', '\u1BEE', '\u1BEF', 
			'\u1BF0', '\u1BF1', '\u1BF2', '\u1BF3'
	);

	/**
	 * Конструктор для {@code BatakAlphabet}.
	 */
	public BatakAlphabet()
	{
		super(BatakAlphabet.LETTERS);
	}

	/**
	 * @see Object#equals(Object)
	 */
	@Override
	public boolean equals(@Nullable final Object obj)
	{
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		final BatakAlphabet alphabet = (BatakAlphabet) obj;

		if (!Objects.equals(BatakAlphabet.LETTERS, alphabet.get())) {
			return false;
		}

		return true;
	}

	/**
	 * @see Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return BatakAlphabet.LETTERS.hashCode();
	}
}
