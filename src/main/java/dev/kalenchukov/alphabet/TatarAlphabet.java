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
 * Класс букв татарского алфавита.
 */
public class TatarAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0410', '\u0430', '\u04D8', '\u04D9', '\u0411', '\u0431', 
			'\u0412', '\u0432', '\u0413', '\u0433', '\u0414', '\u0434', 
			'\u0415', '\u0435', '\u0401', '\u0451', '\u0416', '\u0436', 
			'\u0496', '\u0497', '\u0417', '\u0437', '\u0418', '\u0438', 
			'\u0419', '\u0439', '\u041A', '\u043A', '\u041B', '\u043B', 
			'\u041C', '\u043C', '\u041D', '\u043D', '\u04A2', '\u04A3', 
			'\u041E', '\u043E', '\u04E8', '\u04E9', '\u041F', '\u043F', 
			'\u0420', '\u0440', '\u0421', '\u0441', '\u0422', '\u0442', 
			'\u0423', '\u0443', '\u04AE', '\u04AF', '\u0424', '\u0444', 
			'\u0425', '\u0445', '\u04BA', '\u04BB', '\u0426', '\u0446', 
			'\u0427', '\u0447', '\u0428', '\u0448', '\u0429', '\u0449', 
			'\u042A', '\u044A', '\u042B', '\u044B', '\u042C', '\u044C', 
			'\u042D', '\u044D', '\u042E', '\u044E', '\u042F', '\u044F'
	);

	/**
	 * Конструктор для {@code TatarAlphabet}.
	 */
	public TatarAlphabet()
	{
		super(TatarAlphabet.LETTERS);
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

		final TatarAlphabet alphabet = (TatarAlphabet) obj;

		if (!Objects.equals(TatarAlphabet.LETTERS, alphabet.get())) {
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
		return TatarAlphabet.LETTERS.hashCode();
	}

	/**
	 * Класс прописных букв татарского алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0410', '\u04D8', '\u0411', '\u0412', '\u0413', '\u0414', 
			'\u0415', '\u0401', '\u0416', '\u0496', '\u0417', '\u0418', 
			'\u0419', '\u041A', '\u041B', '\u041C', '\u041D', '\u04A2', 
			'\u041E', '\u04E8', '\u041F', '\u0420', '\u0421', '\u0422', 
			'\u0423', '\u04AE', '\u0424', '\u0425', '\u04BA', '\u0426', 
			'\u0427', '\u0428', '\u0429', '\u042A', '\u042B', '\u042C', 
			'\u042D', '\u042E', '\u042F'
		);

		/**
		 * Конструктор для {@code TatarAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(TatarAlphabet.UpperCase.LETTERS);
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

			final TatarAlphabet.UpperCase alphabet = (TatarAlphabet.UpperCase) obj;

			if (!Objects.equals(TatarAlphabet.UpperCase.LETTERS, alphabet.get())) {
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
			return TatarAlphabet.LETTERS.hashCode();
		}
	}

	/**
	 * Класс строчных букв татарского алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0430', '\u04D9', '\u0431', '\u0432', '\u0433', '\u0434', 
			'\u0435', '\u0451', '\u0436', '\u0497', '\u0437', '\u0438', 
			'\u0439', '\u043A', '\u043B', '\u043C', '\u043D', '\u04A3', 
			'\u043E', '\u04E9', '\u043F', '\u0440', '\u0441', '\u0442', 
			'\u0443', '\u04AF', '\u0444', '\u0445', '\u04BB', '\u0446', 
			'\u0447', '\u0448', '\u0449', '\u044A', '\u044B', '\u044C', 
			'\u044D', '\u044E', '\u044F'
		);

		/**
		 * Конструктор для {@code TatarAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(TatarAlphabet.LowerCase.LETTERS);
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

			final TatarAlphabet.LowerCase alphabet = (TatarAlphabet.LowerCase) obj;

			if (!Objects.equals(TatarAlphabet.LowerCase.LETTERS, alphabet.get())) {
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
			return TatarAlphabet.LETTERS.hashCode();
		}
	}
}
