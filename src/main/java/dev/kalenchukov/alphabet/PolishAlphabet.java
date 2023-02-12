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
 * Класс букв польского алфавита.
 */
public class PolishAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u0061', '\u0104', '\u0105', '\u0042', '\u0062', 
			'\u0043', '\u0063', '\u0106', '\u0107', '\u0044', '\u0064', 
			'\u0045', '\u0065', '\u0118', '\u0119', '\u0046', '\u0066', 
			'\u0047', '\u0067', '\u0048', '\u0068', '\u0049', '\u0069', 
			'\u004A', '\u006A', '\u004B', '\u006B', '\u004C', '\u006C', 
			'\u0141', '\u0142', '\u004D', '\u006D', '\u004E', '\u006E', 
			'\u0143', '\u0144', '\u004F', '\u006F', '\u00D3', '\u00F3', 
			'\u0050', '\u0070', '\u0052', '\u0072', '\u0053', '\u0073', 
			'\u015A', '\u015B', '\u0054', '\u0074', '\u0055', '\u0075', 
			'\u0057', '\u0077', '\u0059', '\u0079', '\u005A', '\u007A', 
			'\u0179', '\u017A', '\u017B', '\u017C'
	);

	/**
	 * Конструктор для {@code PolishAlphabet}.
	 */
	public PolishAlphabet()
	{
		super(PolishAlphabet.LETTERS);
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

		final PolishAlphabet alphabet = (PolishAlphabet) obj;

		if (!Objects.equals(this.get(), alphabet.get())) {
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

	/**
	 * Класс прописных букв польского алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u0104', '\u0042', '\u0043', '\u0106', '\u0044', 
			'\u0045', '\u0118', '\u0046', '\u0047', '\u0048', '\u0049', 
			'\u004A', '\u004B', '\u004C', '\u0141', '\u004D', '\u004E', 
			'\u0143', '\u004F', '\u00D3', '\u0050', '\u0052', '\u0053', 
			'\u015A', '\u0054', '\u0055', '\u0057', '\u0059', '\u005A', 
			'\u0179', '\u017B'
		);

		/**
		 * Конструктор для {@code PolishAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(PolishAlphabet.UpperCase.LETTERS);
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

			final PolishAlphabet.UpperCase alphabet = (PolishAlphabet.UpperCase) obj;

			if (!Objects.equals(this.get(), alphabet.get())) {
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

	/**
	 * Класс строчных букв польского алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0061', '\u0105', '\u0062', '\u0063', '\u0107', '\u0064', 
			'\u0065', '\u0119', '\u0066', '\u0067', '\u0068', '\u0069', 
			'\u006A', '\u006B', '\u006C', '\u0142', '\u006D', '\u006E', 
			'\u0144', '\u006F', '\u00F3', '\u0070', '\u0072', '\u0073', 
			'\u015B', '\u0074', '\u0075', '\u0077', '\u0079', '\u007A', 
			'\u017A', '\u017C'
		);

		/**
		 * Конструктор для {@code PolishAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(PolishAlphabet.LowerCase.LETTERS);
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

			final PolishAlphabet.LowerCase alphabet = (PolishAlphabet.LowerCase) obj;

			if (!Objects.equals(this.get(), alphabet.get())) {
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
}
