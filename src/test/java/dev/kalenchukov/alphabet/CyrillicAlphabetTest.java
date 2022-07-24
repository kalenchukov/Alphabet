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

public class CyrillicAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new CyrillicAlphabet();

	/**
	 * Проверяет количество букв в алфавите.
	 */
	@Test
	public void testGetLettersCount()
	{
		assertEquals(43, ALPHABET.getLetters().size());
	}

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'Ѕ', 'З', 'И', 'І',
			'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'Ꙋ', 'Ф',
			'Х', 'Ѡ', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Ѣ', 'Ю',
			'Ꙗ', 'Ѥ', 'Ѧ', 'Ѫ', 'Ѩ', 'Ѭ', 'Ѯ', 'Ѱ', 'Ѳ', 'Ѵ'
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
			'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'Ѕ', 'З', 'И', 'І',
			'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'Ꙋ', 'Ф',
			'Х', 'Ѡ', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Ѣ', 'Ю',
			'Ꙗ', 'Ѥ', 'Ѧ', 'Ѫ', 'Ѩ', 'Ѭ', 'Ѯ', 'Ѱ', 'Ѳ', 'Ѵ'
		);

		List<Character> letters2 = List.of(
			'А', 'Б', 'В'
		);

		List<Character> letters3 = List.of(
			'А'
		);

		assertTrue(letters1.containsAll(ALPHABET.getLetters(1, 43)));
		assertTrue(letters2.containsAll(ALPHABET.getLetters(1, 3)));
		assertTrue(letters3.containsAll(ALPHABET.getLetters(1, 1)));
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMin()
	{
		ALPHABET.getLetters(0, 43);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetLettersRangeOutOfBoundsMax()
	{
		ALPHABET.getLetters(1, 44);
	}

	/**
	 * Проверяет получение среза букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetLettersRangeInversion()
	{
		ALPHABET.getLetters(40, 26);
	}

	/**
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionLetterBadLetter()
	{
		assertNull(ALPHABET.getPositionLetter('J'));
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
		assertEquals(Optional.of(7), Optional.ofNullable(ALPHABET.getPositionLetter('Ж')));
		assertEquals(Optional.of(8), Optional.ofNullable(ALPHABET.getPositionLetter('Ѕ')));
		assertEquals(Optional.of(9), Optional.ofNullable(ALPHABET.getPositionLetter('З')));
		assertEquals(Optional.of(10), Optional.ofNullable(ALPHABET.getPositionLetter('И')));
		assertEquals(Optional.of(11), Optional.ofNullable(ALPHABET.getPositionLetter('І')));
		assertEquals(Optional.of(12), Optional.ofNullable(ALPHABET.getPositionLetter('К')));
		assertEquals(Optional.of(13), Optional.ofNullable(ALPHABET.getPositionLetter('Л')));
		assertEquals(Optional.of(14), Optional.ofNullable(ALPHABET.getPositionLetter('М')));
		assertEquals(Optional.of(15), Optional.ofNullable(ALPHABET.getPositionLetter('Н')));
		assertEquals(Optional.of(16), Optional.ofNullable(ALPHABET.getPositionLetter('О')));
		assertEquals(Optional.of(17), Optional.ofNullable(ALPHABET.getPositionLetter('П')));
		assertEquals(Optional.of(18), Optional.ofNullable(ALPHABET.getPositionLetter('Р')));
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPositionLetter('С')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPositionLetter('Т')));
		assertEquals(Optional.of(21), Optional.ofNullable(ALPHABET.getPositionLetter('Ꙋ')));
		assertEquals(Optional.of(22), Optional.ofNullable(ALPHABET.getPositionLetter('Ф')));
		assertEquals(Optional.of(23), Optional.ofNullable(ALPHABET.getPositionLetter('Х')));
		assertEquals(Optional.of(24), Optional.ofNullable(ALPHABET.getPositionLetter('Ѡ')));
		assertEquals(Optional.of(25), Optional.ofNullable(ALPHABET.getPositionLetter('Ц')));
		assertEquals(Optional.of(26), Optional.ofNullable(ALPHABET.getPositionLetter('Ч')));
		assertEquals(Optional.of(27), Optional.ofNullable(ALPHABET.getPositionLetter('Ш')));
		assertEquals(Optional.of(28), Optional.ofNullable(ALPHABET.getPositionLetter('Щ')));
		assertEquals(Optional.of(29), Optional.ofNullable(ALPHABET.getPositionLetter('Ъ')));
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPositionLetter('Ы')));
		assertEquals(Optional.of(31), Optional.ofNullable(ALPHABET.getPositionLetter('Ь')));
		assertEquals(Optional.of(32), Optional.ofNullable(ALPHABET.getPositionLetter('Ѣ')));
		assertEquals(Optional.of(33), Optional.ofNullable(ALPHABET.getPositionLetter('Ю')));
		assertEquals(Optional.of(34), Optional.ofNullable(ALPHABET.getPositionLetter('Ꙗ')));
		assertEquals(Optional.of(35), Optional.ofNullable(ALPHABET.getPositionLetter('Ѥ')));
		assertEquals(Optional.of(36), Optional.ofNullable(ALPHABET.getPositionLetter('Ѧ')));
		assertEquals(Optional.of(37), Optional.ofNullable(ALPHABET.getPositionLetter('Ѫ')));
		assertEquals(Optional.of(38), Optional.ofNullable(ALPHABET.getPositionLetter('Ѩ')));
		assertEquals(Optional.of(39), Optional.ofNullable(ALPHABET.getPositionLetter('Ѭ')));
		assertEquals(Optional.of(40), Optional.ofNullable(ALPHABET.getPositionLetter('Ѯ')));
		assertEquals(Optional.of(41), Optional.ofNullable(ALPHABET.getPositionLetter('Ѱ')));
		assertEquals(Optional.of(42), Optional.ofNullable(ALPHABET.getPositionLetter('Ѳ')));
		assertEquals(Optional.of(43), Optional.ofNullable(ALPHABET.getPositionLetter('Ѵ')));
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
		assertEquals(Optional.of('Ж'), Optional.ofNullable(ALPHABET.getLetter(7)));
		assertEquals(Optional.of('Ѕ'), Optional.ofNullable(ALPHABET.getLetter(8)));
		assertEquals(Optional.of('З'), Optional.ofNullable(ALPHABET.getLetter(9)));
		assertEquals(Optional.of('И'), Optional.ofNullable(ALPHABET.getLetter(10)));
		assertEquals(Optional.of('І'), Optional.ofNullable(ALPHABET.getLetter(11)));
		assertEquals(Optional.of('К'), Optional.ofNullable(ALPHABET.getLetter(12)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(ALPHABET.getLetter(13)));
		assertEquals(Optional.of('М'), Optional.ofNullable(ALPHABET.getLetter(14)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(ALPHABET.getLetter(15)));
		assertEquals(Optional.of('О'), Optional.ofNullable(ALPHABET.getLetter(16)));
		assertEquals(Optional.of('П'), Optional.ofNullable(ALPHABET.getLetter(17)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(ALPHABET.getLetter(18)));
		assertEquals(Optional.of('С'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(ALPHABET.getLetter(20)));
		assertEquals(Optional.of('Ꙋ'), Optional.ofNullable(ALPHABET.getLetter(21)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(ALPHABET.getLetter(22)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(ALPHABET.getLetter(23)));
		assertEquals(Optional.of('Ѡ'), Optional.ofNullable(ALPHABET.getLetter(24)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(ALPHABET.getLetter(25)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(ALPHABET.getLetter(26)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(ALPHABET.getLetter(27)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(ALPHABET.getLetter(28)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(ALPHABET.getLetter(29)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(ALPHABET.getLetter(30)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(ALPHABET.getLetter(31)));
		assertEquals(Optional.of('Ѣ'), Optional.ofNullable(ALPHABET.getLetter(32)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(ALPHABET.getLetter(33)));
		assertEquals(Optional.of('Ꙗ'), Optional.ofNullable(ALPHABET.getLetter(34)));
		assertEquals(Optional.of('Ѥ'), Optional.ofNullable(ALPHABET.getLetter(35)));
		assertEquals(Optional.of('Ѧ'), Optional.ofNullable(ALPHABET.getLetter(36)));
		assertEquals(Optional.of('Ѫ'), Optional.ofNullable(ALPHABET.getLetter(37)));
		assertEquals(Optional.of('Ѩ'), Optional.ofNullable(ALPHABET.getLetter(38)));
		assertEquals(Optional.of('Ѭ'), Optional.ofNullable(ALPHABET.getLetter(39)));
		assertEquals(Optional.of('Ѯ'), Optional.ofNullable(ALPHABET.getLetter(40)));
		assertEquals(Optional.of('Ѱ'), Optional.ofNullable(ALPHABET.getLetter(41)));
		assertEquals(Optional.of('Ѳ'), Optional.ofNullable(ALPHABET.getLetter(42)));
		assertEquals(Optional.of('Ѵ'), Optional.ofNullable(ALPHABET.getLetter(43)));
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
		assertTrue(ALPHABET.hasLetter('Ж'));
		assertTrue(ALPHABET.hasLetter('Ѕ'));
		assertTrue(ALPHABET.hasLetter('З'));
		assertTrue(ALPHABET.hasLetter('И'));
		assertTrue(ALPHABET.hasLetter('І'));
		assertTrue(ALPHABET.hasLetter('К'));
		assertTrue(ALPHABET.hasLetter('Л'));
		assertTrue(ALPHABET.hasLetter('М'));
		assertTrue(ALPHABET.hasLetter('Н'));
		assertTrue(ALPHABET.hasLetter('О'));
		assertTrue(ALPHABET.hasLetter('П'));
		assertTrue(ALPHABET.hasLetter('Р'));
		assertTrue(ALPHABET.hasLetter('С'));
		assertTrue(ALPHABET.hasLetter('Т'));
		assertTrue(ALPHABET.hasLetter('Ꙋ'));
		assertTrue(ALPHABET.hasLetter('Ф'));
		assertTrue(ALPHABET.hasLetter('Х'));
		assertTrue(ALPHABET.hasLetter('Ѡ'));
		assertTrue(ALPHABET.hasLetter('Ц'));
		assertTrue(ALPHABET.hasLetter('Ч'));
		assertTrue(ALPHABET.hasLetter('Ш'));
		assertTrue(ALPHABET.hasLetter('Щ'));
		assertTrue(ALPHABET.hasLetter('Ъ'));
		assertTrue(ALPHABET.hasLetter('Ы'));
		assertTrue(ALPHABET.hasLetter('Ь'));
		assertTrue(ALPHABET.hasLetter('Ѣ'));
		assertTrue(ALPHABET.hasLetter('Ю'));
		assertTrue(ALPHABET.hasLetter('Ꙗ'));
		assertTrue(ALPHABET.hasLetter('Ѥ'));
		assertTrue(ALPHABET.hasLetter('Ѧ'));
		assertTrue(ALPHABET.hasLetter('Ѫ'));
		assertTrue(ALPHABET.hasLetter('Ѩ'));
		assertTrue(ALPHABET.hasLetter('Ѭ'));
		assertTrue(ALPHABET.hasLetter('Ѯ'));
		assertTrue(ALPHABET.hasLetter('Ѱ'));
		assertTrue(ALPHABET.hasLetter('Ѳ'));
		assertTrue(ALPHABET.hasLetter('Ѵ'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testHasLetterBad()
	{
		assertFalse(ALPHABET.hasLetter('Q'));
	}
}