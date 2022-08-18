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
 * Класс букв грузинского алфавита.
 */
public class GeorgianAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u10D0', '\u10D1', '\u10D2', '\u10D3', '\u10D4', '\u10D5', 
			'\u10D6', '\u10D7', '\u10D8', '\u10D9', '\u10DA', '\u10DB', 
			'\u10DC', '\u10DD', '\u10DE', '\u10DF', '\u10E0', '\u10E1', 
			'\u10E2', '\u10E3', '\u10E4', '\u10E5', '\u10E6', '\u10E7', 
			'\u10E8', '\u10E9', '\u10EA', '\u10EB', '\u10EC', '\u10ED', 
			'\u10EE', '\u10EF', '\u10F0'
	);

	/**
	 * Конструктор для {@code GeorgianAlphabet}.
	 */
	public GeorgianAlphabet()
	{
		super(GeorgianAlphabet.LETTERS);
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

		final GeorgianAlphabet alphabet = (GeorgianAlphabet) obj;

		if (!Objects.equals(GeorgianAlphabet.LETTERS, alphabet.get())) {
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
		return GeorgianAlphabet.LETTERS.hashCode();
	}
}
