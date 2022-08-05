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

public class RussianAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new RussianAlphabet.UpperCase();

	/**
	 * Проверяет буквы в алфавите.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = ALPHABET.getLetters();

		assertEquals(Optional.of('А'), Optional.ofNullable(letters.get(0)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(letters.get(1)));
		assertEquals(Optional.of('В'), Optional.ofNullable(letters.get(2)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(letters.get(3)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(letters.get(4)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(letters.get(5)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(letters.get(6)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(letters.get(7)));
		assertEquals(Optional.of('З'), Optional.ofNullable(letters.get(8)));
		assertEquals(Optional.of('И'), Optional.ofNullable(letters.get(9)));
		assertEquals(Optional.of('Й'), Optional.ofNullable(letters.get(10)));
		assertEquals(Optional.of('К'), Optional.ofNullable(letters.get(11)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(letters.get(12)));
		assertEquals(Optional.of('М'), Optional.ofNullable(letters.get(13)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(letters.get(14)));
		assertEquals(Optional.of('О'), Optional.ofNullable(letters.get(15)));
		assertEquals(Optional.of('П'), Optional.ofNullable(letters.get(16)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(letters.get(17)));
		assertEquals(Optional.of('С'), Optional.ofNullable(letters.get(18)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(letters.get(19)));
		assertEquals(Optional.of('У'), Optional.ofNullable(letters.get(20)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(letters.get(21)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(letters.get(22)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(letters.get(23)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(letters.get(24)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(letters.get(25)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(letters.get(26)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(letters.get(27)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(letters.get(28)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(letters.get(29)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(letters.get(30)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(letters.get(31)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(letters.get(32)));
	}

	/**
	 * Проверяет буквы алфавита в обратном порядке.
	 */
	@Test
	public void testGetLettersReverse()
	{
		List<Character> letters = ALPHABET.getLettersReverse();

		assertEquals(Optional.of('А'), Optional.ofNullable(letters.get(32)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(letters.get(31)));
		assertEquals(Optional.of('В'), Optional.ofNullable(letters.get(30)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(letters.get(29)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(letters.get(28)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(letters.get(27)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(letters.get(26)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(letters.get(25)));
		assertEquals(Optional.of('З'), Optional.ofNullable(letters.get(24)));
		assertEquals(Optional.of('И'), Optional.ofNullable(letters.get(23)));
		assertEquals(Optional.of('Й'), Optional.ofNullable(letters.get(22)));
		assertEquals(Optional.of('К'), Optional.ofNullable(letters.get(21)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(letters.get(20)));
		assertEquals(Optional.of('М'), Optional.ofNullable(letters.get(19)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(letters.get(18)));
		assertEquals(Optional.of('О'), Optional.ofNullable(letters.get(17)));
		assertEquals(Optional.of('П'), Optional.ofNullable(letters.get(16)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(letters.get(15)));
		assertEquals(Optional.of('С'), Optional.ofNullable(letters.get(14)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(letters.get(13)));
		assertEquals(Optional.of('У'), Optional.ofNullable(letters.get(12)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(letters.get(11)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(letters.get(10)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(letters.get(9)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(letters.get(8)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(letters.get(7)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(letters.get(6)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(letters.get(5)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(letters.get(4)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(letters.get(3)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(letters.get(2)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(letters.get(1)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(letters.get(0)));
	}

	/**
	 * Проверяет получение букв алфавита в перемешанном порядке.
	 */
	@Test
	public void testGetLettersShuffle()
	{
		List<Character> letters = List.of(
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
			'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'
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
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
			'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'
		);

		List<Character> letters2 = List.of(
			'А', 'Б', 'В'
		);

		List<Character> letters3 = List.of(
			'А'
		);

		assertTrue(letters1.containsAll(ALPHABET.getLetters(1, 33)));
		assertTrue(letters2.containsAll(ALPHABET.getLetters(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET.getLetters(1, 1)));
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMin()
	{
		ALPHABET.getLetters(0, 33);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMax()
	{
		ALPHABET.getLetters(1, 34);
	}

	/**
	 * Проверяет получение среза букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeInversion()
	{
		ALPHABET.getLetters(30, 20);
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPosition()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('А')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('Б')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('В')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('Г')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('Д')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('Е')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('Ё')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('Ж')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('З')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('И')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('Й')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('К')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('Л')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('М')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('Н')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('О')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('П')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('Р')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('С')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('Т')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('У')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('Ф')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('Х')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('Ц')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('Ч')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('Ш')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPosition('Щ')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPosition('Ъ')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPosition('Ы')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('Ь')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPosition('Э')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPosition('Ю')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET.getPosition('Я')));
	}

	/**
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionBadLetter()
	{
		assertNull(ALPHABET.getPosition('W'));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('А'), Optional.ofNullable(ALPHABET.getLetter(1)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(ALPHABET.getLetter(2)));
		assertEquals(Optional.of('В'), Optional.ofNullable(ALPHABET.getLetter(3)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(ALPHABET.getLetter(4)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(ALPHABET.getLetter(5)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(ALPHABET.getLetter(6)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('З'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('И'), Optional.ofNullable(ALPHABET.getLetter(10)));
		assertEquals(Optional.of('Й'), Optional.ofNullable(ALPHABET.getLetter(11)));
		assertEquals(Optional.of('К'), Optional.ofNullable(ALPHABET.getLetter(12)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(ALPHABET.getLetter(13)));
		assertEquals(Optional.of('М'), Optional.ofNullable(ALPHABET.getLetter(14)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(ALPHABET.getLetter(15)));
		assertEquals(Optional.of('О'), Optional.ofNullable(ALPHABET.getLetter(16)));
		assertEquals(Optional.of('П'), Optional.ofNullable(ALPHABET.getLetter(17)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(ALPHABET.getLetter(18)));
		assertEquals(Optional.of('С'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(ALPHABET.getLetter(20)));
		assertEquals(Optional.of('У'), Optional.ofNullable(ALPHABET.getLetter(21)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(ALPHABET.getLetter(26)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(ALPHABET.getLetter(27)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(ALPHABET.getLetter(28)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(ALPHABET.getLetter(29)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(ALPHABET.getLetter(30)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(ALPHABET.getLetter(31)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(ALPHABET.getLetter(32)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(ALPHABET.getLetter(33)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testHasLetter()
	{
		assertTrue(ALPHABET.hasLetter('А'));
		assertTrue(ALPHABET.hasLetter('Б'));
		assertTrue(ALPHABET.hasLetter('В'));
		assertTrue(ALPHABET.hasLetter('Г'));
		assertTrue(ALPHABET.hasLetter('Д'));
		assertTrue(ALPHABET.hasLetter('Е'));
		assertTrue(ALPHABET.hasLetter('Ё'));
		assertTrue(ALPHABET.hasLetter('Ж'));
		assertTrue(ALPHABET.hasLetter('З'));
		assertTrue(ALPHABET.hasLetter('И'));
		assertTrue(ALPHABET.hasLetter('Й'));
		assertTrue(ALPHABET.hasLetter('К'));
		assertTrue(ALPHABET.hasLetter('Л'));
		assertTrue(ALPHABET.hasLetter('М'));
		assertTrue(ALPHABET.hasLetter('Н'));
		assertTrue(ALPHABET.hasLetter('О'));
		assertTrue(ALPHABET.hasLetter('П'));
		assertTrue(ALPHABET.hasLetter('Р'));
		assertTrue(ALPHABET.hasLetter('С'));
		assertTrue(ALPHABET.hasLetter('Т'));
		assertTrue(ALPHABET.hasLetter('У'));
		assertTrue(ALPHABET.hasLetter('Ф'));
		assertTrue(ALPHABET.hasLetter('Х'));
		assertTrue(ALPHABET.hasLetter('Ц'));
		assertTrue(ALPHABET.hasLetter('Ч'));
		assertTrue(ALPHABET.hasLetter('Ш'));
		assertTrue(ALPHABET.hasLetter('Щ'));
		assertTrue(ALPHABET.hasLetter('Ъ'));
		assertTrue(ALPHABET.hasLetter('Ы'));
		assertTrue(ALPHABET.hasLetter('Ь'));
		assertTrue(ALPHABET.hasLetter('Э'));
		assertTrue(ALPHABET.hasLetter('Ю'));
		assertTrue(ALPHABET.hasLetter('Я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testHasLetterBad()
	{
		assertFalse(ALPHABET.hasLetter('ж'));
	}
}