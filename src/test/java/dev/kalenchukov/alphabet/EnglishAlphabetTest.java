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

public class EnglishAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new EnglishAlphabet();

	@NotNull
	public static final AlphabeticalCase ALPHABET_CASE = new EnglishAlphabet();

	/**
	 * Проверяет количество букв в алфавите.
	 */
	@Test
	public void testGetLettersCount()
	{
		assertEquals(52, ALPHABET.getLetters().size());
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersUpperCaseCount()
	{
		assertEquals(26, ALPHABET_CASE.getLettersUpperCase().size());
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersLowerCaseCount()
	{
		assertEquals(26, ALPHABET_CASE.getLettersLowerCase().size());
	}

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e',
			'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j',
			'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o',
			'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
			'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y',
			'Z', 'z'
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
			'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e',
			'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j',
			'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o',
			'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
			'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y',
			'Z', 'z'
		);

		List<Character> letters2 = List.of(
			'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e',
			'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j',
			'K', 'k', 'L', 'l', 'M', 'm'
		);

		List<Character> letters3 = List.of(
			'A', 'a', 'B'
		);

		List<Character> letters4 = List.of(
			'A'
		);

		assertTrue(letters1.containsAll(ALPHABET.getLetters(1, 52)));
		assertTrue(letters2.containsAll(ALPHABET.getLetters(1, 26)));
		assertTrue(letters3.containsAll(ALPHABET.getLetters(1, 3)));
		assertTrue(letters4.containsAll(ALPHABET.getLetters(1, 1)));
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
		ALPHABET.getLetters(1, 53);
	}

	/**
	 * Проверяет получение среза букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeInversion()
	{
		ALPHABET.getLetters(26, 20);
	}


	/**
	 * Проверяет прописные буквы в алфавите.
	 */
	@Test
	public void testGetLettersUpperCase()
	{
		List<Character> lettersUpperCase = List.of(
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
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

		assertTrue(letters1.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 26)));
		assertTrue(letters2.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 1)));
	}

	/**
	 * Проверяет получение среза прописных букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeUpperCaseOutOfBoundsMin()
	{
		ALPHABET_CASE.getLettersUpperCase(0, 26);
	}

	/**
	 * Проверяет получение среза прописных букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeUpperCaseOutOfBoundsMax()
	{
		ALPHABET_CASE.getLettersUpperCase(1, 27);
	}

	/**
	 * Проверяет получение среза прописных букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeUpperCaseInversion()
	{
		ALPHABET_CASE.getLettersUpperCase(23, 20);
	}

	/**
	 * Проверяет строчные буквы в алфавите.
	 */
	@Test
	public void testGetLettersLowerCase()
	{
		List<Character> lettersLowerCase = List.of(
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
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
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		);

		List<Character> letters2 = List.of(
			'a', 'b', 'c'
		);

		List<Character> letters3 = List.of(
			'a'
		);

		assertTrue(letters1.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 26)));
		assertTrue(letters2.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 1)));
	}

	/**
	 * Проверяет получение среза строчных букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeLowerCaseOutOfBoundsMin()
	{
		ALPHABET_CASE.getLettersLowerCase(0, 26);
	}

	/**
	 * Проверяет получение среза строчных букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeLowerCaseOutOfBoundsMax()
	{
		ALPHABET_CASE.getLettersLowerCase(1, 27);
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
		assertNull(ALPHABET.getPositionLetter('Ё'));
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPositionLetter()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPositionLetter('A')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPositionLetter('B')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPositionLetter('C')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPositionLetter('D')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPositionLetter('E')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPositionLetter('F')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPositionLetter('G')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPositionLetter('H')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPositionLetter('I')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPositionLetter('J')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPositionLetter('K')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPositionLetter('L')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPositionLetter('M')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPositionLetter('N')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPositionLetter('O')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPositionLetter('P')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPositionLetter('Q')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPositionLetter('R')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPositionLetter('S')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPositionLetter('T')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPositionLetter('U')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPositionLetter('V')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPositionLetter('W')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPositionLetter('X')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPositionLetter('Y')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPositionLetter('Z')));

		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPositionLetter('a')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPositionLetter('b')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPositionLetter('c')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPositionLetter('d')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPositionLetter('e')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPositionLetter('f')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPositionLetter('g')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPositionLetter('h')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPositionLetter('i')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPositionLetter('j')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPositionLetter('k')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPositionLetter('l')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPositionLetter('m')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPositionLetter('n')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPositionLetter('o')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPositionLetter('p')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPositionLetter('q')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPositionLetter('r')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPositionLetter('s')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPositionLetter('t')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPositionLetter('u')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPositionLetter('v')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPositionLetter('w')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPositionLetter('x')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPositionLetter('y')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPositionLetter('z')));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('A'), Optional.ofNullable(ALPHABET.getLetter(1)));
		assertEquals(Optional.of('a'), Optional.ofNullable(ALPHABET.getLetter(2)));
		assertEquals(Optional.of('B'), Optional.ofNullable(ALPHABET.getLetter(3)));
		assertEquals(Optional.of('b'), Optional.ofNullable(ALPHABET.getLetter(4)));
		assertEquals(Optional.of('C'), Optional.ofNullable(ALPHABET.getLetter(5)));
		assertEquals(Optional.of('c'), Optional.ofNullable(ALPHABET.getLetter(6)));
		assertEquals(Optional.of('D'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('d'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('E'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('e'), Optional.ofNullable(ALPHABET.getLetter(10)));
		assertEquals(Optional.of('F'), Optional.ofNullable(ALPHABET.getLetter(11)));
		assertEquals(Optional.of('f'), Optional.ofNullable(ALPHABET.getLetter(12)));
		assertEquals(Optional.of('G'), Optional.ofNullable(ALPHABET.getLetter(13)));
		assertEquals(Optional.of('g'), Optional.ofNullable(ALPHABET.getLetter(14)));
		assertEquals(Optional.of('H'), Optional.ofNullable(ALPHABET.getLetter(15)));
		assertEquals(Optional.of('h'), Optional.ofNullable(ALPHABET.getLetter(16)));
		assertEquals(Optional.of('I'), Optional.ofNullable(ALPHABET.getLetter(17)));
		assertEquals(Optional.of('i'), Optional.ofNullable(ALPHABET.getLetter(18)));
		assertEquals(Optional.of('J'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('j'), Optional.ofNullable(ALPHABET.getLetter(20)));
		assertEquals(Optional.of('K'), Optional.ofNullable(ALPHABET.getLetter(21)));
		assertEquals(Optional.of('k'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('L'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('l'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('M'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('m'), Optional.ofNullable(ALPHABET.getLetter(26)));
		assertEquals(Optional.of('N'), Optional.ofNullable(ALPHABET.getLetter(27)));
		assertEquals(Optional.of('n'), Optional.ofNullable(ALPHABET.getLetter(28)));
		assertEquals(Optional.of('O'), Optional.ofNullable(ALPHABET.getLetter(29)));
		assertEquals(Optional.of('o'), Optional.ofNullable(ALPHABET.getLetter(30)));
		assertEquals(Optional.of('P'), Optional.ofNullable(ALPHABET.getLetter(31)));
		assertEquals(Optional.of('p'), Optional.ofNullable(ALPHABET.getLetter(32)));
		assertEquals(Optional.of('Q'), Optional.ofNullable(ALPHABET.getLetter(33)));
		assertEquals(Optional.of('q'), Optional.ofNullable(ALPHABET.getLetter(34)));
		assertEquals(Optional.of('R'), Optional.ofNullable(ALPHABET.getLetter(35)));
		assertEquals(Optional.of('r'), Optional.ofNullable(ALPHABET.getLetter(36)));
		assertEquals(Optional.of('S'), Optional.ofNullable(ALPHABET.getLetter(37)));
		assertEquals(Optional.of('s'), Optional.ofNullable(ALPHABET.getLetter(38)));
		assertEquals(Optional.of('T'), Optional.ofNullable(ALPHABET.getLetter(39)));
		assertEquals(Optional.of('t'), Optional.ofNullable(ALPHABET.getLetter(40)));
		assertEquals(Optional.of('U'), Optional.ofNullable(ALPHABET.getLetter(41)));
		assertEquals(Optional.of('u'), Optional.ofNullable(ALPHABET.getLetter(42)));
		assertEquals(Optional.of('V'), Optional.ofNullable(ALPHABET.getLetter(43)));
		assertEquals(Optional.of('v'), Optional.ofNullable(ALPHABET.getLetter(44)));
		assertEquals(Optional.of('W'), Optional.ofNullable(ALPHABET.getLetter(45)));
		assertEquals(Optional.of('w'), Optional.ofNullable(ALPHABET.getLetter(46)));
		assertEquals(Optional.of('X'), Optional.ofNullable(ALPHABET.getLetter(47)));
		assertEquals(Optional.of('x'), Optional.ofNullable(ALPHABET.getLetter(48)));
		assertEquals(Optional.of('Y'), Optional.ofNullable(ALPHABET.getLetter(49)));
		assertEquals(Optional.of('y'), Optional.ofNullable(ALPHABET.getLetter(50)));
		assertEquals(Optional.of('Z'), Optional.ofNullable(ALPHABET.getLetter(51)));
		assertEquals(Optional.of('z'), Optional.ofNullable(ALPHABET.getLetter(52)));
	}

	/**
	 * Проверяет прописную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterUpperCase()
	{
		assertEquals(Optional.of('A'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(1)));
		assertEquals(Optional.of('B'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(2)));
		assertEquals(Optional.of('C'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(3)));
		assertEquals(Optional.of('D'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(4)));
		assertEquals(Optional.of('E'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(5)));
		assertEquals(Optional.of('F'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(6)));
		assertEquals(Optional.of('G'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(7)));
		assertEquals(Optional.of('H'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(8)));
		assertEquals(Optional.of('I'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(9)));
		assertEquals(Optional.of('J'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(10)));
		assertEquals(Optional.of('K'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(11)));
		assertEquals(Optional.of('L'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(12)));
		assertEquals(Optional.of('M'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(13)));
		assertEquals(Optional.of('N'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(14)));
		assertEquals(Optional.of('O'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(15)));
		assertEquals(Optional.of('P'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(16)));
		assertEquals(Optional.of('Q'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(17)));
		assertEquals(Optional.of('R'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(18)));
		assertEquals(Optional.of('S'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(19)));
		assertEquals(Optional.of('T'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(20)));
		assertEquals(Optional.of('U'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(21)));
		assertEquals(Optional.of('V'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(22)));
		assertEquals(Optional.of('W'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(23)));
		assertEquals(Optional.of('X'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(24)));
		assertEquals(Optional.of('Y'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(25)));
		assertEquals(Optional.of('Z'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(26)));
	}

	/**
	 * Проверяет строчную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterLowerCase()
	{
		assertEquals(Optional.of('a'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(1)));
		assertEquals(Optional.of('b'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(2)));
		assertEquals(Optional.of('c'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(3)));
		assertEquals(Optional.of('d'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(4)));
		assertEquals(Optional.of('e'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(5)));
		assertEquals(Optional.of('f'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(6)));
		assertEquals(Optional.of('g'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(7)));
		assertEquals(Optional.of('h'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(8)));
		assertEquals(Optional.of('i'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(9)));
		assertEquals(Optional.of('j'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(10)));
		assertEquals(Optional.of('k'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(11)));
		assertEquals(Optional.of('l'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(12)));
		assertEquals(Optional.of('m'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(13)));
		assertEquals(Optional.of('n'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(14)));
		assertEquals(Optional.of('o'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(15)));
		assertEquals(Optional.of('p'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(16)));
		assertEquals(Optional.of('q'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(17)));
		assertEquals(Optional.of('r'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(18)));
		assertEquals(Optional.of('s'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(19)));
		assertEquals(Optional.of('t'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(20)));
		assertEquals(Optional.of('u'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(21)));
		assertEquals(Optional.of('v'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(22)));
		assertEquals(Optional.of('w'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(23)));
		assertEquals(Optional.of('x'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(24)));
		assertEquals(Optional.of('y'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(25)));
		assertEquals(Optional.of('z'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(26)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testIsLetter()
	{
		assertTrue(ALPHABET.isLetter('A'));
		assertTrue(ALPHABET.isLetter('B'));
		assertTrue(ALPHABET.isLetter('C'));
		assertTrue(ALPHABET.isLetter('D'));
		assertTrue(ALPHABET.isLetter('E'));
		assertTrue(ALPHABET.isLetter('F'));
		assertTrue(ALPHABET.isLetter('G'));
		assertTrue(ALPHABET.isLetter('H'));
		assertTrue(ALPHABET.isLetter('I'));
		assertTrue(ALPHABET.isLetter('J'));
		assertTrue(ALPHABET.isLetter('K'));
		assertTrue(ALPHABET.isLetter('L'));
		assertTrue(ALPHABET.isLetter('M'));
		assertTrue(ALPHABET.isLetter('N'));
		assertTrue(ALPHABET.isLetter('O'));
		assertTrue(ALPHABET.isLetter('P'));
		assertTrue(ALPHABET.isLetter('Q'));
		assertTrue(ALPHABET.isLetter('R'));
		assertTrue(ALPHABET.isLetter('S'));
		assertTrue(ALPHABET.isLetter('T'));
		assertTrue(ALPHABET.isLetter('U'));
		assertTrue(ALPHABET.isLetter('V'));
		assertTrue(ALPHABET.isLetter('W'));
		assertTrue(ALPHABET.isLetter('X'));
		assertTrue(ALPHABET.isLetter('Y'));
		assertTrue(ALPHABET.isLetter('Z'));
		assertTrue(ALPHABET.isLetter('a'));
		assertTrue(ALPHABET.isLetter('b'));
		assertTrue(ALPHABET.isLetter('c'));
		assertTrue(ALPHABET.isLetter('d'));
		assertTrue(ALPHABET.isLetter('e'));
		assertTrue(ALPHABET.isLetter('f'));
		assertTrue(ALPHABET.isLetter('g'));
		assertTrue(ALPHABET.isLetter('h'));
		assertTrue(ALPHABET.isLetter('i'));
		assertTrue(ALPHABET.isLetter('j'));
		assertTrue(ALPHABET.isLetter('k'));
		assertTrue(ALPHABET.isLetter('l'));
		assertTrue(ALPHABET.isLetter('m'));
		assertTrue(ALPHABET.isLetter('n'));
		assertTrue(ALPHABET.isLetter('o'));
		assertTrue(ALPHABET.isLetter('p'));
		assertTrue(ALPHABET.isLetter('q'));
		assertTrue(ALPHABET.isLetter('r'));
		assertTrue(ALPHABET.isLetter('s'));
		assertTrue(ALPHABET.isLetter('t'));
		assertTrue(ALPHABET.isLetter('u'));
		assertTrue(ALPHABET.isLetter('v'));
		assertTrue(ALPHABET.isLetter('w'));
		assertTrue(ALPHABET.isLetter('x'));
		assertTrue(ALPHABET.isLetter('y'));
		assertTrue(ALPHABET.isLetter('z'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testIsLetterBad()
	{
		assertFalse(ALPHABET.isLetter('Ы'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту прописных букв.
	 */
	@Test
	public void testIsLetterUpperCase()
	{
		assertTrue(ALPHABET_CASE.isLetterUpperCase('A'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('B'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('C'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('D'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('E'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('F'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('G'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('H'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('I'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('J'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('K'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('L'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('M'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('N'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('O'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('P'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Q'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('R'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('S'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('T'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('U'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('V'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('W'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('X'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Y'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Z'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту прописных букв.
	 */
	@Test
	public void testIsLetterUpperCaseBad()
	{
		assertFalse(ALPHABET_CASE.isLetterUpperCase('x'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCase()
	{
		assertTrue(ALPHABET_CASE.isLetterLowerCase('a'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('b'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('c'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('d'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('e'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('f'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('g'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('h'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('i'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('j'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('k'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('l'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('m'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('n'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('o'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('p'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('q'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('r'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('s'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('t'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('u'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('v'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('w'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('x'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('y'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('z'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCaseBad()
	{
		assertFalse(ALPHABET_CASE.isLetterLowerCase('Z'));
	}

}