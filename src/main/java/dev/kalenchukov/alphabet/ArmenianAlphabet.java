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
 * Класс букв армянского алфавита.
 */
public class ArmenianAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0531', '\u0561', '\u0532', '\u0562', '\u0533', '\u0563', 
			'\u0534', '\u0564', '\u0535', '\u0565', '\u0536', '\u0566', 
			'\u0537', '\u0567', '\u0538', '\u0568', '\u0539', '\u0569', 
			'\u053A', '\u056A', '\u053B', '\u056B', '\u053C', '\u056C', 
			'\u053D', '\u056D', '\u053E', '\u056E', '\u053F', '\u056F', 
			'\u0540', '\u0570', '\u0541', '\u0571', '\u0542', '\u0572', 
			'\u0543', '\u0573', '\u0544', '\u0574', '\u0545', '\u0575', 
			'\u0546', '\u0576', '\u0547', '\u0577', '\u0548', '\u0578', 
			'\u0549', '\u0579', '\u054A', '\u057A', '\u054B', '\u057B', 
			'\u054C', '\u057C', '\u054D', '\u057D', '\u054E', '\u057E', 
			'\u054F', '\u057F', '\u0550', '\u0580', '\u0551', '\u0581', 
			'\u0552', '\u0582', '\u0553', '\u0583', '\u0554', '\u0584', 
			'\u0555', '\u0585', '\u0556', '\u0586'
	);

	/**
	 * Конструктор для {@code ArmenianAlphabet}.
	 */
	public ArmenianAlphabet()
	{
		super(ArmenianAlphabet.LETTERS);
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

		final ArmenianAlphabet alphabet = (ArmenianAlphabet) obj;

		if (!Objects.equals(ArmenianAlphabet.LETTERS, alphabet.get())) {
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
	 * Класс прописных букв армянского алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0531', '\u0532', '\u0533', '\u0534', '\u0535', '\u0536', 
			'\u0537', '\u0538', '\u0539', '\u053A', '\u053B', '\u053C', 
			'\u053D', '\u053E', '\u053F', '\u0540', '\u0541', '\u0542', 
			'\u0543', '\u0544', '\u0545', '\u0546', '\u0547', '\u0548', 
			'\u0549', '\u054A', '\u054B', '\u054C', '\u054D', '\u054E', 
			'\u054F', '\u0550', '\u0551', '\u0552', '\u0553', '\u0554', 
			'\u0555', '\u0556'
		);

		/**
		 * Конструктор для {@code ArmenianAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(ArmenianAlphabet.UpperCase.LETTERS);
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

			final ArmenianAlphabet.UpperCase alphabet = (ArmenianAlphabet.UpperCase) obj;

			if (!Objects.equals(ArmenianAlphabet.UpperCase.LETTERS, alphabet.get())) {
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
	 * Класс строчных букв армянского алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0561', '\u0562', '\u0563', '\u0564', '\u0565', '\u0566', 
			'\u0567', '\u0568', '\u0569', '\u056A', '\u056B', '\u056C', 
			'\u056D', '\u056E', '\u056F', '\u0570', '\u0571', '\u0572', 
			'\u0573', '\u0574', '\u0575', '\u0576', '\u0577', '\u0578', 
			'\u0579', '\u057A', '\u057B', '\u057C', '\u057D', '\u057E', 
			'\u057F', '\u0580', '\u0581', '\u0582', '\u0583', '\u0584', 
			'\u0585', '\u0586'
		);

		/**
		 * Конструктор для {@code ArmenianAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(ArmenianAlphabet.LowerCase.LETTERS);
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

			final ArmenianAlphabet.LowerCase alphabet = (ArmenianAlphabet.LowerCase) obj;

			if (!Objects.equals(ArmenianAlphabet.LowerCase.LETTERS, alphabet.get())) {
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
