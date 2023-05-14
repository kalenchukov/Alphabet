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
 * Класс букв тайского алфавита.
 *
 * @author Алексей Каленчуков
 */
public final class ThaiAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0E01', '\u0E02', '\u0E03', '\u0E04', '\u0E05', '\u0E06', 
			'\u0E07', '\u0E08', '\u0E09', '\u0E0A', '\u0E0B', '\u0E0C', 
			'\u0E0D', '\u0E0E', '\u0E0F', '\u0E10', '\u0E11', '\u0E12', 
			'\u0E13', '\u0E14', '\u0E15', '\u0E16', '\u0E17', '\u0E18', 
			'\u0E19', '\u0E1A', '\u0E1B', '\u0E1C', '\u0E1D', '\u0E1E', 
			'\u0E1F', '\u0E20', '\u0E21', '\u0E22', '\u0E23', '\u0E25', 
			'\u0E27', '\u0E28', '\u0E29', '\u0E2A', '\u0E2B', '\u0E2C', 
			'\u0E2D', '\u0E2E', '\u0E30', '\u0E31', '\u0E32', '\u0E33', 
			'\u0E34', '\u0E35', '\u0E36', '\u0E37', '\u0E38', '\u0E39', 
			'\u0E3A', '\u0E40', '\u0E41', '\u0E42', '\u0E43', '\u0E44', 
			'\u0E45', '\u0E46', '\u0E47', '\u0E48', '\u0E49', '\u0E4A', 
			'\u0E4B', '\u0E4C', '\u0E4D', '\u0E4E', '\u0E4F'
	);

	/**
	 * Конструктор для {@code ThaiAlphabet}.
	 */
	public ThaiAlphabet()
	{
		super(ThaiAlphabet.LETTERS);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param obj {@inheritDoc}
	 * @return {@inheritDoc}
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

		final ThaiAlphabet alphabet = (ThaiAlphabet) obj;

		if (!Objects.equals(this.get(), alphabet.get())) {
			return false;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	public int hashCode()
	{
		return this.get().hashCode();
	}
}
