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
 * Класс букв алфавита тифанаг.
 */
public class TifinaghAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u2D30', '\u2D31', '\u2D32', '\u2D33', '\u2D34', '\u2D35', 
			'\u2D36', '\u2D37', '\u2D38', '\u2D39', '\u2D3A', '\u2D3B', 
			'\u2D3C', '\u2D3D', '\u2D3E', '\u2D3F', '\u2D40', '\u2D41', 
			'\u2D42', '\u2D43', '\u2D44', '\u2D45', '\u2D46', '\u2D47', 
			'\u2D48', '\u2D49', '\u2D4A', '\u2D4B', '\u2D4C', '\u2D4D', 
			'\u2D4E', '\u2D4F', '\u2D50', '\u2D51', '\u2D52', '\u2D53', 
			'\u2D54', '\u2D55', '\u2D56', '\u2D57', '\u2D58', '\u2D59', 
			'\u2D5A', '\u2D5B', '\u2D5C', '\u2D5D', '\u2D5E', '\u2D5F', 
			'\u2D60', '\u2D61', '\u2D62', '\u2D63', '\u2D64', '\u2D65', 
			'\u2D66', '\u2D67', '\u2D6F', '\u2D70', '\u2D7F'
	);

	/**
	 * Конструктор для {@code TifinaghAlphabet}.
	 */
	public TifinaghAlphabet()
	{
		super(TifinaghAlphabet.LETTERS);
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

		final TifinaghAlphabet alphabet = (TifinaghAlphabet) obj;

		if (!Objects.equals(this.get(), alphabet.get())) {
			return false;
		}

		return true;
	}

	/**
	 * @see Alphabetical#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return this.get().hashCode();
	}
}
