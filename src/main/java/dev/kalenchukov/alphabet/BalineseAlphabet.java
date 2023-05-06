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
 * Класс букв балийского алфавита.
 *
 * @author Aleksey Kalenchukov
 */
public final class BalineseAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1B05', '\u1B06', '\u1B07', '\u1B08', '\u1B09', '\u1B0A', 
			'\u1B0B', '\u1B0C', '\u1B0D', '\u1B0E', '\u1B0F', '\u1B10', 
			'\u1B11', '\u1B12', '\u1B13', '\u1B14', '\u1B15', '\u1B16', 
			'\u1B17', '\u1B18', '\u1B19', '\u1B1A', '\u1B1B', '\u1B1C', 
			'\u1B1D', '\u1B1E', '\u1B1F', '\u1B20', '\u1B21', '\u1B22', 
			'\u1B23', '\u1B24', '\u1B25', '\u1B26', '\u1B27', '\u1B28', 
			'\u1B29', '\u1B2A', '\u1B2B', '\u1B2C', '\u1B2D', '\u1B2E', 
			'\u1B2F', '\u1B30', '\u1B31', '\u1B32', '\u1B33', '\u1B00', 
			'\u1B01', '\u1B02', '\u1B03', '\u1B04', '\u1B34', '\u1B35', 
			'\u1B36', '\u1B37', '\u1B38', '\u1B39', '\u1B3A', '\u1B3B', 
			'\u1B3C', '\u1B3D', '\u1B3E', '\u1B3F', '\u1B40', '\u1B41', 
			'\u1B42', '\u1B43', '\u1B44', '\u1B45', '\u1B46', '\u1B47', 
			'\u1B48', '\u1B49', '\u1B4A', '\u1B4B'
	);

	/**
	 * Конструктор для {@code BalineseAlphabet}.
	 */
	public BalineseAlphabet()
	{
		super(BalineseAlphabet.LETTERS);
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

		final BalineseAlphabet alphabet = (BalineseAlphabet) obj;

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
