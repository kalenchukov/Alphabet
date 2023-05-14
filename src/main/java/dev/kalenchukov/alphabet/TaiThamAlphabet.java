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
 * Класс букв алфавита ланна.
 *
 * @author Алексей Каленчуков
 */
public final class TaiThamAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1A20', '\u1A21', '\u1A22', '\u1A23', '\u1A24', '\u1A25', 
			'\u1A26', '\u1A27', '\u1A28', '\u1A29', '\u1A2A', '\u1A2B', 
			'\u1A2C', '\u1A2D', '\u1A2E', '\u1A2F', '\u1A30', '\u1A31', 
			'\u1A32', '\u1A33', '\u1A34', '\u1A35', '\u1A36', '\u1A37', 
			'\u1A38', '\u1A39', '\u1A3A', '\u1A3B', '\u1A3C', '\u1A3D', 
			'\u1A3E', '\u1A3F', '\u1A40', '\u1A41', '\u1A42', '\u1A43', 
			'\u1A44', '\u1A45', '\u1A46', '\u1A47', '\u1A48', '\u1A49', 
			'\u1A4A', '\u1A4B', '\u1A4C', '\u1A50', '\u1A51', '\u1A52', 
			'\u1A53', '\u1A54', '\u1A55', '\u1A56', '\u1A57', '\u1A58', 
			'\u1A59', '\u1A5A', '\u1A5B', '\u1A5C', '\u1A5D', '\u1A5E'
	);

	/**
	 * Конструктор для {@code TaiThamAlphabet}.
	 */
	public TaiThamAlphabet()
	{
		super(TaiThamAlphabet.LETTERS);
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

		final TaiThamAlphabet alphabet = (TaiThamAlphabet) obj;

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
