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

public class EnglishAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new EnglishAlphabet.UpperCase();

	/**
	 * Проверяет буквы в алфавите.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = ALPHABET.getLetters();

		assertEquals(Optional.of('A'), Optional.ofNullable(letters.get(0)));
		assertEquals(Optional.of('B'), Optional.ofNullable(letters.get(1)));
		assertEquals(Optional.of('C'), Optional.ofNullable(letters.get(2)));
		assertEquals(Optional.of('D'), Optional.ofNullable(letters.get(3)));
		assertEquals(Optional.of('E'), Optional.ofNullable(letters.get(4)));
		assertEquals(Optional.of('F'), Optional.ofNullable(letters.get(5)));
		assertEquals(Optional.of('G'), Optional.ofNullable(letters.get(6)));
		assertEquals(Optional.of('H'), Optional.ofNullable(letters.get(7)));
		assertEquals(Optional.of('I'), Optional.ofNullable(letters.get(8)));
		assertEquals(Optional.of('J'), Optional.ofNullable(letters.get(9)));
		assertEquals(Optional.of('K'), Optional.ofNullable(letters.get(10)));
		assertEquals(Optional.of('L'), Optional.ofNullable(letters.get(11)));
		assertEquals(Optional.of('M'), Optional.ofNullable(letters.get(12)));
		assertEquals(Optional.of('N'), Optional.ofNullable(letters.get(13)));
		assertEquals(Optional.of('O'), Optional.ofNullable(letters.get(14)));
		assertEquals(Optional.of('P'), Optional.ofNullable(letters.get(15)));
		assertEquals(Optional.of('Q'), Optional.ofNullable(letters.get(16)));
		assertEquals(Optional.of('R'), Optional.ofNullable(letters.get(17)));
		assertEquals(Optional.of('S'), Optional.ofNullable(letters.get(18)));
		assertEquals(Optional.of('T'), Optional.ofNullable(letters.get(19)));
		assertEquals(Optional.of('U'), Optional.ofNullable(letters.get(20)));
		assertEquals(Optional.of('V'), Optional.ofNullable(letters.get(21)));
		assertEquals(Optional.of('W'), Optional.ofNullable(letters.get(22)));
		assertEquals(Optional.of('X'), Optional.ofNullable(letters.get(23)));
		assertEquals(Optional.of('Y'), Optional.ofNullable(letters.get(24)));
		assertEquals(Optional.of('Z'), Optional.ofNullable(letters.get(25)));
	}

	/**
	 * Проверяет буквы алфавита в обратном порядке.
	 */
	@Test
	public void testGetLettersReverse()
	{
		List<Character> letters = ALPHABET.getLettersReverse();

		assertEquals(Optional.of('A'), Optional.ofNullable(letters.get(25)));
		assertEquals(Optional.of('B'), Optional.ofNullable(letters.get(24)));
		assertEquals(Optional.of('C'), Optional.ofNullable(letters.get(23)));
		assertEquals(Optional.of('D'), Optional.ofNullable(letters.get(22)));
		assertEquals(Optional.of('E'), Optional.ofNullable(letters.get(21)));
		assertEquals(Optional.of('F'), Optional.ofNullable(letters.get(20)));
		assertEquals(Optional.of('G'), Optional.ofNullable(letters.get(19)));
		assertEquals(Optional.of('H'), Optional.ofNullable(letters.get(18)));
		assertEquals(Optional.of('I'), Optional.ofNullable(letters.get(17)));
		assertEquals(Optional.of('J'), Optional.ofNullable(letters.get(16)));
		assertEquals(Optional.of('K'), Optional.ofNullable(letters.get(15)));
		assertEquals(Optional.of('L'), Optional.ofNullable(letters.get(14)));
		assertEquals(Optional.of('M'), Optional.ofNullable(letters.get(13)));
		assertEquals(Optional.of('N'), Optional.ofNullable(letters.get(12)));
		assertEquals(Optional.of('O'), Optional.ofNullable(letters.get(11)));
		assertEquals(Optional.of('P'), Optional.ofNullable(letters.get(10)));
		assertEquals(Optional.of('Q'), Optional.ofNullable(letters.get(9)));
		assertEquals(Optional.of('R'), Optional.ofNullable(letters.get(8)));
		assertEquals(Optional.of('S'), Optional.ofNullable(letters.get(7)));
		assertEquals(Optional.of('T'), Optional.ofNullable(letters.get(6)));
		assertEquals(Optional.of('U'), Optional.ofNullable(letters.get(5)));
		assertEquals(Optional.of('V'), Optional.ofNullable(letters.get(4)));
		assertEquals(Optional.of('W'), Optional.ofNullable(letters.get(3)));
		assertEquals(Optional.of('X'), Optional.ofNullable(letters.get(2)));
		assertEquals(Optional.of('Y'), Optional.ofNullable(letters.get(1)));
		assertEquals(Optional.of('Z'), Optional.ofNullable(letters.get(0)));
	}

	/**
	 * Проверяет получение среза букв алфавита.
	 */
	@Test
	public void testGetLettersRange()
	{
		List<Character> letters1 = List.of(
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
		);

		List<Character> letters2 = List.of(
			'A', 'B', 'C'
		);

		List<Character> letters3 = List.of(
			'A'
		);

		assertTrue(letters1.containsAll(ALPHABET.getLetters(1, 26)));
		assertTrue(letters2.containsAll(ALPHABET.getLetters(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET.getLetters(1, 1)));
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMin()
	{
		ALPHABET.getLetters(0, 26);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMax()
	{
		ALPHABET.getLetters(1, 27);
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
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('A')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('B')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('C')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('D')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('E')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('F')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('G')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('H')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('I')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('J')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('K')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('L')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('M')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('N')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('O')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('P')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('Q')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('R')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('S')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('T')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('U')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('V')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('W')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('X')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('Y')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('Z')));
	}

	/**
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionBadLetter()
	{
		assertNull(ALPHABET.getPosition('Ё'));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('A'), Optional.ofNullable(ALPHABET.getLetter(1)));
		assertEquals(Optional.of('B'), Optional.ofNullable(ALPHABET.getLetter(2)));
		assertEquals(Optional.of('C'), Optional.ofNullable(ALPHABET.getLetter(3)));
		assertEquals(Optional.of('D'), Optional.ofNullable(ALPHABET.getLetter(4)));
		assertEquals(Optional.of('E'), Optional.ofNullable(ALPHABET.getLetter(5)));
		assertEquals(Optional.of('F'), Optional.ofNullable(ALPHABET.getLetter(6)));
		assertEquals(Optional.of('G'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('H'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('I'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('J'), Optional.ofNullable(ALPHABET.getLetter(10)));
		assertEquals(Optional.of('K'), Optional.ofNullable(ALPHABET.getLetter(11)));
		assertEquals(Optional.of('L'), Optional.ofNullable(ALPHABET.getLetter(12)));
		assertEquals(Optional.of('M'), Optional.ofNullable(ALPHABET.getLetter(13)));
		assertEquals(Optional.of('N'), Optional.ofNullable(ALPHABET.getLetter(14)));
		assertEquals(Optional.of('O'), Optional.ofNullable(ALPHABET.getLetter(15)));
		assertEquals(Optional.of('P'), Optional.ofNullable(ALPHABET.getLetter(16)));
		assertEquals(Optional.of('Q'), Optional.ofNullable(ALPHABET.getLetter(17)));
		assertEquals(Optional.of('R'), Optional.ofNullable(ALPHABET.getLetter(18)));
		assertEquals(Optional.of('S'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('T'), Optional.ofNullable(ALPHABET.getLetter(20)));
		assertEquals(Optional.of('U'), Optional.ofNullable(ALPHABET.getLetter(21)));
		assertEquals(Optional.of('V'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('W'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('X'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('Y'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('Z'), Optional.ofNullable(ALPHABET.getLetter(26)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testHasLetter()
	{
		assertTrue(ALPHABET.hasLetter('A'));
		assertTrue(ALPHABET.hasLetter('B'));
		assertTrue(ALPHABET.hasLetter('C'));
		assertTrue(ALPHABET.hasLetter('D'));
		assertTrue(ALPHABET.hasLetter('E'));
		assertTrue(ALPHABET.hasLetter('F'));
		assertTrue(ALPHABET.hasLetter('G'));
		assertTrue(ALPHABET.hasLetter('H'));
		assertTrue(ALPHABET.hasLetter('I'));
		assertTrue(ALPHABET.hasLetter('J'));
		assertTrue(ALPHABET.hasLetter('K'));
		assertTrue(ALPHABET.hasLetter('L'));
		assertTrue(ALPHABET.hasLetter('M'));
		assertTrue(ALPHABET.hasLetter('N'));
		assertTrue(ALPHABET.hasLetter('O'));
		assertTrue(ALPHABET.hasLetter('P'));
		assertTrue(ALPHABET.hasLetter('Q'));
		assertTrue(ALPHABET.hasLetter('R'));
		assertTrue(ALPHABET.hasLetter('S'));
		assertTrue(ALPHABET.hasLetter('T'));
		assertTrue(ALPHABET.hasLetter('U'));
		assertTrue(ALPHABET.hasLetter('V'));
		assertTrue(ALPHABET.hasLetter('W'));
		assertTrue(ALPHABET.hasLetter('X'));
		assertTrue(ALPHABET.hasLetter('Y'));
		assertTrue(ALPHABET.hasLetter('Z'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testHasLetterBad()
	{
		assertFalse(ALPHABET.hasLetter('x'));
	}
}