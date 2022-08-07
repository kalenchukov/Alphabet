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

public class GreekAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new GreekAlphabet.LowerCase();

	/**
	 * Проверяет буквы в алфавите.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'α', 'β', 'γ', 'δ', 'ε', 'ζ', 'η', 'θ', 'ι',
			'κ', 'λ', 'μ', 'ν', 'ξ', 'ο', 'π', 'ρ', 'σ',
			'ς', 'τ', 'υ', 'φ', 'χ', 'ψ', 'ω'
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
			'ω', 'ψ', 'χ', 'φ', 'υ', 'τ', 'ς', 'σ', 'ρ', 'π',
			'ο', 'ξ', 'ν', 'μ', 'λ', 'κ', 'ι', 'θ', 'η', 'ζ', 'ε', 'δ',
			'γ', 'β', 'α'
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
			'α', 'β', 'γ', 'δ', 'ε', 'ζ', 'η', 'θ', 'ι',
			'κ', 'λ', 'μ', 'ν', 'ξ', 'ο', 'π', 'ρ', 'σ',
			'ς', 'τ', 'υ', 'φ', 'χ', 'ψ', 'ω'
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
			'α', 'β', 'γ', 'δ', 'ε', 'ζ', 'η', 'θ', 'ι',
			'κ', 'λ', 'μ', 'ν', 'ξ', 'ο', 'π', 'ρ', 'σ',
			'ς', 'τ', 'υ', 'φ', 'χ', 'ψ', 'ω'
		);

		List<Character> letters2 = List.of(
			'α', 'β', 'γ'
		);

		List<Character> letters3 = List.of(
			'α'
		);

		assertArrayEquals(letters1.toArray(), ALPHABET.getLetters(1, 25).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.getLetters(1, 3).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.getLetters(1, 1).toArray());
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMin()
	{
		ALPHABET.getLetters(0, 25);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMax()
	{
		ALPHABET.getLetters(1, 26);
	}

	/**
	 * Проверяет получение среза букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeInversion()
	{
		ALPHABET.getLetters(23, 20);
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPosition()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('α')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('β')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('γ')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('δ')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('ε')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('ζ')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('η')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('θ')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('ι')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('κ')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('λ')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('μ')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('ν')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('ξ')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('ο')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('π')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('ρ')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('σ')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('ς')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('τ')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('υ')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('φ')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('χ')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('ψ')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('ω')));
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
		assertEquals(Optional.of('α'), Optional.ofNullable(ALPHABET.getLetter(1)));
		assertEquals(Optional.of('β'), Optional.ofNullable(ALPHABET.getLetter(2)));
		assertEquals(Optional.of('γ'), Optional.ofNullable(ALPHABET.getLetter(3)));
		assertEquals(Optional.of('δ'), Optional.ofNullable(ALPHABET.getLetter(4)));
		assertEquals(Optional.of('ε'), Optional.ofNullable(ALPHABET.getLetter(5)));
		assertEquals(Optional.of('ζ'), Optional.ofNullable(ALPHABET.getLetter(6)));
		assertEquals(Optional.of('η'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('θ'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('ι'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('κ'), Optional.ofNullable(ALPHABET.getLetter(10)));
		assertEquals(Optional.of('λ'), Optional.ofNullable(ALPHABET.getLetter(11)));
		assertEquals(Optional.of('μ'), Optional.ofNullable(ALPHABET.getLetter(12)));
		assertEquals(Optional.of('ν'), Optional.ofNullable(ALPHABET.getLetter(13)));
		assertEquals(Optional.of('ξ'), Optional.ofNullable(ALPHABET.getLetter(14)));
		assertEquals(Optional.of('ο'), Optional.ofNullable(ALPHABET.getLetter(15)));
		assertEquals(Optional.of('π'), Optional.ofNullable(ALPHABET.getLetter(16)));
		assertEquals(Optional.of('ρ'), Optional.ofNullable(ALPHABET.getLetter(17)));
		assertEquals(Optional.of('σ'), Optional.ofNullable(ALPHABET.getLetter(18)));
		assertEquals(Optional.of('ς'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('τ'), Optional.ofNullable(ALPHABET.getLetter(20)));
		assertEquals(Optional.of('υ'), Optional.ofNullable(ALPHABET.getLetter(21)));
		assertEquals(Optional.of('φ'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('χ'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('ψ'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('ω'), Optional.ofNullable(ALPHABET.getLetter(25)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('α'));
		assertTrue(ALPHABET.contains('β'));
		assertTrue(ALPHABET.contains('γ'));
		assertTrue(ALPHABET.contains('δ'));
		assertTrue(ALPHABET.contains('ε'));
		assertTrue(ALPHABET.contains('ζ'));
		assertTrue(ALPHABET.contains('η'));
		assertTrue(ALPHABET.contains('θ'));
		assertTrue(ALPHABET.contains('ι'));
		assertTrue(ALPHABET.contains('κ'));
		assertTrue(ALPHABET.contains('λ'));
		assertTrue(ALPHABET.contains('μ'));
		assertTrue(ALPHABET.contains('ν'));
		assertTrue(ALPHABET.contains('ξ'));
		assertTrue(ALPHABET.contains('ο'));
		assertTrue(ALPHABET.contains('π'));
		assertTrue(ALPHABET.contains('ρ'));
		assertTrue(ALPHABET.contains('σ'));
		assertTrue(ALPHABET.contains('ς'));
		assertTrue(ALPHABET.contains('τ'));
		assertTrue(ALPHABET.contains('υ'));
		assertTrue(ALPHABET.contains('φ'));
		assertTrue(ALPHABET.contains('χ'));
		assertTrue(ALPHABET.contains('ψ'));
		assertTrue(ALPHABET.contains('ω'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('Β'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		List<Character> letters = List.of(
			'α', 'β', 'γ', 'δ', 'ε', 'ζ', 'η', 'θ', 'ι',
			'κ', 'λ', 'μ', 'ν', 'ξ', 'ο', 'π', 'ρ', 'σ',
			'ς', 'τ', 'υ', 'φ', 'χ', 'ψ', 'ω'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "α,β,γ,δ,ε,ζ,η,θ,ι,κ,λ,μ,ν,ξ,ο,π,ρ,σ,ς,τ,υ,φ,χ,ψ,ω";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "αβγδεζηθικλμνξοπρσςτυφχψω";

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

		assertFalse(ALPHABET.equals(new BelarusianAlphabet.LowerCase()));

		assertTrue(ALPHABET.equals(new GreekAlphabet.LowerCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new GreekAlphabet.LowerCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new BelarusianAlphabet.LowerCase().hashCode());
	}
}