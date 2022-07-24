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
		assertEquals(66, ALPHABET.getLetters().size());
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersUpperCaseCount()
	{
		assertEquals(33, ALPHABET_CASE.getLettersUpperCase().size());
	}

	/**
	 * Проверяет количество прописных букв в алфавите.
	 */
	@Test
	public void testGetLettersLowerCaseCount()
	{
		assertEquals(33, ALPHABET_CASE.getLettersLowerCase().size());
	}

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч',
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь',
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
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
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч',
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь',
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
		);

		List<Character> letters2 = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П'
		);

		List<Character> letters3 = List.of(
			'А', 'а', 'Б'
		);

		List<Character> letters4 = List.of(
			'А'
		);

		assertTrue(letters1.containsAll(ALPHABET.getLetters(1, 66)));
		assertTrue(letters2.containsAll(ALPHABET.getLetters(1, 33)));
		assertTrue(letters3.containsAll(ALPHABET.getLetters(1, 3)));
		assertTrue(letters4.containsAll(ALPHABET.getLetters(1, 1)));
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
		List<Character> lettersUpperCase = List.of(
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
			'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'
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

		assertTrue(letters1.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 33)));
		assertTrue(letters2.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET_CASE.getLettersUpperCase(1, 1)));
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
		List<Character> lettersLowerCase = List.of(
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
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
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
		);

		List<Character> letters2 = List.of(
			'а', 'б', 'в'
		);

		List<Character> letters3 = List.of(
			'а'
		);

		assertTrue(letters1.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 33)));
		assertTrue(letters2.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET_CASE.getLettersLowerCase(1, 1)));
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
	public void testGetPositionBadLetter()
	{
		assertNull(ALPHABET.getPosition('W'));
	}

	/**
	 * Проверяет позиции букв в алфавите.
	 */
	@Test
	public void testGetPosition()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('А')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('а')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('Б')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('б')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('В')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('в')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('Г')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('г')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('Д')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('д')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('Е')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('е')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('Ё')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('ё')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('Ж')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('ж')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('З')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('з')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('И')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('и')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('Й')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('й')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('К')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('к')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('Л')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('л')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPosition('М')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPosition('м')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPosition('Н')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('н')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPosition('О')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPosition('о')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET.getPosition('П')));
		assertEquals(Optional.of(34), Optional.ofNullable(ALPHABET.getPosition('п')));
		assertEquals(Optional.of(35), Optional.ofNullable(ALPHABET.getPosition('Р')));
		assertEquals(Optional.of(36), Optional.ofNullable(ALPHABET.getPosition('р')));
		assertEquals(Optional.of(37), Optional.ofNullable(ALPHABET.getPosition('С')));
		assertEquals(Optional.of(38), Optional.ofNullable(ALPHABET.getPosition('с')));
		assertEquals(Optional.of(39), Optional.ofNullable(ALPHABET.getPosition('Т')));
		assertEquals(Optional.of(40), Optional.ofNullable(ALPHABET.getPosition('т')));
		assertEquals(Optional.of(41), Optional.ofNullable(ALPHABET.getPosition('У')));
		assertEquals(Optional.of(42), Optional.ofNullable(ALPHABET.getPosition('у')));
		assertEquals(Optional.of(43), Optional.ofNullable(ALPHABET.getPosition('Ф')));
		assertEquals(Optional.of(44), Optional.ofNullable(ALPHABET.getPosition('ф')));
		assertEquals(Optional.of(45), Optional.ofNullable(ALPHABET.getPosition('Х')));
		assertEquals(Optional.of(46), Optional.ofNullable(ALPHABET.getPosition('х')));
		assertEquals(Optional.of(47), Optional.ofNullable(ALPHABET.getPosition('Ц')));
		assertEquals(Optional.of(48), Optional.ofNullable(ALPHABET.getPosition('ц')));
		assertEquals(Optional.of(49), Optional.ofNullable(ALPHABET.getPosition('Ч')));
		assertEquals(Optional.of(50), Optional.ofNullable(ALPHABET.getPosition('ч')));
		assertEquals(Optional.of(51), Optional.ofNullable(ALPHABET.getPosition('Ш')));
		assertEquals(Optional.of(52), Optional.ofNullable(ALPHABET.getPosition('ш')));
		assertEquals(Optional.of(53), Optional.ofNullable(ALPHABET.getPosition('Щ')));
		assertEquals(Optional.of(54), Optional.ofNullable(ALPHABET.getPosition('щ')));
		assertEquals(Optional.of(55), Optional.ofNullable(ALPHABET.getPosition('Ъ')));
		assertEquals(Optional.of(56), Optional.ofNullable(ALPHABET.getPosition('ъ')));
		assertEquals(Optional.of(57), Optional.ofNullable(ALPHABET.getPosition('Ы')));
		assertEquals(Optional.of(58), Optional.ofNullable(ALPHABET.getPosition('ы')));
		assertEquals(Optional.of(59), Optional.ofNullable(ALPHABET.getPosition('Ь')));
		assertEquals(Optional.of(60), Optional.ofNullable(ALPHABET.getPosition('ь')));
		assertEquals(Optional.of(61), Optional.ofNullable(ALPHABET.getPosition('Э')));
		assertEquals(Optional.of(62), Optional.ofNullable(ALPHABET.getPosition('э')));
		assertEquals(Optional.of(63), Optional.ofNullable(ALPHABET.getPosition('Ю')));
		assertEquals(Optional.of(64), Optional.ofNullable(ALPHABET.getPosition('ю')));
		assertEquals(Optional.of(65), Optional.ofNullable(ALPHABET.getPosition('Я')));
		assertEquals(Optional.of(66), Optional.ofNullable(ALPHABET.getPosition('я')));
	}

	/**
	 * Проверяет позиции прописных букв в алфавите.
	 */
	@Test
	public void testGetPositionUpperCase()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('А')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Б')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('В')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Г')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Д')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Е')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ё')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ж')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('З')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('И')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Й')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('К')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Л')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('М')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Н')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('О')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('П')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Р')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('С')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Т')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('У')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ф')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Х')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ц')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ч')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ш')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Щ')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ъ')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ы')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ь')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Э')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Ю')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET_CASE.getPositionUpperCase('Я')));
	}

	/**
	 * Проверяет позиции строчных букв в алфавите.
	 */
	@Test
	public void testGetPositionLowerCase()
	{
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('а')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('б')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('в')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('г')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('д')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('е')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ё')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ж')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('з')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('и')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('й')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('к')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('л')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('м')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('н')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('о')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('п')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('р')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('с')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('т')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('у')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ф')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('х')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ц')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ч')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ш')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('щ')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ъ')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ы')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ь')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('э')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('ю')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET_CASE.getPositionLowerCase('я')));
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
		assertTrue(ALPHABET.hasLetter('а'));
		assertTrue(ALPHABET.hasLetter('б'));
		assertTrue(ALPHABET.hasLetter('в'));
		assertTrue(ALPHABET.hasLetter('г'));
		assertTrue(ALPHABET.hasLetter('д'));
		assertTrue(ALPHABET.hasLetter('е'));
		assertTrue(ALPHABET.hasLetter('ё'));
		assertTrue(ALPHABET.hasLetter('ж'));
		assertTrue(ALPHABET.hasLetter('з'));
		assertTrue(ALPHABET.hasLetter('и'));
		assertTrue(ALPHABET.hasLetter('й'));
		assertTrue(ALPHABET.hasLetter('к'));
		assertTrue(ALPHABET.hasLetter('л'));
		assertTrue(ALPHABET.hasLetter('м'));
		assertTrue(ALPHABET.hasLetter('н'));
		assertTrue(ALPHABET.hasLetter('о'));
		assertTrue(ALPHABET.hasLetter('п'));
		assertTrue(ALPHABET.hasLetter('р'));
		assertTrue(ALPHABET.hasLetter('с'));
		assertTrue(ALPHABET.hasLetter('т'));
		assertTrue(ALPHABET.hasLetter('у'));
		assertTrue(ALPHABET.hasLetter('ф'));
		assertTrue(ALPHABET.hasLetter('х'));
		assertTrue(ALPHABET.hasLetter('ц'));
		assertTrue(ALPHABET.hasLetter('ч'));
		assertTrue(ALPHABET.hasLetter('ш'));
		assertTrue(ALPHABET.hasLetter('щ'));
		assertTrue(ALPHABET.hasLetter('ъ'));
		assertTrue(ALPHABET.hasLetter('ы'));
		assertTrue(ALPHABET.hasLetter('ь'));
		assertTrue(ALPHABET.hasLetter('э'));
		assertTrue(ALPHABET.hasLetter('ю'));
		assertTrue(ALPHABET.hasLetter('я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testHasLetterBad()
	{
		assertFalse(ALPHABET.hasLetter('W'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту прописных букв.
	 */
	@Test
	public void testHasLetterUpperCase()
	{
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('А'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Б'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('В'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Г'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Д'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Е'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ё'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ж'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('З'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('И'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Й'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('К'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Л'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('М'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Н'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('О'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('П'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Р'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('С'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Т'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('У'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ф'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Х'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ц'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ч'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ш'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Щ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ъ'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ы'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ь'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Э'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Ю'));
		assertTrue(ALPHABET_CASE.hasLetterUpperCase('Я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту прописных букв.
	 */
	@Test
	public void testHasLetterUpperCaseBad()
	{
		assertFalse(ALPHABET_CASE.hasLetterUpperCase('ж'));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту строчных букв.
	 */
	@Test
	public void testHasLetterLowerCase()
	{
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('а'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('б'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('в'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('г'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('д'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('е'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ё'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ж'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('з'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('и'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('й'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('к'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('л'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('м'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('н'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('о'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('п'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('р'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('с'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('т'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('у'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ф'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('х'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ц'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ч'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ш'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('щ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ъ'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ы'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ь'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('э'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('ю'));
		assertTrue(ALPHABET_CASE.hasLetterLowerCase('я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту строчных букв.
	 */
	@Test
	public void testHasLetterLowerCaseBad()
	{
		assertFalse(ALPHABET_CASE.hasLetterLowerCase('Э'));
	}

}