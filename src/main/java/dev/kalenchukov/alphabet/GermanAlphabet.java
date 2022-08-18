/*
 * Copyright 2022 Алексей Каленчуков
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
 * Класс букв немецкого алфавита.
 */
public class GermanAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u0061', '\u0042', '\u0062', '\u0043', '\u0063', 
			'\u0044', '\u0064', '\u0045', '\u0065', '\u0046', '\u0066', 
			'\u0047', '\u0067', '\u0048', '\u0068', '\u0049', '\u0069', 
			'\u004A', '\u006A', '\u004B', '\u006B', '\u004C', '\u006C', 
			'\u004D', '\u006D', '\u004E', '\u006E', '\u004F', '\u006F', 
			'\u0050', '\u0070', '\u0051', '\u0071', '\u0052', '\u0072', 
			'\u0053', '\u0073', '\u0054', '\u0074', '\u0055', '\u0075', 
			'\u0056', '\u0076', '\u0057', '\u0077', '\u0058', '\u0078', 
			'\u0059', '\u0079', '\u005A', '\u007A', '\u00C4', '\u00E4', 
			'\u00D6', '\u00F6', '\u00DC', '\u00FC', '\u1E9E', '\u00DF'
	);

	/**
	 * Конструктор для {@code GermanAlphabet}.
	 */
	public GermanAlphabet()
	{
		super(GermanAlphabet.LETTERS);
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

		final GermanAlphabet alphabet = (GermanAlphabet) obj;

		if (!Objects.equals(GermanAlphabet.LETTERS, alphabet.get())) {
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
		return GermanAlphabet.LETTERS.hashCode();
	}

	/**
	 * Класс прописных букв немецкого алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046', 
			'\u0047', '\u0048', '\u0049', '\u004A', '\u004B', '\u004C', 
			'\u004D', '\u004E', '\u004F', '\u0050', '\u0051', '\u0052', 
			'\u0053', '\u0054', '\u0055', '\u0056', '\u0057', '\u0058', 
			'\u0059', '\u005A', '\u00C4', '\u00D6', '\u00DC', '\u1E9E'
		);

		/**
		 * Конструктор для {@code GermanAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(GermanAlphabet.UpperCase.LETTERS);
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

			final GermanAlphabet.UpperCase alphabet = (GermanAlphabet.UpperCase) obj;

			if (!Objects.equals(GermanAlphabet.UpperCase.LETTERS, alphabet.get())) {
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
			return GermanAlphabet.LETTERS.hashCode();
		}
	}

	/**
	 * Класс строчных букв немецкого алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066', 
			'\u0067', '\u0068', '\u0069', '\u006A', '\u006B', '\u006C', 
			'\u006D', '\u006E', '\u006F', '\u0070', '\u0071', '\u0072', 
			'\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', 
			'\u0079', '\u007A', '\u00E4', '\u00F6', '\u00FC', '\u00DF'
		);

		/**
		 * Конструктор для {@code GermanAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(GermanAlphabet.LowerCase.LETTERS);
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

			final GermanAlphabet.LowerCase alphabet = (GermanAlphabet.LowerCase) obj;

			if (!Objects.equals(GermanAlphabet.LowerCase.LETTERS, alphabet.get())) {
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
			return GermanAlphabet.LETTERS.hashCode();
		}
	}
}
