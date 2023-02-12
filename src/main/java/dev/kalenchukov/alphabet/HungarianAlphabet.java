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
 * Класс букв венгерского алфавита.
 */
public class HungarianAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u00C1', '\u0042', '\u0043', '\u0044', '\u0045',
			'\u00C9', '\u0046', '\u0047', '\u0048', '\u0049', '\u00CD',
			'\u004A', '\u004B', '\u004C', '\u004D', '\u004E', '\u004F',
			'\u00D3', '\u00D6', '\u0150', '\u0050', '\u0051', '\u0052',
			'\u0053', '\u0054', '\u0055', '\u00DA', '\u00DC', '\u0170',
			'\u0056', '\u0057', '\u0058', '\u0059', '\u005A'
	);

	/**
	 * Конструктор для {@code HungarianAlphabet}.
	 */
	public HungarianAlphabet()
	{
		super(HungarianAlphabet.LETTERS);
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

		final HungarianAlphabet alphabet = (HungarianAlphabet) obj;

		if (!Objects.equals(HungarianAlphabet.LETTERS, alphabet.get())) {
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
