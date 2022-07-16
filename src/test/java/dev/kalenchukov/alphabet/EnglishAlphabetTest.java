/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class EnglishAlphabetTest
{
	@NotNull
	public static final AlphabeticalCase ALPHABET = new EnglishAlphabet();

	/**
	 * Проверяет количество букв в алфавите.
	 */
	@Test
	public void testGetLettersCount()
	{
		assertEquals(52, ALPHABET.getLetters().length);
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersUpperCaseCount()
	{
		assertEquals(26, ALPHABET.getLettersUpperCase().length);
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersLowerCaseCount()
	{
		assertEquals(26, ALPHABET.getLettersLowerCase().length);
	}

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGetLetters()
	{
		Character[] letters = new Character[] {
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',

			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};

		assertArrayEquals(letters, ALPHABET.getLetters());
	}

	/**
	 * Проверяет получение среза букв алфавита.
	 */
	@Test
	public void testGetLettersRange()
	{
		Character[] letters1 = new Character[] {
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',

			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};

		Character[] letters2 = new Character[] {
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
		};

		Character[] letters3 = new Character[] {
			'A', 'B', 'C'
		};

		Character[] letters4 = new Character[] {
			'A'
		};

		assertArrayEquals(letters1, ALPHABET.getLetters(1, 52));
		assertArrayEquals(letters2, ALPHABET.getLetters(1, 26));
		assertArrayEquals(letters3, ALPHABET.getLetters(1, 3));
		assertArrayEquals(letters4, ALPHABET.getLetters(1, 1));
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
		Character[] lettersUpperCase = new Character[] {
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
		};

		assertArrayEquals(lettersUpperCase, ALPHABET.getLettersUpperCase());
	}

	/**
	 * Проверяет получение среза прописных букв алфавита.
	 */
	@Test
	public void testGetLettersUpperCaseRange()
	{
		Character[] letters1 = new Character[] {
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
		};

		Character[] letters2 = new Character[] {
			'A', 'B', 'C'
		};

		Character[] letters3 = new Character[] {
			'A'
		};

		assertArrayEquals(letters1, ALPHABET.getLettersUpperCase(1, 26));
		assertArrayEquals(letters2, ALPHABET.getLettersUpperCase(1, 3));
		assertArrayEquals(letters3, ALPHABET.getLettersUpperCase(1, 1));
	}

	/**
	 * Проверяет получение среза прописных букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeUpperCaseOutOfBoundsMin()
	{
		ALPHABET.getLettersUpperCase(0, 26);
	}

	/**
	 * Проверяет получение среза прописных букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeUpperCaseOutOfBoundsMax()
	{
		ALPHABET.getLettersUpperCase(1, 27);
	}

	/**
	 * Проверяет получение среза прописных букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeUpperCaseInversion()
	{
		ALPHABET.getLettersUpperCase(23, 20);
	}

	/**
	 * Проверяет строчные буквы в алфавите.
	 */
	@Test
	public void testGetLettersLowerCase()
	{
		Character[] lettersLowerCase = new Character[] {
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};

		assertArrayEquals(lettersLowerCase, ALPHABET.getLettersLowerCase());
	}

	/**
	 * Проверяет получение среза строчных букв алфавита.
	 */
	@Test
	public void testGetLettersLowerCaseRange()
	{
		Character[] letters1 = new Character[] {
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};

		Character[] letters2 = new Character[] {
			'a', 'b', 'c'
		};

		Character[] letters3 = new Character[] {
			'a'
		};

		assertArrayEquals(letters1, ALPHABET.getLettersLowerCase(1, 26));
		assertArrayEquals(letters2, ALPHABET.getLettersLowerCase(1, 3));
		assertArrayEquals(letters3, ALPHABET.getLettersLowerCase(1, 1));
	}

	/**
	 * Проверяет получение среза строчных букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeLowerCaseOutOfBoundsMin()
	{
		ALPHABET.getLettersLowerCase(0, 26);
	}

	/**
	 * Проверяет получение среза строчных букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeLowerCaseOutOfBoundsMax()
	{
		ALPHABET.getLettersLowerCase(1, 27);
	}

	/**
	 * Проверяет получение среза строчных букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeLowerCaseInversion()
	{
		ALPHABET.getLettersLowerCase(23, 20);
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
	 * Проверяет позиции прописных букв в алфавите.
	 */
	@Test
	public void testGetPositionLetterUpperCase()
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
	}

	/**
	 * Проверяет позиции строчных букв в алфавите.
	 */
	@Test
	public void testGetPositionLetterLowerCase()
	{
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
	 * Проверяет прописную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterUpperCasePosition()
	{
		assertEquals(Optional.of('A'), Optional.ofNullable(ALPHABET.getLetterUpperCase(1)));
		assertEquals(Optional.of('B'), Optional.ofNullable(ALPHABET.getLetterUpperCase(2)));
		assertEquals(Optional.of('C'), Optional.ofNullable(ALPHABET.getLetterUpperCase(3)));
		assertEquals(Optional.of('D'), Optional.ofNullable(ALPHABET.getLetterUpperCase(4)));
		assertEquals(Optional.of('E'), Optional.ofNullable(ALPHABET.getLetterUpperCase(5)));
		assertEquals(Optional.of('F'), Optional.ofNullable(ALPHABET.getLetterUpperCase(6)));
		assertEquals(Optional.of('G'), Optional.ofNullable(ALPHABET.getLetterUpperCase(7)));
		assertEquals(Optional.of('H'), Optional.ofNullable(ALPHABET.getLetterUpperCase(8)));
		assertEquals(Optional.of('I'), Optional.ofNullable(ALPHABET.getLetterUpperCase(9)));
		assertEquals(Optional.of('J'), Optional.ofNullable(ALPHABET.getLetterUpperCase(10)));
		assertEquals(Optional.of('K'), Optional.ofNullable(ALPHABET.getLetterUpperCase(11)));
		assertEquals(Optional.of('L'), Optional.ofNullable(ALPHABET.getLetterUpperCase(12)));
		assertEquals(Optional.of('M'), Optional.ofNullable(ALPHABET.getLetterUpperCase(13)));
		assertEquals(Optional.of('N'), Optional.ofNullable(ALPHABET.getLetterUpperCase(14)));
		assertEquals(Optional.of('O'), Optional.ofNullable(ALPHABET.getLetterUpperCase(15)));
		assertEquals(Optional.of('P'), Optional.ofNullable(ALPHABET.getLetterUpperCase(16)));
		assertEquals(Optional.of('Q'), Optional.ofNullable(ALPHABET.getLetterUpperCase(17)));
		assertEquals(Optional.of('R'), Optional.ofNullable(ALPHABET.getLetterUpperCase(18)));
		assertEquals(Optional.of('S'), Optional.ofNullable(ALPHABET.getLetterUpperCase(19)));
		assertEquals(Optional.of('T'), Optional.ofNullable(ALPHABET.getLetterUpperCase(20)));
		assertEquals(Optional.of('U'), Optional.ofNullable(ALPHABET.getLetterUpperCase(21)));
		assertEquals(Optional.of('V'), Optional.ofNullable(ALPHABET.getLetterUpperCase(22)));
		assertEquals(Optional.of('W'), Optional.ofNullable(ALPHABET.getLetterUpperCase(23)));
		assertEquals(Optional.of('X'), Optional.ofNullable(ALPHABET.getLetterUpperCase(24)));
		assertEquals(Optional.of('Y'), Optional.ofNullable(ALPHABET.getLetterUpperCase(25)));
		assertEquals(Optional.of('Z'), Optional.ofNullable(ALPHABET.getLetterUpperCase(26)));
	}

	/**
	 * Проверяет строчную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterLowerCasePosition()
	{
		assertEquals(Optional.of('a'), Optional.ofNullable(ALPHABET.getLetterLowerCase(1)));
		assertEquals(Optional.of('b'), Optional.ofNullable(ALPHABET.getLetterLowerCase(2)));
		assertEquals(Optional.of('c'), Optional.ofNullable(ALPHABET.getLetterLowerCase(3)));
		assertEquals(Optional.of('d'), Optional.ofNullable(ALPHABET.getLetterLowerCase(4)));
		assertEquals(Optional.of('e'), Optional.ofNullable(ALPHABET.getLetterLowerCase(5)));
		assertEquals(Optional.of('f'), Optional.ofNullable(ALPHABET.getLetterLowerCase(6)));
		assertEquals(Optional.of('g'), Optional.ofNullable(ALPHABET.getLetterLowerCase(7)));
		assertEquals(Optional.of('h'), Optional.ofNullable(ALPHABET.getLetterLowerCase(8)));
		assertEquals(Optional.of('i'), Optional.ofNullable(ALPHABET.getLetterLowerCase(9)));
		assertEquals(Optional.of('j'), Optional.ofNullable(ALPHABET.getLetterLowerCase(10)));
		assertEquals(Optional.of('k'), Optional.ofNullable(ALPHABET.getLetterLowerCase(11)));
		assertEquals(Optional.of('l'), Optional.ofNullable(ALPHABET.getLetterLowerCase(12)));
		assertEquals(Optional.of('m'), Optional.ofNullable(ALPHABET.getLetterLowerCase(13)));
		assertEquals(Optional.of('n'), Optional.ofNullable(ALPHABET.getLetterLowerCase(14)));
		assertEquals(Optional.of('o'), Optional.ofNullable(ALPHABET.getLetterLowerCase(15)));
		assertEquals(Optional.of('p'), Optional.ofNullable(ALPHABET.getLetterLowerCase(16)));
		assertEquals(Optional.of('q'), Optional.ofNullable(ALPHABET.getLetterLowerCase(17)));
		assertEquals(Optional.of('r'), Optional.ofNullable(ALPHABET.getLetterLowerCase(18)));
		assertEquals(Optional.of('s'), Optional.ofNullable(ALPHABET.getLetterLowerCase(19)));
		assertEquals(Optional.of('t'), Optional.ofNullable(ALPHABET.getLetterLowerCase(20)));
		assertEquals(Optional.of('u'), Optional.ofNullable(ALPHABET.getLetterLowerCase(21)));
		assertEquals(Optional.of('v'), Optional.ofNullable(ALPHABET.getLetterLowerCase(22)));
		assertEquals(Optional.of('w'), Optional.ofNullable(ALPHABET.getLetterLowerCase(23)));
		assertEquals(Optional.of('x'), Optional.ofNullable(ALPHABET.getLetterLowerCase(24)));
		assertEquals(Optional.of('y'), Optional.ofNullable(ALPHABET.getLetterLowerCase(25)));
		assertEquals(Optional.of('z'), Optional.ofNullable(ALPHABET.getLetterLowerCase(26)));
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
		assertTrue(ALPHABET.isLetterUpperCase('A'));
		assertTrue(ALPHABET.isLetterUpperCase('B'));
		assertTrue(ALPHABET.isLetterUpperCase('C'));
		assertTrue(ALPHABET.isLetterUpperCase('D'));
		assertTrue(ALPHABET.isLetterUpperCase('E'));
		assertTrue(ALPHABET.isLetterUpperCase('F'));
		assertTrue(ALPHABET.isLetterUpperCase('G'));
		assertTrue(ALPHABET.isLetterUpperCase('H'));
		assertTrue(ALPHABET.isLetterUpperCase('I'));
		assertTrue(ALPHABET.isLetterUpperCase('J'));
		assertTrue(ALPHABET.isLetterUpperCase('K'));
		assertTrue(ALPHABET.isLetterUpperCase('L'));
		assertTrue(ALPHABET.isLetterUpperCase('M'));
		assertTrue(ALPHABET.isLetterUpperCase('N'));
		assertTrue(ALPHABET.isLetterUpperCase('O'));
		assertTrue(ALPHABET.isLetterUpperCase('P'));
		assertTrue(ALPHABET.isLetterUpperCase('Q'));
		assertTrue(ALPHABET.isLetterUpperCase('R'));
		assertTrue(ALPHABET.isLetterUpperCase('S'));
		assertTrue(ALPHABET.isLetterUpperCase('T'));
		assertTrue(ALPHABET.isLetterUpperCase('U'));
		assertTrue(ALPHABET.isLetterUpperCase('V'));
		assertTrue(ALPHABET.isLetterUpperCase('W'));
		assertTrue(ALPHABET.isLetterUpperCase('X'));
		assertTrue(ALPHABET.isLetterUpperCase('Y'));
		assertTrue(ALPHABET.isLetterUpperCase('Z'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту прописных букв.
	 */
	@Test
	public void testIsLetterUpperCaseBad()
	{
		assertFalse(ALPHABET.isLetterUpperCase('x'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCase()
	{
		assertTrue(ALPHABET.isLetterLowerCase('a'));
		assertTrue(ALPHABET.isLetterLowerCase('b'));
		assertTrue(ALPHABET.isLetterLowerCase('c'));
		assertTrue(ALPHABET.isLetterLowerCase('d'));
		assertTrue(ALPHABET.isLetterLowerCase('e'));
		assertTrue(ALPHABET.isLetterLowerCase('f'));
		assertTrue(ALPHABET.isLetterLowerCase('g'));
		assertTrue(ALPHABET.isLetterLowerCase('h'));
		assertTrue(ALPHABET.isLetterLowerCase('i'));
		assertTrue(ALPHABET.isLetterLowerCase('j'));
		assertTrue(ALPHABET.isLetterLowerCase('k'));
		assertTrue(ALPHABET.isLetterLowerCase('l'));
		assertTrue(ALPHABET.isLetterLowerCase('m'));
		assertTrue(ALPHABET.isLetterLowerCase('n'));
		assertTrue(ALPHABET.isLetterLowerCase('o'));
		assertTrue(ALPHABET.isLetterLowerCase('p'));
		assertTrue(ALPHABET.isLetterLowerCase('q'));
		assertTrue(ALPHABET.isLetterLowerCase('r'));
		assertTrue(ALPHABET.isLetterLowerCase('s'));
		assertTrue(ALPHABET.isLetterLowerCase('t'));
		assertTrue(ALPHABET.isLetterLowerCase('u'));
		assertTrue(ALPHABET.isLetterLowerCase('v'));
		assertTrue(ALPHABET.isLetterLowerCase('w'));
		assertTrue(ALPHABET.isLetterLowerCase('x'));
		assertTrue(ALPHABET.isLetterLowerCase('y'));
		assertTrue(ALPHABET.isLetterLowerCase('z'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCaseBad()
	{
		assertFalse(ALPHABET.isLetterLowerCase('Z'));
	}

}