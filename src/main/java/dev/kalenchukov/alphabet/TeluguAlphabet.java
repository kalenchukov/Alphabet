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
 * Класс букв алфавита телугу.
 */
public class TeluguAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0C05', '\u0C06', '\u0C07', '\u0C08', '\u0C09', '\u0C0A', 
			'\u0C0B', '\u0C60', '\u0C0E', '\u0C0F', '\u0C10', '\u0C12', 
			'\u0C13', '\u0C14', '\u0C15', '\u0C16', '\u0C17', '\u0C18', 
			'\u0C19', '\u0C1A', '\u0C1B', '\u0C1C', '\u0C1D', '\u0C1E', 
			'\u0C1F', '\u0C20', '\u0C21', '\u0C22', '\u0C23', '\u0C24', 
			'\u0C25', '\u0C26', '\u0C27', '\u0C28', '\u0C2A', '\u0C2B', 
			'\u0C2C', '\u0C2D', '\u0C2E', '\u0C2F', '\u0C30', '\u0C32', 
			'\u0C35', '\u0C33', '\u0C36', '\u0C37', '\u0C38', '\u0C39', 
			'\u0C3D', '\u0C3E', '\u0C3F', '\u0C40', '\u0C41', '\u0C42', 
			'\u0C43', '\u0C44', '\u0C46', '\u0C47', '\u0C48', '\u0C4A', 
			'\u0C4B', '\u0C4C', '\u0C4D', '\u0C58', '\u0C59', '\u0C60', 
			'\u0C61', '\u0C62', '\u0C63'
	);

	/**
	 * Конструктор для {@code TeluguAlphabet}.
	 */
	public TeluguAlphabet()
	{
		super(TeluguAlphabet.LETTERS);
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

		final TeluguAlphabet alphabet = (TeluguAlphabet) obj;

		if (!Objects.equals(TeluguAlphabet.LETTERS, alphabet.get())) {
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
		return TeluguAlphabet.LETTERS.hashCode();
	}
}
