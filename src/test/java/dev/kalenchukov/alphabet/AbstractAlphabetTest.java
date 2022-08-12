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
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.*;

public class AbstractAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new RussianAlphabet();

	/**
	 * Проверяет буквы алфавита в обратном порядке.
	 */
	@Test
	public void testGetReverse()
	{
		List<Character> letters = List.of(
			'я', 'Я', 'ю', 'Ю', 'э', 'Э', 'ь', 'Ь', 'ы', 'Ы',
			'ъ', 'Ъ', 'щ', 'Щ', 'ш', 'Ш', 'ч', 'Ч', 'ц', 'Ц', 'х', 'Х',
			'ф', 'Ф', 'у', 'У', 'т', 'Т', 'с', 'С', 'р', 'Р', 'п', 'П',
			'о', 'О', 'н', 'Н', 'м', 'М', 'л', 'Л', 'к', 'К', 'й', 'Й',
			'и', 'И', 'з', 'З', 'ж', 'Ж', 'ё', 'Ё', 'е', 'Е', 'д', 'Д',
			'г', 'Г', 'в', 'В', 'б', 'Б', 'а', 'А'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.getReverse().toArray());

		assertEquals(Optional.of('А'), Optional.ofNullable(letters.get(65)));
		assertEquals(Optional.of('а'), Optional.ofNullable(letters.get(64)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(letters.get(63)));
		assertEquals(Optional.of('б'), Optional.ofNullable(letters.get(62)));
		assertEquals(Optional.of('В'), Optional.ofNullable(letters.get(61)));
		assertEquals(Optional.of('в'), Optional.ofNullable(letters.get(60)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(letters.get(59)));
		assertEquals(Optional.of('г'), Optional.ofNullable(letters.get(58)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(letters.get(57)));
		assertEquals(Optional.of('д'), Optional.ofNullable(letters.get(56)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(letters.get(55)));
		assertEquals(Optional.of('е'), Optional.ofNullable(letters.get(54)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(letters.get(53)));
		assertEquals(Optional.of('ё'), Optional.ofNullable(letters.get(52)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(letters.get(51)));
		assertEquals(Optional.of('ж'), Optional.ofNullable(letters.get(50)));
		assertEquals(Optional.of('З'), Optional.ofNullable(letters.get(49)));
		assertEquals(Optional.of('з'), Optional.ofNullable(letters.get(48)));
		assertEquals(Optional.of('И'), Optional.ofNullable(letters.get(47)));
		assertEquals(Optional.of('и'), Optional.ofNullable(letters.get(46)));
		assertEquals(Optional.of('Й'), Optional.ofNullable(letters.get(45)));
		assertEquals(Optional.of('й'), Optional.ofNullable(letters.get(44)));
		assertEquals(Optional.of('К'), Optional.ofNullable(letters.get(43)));
		assertEquals(Optional.of('к'), Optional.ofNullable(letters.get(42)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(letters.get(41)));
		assertEquals(Optional.of('л'), Optional.ofNullable(letters.get(40)));
		assertEquals(Optional.of('М'), Optional.ofNullable(letters.get(39)));
		assertEquals(Optional.of('м'), Optional.ofNullable(letters.get(38)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(letters.get(37)));
		assertEquals(Optional.of('н'), Optional.ofNullable(letters.get(36)));
		assertEquals(Optional.of('О'), Optional.ofNullable(letters.get(35)));
		assertEquals(Optional.of('о'), Optional.ofNullable(letters.get(34)));
		assertEquals(Optional.of('П'), Optional.ofNullable(letters.get(33)));
		assertEquals(Optional.of('п'), Optional.ofNullable(letters.get(32)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(letters.get(31)));
		assertEquals(Optional.of('р'), Optional.ofNullable(letters.get(30)));
		assertEquals(Optional.of('С'), Optional.ofNullable(letters.get(29)));
		assertEquals(Optional.of('с'), Optional.ofNullable(letters.get(28)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(letters.get(27)));
		assertEquals(Optional.of('т'), Optional.ofNullable(letters.get(26)));
		assertEquals(Optional.of('У'), Optional.ofNullable(letters.get(25)));
		assertEquals(Optional.of('у'), Optional.ofNullable(letters.get(24)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(letters.get(23)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(letters.get(22)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(letters.get(21)));
		assertEquals(Optional.of('х'), Optional.ofNullable(letters.get(20)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(letters.get(19)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(letters.get(18)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(letters.get(17)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(letters.get(16)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(letters.get(15)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(letters.get(14)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(letters.get(13)));
		assertEquals(Optional.of('щ'), Optional.ofNullable(letters.get(12)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(letters.get(11)));
		assertEquals(Optional.of('ъ'), Optional.ofNullable(letters.get(10)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(letters.get(9)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(letters.get(8)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(letters.get(7)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(letters.get(6)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(letters.get(5)));
		assertEquals(Optional.of('э'), Optional.ofNullable(letters.get(4)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(letters.get(3)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(letters.get(2)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(letters.get(1)));
		assertEquals(Optional.of('я'), Optional.ofNullable(letters.get(0)));
	}

	/**
	 * Проверяет получение букв алфавита в перемешанном порядке.
	 */
	@Test
	public void testGetShuffle()
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

		assertFalse(Arrays.equals(letters.toArray(), ALPHABET.getShuffle().toArray()));
	}

	/**
	 * Проверяет получение среза букв алфавита.
	 */
	@Test
	public void testGetRange()
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

		assertArrayEquals(letters1.toArray(), ALPHABET.get(1, 66).toArray());
		assertArrayEquals(letters2.toArray(), ALPHABET.get(1, 33).toArray());
		assertArrayEquals(letters3.toArray(), ALPHABET.get(1, 3).toArray());
		assertArrayEquals(letters4.toArray(), ALPHABET.get(1, 1).toArray());
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за минимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetRangeOutOfBoundsMin()
	{
		ALPHABET.get(0, 33);
	}

	/**
	 * Проверяет получение среза букв алфавита выходящего за максимальную границу.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetRangeOutOfBoundsMax()
	{
		ALPHABET.get(1, 67);
	}

	/**
	 * Проверяет получение среза букв алфавита с инвертированной границей.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetRangeInversion()
	{
		ALPHABET.get(33, 20);
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
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('н')));
	}

	/**
	 * Проверяет букву по позиции в алфавите.
	 */
	@Test
	public void testGetLetter()
	{
		assertEquals(Optional.of('м'), Optional.ofNullable(ALPHABET.getLetter(28)));
	}

	/**
	 * Проверяет принадлежность буквы к алфавиту.
	 */
	@Test
	public void testContains()
	{
		assertTrue(ALPHABET.contains('У'));
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
	 * Проверяет получение букв в случайном порядке.
	 */
	@Test
	public void testGetRandom()
	{
		assertEquals(0, ALPHABET.getRandom(0).size());
		assertEquals(1, ALPHABET.getRandom(1).size());
		assertEquals(20, ALPHABET.getRandom(20).size());
		assertEquals(100, ALPHABET.getRandom(100).size());
	}

	/**
	 * Проверяет преобразование алфавита в массив.
	 */
	@Test
	public void testToArray()
	{
		Character[] letters = new Character[]{
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч',
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь',
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
		};

		assertArrayEquals(letters, ALPHABET.toArray());
	}

	/**
	 * Проверяет преобразование алфавита в строку с использованием разделителя.
	 */
	@Test
	public void testToStringSeparator()
	{
		String string = "А,а,Б,б,В,в,Г,г,Д,д,Е,е,Ё,ё,Ж,ж,З,з,И,и," +
			"Й,й,К,к,Л,л,М,м,Н,н,О,о,П,п,Р,р,С,с,Т,т,У,у,Ф,ф,Х,х," +
			"Ц,ц,Ч,ч,Ш,ш,Щ,щ,Ъ,ъ,Ы,ы,Ь,ь,Э,э,Ю,ю,Я,я";

		assertEquals(string, ALPHABET.toString(","));
	}

	/**
	 * Проверяет преобразование алфавита в строку.
	 */
	@Test
	public void testToString()
	{
		String string = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";

		assertEquals(string, ALPHABET.toString());
	}

	/**
	 * Проверка с наличием букв.
	 */
	@Test
	public void testStatistics()
	{
		String string = """
			Дом стоит, свет горит
			Из окна видна даль
			Так откуда взялась печаль?
			""";

		Map<Character, Integer> statistics = ALPHABET.statistics(string);

		assertEquals(1, statistics.get('Д').intValue());
		assertEquals(1, statistics.get('Т').intValue());
		assertEquals(1, statistics.get('п').intValue());
		assertEquals(5, statistics.get('о').intValue());
	}

	/**
	 * Проверка с отсутствием букв.
	 */
	@Test
	public void testStatisticsNot()
	{
		String string = """
			И я должен прийти к девяти, на работу свою,
			Но сейчас уже без десяти, а я только встаю
			""";

		Map<Character, Integer> statistics = ALPHABET.statistics(string);

		assertEquals(0, statistics.get('щ').intValue());
		assertEquals(0, statistics.get('Я').intValue());
		assertEquals(0, statistics.get('ъ').intValue());
		assertEquals(0, statistics.get('Ж').intValue());
	}
}