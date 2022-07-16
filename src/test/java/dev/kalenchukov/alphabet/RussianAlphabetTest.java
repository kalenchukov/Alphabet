/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

public class RussianAlphabetTest
{
	@NotNull
	public static final AlphabeticalCase ALPHABET = new RussianAlphabet();

	/**
	 * Проверяет количество букв в алфавите.
	 */
	@Test
	public void testGetLettersCount()
	{
		assertEquals(66, ALPHABET.getLetters().length);
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersUpperCaseCount()
	{
		assertEquals(33, ALPHABET.getLettersUpperCase().length);
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersLowerCaseCount()
	{
		assertEquals(33, ALPHABET.getLettersLowerCase().length);
	}

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGetLetters()
	{
		Character[] letters = new Character[] {
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
			'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',

			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
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
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
			'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',

			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
		};

		Character[] letters2 = new Character[] {
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
			'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'
		};

		Character[] letters3 = new Character[] {
			'А', 'Б', 'В'
		};

		Character[] letters4 = new Character[] {
			'А'
		};

		assertArrayEquals(letters1, ALPHABET.getLetters(1, 66));
		assertArrayEquals(letters2, ALPHABET.getLetters(1, 33));
		assertArrayEquals(letters3, ALPHABET.getLetters(1, 3));
		assertArrayEquals(letters4, ALPHABET.getLetters(1, 1));
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
		ALPHABET.getLetters(1, 67);
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
		Character[] lettersUpperCase = new Character[] {
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
			'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'
		};

		assertArrayEquals(lettersUpperCase, ALPHABET.getLettersUpperCase());
	}

	/**
	 * Проверяет строчные буквы в алфавите.
	 */
	@Test
	public void testGetLettersLowerCase()
	{
		Character[] lettersLowerCase = new Character[] {
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
		};

		assertArrayEquals(lettersLowerCase, ALPHABET.getLettersLowerCase());
	}

	/**
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionLetterBadLetter()
	{
		assertNull(ALPHABET.getPositionLetter('W'));
	}

	/**
	 * Проверяет позиции прописных букв в алфавите.
	 */
	@Test
	public void testGetPositionLetterUpperCase()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPositionLetter('А')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPositionLetter('Б')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPositionLetter('В')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPositionLetter('Г')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPositionLetter('Д')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPositionLetter('Е')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPositionLetter('Ё')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPositionLetter('Ж')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPositionLetter('З')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPositionLetter('И')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPositionLetter('Й')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPositionLetter('К')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPositionLetter('Л')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPositionLetter('М')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPositionLetter('Н')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPositionLetter('О')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPositionLetter('П')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPositionLetter('Р')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPositionLetter('С')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPositionLetter('Т')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPositionLetter('У')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPositionLetter('Ф')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPositionLetter('Х')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPositionLetter('Ц')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPositionLetter('Ч')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPositionLetter('Ш')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPositionLetter('Щ')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPositionLetter('Ъ')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPositionLetter('Ы')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPositionLetter('Ь')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPositionLetter('Э')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPositionLetter('Ю')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET.getPositionLetter('Я')));
	}

	/**
	 * Проверяет позиции строчных букв в алфавите.
	 */
	@Test
	public void testGetPositionLetterLowerCase()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPositionLetter('а')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPositionLetter('б')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPositionLetter('в')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPositionLetter('г')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPositionLetter('д')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPositionLetter('е')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPositionLetter('ё')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPositionLetter('ж')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPositionLetter('з')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPositionLetter('и')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPositionLetter('й')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPositionLetter('к')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPositionLetter('л')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPositionLetter('м')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPositionLetter('н')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPositionLetter('о')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPositionLetter('п')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPositionLetter('р')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPositionLetter('с')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPositionLetter('т')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPositionLetter('у')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPositionLetter('ф')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPositionLetter('х')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPositionLetter('ц')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPositionLetter('ч')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPositionLetter('ш')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPositionLetter('щ')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPositionLetter('ъ')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPositionLetter('ы')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPositionLetter('ь')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPositionLetter('э')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPositionLetter('ю')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET.getPositionLetter('я')));
	}

	/**
	 * Проверяет прописную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterUpperCasePosition()
	{
		assertEquals(Optional.of('А'), Optional.ofNullable(ALPHABET.getLetterUpperCase(1)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(ALPHABET.getLetterUpperCase(2)));
		assertEquals(Optional.of('В'), Optional.ofNullable(ALPHABET.getLetterUpperCase(3)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(ALPHABET.getLetterUpperCase(4)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(ALPHABET.getLetterUpperCase(5)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(ALPHABET.getLetterUpperCase(6)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(ALPHABET.getLetterUpperCase(7)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(ALPHABET.getLetterUpperCase(8)));
		assertEquals(Optional.of('З'), Optional.ofNullable(ALPHABET.getLetterUpperCase(9)));
		assertEquals(Optional.of('И'), Optional.ofNullable(ALPHABET.getLetterUpperCase(10)));
		assertEquals(Optional.of('Й'), Optional.ofNullable(ALPHABET.getLetterUpperCase(11)));
		assertEquals(Optional.of('К'), Optional.ofNullable(ALPHABET.getLetterUpperCase(12)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(ALPHABET.getLetterUpperCase(13)));
		assertEquals(Optional.of('М'), Optional.ofNullable(ALPHABET.getLetterUpperCase(14)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(ALPHABET.getLetterUpperCase(15)));
		assertEquals(Optional.of('О'), Optional.ofNullable(ALPHABET.getLetterUpperCase(16)));
		assertEquals(Optional.of('П'), Optional.ofNullable(ALPHABET.getLetterUpperCase(17)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(ALPHABET.getLetterUpperCase(18)));
		assertEquals(Optional.of('С'), Optional.ofNullable(ALPHABET.getLetterUpperCase(19)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(ALPHABET.getLetterUpperCase(20)));
		assertEquals(Optional.of('У'), Optional.ofNullable(ALPHABET.getLetterUpperCase(21)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(ALPHABET.getLetterUpperCase(22)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(ALPHABET.getLetterUpperCase(23)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(ALPHABET.getLetterUpperCase(24)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(ALPHABET.getLetterUpperCase(25)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(ALPHABET.getLetterUpperCase(26)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(ALPHABET.getLetterUpperCase(27)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(ALPHABET.getLetterUpperCase(28)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(ALPHABET.getLetterUpperCase(29)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(ALPHABET.getLetterUpperCase(30)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(ALPHABET.getLetterUpperCase(31)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(ALPHABET.getLetterUpperCase(32)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(ALPHABET.getLetterUpperCase(33)));
	}

	/**
	 * Проверяет строчную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterLowerCasePosition()
	{
		assertEquals(Optional.of('а'), Optional.ofNullable(ALPHABET.getLetterLowerCase(1)));
		assertEquals(Optional.of('б'), Optional.ofNullable(ALPHABET.getLetterLowerCase(2)));
		assertEquals(Optional.of('в'), Optional.ofNullable(ALPHABET.getLetterLowerCase(3)));
		assertEquals(Optional.of('г'), Optional.ofNullable(ALPHABET.getLetterLowerCase(4)));
		assertEquals(Optional.of('д'), Optional.ofNullable(ALPHABET.getLetterLowerCase(5)));
		assertEquals(Optional.of('е'), Optional.ofNullable(ALPHABET.getLetterLowerCase(6)));
		assertEquals(Optional.of('ё'), Optional.ofNullable(ALPHABET.getLetterLowerCase(7)));
		assertEquals(Optional.of('ж'), Optional.ofNullable(ALPHABET.getLetterLowerCase(8)));
		assertEquals(Optional.of('з'), Optional.ofNullable(ALPHABET.getLetterLowerCase(9)));
		assertEquals(Optional.of('и'), Optional.ofNullable(ALPHABET.getLetterLowerCase(10)));
		assertEquals(Optional.of('й'), Optional.ofNullable(ALPHABET.getLetterLowerCase(11)));
		assertEquals(Optional.of('к'), Optional.ofNullable(ALPHABET.getLetterLowerCase(12)));
		assertEquals(Optional.of('л'), Optional.ofNullable(ALPHABET.getLetterLowerCase(13)));
		assertEquals(Optional.of('м'), Optional.ofNullable(ALPHABET.getLetterLowerCase(14)));
		assertEquals(Optional.of('н'), Optional.ofNullable(ALPHABET.getLetterLowerCase(15)));
		assertEquals(Optional.of('о'), Optional.ofNullable(ALPHABET.getLetterLowerCase(16)));
		assertEquals(Optional.of('п'), Optional.ofNullable(ALPHABET.getLetterLowerCase(17)));
		assertEquals(Optional.of('р'), Optional.ofNullable(ALPHABET.getLetterLowerCase(18)));
		assertEquals(Optional.of('с'), Optional.ofNullable(ALPHABET.getLetterLowerCase(19)));
		assertEquals(Optional.of('т'), Optional.ofNullable(ALPHABET.getLetterLowerCase(20)));
		assertEquals(Optional.of('у'), Optional.ofNullable(ALPHABET.getLetterLowerCase(21)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(ALPHABET.getLetterLowerCase(22)));
		assertEquals(Optional.of('х'), Optional.ofNullable(ALPHABET.getLetterLowerCase(23)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(ALPHABET.getLetterLowerCase(24)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(ALPHABET.getLetterLowerCase(25)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(ALPHABET.getLetterLowerCase(26)));
		assertEquals(Optional.of('щ'), Optional.ofNullable(ALPHABET.getLetterLowerCase(27)));
		assertEquals(Optional.of('ъ'), Optional.ofNullable(ALPHABET.getLetterLowerCase(28)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(ALPHABET.getLetterLowerCase(29)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(ALPHABET.getLetterLowerCase(30)));
		assertEquals(Optional.of('э'), Optional.ofNullable(ALPHABET.getLetterLowerCase(31)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(ALPHABET.getLetterLowerCase(32)));
		assertEquals(Optional.of('я'), Optional.ofNullable(ALPHABET.getLetterLowerCase(33)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testIsLetter()
	{
		assertTrue(ALPHABET.isLetter('А'));
		assertTrue(ALPHABET.isLetter('Б'));
		assertTrue(ALPHABET.isLetter('В'));
		assertTrue(ALPHABET.isLetter('Г'));
		assertTrue(ALPHABET.isLetter('Д'));
		assertTrue(ALPHABET.isLetter('Е'));
		assertTrue(ALPHABET.isLetter('Ё'));
		assertTrue(ALPHABET.isLetter('Ж'));
		assertTrue(ALPHABET.isLetter('З'));
		assertTrue(ALPHABET.isLetter('И'));
		assertTrue(ALPHABET.isLetter('Й'));
		assertTrue(ALPHABET.isLetter('К'));
		assertTrue(ALPHABET.isLetter('Л'));
		assertTrue(ALPHABET.isLetter('М'));
		assertTrue(ALPHABET.isLetter('Н'));
		assertTrue(ALPHABET.isLetter('О'));
		assertTrue(ALPHABET.isLetter('П'));
		assertTrue(ALPHABET.isLetter('Р'));
		assertTrue(ALPHABET.isLetter('С'));
		assertTrue(ALPHABET.isLetter('Т'));
		assertTrue(ALPHABET.isLetter('У'));
		assertTrue(ALPHABET.isLetter('Ф'));
		assertTrue(ALPHABET.isLetter('Х'));
		assertTrue(ALPHABET.isLetter('Ц'));
		assertTrue(ALPHABET.isLetter('Ч'));
		assertTrue(ALPHABET.isLetter('Ш'));
		assertTrue(ALPHABET.isLetter('Щ'));
		assertTrue(ALPHABET.isLetter('Ъ'));
		assertTrue(ALPHABET.isLetter('Ы'));
		assertTrue(ALPHABET.isLetter('Ь'));
		assertTrue(ALPHABET.isLetter('Э'));
		assertTrue(ALPHABET.isLetter('Ю'));
		assertTrue(ALPHABET.isLetter('Я'));
		assertTrue(ALPHABET.isLetter('а'));
		assertTrue(ALPHABET.isLetter('б'));
		assertTrue(ALPHABET.isLetter('в'));
		assertTrue(ALPHABET.isLetter('г'));
		assertTrue(ALPHABET.isLetter('д'));
		assertTrue(ALPHABET.isLetter('е'));
		assertTrue(ALPHABET.isLetter('ё'));
		assertTrue(ALPHABET.isLetter('ж'));
		assertTrue(ALPHABET.isLetter('з'));
		assertTrue(ALPHABET.isLetter('и'));
		assertTrue(ALPHABET.isLetter('й'));
		assertTrue(ALPHABET.isLetter('к'));
		assertTrue(ALPHABET.isLetter('л'));
		assertTrue(ALPHABET.isLetter('м'));
		assertTrue(ALPHABET.isLetter('н'));
		assertTrue(ALPHABET.isLetter('о'));
		assertTrue(ALPHABET.isLetter('п'));
		assertTrue(ALPHABET.isLetter('р'));
		assertTrue(ALPHABET.isLetter('с'));
		assertTrue(ALPHABET.isLetter('т'));
		assertTrue(ALPHABET.isLetter('у'));
		assertTrue(ALPHABET.isLetter('ф'));
		assertTrue(ALPHABET.isLetter('х'));
		assertTrue(ALPHABET.isLetter('ц'));
		assertTrue(ALPHABET.isLetter('ч'));
		assertTrue(ALPHABET.isLetter('ш'));
		assertTrue(ALPHABET.isLetter('щ'));
		assertTrue(ALPHABET.isLetter('ъ'));
		assertTrue(ALPHABET.isLetter('ы'));
		assertTrue(ALPHABET.isLetter('ь'));
		assertTrue(ALPHABET.isLetter('э'));
		assertTrue(ALPHABET.isLetter('ю'));
		assertTrue(ALPHABET.isLetter('я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testIsLetterBad()
	{
		assertFalse(ALPHABET.isLetter('W'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту прописных букв.
	 */
	@Test
	public void testIsLetterUpperCase()
	{
		assertTrue(ALPHABET.isLetterUpperCase('А'));
		assertTrue(ALPHABET.isLetterUpperCase('Б'));
		assertTrue(ALPHABET.isLetterUpperCase('В'));
		assertTrue(ALPHABET.isLetterUpperCase('Г'));
		assertTrue(ALPHABET.isLetterUpperCase('Д'));
		assertTrue(ALPHABET.isLetterUpperCase('Е'));
		assertTrue(ALPHABET.isLetterUpperCase('Ё'));
		assertTrue(ALPHABET.isLetterUpperCase('Ж'));
		assertTrue(ALPHABET.isLetterUpperCase('З'));
		assertTrue(ALPHABET.isLetterUpperCase('И'));
		assertTrue(ALPHABET.isLetterUpperCase('Й'));
		assertTrue(ALPHABET.isLetterUpperCase('К'));
		assertTrue(ALPHABET.isLetterUpperCase('Л'));
		assertTrue(ALPHABET.isLetterUpperCase('М'));
		assertTrue(ALPHABET.isLetterUpperCase('Н'));
		assertTrue(ALPHABET.isLetterUpperCase('О'));
		assertTrue(ALPHABET.isLetterUpperCase('П'));
		assertTrue(ALPHABET.isLetterUpperCase('Р'));
		assertTrue(ALPHABET.isLetterUpperCase('С'));
		assertTrue(ALPHABET.isLetterUpperCase('Т'));
		assertTrue(ALPHABET.isLetterUpperCase('У'));
		assertTrue(ALPHABET.isLetterUpperCase('Ф'));
		assertTrue(ALPHABET.isLetterUpperCase('Х'));
		assertTrue(ALPHABET.isLetterUpperCase('Ц'));
		assertTrue(ALPHABET.isLetterUpperCase('Ч'));
		assertTrue(ALPHABET.isLetterUpperCase('Ш'));
		assertTrue(ALPHABET.isLetterUpperCase('Щ'));
		assertTrue(ALPHABET.isLetterUpperCase('Ъ'));
		assertTrue(ALPHABET.isLetterUpperCase('Ы'));
		assertTrue(ALPHABET.isLetterUpperCase('Ь'));
		assertTrue(ALPHABET.isLetterUpperCase('Э'));
		assertTrue(ALPHABET.isLetterUpperCase('Ю'));
		assertTrue(ALPHABET.isLetterUpperCase('Я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту прописных букв.
	 */
	@Test
	public void testIsLetterUpperCaseBad()
	{
		assertFalse(ALPHABET.isLetterUpperCase('ж'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCase()
	{
		assertTrue(ALPHABET.isLetterLowerCase('а'));
		assertTrue(ALPHABET.isLetterLowerCase('б'));
		assertTrue(ALPHABET.isLetterLowerCase('в'));
		assertTrue(ALPHABET.isLetterLowerCase('г'));
		assertTrue(ALPHABET.isLetterLowerCase('д'));
		assertTrue(ALPHABET.isLetterLowerCase('е'));
		assertTrue(ALPHABET.isLetterLowerCase('ё'));
		assertTrue(ALPHABET.isLetterLowerCase('ж'));
		assertTrue(ALPHABET.isLetterLowerCase('з'));
		assertTrue(ALPHABET.isLetterLowerCase('и'));
		assertTrue(ALPHABET.isLetterLowerCase('й'));
		assertTrue(ALPHABET.isLetterLowerCase('к'));
		assertTrue(ALPHABET.isLetterLowerCase('л'));
		assertTrue(ALPHABET.isLetterLowerCase('м'));
		assertTrue(ALPHABET.isLetterLowerCase('н'));
		assertTrue(ALPHABET.isLetterLowerCase('о'));
		assertTrue(ALPHABET.isLetterLowerCase('п'));
		assertTrue(ALPHABET.isLetterLowerCase('р'));
		assertTrue(ALPHABET.isLetterLowerCase('с'));
		assertTrue(ALPHABET.isLetterLowerCase('т'));
		assertTrue(ALPHABET.isLetterLowerCase('у'));
		assertTrue(ALPHABET.isLetterLowerCase('ф'));
		assertTrue(ALPHABET.isLetterLowerCase('х'));
		assertTrue(ALPHABET.isLetterLowerCase('ц'));
		assertTrue(ALPHABET.isLetterLowerCase('ч'));
		assertTrue(ALPHABET.isLetterLowerCase('ш'));
		assertTrue(ALPHABET.isLetterLowerCase('щ'));
		assertTrue(ALPHABET.isLetterLowerCase('ъ'));
		assertTrue(ALPHABET.isLetterLowerCase('ы'));
		assertTrue(ALPHABET.isLetterLowerCase('ь'));
		assertTrue(ALPHABET.isLetterLowerCase('э'));
		assertTrue(ALPHABET.isLetterLowerCase('ю'));
		assertTrue(ALPHABET.isLetterLowerCase('я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCaseBad()
	{
		assertFalse(ALPHABET.isLetterLowerCase('Э'));
	}

}