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

public class BelarusianAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BelarusianAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGetLetters()
	{
		List<Character> letters = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'І', 'і',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ў', 'ў', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц',
			'Ч', 'ч', 'Ш', 'ш', 'Ы', 'ы', 'Ь', 'ь', 'Э', 'э',
			'Ю', 'ю', 'Я', 'я'
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
			'я', 'Я', 'ю', 'Ю', 'э', 'Э', 'ь', 'Ь', 'ы', 'Ы', 'ш', 'Ш', 'ч', 'Ч', 'ц', 'Ц', 'х', 'Х', 'ф', 'Ф', 'ў', 'Ў', 'у', 'У', 'т', 'Т', 'с', 'С', 'р', 'Р', 'п', 'П', 'о', 'О', 'н', 'Н', 'м', 'М', 'л', 'Л', 'к', 'К', 'й', 'Й', 'і', 'І', 'з', 'З', 'ж', 'Ж', 'ё', 'Ё', 'е', 'Е', 'д', 'Д', 'г', 'Г', 'в', 'В', 'б', 'Б', 'а', 'А'
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
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'І', 'і',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ў', 'ў', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц',
			'Ч', 'ч', 'Ш', 'ш', 'Ы', 'ы', 'Ь', 'ь', 'Э', 'э',
			'Ю', 'ю', 'Я', 'я'
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
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'І', 'і',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ў', 'ў', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц',
			'Ч', 'ч', 'Ш', 'ш', 'Ы', 'ы', 'Ь', 'ь', 'Э', 'э',
			'Ю', 'ю', 'Я', 'я'
		);

		List<Character> letters2 = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'І', 'і',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П'
		);

		List<Character> letters3 = List.of(
			'А', 'а', 'Б'
		);

		List<Character> letters4 = List.of(
			'А'
		);

		assertArrayEquals(letters1.toArray(), ALPHABET.getLetters(1, 64).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.getLetters(1, 33).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.getLetters(1, 3).toArray());
		assertArrayEquals(letters4.toArray(), ALPHABET.getLetters(1, 1).toArray());
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
		ALPHABET.getLetters(1, 65);
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
	 * Проверяет позицию несуществующей буквы в алфавите.
	 */
	@Test
	public void testGetPositionNotLetter()
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
		assertEquals(Optional.of(19), Optional.ofNullable(ALPHABET.getPosition('І')));
		assertEquals(Optional.of(20), Optional.ofNullable(ALPHABET.getPosition('і')));
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
		assertEquals(Optional.of(43), Optional.ofNullable(ALPHABET.getPosition('Ў')));
		assertEquals(Optional.of(44), Optional.ofNullable(ALPHABET.getPosition('ў')));
		assertEquals(Optional.of(45), Optional.ofNullable(ALPHABET.getPosition('Ф')));
		assertEquals(Optional.of(46), Optional.ofNullable(ALPHABET.getPosition('ф')));
		assertEquals(Optional.of(47), Optional.ofNullable(ALPHABET.getPosition('Х')));
		assertEquals(Optional.of(48), Optional.ofNullable(ALPHABET.getPosition('х')));
		assertEquals(Optional.of(49), Optional.ofNullable(ALPHABET.getPosition('Ц')));
		assertEquals(Optional.of(50), Optional.ofNullable(ALPHABET.getPosition('ц')));
		assertEquals(Optional.of(51), Optional.ofNullable(ALPHABET.getPosition('Ч')));
		assertEquals(Optional.of(52), Optional.ofNullable(ALPHABET.getPosition('ч')));
		assertEquals(Optional.of(53), Optional.ofNullable(ALPHABET.getPosition('Ш')));
		assertEquals(Optional.of(54), Optional.ofNullable(ALPHABET.getPosition('ш')));
		assertEquals(Optional.of(55), Optional.ofNullable(ALPHABET.getPosition('Ы')));
		assertEquals(Optional.of(56), Optional.ofNullable(ALPHABET.getPosition('ы')));
		assertEquals(Optional.of(57), Optional.ofNullable(ALPHABET.getPosition('Ь')));
		assertEquals(Optional.of(58), Optional.ofNullable(ALPHABET.getPosition('ь')));
		assertEquals(Optional.of(59), Optional.ofNullable(ALPHABET.getPosition('Э')));
		assertEquals(Optional.of(60), Optional.ofNullable(ALPHABET.getPosition('э')));
		assertEquals(Optional.of(61), Optional.ofNullable(ALPHABET.getPosition('Ю')));
		assertEquals(Optional.of(62), Optional.ofNullable(ALPHABET.getPosition('ю')));
		assertEquals(Optional.of(63), Optional.ofNullable(ALPHABET.getPosition('Я')));
		assertEquals(Optional.of(64), Optional.ofNullable(ALPHABET.getPosition('я')));
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
		assertEquals(Optional.of('І'), Optional.ofNullable(ALPHABET.getLetter(19)));
		assertEquals(Optional.of('і'), Optional.ofNullable(ALPHABET.getLetter(20)));
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
		assertEquals(Optional.of('Ў'), Optional.ofNullable(ALPHABET.getLetter(43)));
		assertEquals(Optional.of('ў'), Optional.ofNullable(ALPHABET.getLetter(44)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(ALPHABET.getLetter(45)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(ALPHABET.getLetter(46)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(ALPHABET.getLetter(47)));
		assertEquals(Optional.of('х'), Optional.ofNullable(ALPHABET.getLetter(48)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(ALPHABET.getLetter(49)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(ALPHABET.getLetter(50)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(ALPHABET.getLetter(51)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(ALPHABET.getLetter(52)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(ALPHABET.getLetter(53)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(ALPHABET.getLetter(54)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(ALPHABET.getLetter(55)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(ALPHABET.getLetter(56)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(ALPHABET.getLetter(57)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(ALPHABET.getLetter(58)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(ALPHABET.getLetter(59)));
		assertEquals(Optional.of('э'), Optional.ofNullable(ALPHABET.getLetter(60)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(ALPHABET.getLetter(61)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(ALPHABET.getLetter(62)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(ALPHABET.getLetter(63)));
		assertEquals(Optional.of('я'), Optional.ofNullable(ALPHABET.getLetter(64)));
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
		assertTrue(ALPHABET.contains('а'));
		assertTrue(ALPHABET.contains('б'));
		assertTrue(ALPHABET.contains('в'));
		assertTrue(ALPHABET.contains('г'));
		assertTrue(ALPHABET.contains('д'));
		assertTrue(ALPHABET.contains('е'));
		assertTrue(ALPHABET.contains('ё'));
		assertTrue(ALPHABET.contains('ж'));
		assertTrue(ALPHABET.contains('з'));
		assertTrue(ALPHABET.contains('і'));
		assertTrue(ALPHABET.contains('й'));
		assertTrue(ALPHABET.contains('к'));
		assertTrue(ALPHABET.contains('л'));
		assertTrue(ALPHABET.contains('м'));
		assertTrue(ALPHABET.contains('н'));
		assertTrue(ALPHABET.contains('о'));
		assertTrue(ALPHABET.contains('п'));
		assertTrue(ALPHABET.contains('р'));
		assertTrue(ALPHABET.contains('с'));
		assertTrue(ALPHABET.contains('т'));
		assertTrue(ALPHABET.contains('у'));
		assertTrue(ALPHABET.contains('ў'));
		assertTrue(ALPHABET.contains('ф'));
		assertTrue(ALPHABET.contains('х'));
		assertTrue(ALPHABET.contains('ц'));
		assertTrue(ALPHABET.contains('ч'));
		assertTrue(ALPHABET.contains('ш'));
		assertTrue(ALPHABET.contains('ы'));
		assertTrue(ALPHABET.contains('ь'));
		assertTrue(ALPHABET.contains('э'));
		assertTrue(ALPHABET.contains('ю'));
		assertTrue(ALPHABET.contains('я'));
	}

	/**
	 * Проверяет принадлежность не принадлежащей буквы к алфавиту.
	 */
	@Test
	public void testContainsNot()
	{
		assertFalse(ALPHABET.contains('W'));
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'І', 'і',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ў', 'ў', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц',
			'Ч', 'ч', 'Ш', 'ш', 'Ы', 'ы', 'Ь', 'ь', 'Э', 'э',
			'Ю', 'ю', 'Я', 'я'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "А,а,Б,б,В,в,Г,г,Д,д,Е,е,Ё,ё,Ж,ж,З,з,І,і,Й,й," +
			"К,к,Л,л,М,м,Н,н,О,о,П,п,Р,р,С,с,Т,т,У,у,Ў,ў,Ф,ф,Х,х," +
			"Ц,ц,Ч,ч,Ш,ш,Ы,ы,Ь,ь,Э,э,Ю,ю,Я,я";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "АаБбВвГгДдЕеЁёЖжЗзІіЙйКкЛлМмНнОоПпРрСсТтУуЎўФфХхЦцЧчШшЫыЬьЭэЮюЯя";

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

		assertFalse(ALPHABET.equals(new GreekAlphabet()));

		assertTrue(ALPHABET.equals(new BelarusianAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BelarusianAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new GreekAlphabet().hashCode());
	}
}