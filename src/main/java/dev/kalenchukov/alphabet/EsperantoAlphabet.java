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
 * Класс букв алфавита эсперанто.
 *
 * @author Aleksey Kalenchukov
 */
public final class EsperantoAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	private static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u0042', '\u0043', '\u0108', '\u0044', '\u0045', 
			'\u0046', '\u0047', '\u011C', '\u0048', '\u0124', '\u0049', 
			'\u004A', '\u0134', '\u004B', '\u004C', '\u004D', '\u004E', 
			'\u004F', '\u0050', '\u0052', '\u0053', '\u015C', '\u0054', 
			'\u0055', '\u016C', '\u0056', '\u005A', '\u0061', '\u0062', 
			'\u0063', '\u0109', '\u0064', '\u0065', '\u0066', '\u0067', 
			'\u011D', '\u0068', '\u0125', '\u0069', '\u006A', '\u0135', 
			'\u006B', '\u006C', '\u006D', '\u006E', '\u006F', '\u0070', 
			'\u0072', '\u0073', '\u015D', '\u0074', '\u0075', '\u016D', 
			'\u0076', '\u007A'
	);

	/**
	 * Конструктор для {@code EsperantoAlphabet}.
	 */
	public EsperantoAlphabet()
	{
		super(EsperantoAlphabet.LETTERS);
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

		final EsperantoAlphabet alphabet = (EsperantoAlphabet) obj;

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

	/**
	 * Класс прописных букв алфавита эсперанто.
	 *
	 * @author Aleksey Kalenchukov
	 */
	public static final class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		private static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u0042', '\u0043', '\u0108', '\u0044', '\u0045', 
			'\u0046', '\u0047', '\u011C', '\u0048', '\u0124', '\u0049', 
			'\u004A', '\u0134', '\u004B', '\u004C', '\u004D', '\u004E', 
			'\u004F', '\u0050', '\u0052', '\u0053', '\u015C', '\u0054', 
			'\u0055', '\u016C', '\u0056', '\u005A'
		);

		/**
		 * Конструктор для {@code EsperantoAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(EsperantoAlphabet.UpperCase.LETTERS);
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

			final EsperantoAlphabet.UpperCase alphabet = (EsperantoAlphabet.UpperCase) obj;

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

	/**
	 * Класс строчных букв алфавита эсперанто.
	 *
	 * @author Aleksey Kalenchukov
	 */
	public static final class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		private static final List<@NotNull Character> LETTERS = List.of(
			'\u0061', '\u0062', '\u0063', '\u0109', '\u0064', '\u0065', 
			'\u0066', '\u0067', '\u011D', '\u0068', '\u0125', '\u0069', 
			'\u006A', '\u0135', '\u006B', '\u006C', '\u006D', '\u006E', 
			'\u006F', '\u0070', '\u0072', '\u0073', '\u015D', '\u0074', 
			'\u0075', '\u016D', '\u0076', '\u007A'
		);

		/**
		 * Конструктор для {@code EsperantoAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(EsperantoAlphabet.LowerCase.LETTERS);
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

			final EsperantoAlphabet.LowerCase alphabet = (EsperantoAlphabet.LowerCase) obj;

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
}
