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
 * Класс букв белорусского алфавита.
 */
public class BelarusianAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
		'\u0410', '\u0430', '\u0411', '\u0431', '\u0412', '\u0432',
		'\u0413', '\u0433', '\u0414', '\u0434', '\u0415', '\u0435',
		'\u0401', '\u0451', '\u0416', '\u0436', '\u0417', '\u0437',
		'\u0406', '\u0456', '\u0419', '\u0439', '\u041A', '\u043A',
		'\u041B', '\u043B', '\u041C', '\u043C', '\u041D', '\u043D',
		'\u041E', '\u043E', '\u041F', '\u043F', '\u0420', '\u0440',
		'\u0421', '\u0441', '\u0422', '\u0442', '\u0423', '\u0443',
		'\u040E', '\u045E', '\u0424', '\u0444', '\u0425', '\u0445',
		'\u0426', '\u0446', '\u0427', '\u0447', '\u0428', '\u0448',
		'\u042B', '\u044B', '\u042C', '\u044C', '\u042D', '\u044D',
		'\u042E', '\u044E', '\u042F', '\u044F'
	);

	/**
	 * Конструктор для {@code BelarusianAlphabet}.
	 */
	public BelarusianAlphabet()
	{
		super(BelarusianAlphabet.LETTERS);
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

		final BelarusianAlphabet alphabet = (BelarusianAlphabet) obj;

		if (!Objects.equals(BelarusianAlphabet.LETTERS, alphabet.getLetters())) {
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
		return BelarusianAlphabet.LETTERS.hashCode();
	}

	/**
	 * Класс прописных букв белорусского алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0410', '\u0411', '\u0412', '\u0413', '\u0414', '\u0415',
			'\u0401', '\u0416', '\u0417', '\u0406', '\u0419', '\u041A',
			'\u041B', '\u041C', '\u041D', '\u041E', '\u041F', '\u0420',
			'\u0421', '\u0422', '\u0423', '\u040E', '\u0424', '\u0425',
			'\u0426', '\u0427', '\u0428', '\u042B', '\u042C', '\u042D',
			'\u042E', '\u042F'
		);

		/**
		 * Конструктор для {@code BelarusianAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(BelarusianAlphabet.UpperCase.LETTERS);
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

			final BelarusianAlphabet.UpperCase alphabet = (BelarusianAlphabet.UpperCase) obj;

			if (!Objects.equals(BelarusianAlphabet.UpperCase.LETTERS, alphabet.getLetters())) {
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
			return BelarusianAlphabet.LETTERS.hashCode();
		}
	}

	/**
	 * Класс строчных букв белорусского алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0430', '\u0431', '\u0432', '\u0433', '\u0434', '\u0435',
			'\u0451', '\u0436', '\u0437', '\u0456', '\u0439', '\u043A',
			'\u043B', '\u043C', '\u043D', '\u043E', '\u043F', '\u0440',
			'\u0441', '\u0442', '\u0443', '\u045E', '\u0444', '\u0445',
			'\u0446', '\u0447', '\u0448', '\u044B', '\u044C', '\u044D',
			'\u044E', '\u044F'
		);

		/**
		 * Конструктор для {@code BelarusianAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(BelarusianAlphabet.LowerCase.LETTERS);
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

			final BelarusianAlphabet.LowerCase alphabet = (BelarusianAlphabet.LowerCase) obj;

			if (!Objects.equals(BelarusianAlphabet.LowerCase.LETTERS, alphabet.getLetters())) {
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
			return BelarusianAlphabet.LETTERS.hashCode();
		}
	}
}
