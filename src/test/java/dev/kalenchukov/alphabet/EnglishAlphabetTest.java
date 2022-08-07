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

public class EnglishAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new EnglishAlphabet();

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

		assertArrayEquals(letters.toArray(), ALPHABET.getLetters().toArray());
	}

	/**
	 * Проверяет буквы алфавита в обратном порядке.
	 */
	@Test
	public void testGetLettersReverse()
	{
		List<Character> letters = List.of(
			'z', 'Z', 'y', 'Y', 'x', 'X', 'w', 'W', 'v', 'V',
			'u', 'U', 't', 'T', 's', 'S', 'r', 'R', 'q', 'Q', 'p', 'P',
			'o', 'O', 'n', 'N', 'm', 'M', 'l', 'L', 'k', 'K', 'j', 'J',
			'i', 'I', 'h', 'H', 'g', 'G', 'f', 'F', 'e', 'E', 'd', 'D',
			'c', 'C', 'b', 'B', 'a', 'A'
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
			'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e',
			'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j',
			'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o',
			'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
			'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y',
			'Z', 'z'
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

		assertArrayEquals(letters1.toArray(), ALPHABET.getLetters(1, 52).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.getLetters(1, 26).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.getLetters(1, 3).toArray());
		assertArrayEquals(letters4.toArray(), ALPHABET.getLetters(1, 1).toArray());
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
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionNotLetter()
	{
		assertNull(ALPHABET.getPosition('Ё'));
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPosition()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('A')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('a')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('B')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('b')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('C')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('c')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('D')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('d')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('E')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('e')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('F')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('f')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('G')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('g')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('H')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('h')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('I')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('i')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('J')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('j')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('K')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('k')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('L')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('l')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('M')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('m')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPosition('N')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPosition('n')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPosition('O')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('o')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPosition('P')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPosition('p')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET.getPosition('Q')));
		assertEquals(Optional.of(34), Optional.ofNullable(ALPHABET.getPosition('q')));
		assertEquals(Optional.of(35), Optional.ofNullable(ALPHABET.getPosition('R')));
		assertEquals(Optional.of(36), Optional.ofNullable(ALPHABET.getPosition('r')));
		assertEquals(Optional.of(37), Optional.ofNullable(ALPHABET.getPosition('S')));
		assertEquals(Optional.of(38), Optional.ofNullable(ALPHABET.getPosition('s')));
		assertEquals(Optional.of(39), Optional.ofNullable(ALPHABET.getPosition('T')));
		assertEquals(Optional.of(40), Optional.ofNullable(ALPHABET.getPosition('t')));
		assertEquals(Optional.of(41), Optional.ofNullable(ALPHABET.getPosition('U')));
		assertEquals(Optional.of(42), Optional.ofNullable(ALPHABET.getPosition('u')));
		assertEquals(Optional.of(43), Optional.ofNullable(ALPHABET.getPosition('V')));
		assertEquals(Optional.of(44), Optional.ofNullable(ALPHABET.getPosition('v')));
		assertEquals(Optional.of(45), Optional.ofNullable(ALPHABET.getPosition('W')));
		assertEquals(Optional.of(46), Optional.ofNullable(ALPHABET.getPosition('w')));
		assertEquals(Optional.of(47), Optional.ofNullable(ALPHABET.getPosition('X')));
		assertEquals(Optional.of(48), Optional.ofNullable(ALPHABET.getPosition('x')));
		assertEquals(Optional.of(49), Optional.ofNullable(ALPHABET.getPosition('Y')));
		assertEquals(Optional.of(50), Optional.ofNullable(ALPHABET.getPosition('y')));
		assertEquals(Optional.of(51), Optional.ofNullable(ALPHABET.getPosition('Z')));
		assertEquals(Optional.of(52), Optional.ofNullable(ALPHABET.getPosition('z')));
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
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('A'));
		assertTrue(ALPHABET.contains('B'));
		assertTrue(ALPHABET.contains('C'));
		assertTrue(ALPHABET.contains('D'));
		assertTrue(ALPHABET.contains('E'));
		assertTrue(ALPHABET.contains('F'));
		assertTrue(ALPHABET.contains('G'));
		assertTrue(ALPHABET.contains('H'));
		assertTrue(ALPHABET.contains('I'));
		assertTrue(ALPHABET.contains('J'));
		assertTrue(ALPHABET.contains('K'));
		assertTrue(ALPHABET.contains('L'));
		assertTrue(ALPHABET.contains('M'));
		assertTrue(ALPHABET.contains('N'));
		assertTrue(ALPHABET.contains('O'));
		assertTrue(ALPHABET.contains('P'));
		assertTrue(ALPHABET.contains('Q'));
		assertTrue(ALPHABET.contains('R'));
		assertTrue(ALPHABET.contains('S'));
		assertTrue(ALPHABET.contains('T'));
		assertTrue(ALPHABET.contains('U'));
		assertTrue(ALPHABET.contains('V'));
		assertTrue(ALPHABET.contains('W'));
		assertTrue(ALPHABET.contains('X'));
		assertTrue(ALPHABET.contains('Y'));
		assertTrue(ALPHABET.contains('Z'));
		assertTrue(ALPHABET.contains('a'));
		assertTrue(ALPHABET.contains('b'));
		assertTrue(ALPHABET.contains('c'));
		assertTrue(ALPHABET.contains('d'));
		assertTrue(ALPHABET.contains('e'));
		assertTrue(ALPHABET.contains('f'));
		assertTrue(ALPHABET.contains('g'));
		assertTrue(ALPHABET.contains('h'));
		assertTrue(ALPHABET.contains('i'));
		assertTrue(ALPHABET.contains('j'));
		assertTrue(ALPHABET.contains('k'));
		assertTrue(ALPHABET.contains('l'));
		assertTrue(ALPHABET.contains('m'));
		assertTrue(ALPHABET.contains('n'));
		assertTrue(ALPHABET.contains('o'));
		assertTrue(ALPHABET.contains('p'));
		assertTrue(ALPHABET.contains('q'));
		assertTrue(ALPHABET.contains('r'));
		assertTrue(ALPHABET.contains('s'));
		assertTrue(ALPHABET.contains('t'));
		assertTrue(ALPHABET.contains('u'));
		assertTrue(ALPHABET.contains('v'));
		assertTrue(ALPHABET.contains('w'));
		assertTrue(ALPHABET.contains('x'));
		assertTrue(ALPHABET.contains('y'));
		assertTrue(ALPHABET.contains('z'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('Ы'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e',
			'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j',
			'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o',
			'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
			'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y',
			'Z', 'z'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "A,a,B,b,C,c,D,d,E,e,F,f,G,g,H,h,I,i,J,j,K,k,L,l,M,m,N,n,O,o,P,p,Q,q,R,r,S,s,T,t,U,u,V,v,W,w,X,x,Y,y,Z,z";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";

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

		assertTrue(ALPHABET.equals(new EnglishAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new EnglishAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new BelarusianAlphabet().hashCode());
	}
}