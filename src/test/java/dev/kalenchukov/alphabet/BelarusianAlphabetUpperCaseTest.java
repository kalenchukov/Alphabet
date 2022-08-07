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
		assertEquals(Optional.of('А'), Optional.ofNullable(ALPHABET.getLetter(1)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(ALPHABET.getLetter(2)));
		assertEquals(Optional.of('В'), Optional.ofNullable(ALPHABET.getLetter(3)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(ALPHABET.getLetter(4)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(ALPHABET.getLetter(5)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(ALPHABET.getLetter(6)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('З'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('І'), Optional.ofNullable(ALPHABET.getLetter(10)));
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
		assertEquals(Optional.of('Ў'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(ALPHABET.getLetter(26)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(ALPHABET.getLetter(27)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(ALPHABET.getLetter(28)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(ALPHABET.getLetter(29)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(ALPHABET.getLetter(30)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(ALPHABET.getLetter(31)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(ALPHABET.getLetter(32)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('А'));
		assertTrue(ALPHABET.contains('Б'));
		assertTrue(ALPHABET.contains('В'));
		assertTrue(ALPHABET.contains('Г'));
		assertTrue(ALPHABET.contains('Д'));
		assertTrue(ALPHABET.contains('Е'));
		assertTrue(ALPHABET.contains('Ё'));
		assertTrue(ALPHABET.contains('Ж'));
		assertTrue(ALPHABET.contains('З'));
		assertTrue(ALPHABET.contains('І'));
		assertTrue(ALPHABET.contains('Й'));
		assertTrue(ALPHABET.contains('К'));
		assertTrue(ALPHABET.contains('Л'));
		assertTrue(ALPHABET.contains('М'));
		assertTrue(ALPHABET.contains('Н'));
		assertTrue(ALPHABET.contains('О'));
		assertTrue(ALPHABET.contains('П'));
		assertTrue(ALPHABET.contains('Р'));
		assertTrue(ALPHABET.contains('С'));
		assertTrue(ALPHABET.contains('Т'));
		assertTrue(ALPHABET.contains('У'));
		assertTrue(ALPHABET.contains('Ў'));
		assertTrue(ALPHABET.contains('Ф'));
		assertTrue(ALPHABET.contains('Х'));
		assertTrue(ALPHABET.contains('Ц'));
		assertTrue(ALPHABET.contains('Ч'));
		assertTrue(ALPHABET.contains('Ш'));
		assertTrue(ALPHABET.contains('Ы'));
		assertTrue(ALPHABET.contains('Ь'));
		assertTrue(ALPHABET.contains('Э'));
		assertTrue(ALPHABET.contains('Ю'));
		assertTrue(ALPHABET.contains('Я'));
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