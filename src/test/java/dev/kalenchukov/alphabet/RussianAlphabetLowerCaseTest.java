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

public class RussianAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new RussianAlphabet.LowerCase();

	/**
	 * Проверяет буквы в алфавите.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
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
			'я', 'ю', 'э', 'ь', 'ы', 'ъ', 'щ', 'ш', 'ч', 'ц',
			'х', 'ф', 'у', 'т', 'с', 'р', 'п', 'о', 'н', 'м', 'л', 'к',
			'й', 'и', 'з', 'ж', 'ё', 'е', 'д', 'г', 'в', 'б', 'а'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.getLettersReverse().toArray());

		assertEquals(Optional.of('а'), Optional.ofNullable(letters.get(32)));
		assertEquals(Optional.of('б'), Optional.ofNullable(letters.get(31)));
		assertEquals(Optional.of('в'), Optional.ofNullable(letters.get(30)));
		assertEquals(Optional.of('г'), Optional.ofNullable(letters.get(29)));
		assertEquals(Optional.of('д'), Optional.ofNullable(letters.get(28)));
		assertEquals(Optional.of('е'), Optional.ofNullable(letters.get(27)));
		assertEquals(Optional.of('ё'), Optional.ofNullable(letters.get(26)));
		assertEquals(Optional.of('ж'), Optional.ofNullable(letters.get(25)));
		assertEquals(Optional.of('з'), Optional.ofNullable(letters.get(24)));
		assertEquals(Optional.of('и'), Optional.ofNullable(letters.get(23)));
		assertEquals(Optional.of('й'), Optional.ofNullable(letters.get(22)));
		assertEquals(Optional.of('к'), Optional.ofNullable(letters.get(21)));
		assertEquals(Optional.of('л'), Optional.ofNullable(letters.get(20)));
		assertEquals(Optional.of('м'), Optional.ofNullable(letters.get(19)));
		assertEquals(Optional.of('н'), Optional.ofNullable(letters.get(18)));
		assertEquals(Optional.of('о'), Optional.ofNullable(letters.get(17)));
		assertEquals(Optional.of('п'), Optional.ofNullable(letters.get(16)));
		assertEquals(Optional.of('р'), Optional.ofNullable(letters.get(15)));
		assertEquals(Optional.of('с'), Optional.ofNullable(letters.get(14)));
		assertEquals(Optional.of('т'), Optional.ofNullable(letters.get(13)));
		assertEquals(Optional.of('у'), Optional.ofNullable(letters.get(12)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(letters.get(11)));
		assertEquals(Optional.of('х'), Optional.ofNullable(letters.get(10)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(letters.get(9)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(letters.get(8)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(letters.get(7)));
		assertEquals(Optional.of('щ'), Optional.ofNullable(letters.get(6)));
		assertEquals(Optional.of('ъ'), Optional.ofNullable(letters.get(5)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(letters.get(4)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(letters.get(3)));
		assertEquals(Optional.of('э'), Optional.ofNullable(letters.get(2)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(letters.get(1)));
		assertEquals(Optional.of('я'), Optional.ofNullable(letters.get(0)));
	}

	/**
	 * Проверяет получение букв алфавита в перемешанном порядке.
	 */
	@Test
	public void testGetLettersShuffle()
	{
		List<Character> letters = List.of(
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
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

		assertArrayEquals(letters1.toArray(), ALPHABET.getLetters(1, 33).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.getLetters(1, 3).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.getLetters(1, 1).toArray());
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
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPosition('щ')));
	}

	/**
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionNotLetter()
	{
		assertNull(ALPHABET.getPosition('W'));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('ш'), Optional.ofNullable(ALPHABET.getLetter(26)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('щ'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('Э'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
			'ъ', 'ы', 'ь', 'э', 'ю', 'я'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "а,б,в,г,д,е,ё,ж,з,и,й,к,л,м,н,о,п,р,с,т,у,ф,х,ц,ч,ш,щ,ъ,ы,ь,э,ю,я";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

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

		assertFalse(ALPHABET.equals(new EnglishAlphabet.LowerCase()));

		assertTrue(ALPHABET.equals(new RussianAlphabet.LowerCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new RussianAlphabet.LowerCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new EnglishAlphabet.LowerCase().hashCode());
	}
}