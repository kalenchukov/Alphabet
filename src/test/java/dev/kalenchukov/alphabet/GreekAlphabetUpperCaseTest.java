/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class GreekAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new GreekAlphabet.UpperCase();

	/**
	 * Проверяет буквы в алфавите.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'Α', 'Β', 'Γ', 'Δ', 'Ε', 'Ζ', 'Η', 'Θ', 'Ι',
			'Κ', 'Λ', 'Μ', 'Ν', 'Ξ', 'Ο', 'Π', 'Ρ', 'Σ',
			'Τ', 'Υ', 'Φ', 'Χ', 'Ψ', 'Ω'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.getLetters().toArray());
	}

	/**
	 * Проверяет буквы алфавита в обратном порядке.
	 */
	@Test
	public void testGetReverse()
	{
		List<Character> letters = List.of(
			'Ω', 'Ψ', 'Χ', 'Φ', 'Υ', 'Τ', 'Σ', 'Ρ', 'Π', 'Ο',
			'Ξ', 'Ν', 'Μ', 'Λ', 'Κ', 'Ι', 'Θ', 'Η', 'Ζ', 'Ε', 'Δ', 'Γ',
			'Β', 'Α'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.getReverse().toArray());

		assertEquals(Optional.of('Α'), Optional.ofNullable(letters.get(23)));
		assertEquals(Optional.of('Β'), Optional.ofNullable(letters.get(22)));
		assertEquals(Optional.of('Γ'), Optional.ofNullable(letters.get(21)));
		assertEquals(Optional.of('Δ'), Optional.ofNullable(letters.get(20)));
		assertEquals(Optional.of('Ε'), Optional.ofNullable(letters.get(19)));
		assertEquals(Optional.of('Ζ'), Optional.ofNullable(letters.get(18)));
		assertEquals(Optional.of('Η'), Optional.ofNullable(letters.get(17)));
		assertEquals(Optional.of('Θ'), Optional.ofNullable(letters.get(16)));
		assertEquals(Optional.of('Ι'), Optional.ofNullable(letters.get(15)));
		assertEquals(Optional.of('Κ'), Optional.ofNullable(letters.get(14)));
		assertEquals(Optional.of('Λ'), Optional.ofNullable(letters.get(13)));
		assertEquals(Optional.of('Μ'), Optional.ofNullable(letters.get(12)));
		assertEquals(Optional.of('Ν'), Optional.ofNullable(letters.get(11)));
		assertEquals(Optional.of('Ξ'), Optional.ofNullable(letters.get(10)));
		assertEquals(Optional.of('Ο'), Optional.ofNullable(letters.get(9)));
		assertEquals(Optional.of('Π'), Optional.ofNullable(letters.get(8)));
		assertEquals(Optional.of('Ρ'), Optional.ofNullable(letters.get(7)));
		assertEquals(Optional.of('Σ'), Optional.ofNullable(letters.get(6)));
		assertEquals(Optional.of('Τ'), Optional.ofNullable(letters.get(5)));
		assertEquals(Optional.of('Υ'), Optional.ofNullable(letters.get(4)));
		assertEquals(Optional.of('Φ'), Optional.ofNullable(letters.get(3)));
		assertEquals(Optional.of('Χ'), Optional.ofNullable(letters.get(2)));
		assertEquals(Optional.of('Ψ'), Optional.ofNullable(letters.get(1)));
		assertEquals(Optional.of('Ω'), Optional.ofNullable(letters.get(0)));
	}

	/**
	 * Проверяет получение букв алфавита в перемешанном порядке.
	 */
	@Test
	public void testGetShuffle()
	{
		List<Character> letters = List.of(
			'Α', 'Β', 'Γ', 'Δ', 'Ε', 'Ζ', 'Η', 'Θ', 'Ι',
			'Κ', 'Λ', 'Μ', 'Ν', 'Ξ', 'Ο', 'Π', 'Ρ', 'Σ',
			'Τ', 'Υ', 'Φ', 'Χ', 'Ψ', 'Ω'
		);

		assertFalse(Arrays.equals(letters.toArray(), ALPHABET.getShuffle().toArray()));
	}

	/**
	 * Проверяет получение среза букв алфавита.
	 */
	@Test
	public void testGetLettersRange()
	{
		List<Character> letters1 = List.of(
			'Α', 'Β', 'Γ', 'Δ', 'Ε', 'Ζ', 'Η', 'Θ', 'Ι',
			'Κ', 'Λ', 'Μ', 'Ν', 'Ξ', 'Ο', 'Π', 'Ρ', 'Σ',
			'Τ', 'Υ', 'Φ', 'Χ', 'Ψ', 'Ω'
		);

		List<Character> letters2 = List.of(
			'Α', 'Β', 'Γ'
		);

		List<Character> letters3 = List.of(
			'Α'
		);

		assertArrayEquals(letters1.toArray(), ALPHABET.getLetters(1, 24).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.getLetters(1, 3).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.getLetters(1, 1).toArray());
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMin()
	{
		ALPHABET.getLetters(0, 24);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMax()
	{
		ALPHABET.getLetters(1, 25);
	}

	/**
	 * Проверяет получение среза букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeInversion()
	{
		ALPHABET.getLetters(21, 14);
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPosition()
	{
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('Ψ')));
	}

	/**
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionNotLetter()
	{
		assertNull(ALPHABET.getPosition('W'));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('Ξ'), Optional.ofNullable(ALPHABET.getLetter(14)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('Σ'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('β'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'Α', 'Β', 'Γ', 'Δ', 'Ε', 'Ζ', 'Η', 'Θ', 'Ι',
			'Κ', 'Λ', 'Μ', 'Ν', 'Ξ', 'Ο', 'Π', 'Ρ', 'Σ',
			'Τ', 'Υ', 'Φ', 'Χ', 'Ψ', 'Ω'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "Α,Β,Γ,Δ,Ε,Ζ,Η,Θ,Ι,Κ,Λ,Μ,Ν,Ξ,Ο,Π,Ρ,Σ,Τ,Υ,Φ,Χ,Ψ,Ω";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩ";

		assertEquals(string, ALPHABET.toString());
	}

	/**
	 * Проверка сравнения объектов.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(ALPHABET.equals(null));

		assertTrue(ALPHABET.equals(ALPHABET));

		assertFalse(ALPHABET.equals(new BelarusianAlphabet.UpperCase()));

		assertTrue(ALPHABET.equals(new GreekAlphabet.UpperCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new GreekAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new BelarusianAlphabet.UpperCase().hashCode());
	}
}