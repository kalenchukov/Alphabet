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
 * Класс букв алфавита ория.
 */
public class OriyaAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0B05', '\u0B06', '\u0B07', '\u0B08', '\u0B09', '\u0B0A', 
			'\u0B0B', '\u0B60', '\u0B0C', '\u0B61', '\u0B0F', '\u0B10', 
			'\u0B13', '\u0B14', '\u0B15', '\u0B16', '\u0B17', '\u0B18', 
			'\u0B19', '\u0B1A', '\u0B1B', '\u0B1C', '\u0B1D', '\u0B1E', 
			'\u0B1F', '\u0B20', '\u0B21', '\u0B22', '\u0B23', '\u0B24', 
			'\u0B25', '\u0B26', '\u0B27', '\u0B28', '\u0B2A', '\u0B2B', 
			'\u0B2C', '\u0B35', '\u0B2D', '\u0B2E', '\u0B2F', '\u0B30', 
			'\u0B33', '\u0B71', '\u0B36', '\u0B37', '\u0B38', '\u0B39', 
			'\u0B5F', '\u0B32'
	);

	/**
	 * Конструктор для {@code OriyaAlphabet}.
	 */
	public OriyaAlphabet()
	{
		super(OriyaAlphabet.LETTERS);
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

		final OriyaAlphabet alphabet = (OriyaAlphabet) obj;

		if (!Objects.equals(OriyaAlphabet.LETTERS, alphabet.get())) {
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
