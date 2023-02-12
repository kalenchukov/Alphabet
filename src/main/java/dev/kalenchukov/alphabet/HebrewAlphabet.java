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
 * Класс букв еврейского алфавита.
 */
public class HebrewAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u05D0', '\u05D1', '\u05D2', '\u05D3', '\u05D4', '\u05D5', 
			'\u05D6', '\u05D7', '\u05D8', '\u05D9', '\u05DB', '\u05DA', 
			'\u05DC', '\u05DE', '\u05DD', '\u05E0', '\u05DF', '\u05E1', 
			'\u05E2', '\u05E4', '\u05E3', '\u05E6', '\u05E5', '\u05E7', 
			'\u05E8', '\u05E9', '\u05EA'
	);

	/**
	 * Конструктор для {@code HebrewAlphabet}.
	 */
	public HebrewAlphabet()
	{
		super(HebrewAlphabet.LETTERS);
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

		final HebrewAlphabet alphabet = (HebrewAlphabet) obj;

		if (!Objects.equals(HebrewAlphabet.LETTERS, alphabet.get())) {
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
		return HebrewAlphabet.LETTERS.hashCode();
	}
}
