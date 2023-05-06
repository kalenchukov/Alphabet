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
 * Класс букв бугийского алфавита.
 *
 * @author Aleksey Kalenchukov
 */
public final class BugineseAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	private static final List<@NotNull Character> LETTERS = List.of(
			'\u1A00', '\u1A01', '\u1A02', '\u1A03', '\u1A04', '\u1A05', 
			'\u1A06', '\u1A07', '\u1A08', '\u1A09', '\u1A0A', '\u1A0B', 
			'\u1A0C', '\u1A0D', '\u1A0E', '\u1A0F', '\u1A10', '\u1A11', 
			'\u1A12', '\u1A13', '\u1A14', '\u1A15', '\u1A16', '\u1A17', 
			'\u1A18', '\u1A19', '\u1A1A', '\u1A1B', '\u1A1E', '\u1A1F'
	);

	/**
	 * Конструктор для {@code BugineseAlphabet}.
	 */
	public BugineseAlphabet()
	{
		super(BugineseAlphabet.LETTERS);
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

		final BugineseAlphabet alphabet = (BugineseAlphabet) obj;

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
