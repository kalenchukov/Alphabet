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
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('а')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('б')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('в')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('г')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('д')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('е')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('ё')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('ж')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('з')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('и')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPosition('й')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPosition('к')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPosition('л')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPosition('м')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPosition('н')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPosition('о')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPosition('п')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPosition('р')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('с')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('т')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPosition('у')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('ф')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('х')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('ц')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('ч')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('ш')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPosition('щ')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPosition('ъ')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPosition('ы')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('ь')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPosition('э')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPosition('ю')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET.getPosition('я')));
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
		assertEquals(Optional.of('а'), Optional.ofNullable(ALPHABET.getLetter(1)));
		assertEquals(Optional.of('б'), Optional.ofNullable(ALPHABET.getLetter(2)));
		assertEquals(Optional.of('в'), Optional.ofNullable(ALPHABET.getLetter(3)));
		assertEquals(Optional.of('г'), Optional.ofNullable(ALPHABET.getLetter(4)));
		assertEquals(Optional.of('д'), Optional.ofNullable(ALPHABET.getLetter(5)));
		assertEquals(Optional.of('е'), Optional.ofNullable(ALPHABET.getLetter(6)));
		assertEquals(Optional.of('ё'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('ж'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('з'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('и'), Optional.ofNullable(ALPHABET.getLetter(10)));
		assertEquals(Optional.of('й'), Optional.ofNullable(ALPHABET.getLetter(11)));
		assertEquals(Optional.of('к'), Optional.ofNullable(ALPHABET.getLetter(12)));
		assertEquals(Optional.of('л'), Optional.ofNullable(ALPHABET.getLetter(13)));
		assertEquals(Optional.of('м'), Optional.ofNullable(ALPHABET.getLetter(14)));
		assertEquals(Optional.of('н'), Optional.ofNullable(ALPHABET.getLetter(15)));
		assertEquals(Optional.of('о'), Optional.ofNullable(ALPHABET.getLetter(16)));
		assertEquals(Optional.of('п'), Optional.ofNullable(ALPHABET.getLetter(17)));
		assertEquals(Optional.of('р'), Optional.ofNullable(ALPHABET.getLetter(18)));
		assertEquals(Optional.of('с'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('т'), Optional.ofNullable(ALPHABET.getLetter(20)));
		assertEquals(Optional.of('у'), Optional.ofNullable(ALPHABET.getLetter(21)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('х'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(ALPHABET.getLetter(26)));
		assertEquals(Optional.of('щ'), Optional.ofNullable(ALPHABET.getLetter(27)));
		assertEquals(Optional.of('ъ'), Optional.ofNullable(ALPHABET.getLetter(28)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(ALPHABET.getLetter(29)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(ALPHABET.getLetter(30)));
		assertEquals(Optional.of('э'), Optional.ofNullable(ALPHABET.getLetter(31)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(ALPHABET.getLetter(32)));
		assertEquals(Optional.of('я'), Optional.ofNullable(ALPHABET.getLetter(33)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testHasLetter()
	{
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
		assertFalse(ALPHABET.hasLetter('Э'));
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
}