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
 * Класс букв алфавита гуджарати.
 */
public class GujaratiAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0A95', '\u0A96', '\u0A97', '\u0A98', '\u0A99', '\u0A9A', 
			'\u0A9B', '\u0A9C', '\u0A9D', '\u0A9E', '\u0A9F', '\u0AA0', 
			'\u0AA1', '\u0AA2', '\u0AA3', '\u0AA4', '\u0AA5', '\u0AA6', 
			'\u0AA7', '\u0AA8', '\u0AAA', '\u0AAB', '\u0AAC', '\u0AAD', 
			'\u0AAE', '\u0AAF', '\u0AB0', '\u0AB2', '\u0AB5', '\u0AB6', 
			'\u0AB7', '\u0AB8', '\u0AB9', '\u0AB3', '\u0A85', '\u0A86',
			'\u0A87', '\u0A88', '\u0A89', '\u0A8A', '\u0A8B', '\u0A8F',
			'\u0A90', '\u0A93', '\u0A94', '\u0ACD', '\u0A82', '\u0A83'
	);

	/**
	 * Конструктор для {@code GujaratiAlphabet}.
	 */
	public GujaratiAlphabet()
	{
		super(GujaratiAlphabet.LETTERS);
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

		final GujaratiAlphabet alphabet = (GujaratiAlphabet) obj;

		if (!Objects.equals(GujaratiAlphabet.LETTERS, alphabet.get())) {
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
		return GujaratiAlphabet.LETTERS.hashCode();
	}
}
