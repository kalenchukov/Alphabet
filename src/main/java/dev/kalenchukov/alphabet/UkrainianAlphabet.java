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
 * Класс букв украинского алфавита.
 */
public class UkrainianAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0410', '\u0430', '\u0411', '\u0431', '\u0412', '\u0432', 
			'\u0413', '\u0433', '\u0490', '\u0491', '\u0414', '\u0434', 
			'\u0415', '\u0435', '\u0404', '\u0454', '\u0416', '\u0436', 
			'\u0417', '\u0437', '\u0418', '\u0438', '\u0406', '\u0456', 
			'\u0407', '\u0457', '\u0419', '\u0439', '\u041A', '\u043A', 
			'\u041B', '\u043B', '\u041C', '\u043C', '\u041D', '\u043D', 
			'\u041E', '\u043E', '\u041F', '\u043F', '\u0420', '\u0440', 
			'\u0421', '\u0441', '\u0422', '\u0442', '\u0423', '\u0443', 
			'\u0424', '\u0444', '\u0425', '\u0445', '\u0426', '\u0446', 
			'\u0427', '\u0447', '\u0428', '\u0448', '\u0429', '\u0449', 
			'\u042C', '\u044C', '\u042E', '\u044E', '\u042F', '\u044F'
	);

	/**
	 * Конструктор для {@code UkrainianAlphabet}.
	 */
	public UkrainianAlphabet()
	{
		super(UkrainianAlphabet.LETTERS);
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

		final UkrainianAlphabet alphabet = (UkrainianAlphabet) obj;

		if (!Objects.equals(UkrainianAlphabet.LETTERS, alphabet.get())) {
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
		return UkrainianAlphabet.LETTERS.hashCode();
	}

	/**
	 * Класс прописных букв украинского алфавита.
	 */
	public static class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0410', '\u0411', '\u0412', '\u0413', '\u0490', '\u0414', 
			'\u0415', '\u0404', '\u0416', '\u0417', '\u0418', '\u0406', 
			'\u0407', '\u0419', '\u041A', '\u041B', '\u041C', '\u041D', 
			'\u041E', '\u041F', '\u0420', '\u0421', '\u0422', '\u0423', 
			'\u0424', '\u0425', '\u0426', '\u0427', '\u0428', '\u0429', 
			'\u042C', '\u042E', '\u042F'
		);

		/**
		 * Конструктор для {@code UkrainianAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(UkrainianAlphabet.UpperCase.LETTERS);
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

			final UkrainianAlphabet.UpperCase alphabet = (UkrainianAlphabet.UpperCase) obj;

			if (!Objects.equals(UkrainianAlphabet.UpperCase.LETTERS, alphabet.get())) {
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
			return UkrainianAlphabet.LETTERS.hashCode();
		}
	}

	/**
	 * Класс строчных букв украинского алфавита.
	 */
	public static class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0430', '\u0431', '\u0432', '\u0433', '\u0491', '\u0434', 
			'\u0435', '\u0454', '\u0436', '\u0437', '\u0438', '\u0456', 
			'\u0457', '\u0439', '\u043A', '\u043B', '\u043C', '\u043D', 
			'\u043E', '\u043F', '\u0440', '\u0441', '\u0442', '\u0443', 
			'\u0444', '\u0445', '\u0446', '\u0447', '\u0448', '\u0449', 
			'\u044C', '\u044E', '\u044F'
		);

		/**
		 * Конструктор для {@code UkrainianAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(UkrainianAlphabet.LowerCase.LETTERS);
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

			final UkrainianAlphabet.LowerCase alphabet = (UkrainianAlphabet.LowerCase) obj;

			if (!Objects.equals(UkrainianAlphabet.LowerCase.LETTERS, alphabet.get())) {
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
			return UkrainianAlphabet.LETTERS.hashCode();
		}
	}
}