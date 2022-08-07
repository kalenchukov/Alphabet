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

public class EnglishAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new EnglishAlphabet.LowerCase();

	/**
	 * Проверяет буквы в алфавите.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
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
			'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q',
			'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e',
			'd', 'c', 'b', 'a'
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
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
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
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('a')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('b')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('c')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('d')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('e')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('f')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('g')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('h')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('i')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('j')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('k')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('l')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('m')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('n')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('o')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('p')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('q')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('r')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('s')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('t')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('u')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('v')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('w')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('x')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('y')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('z')));
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
		assertEquals(Optional.of('s'), Optional.ofNullable(ALPHABET.getLetter(19)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('m'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('Z'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "abcdefghijklmnopqrstuvwxyz";

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

		assertTrue(ALPHABET.equals(new EnglishAlphabet.LowerCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new EnglishAlphabet.LowerCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new BelarusianAlphabet.LowerCase().hashCode());
	}
}