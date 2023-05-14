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
 * Класс букв кхмерского алфавита.
 *
 * @author Алексей Каленчуков
 */
public final class KhmerAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1780', '\u1781', '\u1782', '\u1783', '\u1784', '\u1785', 
			'\u1786', '\u1787', '\u1788', '\u1789', '\u178A', '\u178B', 
			'\u178C', '\u178D', '\u178E', '\u178F', '\u1790', '\u1791', 
			'\u1792', '\u1793', '\u1794', '\u1795', '\u1796', '\u1797', 
			'\u1798', '\u1799', '\u179A', '\u179B', '\u179C', '\u179F', 
			'\u17A0', '\u17A1', '\u17A2', '\u17A3', '\u17A4', '\u17A5', 
			'\u17A6', '\u17A7', '\u17A9', '\u17AA', '\u17AB', '\u17AC', 
			'\u17AD', '\u17AE', '\u17AF', '\u17B0', '\u17B1', '\u17B3', 
			'\u17B6', '\u17B7', '\u17B8', '\u17B9', '\u17BA', '\u17BB', 
			'\u17BC', '\u17BD', '\u17BE', '\u17BF', '\u17C0', '\u17C1', 
			'\u17C2', '\u17C3', '\u17C4', '\u17C5', '\u17C6', '\u17C7', 
			'\u17C8', '\u17C9', '\u17CA', '\u17CB', '\u17CC', '\u17CD', 
			'\u17CE', '\u17CF', '\u17D0', '\u17D1', '\u17D2', '\u17D3', 
			'\u17D4', '\u17D5', '\u17D6', '\u17D7', '\u17D8', '\u17D9', 
			'\u17DA', '\u17DB', '\u17DC', '\u17DD'
	);

	/**
	 * Конструктор для {@code KhmerAlphabet}.
	 */
	public KhmerAlphabet()
	{
		super(KhmerAlphabet.LETTERS);
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

		final KhmerAlphabet alphabet = (KhmerAlphabet) obj;

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
