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

public class RussianAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new RussianAlphabet();

	@NotNull
	public static final AlphabeticalCase ALPHABET_CASE = new RussianAlphabet();

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
		assertEquals(33, ALPHABET_CASE.getLettersUpperCase().length);
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersLowerCaseCount()
	{
		assertEquals(33, ALPHABET_CASE.getLettersLowerCase().length);
	}

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGetLetters()
	{
		Character[] letters = new Character[] {
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч',
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь',
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
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
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч',
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь',
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
		};

		Character[] letters2 = new Character[] {
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П'
		};

		Character[] letters3 = new Character[] {
			'А', 'а', 'Б'
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

		assertArrayEquals(lettersUpperCase, ALPHABET_CASE.getLettersUpperCase());
	}

	/**
	 * Проверяет получение среза прописных букв алфавита.
	 */
	@Test
	public void testGetLettersUpperCaseRange()
	{
		Character[] letters1 = new Character[] {
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
			'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'
		};

		Character[] letters2 = new Character[] {
			'А', 'Б', 'В'
		};

		Character[] letters3 = new Character[] {
			'А'
		};

		assertArrayEquals(letters1, ALPHABET_CASE.getLettersUpperCase(1, 33));
		assertArrayEquals(letters2, ALPHABET_CASE.getLettersUpperCase(1, 3));
		assertArrayEquals(letters3, ALPHABET_CASE.getLettersUpperCase(1, 1));
	}

	/**
	 * Проверяет получение среза прописных букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeUpperCaseOutOfBoundsMin()
	{
		ALPHABET_CASE.getLettersUpperCase(0, 33);
	}

	/**
	 * Проверяет получение среза прописных букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeUpperCaseOutOfBoundsMax()
	{
		ALPHABET_CASE.getLettersUpperCase(1, 34);
	}

	/**
	 * Проверяет получение среза прописных букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeUpperCaseInversion()
	{
		ALPHABET_CASE.getLettersUpperCase(30, 20);
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

		assertArrayEquals(lettersLowerCase, ALPHABET_CASE.getLettersLowerCase());
	}

	/**
	 * Проверяет получение среза строчных букв алфавита.
	 */
	@Test
	public void testGetLettersLowerCaseRange()
	{
		Character[] letters1 = new Character[] {
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
		};

		Character[] letters2 = new Character[] {
			'а', 'б', 'в'
		};

		Character[] letters3 = new Character[] {
			'а'
		};

		assertArrayEquals(letters1, ALPHABET_CASE.getLettersLowerCase(1, 33));
		assertArrayEquals(letters2, ALPHABET_CASE.getLettersLowerCase(1, 3));
		assertArrayEquals(letters3, ALPHABET_CASE.getLettersLowerCase(1, 1));
	}

	/**
	 * Проверяет получение среза строчных букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeLowerCaseOutOfBoundsMin()
	{
		ALPHABET_CASE.getLettersLowerCase(0, 33);
	}

	/**
	 * Проверяет получение среза строчных букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeLowerCaseOutOfBoundsMax()
	{
		ALPHABET_CASE.getLettersLowerCase(1, 34);
	}

	/**
	 * Проверяет получение среза строчных букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeLowerCaseInversion()
	{
		ALPHABET_CASE.getLettersLowerCase(30, 20);
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
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPositionLetter()
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
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('А'), Optional.ofNullable(ALPHABET.getLetter(1)));
		assertEquals(Optional.of('а'), Optional.ofNullable(ALPHABET.getLetter(2)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(ALPHABET.getLetter(3)));
		assertEquals(Optional.of('б'), Optional.ofNullable(ALPHABET.getLetter(4)));
		assertEquals(Optional.of('В'), Optional.ofNullable(ALPHABET.getLetter(5)));
		assertEquals(Optional.of('в'), Optional.ofNullable(ALPHABET.getLetter(6)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('г'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('д'), Optional.ofNullable(ALPHABET.getLetter(10)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(ALPHABET.getLetter(11)));
		assertEquals(Optional.of('е'), Optional.ofNullable(ALPHABET.getLetter(12)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(ALPHABET.getLetter(13)));
		assertEquals(Optional.of('ё'), Optional.ofNullable(ALPHABET.getLetter(14)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(ALPHABET.getLetter(15)));
		assertEquals(Optional.of('ж'), Optional.ofNullable(ALPHABET.getLetter(16)));
		assertEquals(Optional.of('З'), Optional.ofNullable(ALPHABET.getLetter(17)));
		assertEquals(Optional.of('з'), Optional.ofNullable(ALPHABET.getLetter(18)));
		assertEquals(Optional.of('И'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('и'), Optional.ofNullable(ALPHABET.getLetter(20)));
		assertEquals(Optional.of('Й'), Optional.ofNullable(ALPHABET.getLetter(21)));
		assertEquals(Optional.of('й'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('К'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('к'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('л'), Optional.ofNullable(ALPHABET.getLetter(26)));
		assertEquals(Optional.of('М'), Optional.ofNullable(ALPHABET.getLetter(27)));
		assertEquals(Optional.of('м'), Optional.ofNullable(ALPHABET.getLetter(28)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(ALPHABET.getLetter(29)));
		assertEquals(Optional.of('н'), Optional.ofNullable(ALPHABET.getLetter(30)));
		assertEquals(Optional.of('О'), Optional.ofNullable(ALPHABET.getLetter(31)));
		assertEquals(Optional.of('о'), Optional.ofNullable(ALPHABET.getLetter(32)));
		assertEquals(Optional.of('П'), Optional.ofNullable(ALPHABET.getLetter(33)));
		assertEquals(Optional.of('п'), Optional.ofNullable(ALPHABET.getLetter(34)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(ALPHABET.getLetter(35)));
		assertEquals(Optional.of('р'), Optional.ofNullable(ALPHABET.getLetter(36)));
		assertEquals(Optional.of('С'), Optional.ofNullable(ALPHABET.getLetter(37)));
		assertEquals(Optional.of('с'), Optional.ofNullable(ALPHABET.getLetter(38)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(ALPHABET.getLetter(39)));
		assertEquals(Optional.of('т'), Optional.ofNullable(ALPHABET.getLetter(40)));
		assertEquals(Optional.of('У'), Optional.ofNullable(ALPHABET.getLetter(41)));
		assertEquals(Optional.of('у'), Optional.ofNullable(ALPHABET.getLetter(42)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(ALPHABET.getLetter(43)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(ALPHABET.getLetter(44)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(ALPHABET.getLetter(45)));
		assertEquals(Optional.of('х'), Optional.ofNullable(ALPHABET.getLetter(46)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(ALPHABET.getLetter(47)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(ALPHABET.getLetter(48)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(ALPHABET.getLetter(49)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(ALPHABET.getLetter(50)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(ALPHABET.getLetter(51)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(ALPHABET.getLetter(52)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(ALPHABET.getLetter(53)));
		assertEquals(Optional.of('щ'), Optional.ofNullable(ALPHABET.getLetter(54)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(ALPHABET.getLetter(55)));
		assertEquals(Optional.of('ъ'), Optional.ofNullable(ALPHABET.getLetter(56)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(ALPHABET.getLetter(57)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(ALPHABET.getLetter(58)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(ALPHABET.getLetter(59)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(ALPHABET.getLetter(60)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(ALPHABET.getLetter(61)));
		assertEquals(Optional.of('э'), Optional.ofNullable(ALPHABET.getLetter(62)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(ALPHABET.getLetter(63)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(ALPHABET.getLetter(64)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(ALPHABET.getLetter(65)));
		assertEquals(Optional.of('я'), Optional.ofNullable(ALPHABET.getLetter(66)));
	}

	/**
	 * Проверяет прописную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterUpperCase()
	{
		assertEquals(Optional.of('А'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(1)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(2)));
		assertEquals(Optional.of('В'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(3)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(4)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(5)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(6)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(7)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(8)));
		assertEquals(Optional.of('З'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(9)));
		assertEquals(Optional.of('И'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(10)));
		assertEquals(Optional.of('Й'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(11)));
		assertEquals(Optional.of('К'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(12)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(13)));
		assertEquals(Optional.of('М'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(14)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(15)));
		assertEquals(Optional.of('О'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(16)));
		assertEquals(Optional.of('П'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(17)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(18)));
		assertEquals(Optional.of('С'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(19)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(20)));
		assertEquals(Optional.of('У'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(21)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(22)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(23)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(24)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(25)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(26)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(27)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(28)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(29)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(30)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(31)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(32)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(ALPHABET_CASE.getLetterUpperCase(33)));
	}

	/**
	 * Проверяет строчную букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetterLowerCase()
	{
		assertEquals(Optional.of('а'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(1)));
		assertEquals(Optional.of('б'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(2)));
		assertEquals(Optional.of('в'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(3)));
		assertEquals(Optional.of('г'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(4)));
		assertEquals(Optional.of('д'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(5)));
		assertEquals(Optional.of('е'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(6)));
		assertEquals(Optional.of('ё'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(7)));
		assertEquals(Optional.of('ж'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(8)));
		assertEquals(Optional.of('з'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(9)));
		assertEquals(Optional.of('и'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(10)));
		assertEquals(Optional.of('й'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(11)));
		assertEquals(Optional.of('к'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(12)));
		assertEquals(Optional.of('л'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(13)));
		assertEquals(Optional.of('м'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(14)));
		assertEquals(Optional.of('н'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(15)));
		assertEquals(Optional.of('о'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(16)));
		assertEquals(Optional.of('п'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(17)));
		assertEquals(Optional.of('р'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(18)));
		assertEquals(Optional.of('с'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(19)));
		assertEquals(Optional.of('т'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(20)));
		assertEquals(Optional.of('у'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(21)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(22)));
		assertEquals(Optional.of('х'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(23)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(24)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(25)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(26)));
		assertEquals(Optional.of('щ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(27)));
		assertEquals(Optional.of('ъ'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(28)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(29)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(30)));
		assertEquals(Optional.of('э'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(31)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(32)));
		assertEquals(Optional.of('я'), Optional.ofNullable(ALPHABET_CASE.getLetterLowerCase(33)));
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
		assertTrue(ALPHABET_CASE.isLetterUpperCase('А'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Б'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('В'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Г'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Д'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Е'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ё'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ж'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('З'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('И'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Й'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('К'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Л'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('М'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Н'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('О'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('П'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Р'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('С'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Т'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('У'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ф'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Х'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ц'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ч'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ш'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Щ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ъ'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ы'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ь'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Э'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Ю'));
		assertTrue(ALPHABET_CASE.isLetterUpperCase('Я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту прописных букв.
	 */
	@Test
	public void testIsLetterUpperCaseBad()
	{
		assertFalse(ALPHABET_CASE.isLetterUpperCase('ж'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCase()
	{
		assertTrue(ALPHABET_CASE.isLetterLowerCase('а'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('б'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('в'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('г'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('д'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('е'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ё'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ж'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('з'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('и'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('й'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('к'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('л'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('м'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('н'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('о'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('п'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('р'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('с'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('т'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('у'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ф'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('х'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ц'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ч'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ш'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('щ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ъ'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ы'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ь'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('э'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('ю'));
		assertTrue(ALPHABET_CASE.isLetterLowerCase('я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту строчных букв.
	 */
	@Test
	public void testIsLetterLowerCaseBad()
	{
		assertFalse(ALPHABET_CASE.isLetterLowerCase('Э'));
	}

}