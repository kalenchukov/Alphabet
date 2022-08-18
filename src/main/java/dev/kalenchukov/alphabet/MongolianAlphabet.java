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
 * Класс букв монгольского алфавита.
 */
public class MongolianAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1820', '\u1821', '\u1822', '\u1823', '\u1824', '\u1825', 
			'\u1826', '\u1827', '\u1828', '\u1829', '\u182A', '\u182B', 
			'\u182C', '\u182D', '\u182E', '\u182F', '\u1830', '\u1831', 
			'\u1832', '\u1833', '\u1834', '\u1835', '\u1836', '\u1837', 
			'\u1838', '\u1839', '\u183A', '\u183B', '\u183C', '\u183D', 
			'\u183E', '\u183F', '\u1840', '\u1841', '\u1842'
	);

	/**
	 * Конструктор для {@code MongolianAlphabet}.
	 */
	public MongolianAlphabet()
	{
		super(MongolianAlphabet.LETTERS);
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

		final MongolianAlphabet alphabet = (MongolianAlphabet) obj;

		if (!Objects.equals(MongolianAlphabet.LETTERS, alphabet.get())) {
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
		return MongolianAlphabet.LETTERS.hashCode();
	}
}
