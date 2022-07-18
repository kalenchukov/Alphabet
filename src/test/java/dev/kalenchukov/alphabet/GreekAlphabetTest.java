/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class GreekAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new GreekAlphabet();

	@NotNull
	public static final AlphabeticalCase ALPHABET_CASE = new GreekAlphabet();

	/**
	 * Проверяет количество букв в алфавите.
	 */
	@Test
	public void testGetLettersCount()
	{
		assertEquals(49, ALPHABET.getLetters().size());
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersUpperCaseCount()
	{
		assertEquals(24, ALPHABET_CASE.getLettersUpperCase().size());
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersLowerCaseCount()
	{
		assertEquals(25, ALPHABET_CASE.getLettersLowerCase().size());
	}

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

		assertTrue(letters.containsAll(ALPHABET.getLetters()));
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

		assertTrue(letters1.containsAll(ALPHABET.getLetters(1, 49)));
		assertTrue(letters2.containsAll(ALPHABET.getLetters(1, 33)));
		assertTrue(letters3.containsAll(ALPHABET.getLetters(1, 3)));
		assertTrue(letters4.containsAll(ALPHABET.getLetters(1, 1)));
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
	 * Проверяет прописные буквы в алфавите.
	 */
	@Test
	public void testGetLettersUpperCase()
	{
		List<Character> lettersUpperCase = List.of(
			'Α', 'Β', 'Γ', 'Δ', 'Ε', 'Ζ', 'Η', 'Θ', 'Ι',
			'Κ', 'Λ', 'Μ', 'Ν', 'Ξ', 'Ο', 'Π', 'Ρ', 'Σ',
			'Τ', 'Υ', 'Φ', 'Χ', 'Ψ', 'Ω'
		);

		assertTrue(lettersUpperCase.containsAll(ALPHABET_CASE.getLettersUpperCase()));
	}

	/**
	 * Проверяет получение среза прописных букв алфавита.
	 */
	@Test
	public void testGetLettersUpperCaseRange()
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

		assertTrue(letters1.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 24)));
		assertTrue(letters2.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 1)));
	}

	/**
	 * Проверяет получение среза прописных букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeUpperCaseOutOfBoundsMin()
	{
		ALPHABET_CASE.getLettersUpperCase(0, 24);
	}

	/**
	 * Проверяет получение среза прописных букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeUpperCaseOutOfBoundsMax()
	{
		ALPHABET_CASE.getLettersUpperCase(1, 25);
	}

	/**
	 * Проверяет получение среза прописных букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeUpperCaseInversion()
	{
		ALPHABET_CASE.getLettersUpperCase(21, 14);
	}

	/**
	 * Проверяет строчные буквы в алфавите.
	 */
	@Test
	public void testGetLettersLowerCase()
	{
		List<Character> lettersLowerCase = List.of(
			'α', 'β', 'γ', 'δ', 'ε', 'ζ', 'η', 'θ', 'ι',
			'κ', 'λ', 'μ', 'ν', 'ξ', 'ο', 'π', 'ρ', 'σ',
			'ς', 'τ', 'υ', 'φ', 'χ', 'ψ', 'ω'
		);

		assertTrue(lettersLowerCase.containsAll(ALPHABET_CASE.getLettersLowerCase()));
	}

	/**
	 * Проверяет получение среза строчных букв алфавита.
	 */
	@Test
	public void testGetLettersLowerCaseRange()
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

		assertTrue(letters1.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 25)));
		assertTrue(letters2.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 1)));
	}

	/**
	 * Проверяет получение среза строчных букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeLowerCaseOutOfBoundsMin()
	{
		ALPHABET_CASE.getLettersLowerCase(0, 25);
	}

	/**
	 * Проверяет получение среза строчных букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeLowerCaseOutOfBoundsMax()
	{
		ALPHABET_CASE.getLettersLowerCase(1, 26);
	}

	/**
	 * Проверяет получение среза строчных букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeLowerCaseInversion()
	{
		ALPHABET_CASE.getLettersLowerCase(23, 20);
	}

	/**
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionLetterBadLetter()
	{
		assertNull(ALPHABET.getPositionLetter('й'));
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPositionLetter()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPositionLetter('Α')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPositionLetter('Β')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPositionLetter('Γ')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPositionLetter('Δ')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPositionLetter('Ε')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPositionLetter('Ζ')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPositionLetter('Η')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPositionLetter('Θ')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPositionLetter('Ι')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPositionLetter('Κ')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPositionLetter('Λ')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPositionLetter('Μ')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPositionLetter('Ν')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPositionLetter('Ξ')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPositionLetter('Ο')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPositionLetter('Π')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPositionLetter('Ρ')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPositionLetter('Σ')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPositionLetter('Τ')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPositionLetter('Υ')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPositionLetter('Φ')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPositionLetter('Χ')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPositionLetter('Ψ')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPositionLetter('Ω')));

		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPositionLetter('α')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPositionLetter('β')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPositionLetter('γ')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPositionLetter('δ')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPositionLetter('ε')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPositionLetter('ζ')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPositionLetter('η')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPositionLetter('θ')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPositionLetter('ι')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPositionLetter('κ')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPositionLetter('λ')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPositionLetter('μ')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPositionLetter('ν')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPositionLetter('ξ')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPositionLetter('ο')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPositionLetter('π')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPositionLetter('ρ')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPositionLetter('σ')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPositionLetter('ς')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPositionLetter('τ')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPositionLetter('υ')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPositionLetter('φ')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPositionLetter('χ')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPositionLetter('ψ')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPositionLetter('ω')));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('Α'), Optional.ofNullable(ALPHABET.getLetter(1)));
		assertEquals(Optional.of('α'), Optional.ofNullable(ALPHABET.getLetter(2)));
		assertEquals(Optional.of('Β'), Optional.ofNullable(ALPHABET.getLetter(3)));
		assertEquals(Optional.of('β'), Optional.ofNullable(ALPHABET.getLetter(4)));
		assertEquals(Optional.of('Γ'), Optional.ofNullable(ALPHABET.getLetter(5)));
		assertEquals(Optional.of('γ'), Optional.ofNullable(ALPHABET.getLetter(6)));
		assertEquals(Optional.of('Δ'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('δ'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('Ε'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('ε'), Optional.ofNullable(ALPHABET.getLetter(10)));
		assertEquals(Optional.of('Ζ'), Optional.ofNullable(ALPHABET.getLetter(11)));
		assertEquals(Optional.of('ζ'), Optional.ofNullable(ALPHABET.getLetter(12)));
		assertEquals(Optional.of('Η'), Optional.ofNullable(ALPHABET.getLetter(13)));
		assertEquals(Optional.of('η'), Optional.ofNullable(ALPHABET.getLetter(14)));
		assertEquals(Optional.of('Θ'), Optional.ofNullable(ALPHABET.getLetter(15)));
		assertEquals(Optional.of('θ'), Optional.ofNullable(ALPHABET.getLetter(16)));
		assertEquals(Optional.of('Ι'), Optional.ofNullable(ALPHABET.getLetter(17)));
		assertEquals(Optional.of('ι'), Optional.ofNullable(ALPHABET.getLetter(18)));
		assertEquals(Optional.of('Κ'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('κ'), Optional.ofNullable(ALPHABET.getLetter(20)));
		assertEquals(Optional.of('Λ'), Optional.ofNullable(ALPHABET.getLetter(21)));
		assertEquals(Optional.of('λ'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('Μ'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('μ'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('Ν'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('ν'), Optional.ofNullable(ALPHABET.getLetter(26)));
		assertEquals(Optional.of('Ξ'), Optional.ofNullable(ALPHABET.getLetter(27)));
		assertEquals(Optional.of('ξ'), Optional.ofNullable(ALPHABET.getLetter(28)));
		assertEquals(Optional.of('Ο'), Optional.ofNullable(ALPHABET.getLetter(29)));
		assertEquals(Optional.of('ο'), Optional.ofNullable(ALPHABET.getLetter(30)));
		assertEquals(Optional.of('Π'), Optional.ofNullable(ALPHABET.getLetter(31)));
		assertEquals(Optional.of('π'), Optional.ofNullable(ALPHABET.getLetter(32)));
		assertEquals(Optional.of('Ρ'), Optional.ofNullable(ALPHABET.getLetter(33)));
		assertEquals(Optional.of('ρ'), Optional.ofNullable(ALPHABET.getLetter(34)));
		assertEquals(Optional.of('Σ'), Optional.ofNullable(ALPHABET.getLetter(35)));
		assertEquals(Optional.of('σ'), Optional.ofNullable(ALPHABET.getLetter(36)));
		assertEquals(Optional.of('ς'), Optional.ofNullable(ALPHABET.getLetter(37)));
		assertEquals(Optional.of('Τ'), Optional.ofNullable(ALPHABET.getLetter(38)));
		assertEquals(Optional.of('τ'), Optional.ofNullable(ALPHABET.getLetter(39)));
		assertEquals(Optional.of('Υ'), Optional.ofNullable(ALPHABET.getLetter(40)));
		assertEquals(Optional.of('υ'), Optional.ofNullable(ALPHABET.getLetter(41)));
		assertEquals(Optional.of('Φ'), Optional.ofNullable(ALPHABET.getLetter(42)));
		assertEquals(Optional.of('φ'), Optional.ofNullable(ALPHABET.getLetter(43)));
		assertEquals(Optional.of('Χ'), Optional.ofNullable(ALPHABET.getLetter(44)));
		assertEquals(Optional.of('χ'), Optional.ofNullable(ALPHABET.getLetter(45)));
		assertEquals(Optional.of('Ψ'), Optional.ofNullable(ALPHABET.getLetter(46)));
		assertEquals(Optional.of('ψ'), Optional.ofNullable(ALPHABET.getLetter(47)));
		assertEquals(Optional.of('Ω'), Optional.ofNullable(ALPHABET.getLetter(48)));
		assertEquals(Optional.of('ω'), Optional.ofNullable(ALPHABET.getLetter(49)));
	}

	/**
	 * Проверяет прописную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterUpperCase()
	{
		assertEquals(Optional.of('Α'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(1)));
		assertEquals(Optional.of('Β'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(2)));
		assertEquals(Optional.of('Γ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(3)));
		assertEquals(Optional.of('Δ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(4)));
		assertEquals(Optional.of('Ε'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(5)));
		assertEquals(Optional.of('Ζ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(6)));
		assertEquals(Optional.of('Η'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(7)));
		assertEquals(Optional.of('Θ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(8)));
		assertEquals(Optional.of('Ι'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(9)));
		assertEquals(Optional.of('Κ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(10)));
		assertEquals(Optional.of('Λ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(11)));
		assertEquals(Optional.of('Μ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(12)));
		assertEquals(Optional.of('Ν'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(13)));
		assertEquals(Optional.of('Ξ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(14)));
		assertEquals(Optional.of('Ο'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(15)));
		assertEquals(Optional.of('Π'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(16)));
		assertEquals(Optional.of('Ρ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(17)));
		assertEquals(Optional.of('Σ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(18)));
		assertEquals(Optional.of('Τ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(19)));
		assertEquals(Optional.of('Υ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(20)));
		assertEquals(Optional.of('Φ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(21)));
		assertEquals(Optional.of('Χ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(22)));
		assertEquals(Optional.of('Ψ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(23)));
		assertEquals(Optional.of('Ω'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(24)));
	}

	/**
	 * Проверяет строчную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterLowerCase()
	{
		assertEquals(Optional.of('α'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(1)));
		assertEquals(Optional.of('β'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(2)));
		assertEquals(Optional.of('γ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(3)));
		assertEquals(Optional.of('δ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(4)));
		assertEquals(Optional.of('ε'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(5)));
		assertEquals(Optional.of('ζ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(6)));
		assertEquals(Optional.of('η'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(7)));
		assertEquals(Optional.of('θ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(8)));
		assertEquals(Optional.of('ι'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(9)));
		assertEquals(Optional.of('κ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(10)));
		assertEquals(Optional.of('λ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(11)));
		assertEquals(Optional.of('μ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(12)));
		assertEquals(Optional.of('ν'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(13)));
		assertEquals(Optional.of('ξ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(14)));
		assertEquals(Optional.of('ο'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(15)));
		assertEquals(Optional.of('π'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(16)));
		assertEquals(Optional.of('ρ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(17)));
		assertEquals(Optional.of('σ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(18)));
		assertEquals(Optional.of('ς'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(19)));
		assertEquals(Optional.of('τ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(20)));
		assertEquals(Optional.of('υ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(21)));
		assertEquals(Optional.of('φ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(22)));
		assertEquals(Optional.of('χ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(23)));
		assertEquals(Optional.of('ψ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(24)));
		assertEquals(Optional.of('ω'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(25)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testIsLetter()
	{
		assertTrue(ALPHABET.isLetter('Α'));
		assertTrue(ALPHABET.isLetter('Β'));
		assertTrue(ALPHABET.isLetter('Γ'));
		assertTrue(ALPHABET.isLetter('Δ'));
		assertTrue(ALPHABET.isLetter('Ε'));
		assertTrue(ALPHABET.isLetter('Ζ'));
		assertTrue(ALPHABET.isLetter('Η'));
		assertTrue(ALPHABET.isLetter('Θ'));
		assertTrue(ALPHABET.isLetter('Ι'));
		assertTrue(ALPHABET.isLetter('Κ'));
		assertTrue(ALPHABET.isLetter('Λ'));
		assertTrue(ALPHABET.isLetter('Μ'));
		assertTrue(ALPHABET.isLetter('Ν'));
		assertTrue(ALPHABET.isLetter('Ξ'));
		assertTrue(ALPHABET.isLetter('Ο'));
		assertTrue(ALPHABET.isLetter('Π'));
		assertTrue(ALPHABET.isLetter('Ρ'));
		assertTrue(ALPHABET.isLetter('Σ'));
		assertTrue(ALPHABET.isLetter('Τ'));
		assertTrue(ALPHABET.isLetter('Υ'));
		assertTrue(ALPHABET.isLetter('Φ'));
		assertTrue(ALPHABET.isLetter('Χ'));
		assertTrue(ALPHABET.isLetter('Ψ'));
		assertTrue(ALPHABET.isLetter('Ω'));
		assertTrue(ALPHABET.isLetter('α'));
		assertTrue(ALPHABET.isLetter('β'));
		assertTrue(ALPHABET.isLetter('γ'));
		assertTrue(ALPHABET.isLetter('δ'));
		assertTrue(ALPHABET.isLetter('ε'));
		assertTrue(ALPHABET.isLetter('ζ'));
		assertTrue(ALPHABET.isLetter('η'));
		assertTrue(ALPHABET.isLetter('θ'));
		assertTrue(ALPHABET.isLetter('ι'));
		assertTrue(ALPHABET.isLetter('κ'));
		assertTrue(ALPHABET.isLetter('λ'));
		assertTrue(ALPHABET.isLetter('μ'));
		assertTrue(ALPHABET.isLetter('ν'));
		assertTrue(ALPHABET.isLetter('ξ'));
		assertTrue(ALPHABET.isLetter('ο'));
		assertTrue(ALPHABET.isLetter('π'));
		assertTrue(ALPHABET.isLetter('ρ'));
		assertTrue(ALPHABET.isLetter('σ'));
		assertTrue(ALPHABET.isLetter('ς'));
		assertTrue(ALPHABET.isLetter('τ'));
		assertTrue(ALPHABET.isLetter('υ'));
		assertTrue(ALPHABET.isLetter('φ'));
		assertTrue(ALPHABET.isLetter('χ'));
		assertTrue(ALPHABET.isLetter('ψ'));
		assertTrue(ALPHABET.isLetter('ω'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testIsLetterBad()
	{
		assertFalse(ALPHABET.isLetter('ы'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту прописных букв.
	 */
	@Test
	public void testIsLetterUpperCase()
	{
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Α'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Β'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Γ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Δ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ε'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ζ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Η'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Θ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ι'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Κ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Λ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Μ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ν'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ξ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ο'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Π'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ρ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Σ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Τ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Υ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Φ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Χ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ψ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ω'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту прописных букв.
	 */
	@Test
	public void testIsLetterUpperCaseBad()
	{
		assertFalse(ALPHABET_CASE.isLetterUpperCase('β'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCase()
	{
		assertTrue(ALPHABET_CASE.isLetterLowerCase('α'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('β'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('γ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('δ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ε'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ζ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('η'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('θ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ι'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('κ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('λ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('μ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ν'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ξ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ο'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('π'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ρ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('σ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ς'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('τ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('υ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('φ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('χ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ψ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ω'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCaseBad()
	{
		assertFalse(ALPHABET_CASE.isLetterLowerCase('Β'));
	}

}