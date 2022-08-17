/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Objects;

/**
 * Класс букв итальянского алфавита.
 */
public class ItalianAlphabet extends AbstractAlphabet implements AlphabeticalCase
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
			'\u004C', '\u006C', '\u004D', '\u006D', '\u004E', '\u006E', 
			'\u004F', '\u006F', '\u0050', '\u0070', '\u0051', '\u0071', 
			'\u0052', '\u0072', '\u0053', '\u0073', '\u0054', '\u0074', 
			'\u0055', '\u0075', '\u0056', '\u0076'
	);

	/**
	 * Конструктор для {@code ItalianAlphabet}.
	 */
	public ItalianAlphabet()
	{
		super(ItalianAlphabet.LETTERS);
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

		final ItalianAlphabet alphabet = (ItalianAlphabet) obj;

		if (!Objects.equals(ItalianAlphabet.LETTERS, alphabet.get())) {
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
		return ItalianAlphabet.LETTERS.hashCode();
	}

	/**
	 * Класс прописных букв итальянского алфавита.
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
			'\u0047', '\u0048', '\u0049', '\u004C', '\u004D', '\u004E', 
			'\u004F', '\u0050', '\u0051', '\u0052', '\u0053', '\u0054', 
			'\u0055', '\u0056'
		);

		/**
		 * Конструктор для {@code ItalianAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(ItalianAlphabet.UpperCase.LETTERS);
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

			final ItalianAlphabet.UpperCase alphabet = (ItalianAlphabet.UpperCase) obj;

			if (!Objects.equals(ItalianAlphabet.UpperCase.LETTERS, alphabet.get())) {
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
			return ItalianAlphabet.LETTERS.hashCode();
		}
	}

	/**
	 * Класс строчных букв итальянского алфавита.
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
			'\u0067', '\u0068', '\u0069', '\u006C', '\u006D', '\u006E', 
			'\u006F', '\u0070', '\u0071', '\u0072', '\u0073', '\u0074', 
			'\u0075', '\u0076'
		);

		/**
		 * Конструктор для {@code ItalianAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(ItalianAlphabet.LowerCase.LETTERS);
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

			final ItalianAlphabet.LowerCase alphabet = (ItalianAlphabet.LowerCase) obj;

			if (!Objects.equals(ItalianAlphabet.LowerCase.LETTERS, alphabet.get())) {
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
			return ItalianAlphabet.LETTERS.hashCode();
		}
	}
}
