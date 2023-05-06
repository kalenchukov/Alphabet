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
 * Класс букв алфавита чероки.
 *
 * @author Aleksey Kalenchukov
 */
public final class CherokeeAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	private static final List<@NotNull Character> LETTERS = List.of(
			'\u13A0', '\u13A1', '\u13A2', '\u13A3', '\u13A4', '\u13A5', 
			'\u13A6', '\u13A7', '\u13A8', '\u13A9', '\u13AA', '\u13AB', 
			'\u13AC', '\u13AD', '\u13AE', '\u13AF', '\u13B0', '\u13B1', 
			'\u13B2', '\u13B3', '\u13B4', '\u13B5', '\u13B6', '\u13B7', 
			'\u13B8', '\u13B9', '\u13BA', '\u13BB', '\u13BC', '\u13BD', 
			'\u13BE', '\u13BF', '\u13C0', '\u13C1', '\u13C2', '\u13C3', 
			'\u13C4', '\u13C5', '\u13C6', '\u13C7', '\u13C8', '\u13C9', 
			'\u13CA', '\u13CB', '\u13CC', '\u13CD', '\u13CE', '\u13CF', 
			'\u13D0', '\u13D1', '\u13D2', '\u13D3', '\u13D4', '\u13D5', 
			'\u13D6', '\u13D7', '\u13D8', '\u13D9', '\u13DA', '\u13DB', 
			'\u13DC', '\u13DD', '\u13DE', '\u13DF', '\u13E0', '\u13E1', 
			'\u13E2', '\u13E3', '\u13E4', '\u13E5', '\u13E6', '\u13E7', 
			'\u13E8', '\u13E9', '\u13EA', '\u13EB', '\u13EC', '\u13ED', 
			'\u13EE', '\u13EF', '\u13F0', '\u13F1', '\u13F2', '\u13F3', 
			'\u13F4'
	);

	/**
	 * Конструктор для {@code CherokeeAlphabet}.
	 */
	public CherokeeAlphabet()
	{
		super(CherokeeAlphabet.LETTERS);
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

		final CherokeeAlphabet alphabet = (CherokeeAlphabet) obj;

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
