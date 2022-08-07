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
		List<Character> letters = List.of(
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
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
			'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q',
			'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E',
			'D', 'C', 'B', 'A'
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
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
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

		assertArrayEquals(letters1.toArray(), ALPHABET.getLetters(1, 26).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.getLetters(1, 3).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.getLetters(1, 1).toArray());
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
	public void testGetPositionNotLetter()
	{
		assertNull(ALPHABET.getPosition('Ё'));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('Z'), Optional.ofNullable(ALPHABET.getLetter(26)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('N'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('x'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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

		assertTrue(ALPHABET.equals(new EnglishAlphabet.UpperCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new EnglishAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new BelarusianAlphabet.UpperCase().hashCode());
	}
}