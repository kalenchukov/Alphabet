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
 * Класс букв арабского алфавита.
 */
public class ArabAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uFE8E', '\uFE8D', '\uFE90', '\uFE92', '\uFE91', '\uFE8F', 
			'\uFE96', '\uFE98', '\uFE97', '\uFE95', '\uFE9A', '\uFE9C', 
			'\uFE9B', '\uFE99', '\uFE9E', '\uFEA0', '\uFE9F', '\uFE9D', 
			'\uFEA2', '\uFEA4', '\uFEA3', '\uFEA1', '\uFEA6', '\uFEA8', 
			'\uFEA7', '\uFEA5', '\uFEAA', '\uFEA9', '\uFEAC', '\uFEAB', 
			'\uFEAE', '\uFEAD', '\uFEB0', '\uFEAF', '\uFEB2', '\uFEB4', 
			'\uFEB3', '\uFEB1', '\uFEB6', '\uFEB8', '\uFEB7', '\uFEB5', 
			'\uFEBA', '\uFEBC', '\uFEBB', '\uFEB9', '\uFEBE', '\uFEC0', 
			'\uFEBF', '\uFEBD', '\uFEC2', '\uFEC4', '\uFEC3', '\uFEC1', 
			'\uFEC6', '\uFEC8', '\uFEC7', '\uFEC5', '\uFECA', '\uFECC', 
			'\uFECB', '\uFEC9', '\uFECE', '\uFED0', '\uFECF', '\uFECD', 
			'\uFED2', '\uFED4', '\uFED3', '\uFED1', '\uFED6', '\uFED8', 
			'\uFED7', '\uFED5', '\uFEDA', '\uFEDC', '\uFEDB', '\uFED9', 
			'\uFEDE', '\uFEE0', '\uFEDF', '\uFEDD', '\uFEE2', '\uFEE4', 
			'\uFEE3', '\uFEE1', '\uFEE6', '\uFEE8', '\uFEE7', '\uFEE5', 
			'\uFEEA', '\uFEEC', '\uFEEB', '\uFEE9', '\uFEEE', '\uFEED', 
			'\uFEF2', '\uFEF4', '\uFEF3', '\uFEF1'
	);

	/**
	 * Конструктор для {@code ArabAlphabet}.
	 */
	public ArabAlphabet()
	{
		super(ArabAlphabet.LETTERS);
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

		final ArabAlphabet alphabet = (ArabAlphabet) obj;

		if (!Objects.equals(ArabAlphabet.LETTERS, alphabet.get())) {
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
		return ArabAlphabet.LETTERS.hashCode();
	}
}
