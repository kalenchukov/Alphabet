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
 * Класс букв чамского алфавита.
 */
public class ChamAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uAA00', '\uAA01', '\uAA02', '\uAA03', '\uAA04', '\uAA05', 
			'\uAA06', '\uAA07', '\uAA08', '\uAA09', '\uAA0A', '\uAA0B', 
			'\uAA0C', '\uAA0D', '\uAA0E', '\uAA0F', '\uAA10', '\uAA11', 
			'\uAA12', '\uAA13', '\uAA14', '\uAA15', '\uAA16', '\uAA17', 
			'\uAA18', '\uAA19', '\uAA1A', '\uAA1B', '\uAA1C', '\uAA1D', 
			'\uAA1E', '\uAA1F', '\uAA20', '\uAA21', '\uAA22', '\uAA23', 
			'\uAA24', '\uAA25', '\uAA26', '\uAA27', '\uAA28', '\uAA29', 
			'\uAA2A', '\uAA2B', '\uAA2C', '\uAA2D', '\uAA2E', '\uAA2F', 
			'\uAA30', '\uAA31', '\uAA32', '\uAA33', '\uAA34', '\uAA35', 
			'\uAA36', '\uAA40', '\uAA41', '\uAA42', '\uAA43', '\uAA44', 
			'\uAA45', '\uAA46', '\uAA47', '\uAA48', '\uAA49', '\uAA4A', 
			'\uAA4B', '\uAA4C', '\uAA4D'
	);

	/**
	 * Конструктор для {@code ChamAlphabet}.
	 */
	public ChamAlphabet()
	{
		super(ChamAlphabet.LETTERS);
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

		final ChamAlphabet alphabet = (ChamAlphabet) obj;

		if (!Objects.equals(ChamAlphabet.LETTERS, alphabet.get())) {
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
