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
 * Класс букв международного фонетического алфавита.
 */
public class InternationalPhoneticAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0070', '\u0062', '\u0074', '\u0064', '\u0288', '\u0256', 
			'\u0063', '\u025F', '\u006B', '\u0261', '\u0071', '\u0262', 
			'\u0294', '\u006D', '\u0271', '\u006E', '\u0273', '\u0272', 
			'\u014B', '\u0274', '\u0299', '\u0072', '\u0280', '\u2C71', 
			'\u027E', '\u027D', '\u0278', '\u03B2', '\u0066', '\u0076', 
			'\u03B8', '\u00F0', '\u0073', '\u007A', '\u0283', '\u0292', 
			'\u0282', '\u0290', '\u00E7', '\u029D', '\u0078', '\u0263', 
			'\u03C7', '\u0281', '\u0127', '\u0295', '\u0068', '\u0266', 
			'\u026C', '\u026E', '\u028B', '\u0279', '\u027B', '\u006A', 
			'\u0270', '\u006C', '\u026D', '\u028E', '\u029F', '\u0069', 
			'\u0079', '\u0268', '\u0289', '\u026F', '\u0075', '\u026A', 
			'\u028F', '\u028A', '\u0065', '\u00F8', '\u0258', '\u0275', 
			'\u0264', '\u006F', '\u0259', '\u025B', '\u0153', '\u025C', 
			'\u025E', '\u028C', '\u0254', '\u00E6', '\u0250', '\u0061', 
			'\u0276', '\u0251', '\u0252', '\u0298', '\u01C0', '\u01C3', 
			'\u01C2', '\u01C1', '\u0253', '\u0257', '\u0284', '\u0260', 
			'\u029B', '\u02BC', '\u028D', '\u0077', '\u0265', '\u029C', 
			'\u02A2', '\u02A1', '\u0255', '\u0291', '\u027A', '\u0267', 
			'\u02C8', '\u02CC', '\u02D0', '\u02D1', '\u0306', '\u007C', 
			'\u2016', '\u002E', '\u203F', '\u0361', '\u0325', '\u032C', 
			'\u02B0', '\u0339', '\u031C', '\u031F', '\u0320', '\u0308', 
			'\u033D', '\u0329', '\u032F', '\u02DE', '\u0324', '\u0330', 
			'\u033C', '\u02B7', '\u02B2', '\u02E0', '\u02E4', '\u0334', 
			'\u031D', '\u031E', '\u0318', '\u0319', '\u032A', '\u033A', 
			'\u033B', '\u0303', '\u207F', '\u02E1', '\u031A', '\u025A', 
			'\u025D', '\u026B', '\u026C', '\u0277', '\u027C', '\u027F', 
			'\u0285', '\u0286', '\u0287', '\u0293', '\u0296', '\u0297', 
			'\u029A', '\u029E', '\u02A0', '\u02A3', '\u02A4', '\u02A5', 
			'\u02A6', '\u02A7', '\u02A8', '\u02A9', '\u02AA', '\u02AB', 
			'\u02AC', '\u02AD', '\u02AE', '\u02AF'
	);

	/**
	 * Конструктор для {@code InternationalPhoneticAlphabet}.
	 */
	public InternationalPhoneticAlphabet()
	{
		super(InternationalPhoneticAlphabet.LETTERS);
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

		final InternationalPhoneticAlphabet alphabet = (InternationalPhoneticAlphabet) obj;

		if (!Objects.equals(InternationalPhoneticAlphabet.LETTERS, alphabet.get())) {
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
	 * Класс прописных букв международного фонетического алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0262', '\u0274', '\u0299', '\u0280', '\u0281', '\u029F', 
			'\u026A', '\u028F', '\u0276', '\u029B', '\u029C'
		);

		/**
		 * Конструктор для {@code InternationalPhoneticAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(InternationalPhoneticAlphabet.UpperCase.LETTERS);
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

			final InternationalPhoneticAlphabet.UpperCase alphabet = (InternationalPhoneticAlphabet.UpperCase) obj;

			if (!Objects.equals(InternationalPhoneticAlphabet.UpperCase.LETTERS, alphabet.get())) {
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
	 * Класс строчных букв международного фонетического алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0070', '\u0062', '\u0074', '\u0064', '\u0288', '\u0256', 
			'\u0063', '\u025F', '\u006B', '\u0261', '\u0071', '\u006D', 
			'\u0271', '\u006E', '\u0273', '\u0272', '\u014B', '\u0072', 
			'\u0280', '\u2C71', '\u027E', '\u027D', '\u0278', '\u03B2', 
			'\u0066', '\u0076', '\u03B8', '\u00F0', '\u0073', '\u007A', 
			'\u0283', '\u0292', '\u0282', '\u0290', '\u00E7', '\u029D', 
			'\u0078', '\u0263', '\u03C7', '\u0281', '\u0127', '\u0068', 
			'\u0266', '\u026C', '\u026E', '\u028B', '\u0279', '\u027B', 
			'\u006A', '\u0270', '\u006C', '\u026D', '\u028E', '\u0069', 
			'\u0079', '\u0268', '\u0289', '\u026F', '\u0075', '\u028A', 
			'\u0065', '\u00F8', '\u0258', '\u0275', '\u0264', '\u006F', 
			'\u0259', '\u025B', '\u0153', '\u025C', '\u025E', '\u028C', 
			'\u0254', '\u00E6', '\u0250', '\u0061', '\u0251', '\u0252', 
			'\u0253', '\u0257', '\u0284', '\u0260', '\u028D', '\u0077', 
			'\u0265', '\u0255', '\u0291', '\u027A', '\u0267', '\u02B0', 
			'\u0329', '\u033C', '\u02B7', '\u02B2', '\u02E0', '\u02E4', 
			'\u032A', '\u033A', '\u207F', '\u02E1', '\u025A', '\u025D', 
			'\u026B', '\u026C', '\u0277', '\u027C', '\u027F', '\u0285', 
			'\u0286', '\u0287', '\u0293', '\u029A', '\u029E', '\u02A0', 
			'\u02A3', '\u02A4', '\u02A5', '\u02A6', '\u02A7', '\u02A8', 
			'\u02A9', '\u02AA', '\u02AB', '\u02AE', '\u02AF'
		);

		/**
		 * Конструктор для {@code InternationalPhoneticAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(InternationalPhoneticAlphabet.LowerCase.LETTERS);
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

			final InternationalPhoneticAlphabet.LowerCase alphabet = (InternationalPhoneticAlphabet.LowerCase) obj;

			if (!Objects.equals(InternationalPhoneticAlphabet.LowerCase.LETTERS, alphabet.get())) {
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
