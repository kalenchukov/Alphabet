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
	public void testGetPositionBadLetter()
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
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('Β')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('Γ')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('Δ')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('Ε')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('Ζ')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('Η')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('Θ')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('Ι')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('Κ')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('Λ')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('Μ')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('Ν')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('Ξ')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('Ο')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('Π')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('Ρ')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('Σ')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('Τ')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('Υ')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('Φ')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('Χ')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('Ψ')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('Ω')));

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
	public void testHasLetter()
	{
		assertTrue(ALPHABET.hasLetter('Α'));
		assertTrue(ALPHABET.hasLetter('Β'));
		assertTrue(ALPHABET.hasLetter('Γ'));
		assertTrue(ALPHABET.hasLetter('Δ'));
		assertTrue(ALPHABET.hasLetter('Ε'));
		assertTrue(ALPHABET.hasLetter('Ζ'));
		assertTrue(ALPHABET.hasLetter('Η'));
		assertTrue(ALPHABET.hasLetter('Θ'));
		assertTrue(ALPHABET.hasLetter('Ι'));
		assertTrue(ALPHABET.hasLetter('Κ'));
		assertTrue(ALPHABET.hasLetter('Λ'));
		assertTrue(ALPHABET.hasLetter('Μ'));
		assertTrue(ALPHABET.hasLetter('Ν'));
		assertTrue(ALPHABET.hasLetter('Ξ'));
		assertTrue(ALPHABET.hasLetter('Ο'));
		assertTrue(ALPHABET.hasLetter('Π'));
		assertTrue(ALPHABET.hasLetter('Ρ'));
		assertTrue(ALPHABET.hasLetter('Σ'));
		assertTrue(ALPHABET.hasLetter('Τ'));
		assertTrue(ALPHABET.hasLetter('Υ'));
		assertTrue(ALPHABET.hasLetter('Φ'));
		assertTrue(ALPHABET.hasLetter('Χ'));
		assertTrue(ALPHABET.hasLetter('Ψ'));
		assertTrue(ALPHABET.hasLetter('Ω'));
		assertTrue(ALPHABET.hasLetter('α'));
		assertTrue(ALPHABET.hasLetter('β'));
		assertTrue(ALPHABET.hasLetter('γ'));
		assertTrue(ALPHABET.hasLetter('δ'));
		assertTrue(ALPHABET.hasLetter('ε'));
		assertTrue(ALPHABET.hasLetter('ζ'));
		assertTrue(ALPHABET.hasLetter('η'));
		assertTrue(ALPHABET.hasLetter('θ'));
		assertTrue(ALPHABET.hasLetter('ι'));
		assertTrue(ALPHABET.hasLetter('κ'));
		assertTrue(ALPHABET.hasLetter('λ'));
		assertTrue(ALPHABET.hasLetter('μ'));
		assertTrue(ALPHABET.hasLetter('ν'));
		assertTrue(ALPHABET.hasLetter('ξ'));
		assertTrue(ALPHABET.hasLetter('ο'));
		assertTrue(ALPHABET.hasLetter('π'));
		assertTrue(ALPHABET.hasLetter('ρ'));
		assertTrue(ALPHABET.hasLetter('σ'));
		assertTrue(ALPHABET.hasLetter('ς'));
		assertTrue(ALPHABET.hasLetter('τ'));
		assertTrue(ALPHABET.hasLetter('υ'));
		assertTrue(ALPHABET.hasLetter('φ'));
		assertTrue(ALPHABET.hasLetter('χ'));
		assertTrue(ALPHABET.hasLetter('ψ'));
		assertTrue(ALPHABET.hasLetter('ω'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testHasLetterBad()
	{
		assertFalse(ALPHABET.hasLetter('ы'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту прописных букв.
	 */
	@Test
	public void testHasLetterUpperCase()
	{
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Α'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Β'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Γ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Δ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ε'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ζ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Η'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Θ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ι'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Κ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Λ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Μ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ν'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ξ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ο'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Π'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ρ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Σ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Τ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Υ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Φ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Χ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ψ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ω'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту прописных букв.
	 */
	@Test
	public void testHasLetterUpperCaseBad()
	{
		assertFalse(ALPHABET_CASE.hasLetterUpperCase('β'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 */
	@Test
	public void testHasLetterLowerCase()
	{
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('α'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('β'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('γ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('δ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ε'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ζ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('η'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('θ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ι'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('κ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('λ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('μ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ν'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ξ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ο'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('π'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ρ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('σ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ς'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('τ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('υ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('φ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('χ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ψ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ω'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту строчных букв.
	 */
	@Test
	public void testHasLetterLowerCaseBad()
	{
		assertFalse(ALPHABET_CASE.hasLetterLowerCase('Β'));
	}

}