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

public class GreekAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new GreekAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'Α', 'α', 'Β', 'β', 'Γ', 'γ', 'Δ', 'δ', 'Ε', 'ε',
			'Ζ', 'ζ', 'Η', 'η', 'Θ', 'θ', 'Ι', 'ι', 'Κ', 'κ',
			'Λ', 'λ', 'Μ', 'μ', 'Ν', 'ν', 'Ξ', 'ξ', 'Ο', 'ο',
			'Π', 'π', 'Ρ', 'ρ', 'Σ', 'σ', 'ς', 'Τ', 'τ', 'Υ',
			'υ', 'Φ', 'φ', 'Χ', 'χ', 'Ψ', 'ψ', 'Ω', 'ω'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.getLetters().toArray());
	}

	/**
	 * Проверяет буквы алфавита в обратном порядке.
	 */
	@Test
	public void testGetLettersReverse()
	{
		List<Character> letters = List.of(
			'ω', 'Ω', 'ψ', 'Ψ', 'χ', 'Χ', 'φ', 'Φ', 'υ', 'Υ',
			'τ', 'Τ', 'ς', 'σ', 'Σ', 'ρ', 'Ρ', 'π', 'Π', 'ο', 'Ο', 'ξ',
			'Ξ', 'ν', 'Ν', 'μ', 'Μ', 'λ', 'Λ', 'κ', 'Κ', 'ι', 'Ι', 'θ',
			'Θ', 'η', 'Η', 'ζ', 'Ζ', 'ε', 'Ε', 'δ', 'Δ', 'γ', 'Γ', 'β',
			'Β', 'α', 'Α'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.getLettersReverse().toArray());
	}

	/**
	 * Проверяет получение букв алфавита в перемешанном порядке.
	 */
	@Test
	public void testGetLettersShuffle()
	{
		List<Character> letters = List.of(
			'Α', 'α', 'Β', 'β', 'Γ', 'γ', 'Δ', 'δ', 'Ε', 'ε',
			'Ζ', 'ζ', 'Η', 'η', 'Θ', 'θ', 'Ι', 'ι', 'Κ', 'κ',
			'Λ', 'λ', 'Μ', 'μ', 'Ν', 'ν', 'Ξ', 'ξ', 'Ο', 'ο',
			'Π', 'π', 'Ρ', 'ρ', 'Σ', 'σ', 'ς', 'Τ', 'τ', 'Υ',
			'υ', 'Φ', 'φ', 'Χ', 'χ', 'Ψ', 'ψ', 'Ω', 'ω'
		);

		assertFalse(Arrays.equals(letters.toArray(), ALPHABET.getLettersShuffle().toArray()));
	}

	/**
	 * Проверяет получение среза букв алфавита.
	 */
	@Test
	public void testGetLettersRange()
	{
		List<Character> letters1 = List.of(
			'Α', 'α', 'Β', 'β', 'Γ', 'γ', 'Δ', 'δ', 'Ε', 'ε',
			'Ζ', 'ζ', 'Η', 'η', 'Θ', 'θ', 'Ι', 'ι', 'Κ', 'κ',
			'Λ', 'λ', 'Μ', 'μ', 'Ν', 'ν', 'Ξ', 'ξ', 'Ο', 'ο',
			'Π', 'π', 'Ρ', 'ρ', 'Σ', 'σ', 'ς', 'Τ', 'τ', 'Υ',
			'υ', 'Φ', 'φ', 'Χ', 'χ', 'Ψ', 'ψ', 'Ω', 'ω'
		);

		List<Character> letters2 = List.of(
			'Α', 'α', 'Β', 'β', 'Γ', 'γ', 'Δ', 'δ', 'Ε', 'ε',
			'Ζ', 'ζ', 'Η', 'η', 'Θ', 'θ', 'Ι', 'ι', 'Κ', 'κ',
			'Λ', 'λ', 'Μ', 'μ', 'Ν', 'ν', 'Ξ', 'ξ', 'Ο', 'ο',
			'Π', 'π', 'Ρ'
		);

		List<Character> letters3 = List.of(
			'Α', 'α', 'Β'
		);

		List<Character> letters4 = List.of(
			'Α'
		);

		assertArrayEquals(letters1.toArray(), ALPHABET.getLetters(1, 49).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.getLetters(1, 33).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.getLetters(1, 3).toArray());
		assertArrayEquals(letters4.toArray(), ALPHABET.getLetters(1, 1).toArray());
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMin()
	{
		ALPHABET.getLetters(0, 49);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMax()
	{
		ALPHABET.getLetters(1, 50);
	}

	/**
	 * Проверяет получение среза букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeInversion()
	{
		ALPHABET.getLetters(33, 20);
	}

	/**
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionNotLetter()
	{
		assertNull(ALPHABET.getPosition('й'));
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPosition()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('Α')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('α')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('Β')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('β')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('Γ')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('γ')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('Δ')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('δ')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('Ε')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('ε')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('Ζ')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('ζ')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('Η')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('η')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('Θ')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('θ')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('Ι')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('ι')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('Κ')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('κ')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('Λ')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('λ')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('Μ')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('μ')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('Ν')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('ν')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPosition('Ξ')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPosition('ξ')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPosition('Ο')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('ο')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPosition('Π')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPosition('π')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET.getPosition('Ρ')));
		assertEquals(Optional.of(34), Optional.ofNullable(ALPHABET.getPosition('ρ')));
		assertEquals(Optional.of(35), Optional.ofNullable(ALPHABET.getPosition('Σ')));
		assertEquals(Optional.of(36), Optional.ofNullable(ALPHABET.getPosition('σ')));
		assertEquals(Optional.of(37), Optional.ofNullable(ALPHABET.getPosition('ς')));
		assertEquals(Optional.of(38), Optional.ofNullable(ALPHABET.getPosition('Τ')));
		assertEquals(Optional.of(39), Optional.ofNullable(ALPHABET.getPosition('τ')));
		assertEquals(Optional.of(40), Optional.ofNullable(ALPHABET.getPosition('Υ')));
		assertEquals(Optional.of(41), Optional.ofNullable(ALPHABET.getPosition('υ')));
		assertEquals(Optional.of(42), Optional.ofNullable(ALPHABET.getPosition('Φ')));
		assertEquals(Optional.of(43), Optional.ofNullable(ALPHABET.getPosition('φ')));
		assertEquals(Optional.of(44), Optional.ofNullable(ALPHABET.getPosition('Χ')));
		assertEquals(Optional.of(45), Optional.ofNullable(ALPHABET.getPosition('χ')));
		assertEquals(Optional.of(46), Optional.ofNullable(ALPHABET.getPosition('Ψ')));
		assertEquals(Optional.of(47), Optional.ofNullable(ALPHABET.getPosition('ψ')));
		assertEquals(Optional.of(48), Optional.ofNullable(ALPHABET.getPosition('Ω')));
		assertEquals(Optional.of(49), Optional.ofNullable(ALPHABET.getPosition('ω')));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('θ'), Optional.ofNullable(ALPHABET.getLetter(16)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('Ξ'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('ы'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'Α', 'α', 'Β', 'β', 'Γ', 'γ', 'Δ', 'δ', 'Ε', 'ε',
			'Ζ', 'ζ', 'Η', 'η', 'Θ', 'θ', 'Ι', 'ι', 'Κ', 'κ',
			'Λ', 'λ', 'Μ', 'μ', 'Ν', 'ν', 'Ξ', 'ξ', 'Ο', 'ο',
			'Π', 'π', 'Ρ', 'ρ', 'Σ', 'σ', 'ς', 'Τ', 'τ', 'Υ',
			'υ', 'Φ', 'φ', 'Χ', 'χ', 'Ψ', 'ψ', 'Ω', 'ω'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "Α,α,Β,β,Γ,γ,Δ,δ,Ε,ε,Ζ,ζ,Η,η,Θ,θ,Ι,ι,Κ,κ,Λ,λ,Μ,μ,Ν,ν,Ξ,ξ,Ο,ο,Π,π,Ρ,ρ,Σ,σ,ς,Τ,τ,Υ,υ,Φ,φ,Χ,χ,Ψ,ψ,Ω,ω";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "ΑαΒβΓγΔδΕεΖζΗηΘθΙιΚκΛλΜμΝνΞξΟοΠπΡρΣσςΤτΥυΦφΧχΨψΩω";

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

		assertFalse(ALPHABET.equals(new BelarusianAlphabet()));

		assertTrue(ALPHABET.equals(new GreekAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new GreekAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new BelarusianAlphabet().hashCode());
	}
}