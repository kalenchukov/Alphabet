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
 * Класс букв турецкого алфавита.
 */
public class TurkishAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u0061', '\u0042', '\u0062', '\u0043', '\u0063', 
			'\u00C7', '\u00E7', '\u0044', '\u0064', '\u0045', '\u0065', 
			'\u0046', '\u0066', '\u0047', '\u0067', '\u011E', '\u011F', 
			'\u0048', '\u0068', '\u0049', '\u0131', '\u0130', '\u0069', 
			'\u004A', '\u006A', '\u004B', '\u006B', '\u004C', '\u006C', 
			'\u004D', '\u006D', '\u004E', '\u006E', '\u004F', '\u006F', 
			'\u00D6', '\u00F6', '\u0050', '\u0070', '\u0052', '\u0072', 
			'\u0053', '\u0073', '\u015E', '\u015F', '\u0054', '\u0074', 
			'\u0055', '\u0075', '\u00DC', '\u00FC', '\u0056', '\u0076', 
			'\u0059', '\u0079', '\u005A', '\u007A'
	);

	/**
	 * Конструктор для {@code TurkishAlphabet}.
	 */
	public TurkishAlphabet()
	{
		super(TurkishAlphabet.LETTERS);
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

		final TurkishAlphabet alphabet = (TurkishAlphabet) obj;

		if (!Objects.equals(TurkishAlphabet.LETTERS, alphabet.get())) {
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
		return TurkishAlphabet.LETTERS.hashCode();
	}

	/**
	 * Класс прописных букв турецкого алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0041', '\u0042', '\u0043', '\u00C7', '\u0044', '\u0045', 
			'\u0046', '\u0047', '\u011E', '\u0048', '\u0049', '\u0130', 
			'\u004A', '\u004B', '\u004C', '\u004D', '\u004E', '\u004F', 
			'\u00D6', '\u0050', '\u0052', '\u0053', '\u015E', '\u0054', 
			'\u0055', '\u00DC', '\u0056', '\u0059', '\u005A'
		);

		/**
		 * Конструктор для {@code TurkishAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(TurkishAlphabet.UpperCase.LETTERS);
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

			final TurkishAlphabet.UpperCase alphabet = (TurkishAlphabet.UpperCase) obj;

			if (!Objects.equals(TurkishAlphabet.UpperCase.LETTERS, alphabet.get())) {
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
			return TurkishAlphabet.LETTERS.hashCode();
		}
	}

	/**
	 * Класс строчных букв турецкого алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0061', '\u0062', '\u0063', '\u00E7', '\u0064', '\u0065', 
			'\u0066', '\u0067', '\u011F', '\u0068', '\u0131', '\u0069', 
			'\u006A', '\u006B', '\u006C', '\u006D', '\u006E', '\u006F', 
			'\u00F6', '\u0070', '\u0072', '\u0073', '\u015F', '\u0074', 
			'\u0075', '\u00FC', '\u0076', '\u0079', '\u007A'
		);

		/**
		 * Конструктор для {@code TurkishAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(TurkishAlphabet.LowerCase.LETTERS);
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

			final TurkishAlphabet.LowerCase alphabet = (TurkishAlphabet.LowerCase) obj;

			if (!Objects.equals(TurkishAlphabet.LowerCase.LETTERS, alphabet.get())) {
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
			return TurkishAlphabet.LETTERS.hashCode();
		}
	}
}
