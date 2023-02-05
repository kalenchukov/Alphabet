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
 * Класс букв алфавита гурмукхи.
 */
public class GurmukhiAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0A73', '\u0A05', '\u0A72', '\u0A38', '\u0A39', '\u0A15', 
			'\u0A16', '\u0A17', '\u0A18', '\u0A19', '\u0A1A', '\u0A1B', 
			'\u0A1C', '\u0A1D', '\u0A1E', '\u0A1F', '\u0A20', '\u0A21', 
			'\u0A22', '\u0A23', '\u0A24', '\u0A25', '\u0A26', '\u0A27', 
			'\u0A28', '\u0A2A', '\u0A2B', '\u0A2C', '\u0A2D', '\u0A2E', 
			'\u0A2F', '\u0A30', '\u0A32', '\u0A35', '\u0A5C', '\u0A36', 
			'\u0A59', '\u0A5A', '\u0A5B', '\u0A5E', '\u0A33', '\u0A05', 
			'\u0A06', '\u0A07', '\u0A08', '\u0A09', '\u0A0A', '\u0A0F', 
			'\u0A10', '\u0A13', '\u0A14', '\u0A71', '\u0A02', '\u0A70', 
			'\u0A03', '\u0A4D', '\u0A74'
	);

	/**
	 * Конструктор для {@code GurmukhiAlphabet}.
	 */
	public GurmukhiAlphabet()
	{
		super(GurmukhiAlphabet.LETTERS);
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

		final GurmukhiAlphabet alphabet = (GurmukhiAlphabet) obj;

		if (!Objects.equals(GurmukhiAlphabet.LETTERS, alphabet.get())) {
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
		return GurmukhiAlphabet.LETTERS.hashCode();
	}
}
