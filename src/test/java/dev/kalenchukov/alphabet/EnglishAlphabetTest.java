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
		assertEquals(Optional.of('j'), Optional.ofNullable(ALPHABET.getLetter(20)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('L'));
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