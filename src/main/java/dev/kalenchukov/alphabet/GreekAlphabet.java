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
 * Класс букв греческого алфавита.
 */
public class GreekAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
		'\u0391', '\u03B1', '\u0392', '\u03B2', '\u0393', '\u03B3',
		'\u0394', '\u03B4', '\u0395', '\u03B5', '\u0396', '\u03B6',
		'\u0397', '\u03B7', '\u0398', '\u03B8', '\u0399', '\u03B9',
		'\u039A', '\u03BA', '\u039B', '\u03BB', '\u039C', '\u03BC',
		'\u039D', '\u03BD', '\u039E', '\u03BE', '\u039F', '\u03BF',
		'\u03A0', '\u03C0', '\u03A1', '\u03C1', '\u03A3', '\u03C3',
		'\u03C2', '\u03A4', '\u03C4', '\u03A5', '\u03C5', '\u03A6',
		'\u03C6', '\u03A7', '\u03C7', '\u03A8', '\u03C8', '\u03A9',
		'\u03C9'
	);

	/**
	 * Конструктор для {@code GreekAlphabet}.
	 */
	public GreekAlphabet()
	{
		super(GreekAlphabet.LETTERS);
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

		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}

		final GreekAlphabet alphabet = (GreekAlphabet) obj;

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
	 * Класс прописных букв греческого алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0391', '\u0392', '\u0393', '\u0394', '\u0395', '\u0396',
			'\u0397', '\u0398', '\u0399', '\u039A', '\u039B', '\u039C',
			'\u039D', '\u039E', '\u039F', '\u03A0', '\u03A1', '\u03A3',
			'\u03A4', '\u03A5', '\u03A6', '\u03A7', '\u03A8', '\u03A9'
		);

		/**
		 * Конструктор для {@code GreekAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(GreekAlphabet.UpperCase.LETTERS);
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

			if (!this.getClass().equals(obj.getClass())) {
				return false;
			}

			final GreekAlphabet.UpperCase alphabet = (GreekAlphabet.UpperCase) obj;

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
	 * Класс строчных букв греческого алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u03B1', '\u03B2', '\u03B3', '\u03B4', '\u03B5', '\u03B6',
			'\u03B7', '\u03B8', '\u03B9', '\u03BA', '\u03BB', '\u03BC',
			'\u03BD', '\u03BE', '\u03BF', '\u03C0', '\u03C1', '\u03C3',
			'\u03C2', '\u03C4', '\u03C5', '\u03C6', '\u03C7', '\u03C8',
			'\u03C9'
		);

		/**
		 * Конструктор для {@code GreekAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(GreekAlphabet.LowerCase.LETTERS);
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

			if (!this.getClass().equals(obj.getClass())) {
				return false;
			}

			final GreekAlphabet.LowerCase alphabet = (GreekAlphabet.LowerCase) obj;

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
