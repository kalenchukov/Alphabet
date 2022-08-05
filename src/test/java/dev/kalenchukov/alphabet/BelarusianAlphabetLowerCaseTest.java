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

public class BelarusianAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BelarusianAlphabet.LowerCase();

	/**
	 * Проверяет буквы в алфавите.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'і', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ў', 'ф', 'х', 'ц', 'ч', 'ш',
			'ы', 'ь', 'э', 'ю', 'я'
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
			'я', 'ю', 'э', 'ь', 'ы', 'ш', 'ч', 'ц', 'х', 'ф',
			'ў', 'у', 'т', 'с', 'р', 'п', 'о', 'н', 'м', 'л', 'к', 'й',
			'і', 'з', 'ж', 'ё', 'е', 'д', 'г', 'в', 'б', 'а'
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
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
			'і', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ў', 'ф', 'х', 'ц', 'ч', 'ш',
			'ы', 'ь', 'э', 'ю', 'я'
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
			'і', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
			'с', 'т', 'у', 'ў', 'ф', 'х', 'ц', 'ч', 'ш',
			'ы', 'ь', 'э', 'ю', 'я'
		);

		List<Character> letters2 = List.of(
			'а', 'б', 'в'
		);

		List<Character> letters3 = List.of(
			'а'
		);

		assertArrayEquals(letters1.toArray(), ALPHABET.getLetters(1, 32).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.getLetters(1, 3).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.getLetters(1, 1).toArray());
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMin()
	{
		ALPHABET.getLetters(0, 32);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMax()
	{
		ALPHABET.getLetters(1, 33);
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
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('і')));
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
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('ў')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('ф')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('х')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('ц')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('ч')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPosition('ш')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPosition('ы')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPosition('ь')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('э')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPosition('ю')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPosition('я')));
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
		assertEquals(Optional.of('і'), Optional.ofNullable(ALPHABET.getLetter(10)));
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
		assertEquals(Optional.of('ў'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('х'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(ALPHABET.getLetter(26)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(ALPHABET.getLetter(27)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(ALPHABET.getLetter(28)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(ALPHABET.getLetter(29)));
		assertEquals(Optional.of('э'), Optional.ofNullable(ALPHABET.getLetter(30)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(ALPHABET.getLetter(31)));
		assertEquals(Optional.of('я'), Optional.ofNullable(ALPHABET.getLetter(32)));
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
		assertTrue(ALPHABET.hasLetter('і'));
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
		assertTrue(ALPHABET.hasLetter('ў'));
		assertTrue(ALPHABET.hasLetter('ф'));
		assertTrue(ALPHABET.hasLetter('х'));
		assertTrue(ALPHABET.hasLetter('ц'));
		assertTrue(ALPHABET.hasLetter('ч'));
		assertTrue(ALPHABET.hasLetter('ш'));
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
		assertFalse(ALPHABET.hasLetter('Ў'));
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "а,б,в,г,д,е,ё,ж,з,і,й,к,л,м,н,о,п,р,с,т,у,ў,ф,х,ц,ч,ш,ы,ь,э,ю,я";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "абвгдеёжзійклмнопрстуўфхцчшыьэюя";

		assertEquals(string, ALPHABET.toString());
	}
}