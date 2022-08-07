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
	public void testGet()
	{
		List<Character> letters = List.of(
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверяет буквы алфавита в обратном порядке.
	 */
	@Test
	public void testGetReverse()
	{
		List<Character> letters = List.of(
			'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q',
			'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e',
			'd', 'c', 'b', 'a'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.getReverse().toArray());
	}

	/**
	 * Проверяет получение букв алфавита в перемешанном порядке.
	 */
	@Test
	public void testGetShuffle()
	{
		List<Character> letters = List.of(
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		);

		assertFalse(Arrays.equals(letters.toArray(), ALPHABET.getShuffle().toArray()));
	}

	/**
	 * Проверяет получение среза букв алфавита.
	 */
	@Test
	public void testGetRange()
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

		assertArrayEquals(letters1.toArray(), ALPHABET.get(1, 26).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.get(1, 3).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.get(1, 1).toArray());
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetRangeOutOfBoundsMin()
	{
		ALPHABET.get(0, 26);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetRangeOutOfBoundsMax()
	{
		ALPHABET.get(1, 27);
	}

	/**
	 * Проверяет получение среза букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetRangeInversion()
	{
		ALPHABET.get(23, 20);
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPosition()
	{
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('q')));
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
	 * Проверяет получение букв в случайном порядке.
	 */
	@Test
	public void testGetRandom()
	{
		assertEquals(0, ALPHABET.getRandom(0).size());
		assertEquals(1, ALPHABET.getRandom(1).size());
		assertEquals(20, ALPHABET.getRandom(20).size());
		assertEquals(100, ALPHABET.getRandom(100).size());
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