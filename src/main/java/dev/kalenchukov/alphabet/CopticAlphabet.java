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
 * Класс букв коптского алфавита.
 */
public class CopticAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u2C80', '\u2C81', '\u2C82', '\u2C83', '\u2C84', '\u2C85', 
			'\u2C86', '\u2C87', '\u2C88', '\u2C89', '\u2C8A', '\u2C8B', 
			'\u2C8C', '\u2C8D', '\u2C8E', '\u2C8F', '\u2C90', '\u2C91', 
			'\u2C92', '\u2C93', '\u2C94', '\u2C95', '\u2C96', '\u2C97', 
			'\u2C98', '\u2C99', '\u2C9A', '\u2C9B', '\u2C9C', '\u2C9D', 
			'\u2C9E', '\u2C9F', '\u2CA0', '\u2CA1', '\u2CA2', '\u2CA3', 
			'\u2CA4', '\u2CA5', '\u2CA6', '\u2CA7', '\u2CA8', '\u2CA9', 
			'\u2CAA', '\u2CAB', '\u2CAC', '\u2CAD', '\u2CAE', '\u2CAF', 
			'\u2CB0', '\u2CB1', '\u2CB2', '\u2CB3', '\u2CB4', '\u2CB5', 
			'\u2CB6', '\u2CB7', '\u2CB8', '\u2CB9', '\u2CBA', '\u2CBB', 
			'\u2CBC', '\u2CBD', '\u2CBE', '\u2CBF', '\u2CC0', '\u2CC1', 
			'\u2CC2', '\u2CC3', '\u2CC4', '\u2CC5', '\u2CC6', '\u2CC7', 
			'\u2CC8', '\u2CC9', '\u2CCA', '\u2CCB', '\u2CCC', '\u2CCD', 
			'\u2CCE', '\u2CCF', '\u2CD0', '\u2CD1', '\u2CD2', '\u2CD3', 
			'\u2CD4', '\u2CD5', '\u2CD6', '\u2CD7', '\u2CD8', '\u2CD9', 
			'\u2CDA', '\u2CDB'
	);

	/**
	 * Конструктор для {@code CopticAlphabet}.
	 */
	public CopticAlphabet()
	{
		super(CopticAlphabet.LETTERS);
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

		final CopticAlphabet alphabet = (CopticAlphabet) obj;

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
	 * Класс прописных букв коптского алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u2C80', '\u2C82', '\u2C84', '\u2C86', '\u2C88', '\u2C8A', 
			'\u2C8C', '\u2C8E', '\u2C90', '\u2C92', '\u2C94', '\u2C96', 
			'\u2C98', '\u2C9A', '\u2C9C', '\u2C9E', '\u2CA0', '\u2CA2', 
			'\u2CA4', '\u2CA6', '\u2CA8', '\u2CAA', '\u2CAC', '\u2CAE', 
			'\u2CB0', '\u2CB2', '\u2CB4', '\u2CB6', '\u2CB8', '\u2CBA', 
			'\u2CBC', '\u2CBE', '\u2CC0', '\u2CC2', '\u2CC4', '\u2CC6', 
			'\u2CC8', '\u2CCA', '\u2CCC', '\u2CCE', '\u2CD0', '\u2CD2', 
			'\u2CD4', '\u2CD6', '\u2CD8', '\u2CDA'
		);

		/**
		 * Конструктор для {@code CopticAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(CopticAlphabet.UpperCase.LETTERS);
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

			final CopticAlphabet.UpperCase alphabet = (CopticAlphabet.UpperCase) obj;

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
	 * Класс строчных букв коптского алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u2C81', '\u2C83', '\u2C85', '\u2C87', '\u2C89', '\u2C8B', 
			'\u2C8D', '\u2C8F', '\u2C91', '\u2C93', '\u2C95', '\u2C97', 
			'\u2C99', '\u2C9B', '\u2C9D', '\u2C9F', '\u2CA1', '\u2CA3', 
			'\u2CA5', '\u2CA7', '\u2CA9', '\u2CAB', '\u2CAD', '\u2CAF', 
			'\u2CB1', '\u2CB3', '\u2CB5', '\u2CB7', '\u2CB9', '\u2CBB', 
			'\u2CBD', '\u2CBF', '\u2CC1', '\u2CC3', '\u2CC5', '\u2CC7', 
			'\u2CC9', '\u2CCB', '\u2CCD', '\u2CCF', '\u2CD1', '\u2CD3', 
			'\u2CD5', '\u2CD7', '\u2CD9', '\u2CDB'
		);

		/**
		 * Конструктор для {@code CopticAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(CopticAlphabet.LowerCase.LETTERS);
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

			final CopticAlphabet.LowerCase alphabet = (CopticAlphabet.LowerCase) obj;

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
