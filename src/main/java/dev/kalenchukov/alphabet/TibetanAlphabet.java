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
 * Класс букв тибетского алфавита.
 */
public class TibetanAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0F40', '\u0F41', '\u0F42', '\u0F44', '\u0F45', '\u0F46', 
			'\u0F47', '\u0F49', '\u0F4F', '\u0F50', '\u0F51', '\u0F53', 
			'\u0F54', '\u0F55', '\u0F56', '\u0F58', '\u0F59', '\u0F5A', 
			'\u0F5B', '\u0F5D', '\u0F5E', '\u0F5F', '\u0F60', '\u0F61', 
			'\u0F62', '\u0F63', '\u0F64', '\u0F66', '\u0F67', '\u0F68', 
			'\u0F69', '\u0F6A', '\u0F6B', '\u0F6C'
	);

	/**
	 * Конструктор для {@code TibetanAlphabet}.
	 */
	public TibetanAlphabet()
	{
		super(TibetanAlphabet.LETTERS);
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

		final TibetanAlphabet alphabet = (TibetanAlphabet) obj;

		if (!Objects.equals(TibetanAlphabet.LETTERS, alphabet.get())) {
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
		return TibetanAlphabet.LETTERS.hashCode();
	}
}
