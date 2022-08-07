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

public class BelarusianAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BelarusianAlphabet.UpperCase();

	/**
	 * Проверяет буквы в алфавите.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'І', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ў', 'Ф', 'Х', 'Ц', 'Ч', 'Ш',
			'Ы', 'Ь', 'Э', 'Ю', 'Я'
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
			'Я', 'Ю', 'Э', 'Ь', 'Ы', 'Ш', 'Ч', 'Ц', 'Х', 'Ф',
			'Ў', 'У', 'Т', 'С', 'Р', 'П', 'О', 'Н', 'М', 'Л', 'К', 'Й',
			'І', 'З', 'Ж', 'Ё', 'Е', 'Д', 'Г', 'В', 'Б', 'А'
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
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'І', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ў', 'Ф', 'Х', 'Ц', 'Ч', 'Ш',
			'Ы', 'Ь', 'Э', 'Ю', 'Я'
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
			'І', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ў', 'Ф', 'Х', 'Ц', 'Ч', 'Ш',
			'Ы', 'Ь', 'Э', 'Ю', 'Я'
		);

		List<Character> letters2 = List.of(
			'А', 'Б', 'В'
		);

		List<Character> letters3 = List.of(
			'А'
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
		assertEquals(Optional.of(1), Optional.ofNullable(ALPHABET.getPosition('А')));
		assertEquals(Optional.of(2), Optional.ofNullable(ALPHABET.getPosition('Б')));
		assertEquals(Optional.of(3), Optional.ofNullable(ALPHABET.getPosition('В')));
		assertEquals(Optional.of(4), Optional.ofNullable(ALPHABET.getPosition('Г')));
		assertEquals(Optional.of(5), Optional.ofNullable(ALPHABET.getPosition('Д')));
		assertEquals(Optional.of(6), Optional.ofNullable(ALPHABET.getPosition('Е')));
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPosition('Ё')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPosition('Ж')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPosition('З')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPosition('І')));
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
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPosition('Ў')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPosition('Ф')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPosition('Х')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPosition('Ц')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPosition('Ч')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPosition('Ш')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPosition('Ы')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPosition('Ь')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('Э')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPosition('Ю')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPosition('Я')));
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
		assertEquals(Optional.of('Р'), Optional.ofNullable(ALPHABET.getLetter(18)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('Ў'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('ў'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
			'І', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
			'С', 'Т', 'У', 'Ў', 'Ф', 'Х', 'Ц', 'Ч', 'Ш',
			'Ы', 'Ь', 'Э', 'Ю', 'Я'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "А,Б,В,Г,Д,Е,Ё,Ж,З,І,Й,К,Л,М,Н,О,П,Р,С,Т,У,Ў,Ф,Х,Ц,Ч,Ш,Ы,Ь,Э,Ю,Я";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "АБВГДЕЁЖЗІЙКЛМНОПРСТУЎФХЦЧШЫЬЭЮЯ";

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

		assertFalse(ALPHABET.equals(new GreekAlphabet.UpperCase()));

		assertTrue(ALPHABET.equals(new BelarusianAlphabet.UpperCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BelarusianAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new GreekAlphabet.UpperCase().hashCode());
	}
}