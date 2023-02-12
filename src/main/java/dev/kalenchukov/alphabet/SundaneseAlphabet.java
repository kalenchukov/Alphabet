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
 * Класс букв сунданского алфавита.
 */
public class SundaneseAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1B83', '\u1B84', '\u1B85', '\u1B86', '\u1B87', '\u1B88', 
			'\u1B89', '\u1B8A', '\u1B8B', '\u1B8C', '\u1B8D', '\u1B8E', 
			'\u1B8F', '\u1B90', '\u1B91', '\u1B92', '\u1B93', '\u1B94', 
			'\u1B95', '\u1B96', '\u1B97', '\u1B98', '\u1B99', '\u1B9A', 
			'\u1B9B', '\u1B9C', '\u1B9D', '\u1B9E', '\u1B9F', '\u1BA0', 
			'\u1BA1', '\u1BA2', '\u1BA3', '\u1BA4', '\u1BA5', '\u1BA6', 
			'\u1BA7', '\u1BA8', '\u1BA9', '\u1BAA', '\u1BAB', '\u1BAC', 
			'\u1BAD', '\u1BAE', '\u1BAF', '\u1BB0', '\u1BB1', '\u1BB2', 
			'\u1BB3', '\u1BB4', '\u1BB5', '\u1BB6', '\u1BB7', '\u1BB8', 
			'\u1BB9', '\u1BBA', '\u1BBB', '\u1BBC', '\u1BBD', '\u1BBE', 
			'\u1BBF'
	);

	/**
	 * Конструктор для {@code SundaneseAlphabet}.
	 */
	public SundaneseAlphabet()
	{
		super(SundaneseAlphabet.LETTERS);
	}

	/**
	 * @see Alphabetical#equals(Object)
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

		final SundaneseAlphabet alphabet = (SundaneseAlphabet) obj;

		if (!Objects.equals(SundaneseAlphabet.LETTERS, alphabet.get())) {
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
		return SundaneseAlphabet.LETTERS.hashCode();
	}
}
