/*
 * Copyright © 2022-2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.kalenchukov.alphabet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link AbstractAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class AbstractAlphabetTest
{
	/**
	 * Проверка метода {@link AbstractAlphabet#getFirst()}.
	 */
	@Test
	public void getFirst()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		Character actualLetter = alphabet.getFirst();

		assertEquals('А', actualLetter);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getLast()}.
	 */
	@Test
	public void getLast()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		Character actualLetter = alphabet.getLast();

		assertEquals('я', actualLetter);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getReverse()}.
	 */
	@Test
	public void getReverse()
	{
		RussianAlphabet alphabet = new RussianAlphabet();
		List<Character> expectedList = List.of(
			'я', 'Я', 'ю', 'Ю', 'э', 'Э', 'ь', 'Ь', 'ы', 'Ы',
			'ъ', 'Ъ', 'щ', 'Щ', 'ш', 'Ш', 'ч', 'Ч', 'ц', 'Ц', 'х', 'Х',
			'ф', 'Ф', 'у', 'У', 'т', 'Т', 'с', 'С', 'р', 'Р', 'п', 'П',
			'о', 'О', 'н', 'Н', 'м', 'М', 'л', 'Л', 'к', 'К', 'й', 'Й',
			'и', 'И', 'з', 'З', 'ж', 'Ж', 'ё', 'Ё', 'е', 'Е', 'д', 'Д',
			'г', 'Г', 'в', 'В', 'б', 'Б', 'а', 'А'
		);

		List<Character> actualList = alphabet.getReverse();

		assertArrayEquals(expectedList.toArray(), actualList.toArray());

		assertEquals('А', expectedList.get(65));
		assertEquals('а', expectedList.get(64));
		assertEquals('Б', expectedList.get(63));
		assertEquals('б', expectedList.get(62));
		assertEquals('В', expectedList.get(61));
		assertEquals('в', expectedList.get(60));
		assertEquals('Г', expectedList.get(59));
		assertEquals('г', expectedList.get(58));
		assertEquals('Д', expectedList.get(57));
		assertEquals('д', expectedList.get(56));
		assertEquals('Е', expectedList.get(55));
		assertEquals('е', expectedList.get(54));
		assertEquals('Ё', expectedList.get(53));
		assertEquals('ё', expectedList.get(52));
		assertEquals('Ж', expectedList.get(51));
		assertEquals('ж', expectedList.get(50));
		assertEquals('З', expectedList.get(49));
		assertEquals('з', expectedList.get(48));
		assertEquals('И', expectedList.get(47));
		assertEquals('и', expectedList.get(46));
		assertEquals('Й', expectedList.get(45));
		assertEquals('й', expectedList.get(44));
		assertEquals('К', expectedList.get(43));
		assertEquals('к', expectedList.get(42));
		assertEquals('Л', expectedList.get(41));
		assertEquals('л', expectedList.get(40));
		assertEquals('М', expectedList.get(39));
		assertEquals('м', expectedList.get(38));
		assertEquals('Н', expectedList.get(37));
		assertEquals('н', expectedList.get(36));
		assertEquals('О', expectedList.get(35));
		assertEquals('о', expectedList.get(34));
		assertEquals('П', expectedList.get(33));
		assertEquals('п', expectedList.get(32));
		assertEquals('Р', expectedList.get(31));
		assertEquals('р', expectedList.get(30));
		assertEquals('С', expectedList.get(29));
		assertEquals('с', expectedList.get(28));
		assertEquals('Т', expectedList.get(27));
		assertEquals('т', expectedList.get(26));
		assertEquals('У', expectedList.get(25));
		assertEquals('у', expectedList.get(24));
		assertEquals('Ф', expectedList.get(23));
		assertEquals('ф', expectedList.get(22));
		assertEquals('Х', expectedList.get(21));
		assertEquals('х', expectedList.get(20));
		assertEquals('Ц', expectedList.get(19));
		assertEquals('ц', expectedList.get(18));
		assertEquals('Ч', expectedList.get(17));
		assertEquals('ч', expectedList.get(16));
		assertEquals('Ш', expectedList.get(15));
		assertEquals('ш', expectedList.get(14));
		assertEquals('Щ', expectedList.get(13));
		assertEquals('щ', expectedList.get(12));
		assertEquals('Ъ', expectedList.get(11));
		assertEquals('ъ', expectedList.get(10));
		assertEquals('Ы', expectedList.get(9));
		assertEquals('ы', expectedList.get(8));
		assertEquals('Ь', expectedList.get(7));
		assertEquals('ь', expectedList.get(6));
		assertEquals('Э', expectedList.get(5));
		assertEquals('э', expectedList.get(4));
		assertEquals('Ю', expectedList.get(3));
		assertEquals('ю', expectedList.get(2));
		assertEquals('Я', expectedList.get(1));
		assertEquals('я', expectedList.get(0));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getShuffle()}.
	 */
	@Test
	public void getShuffle()
	{
		RussianAlphabet alphabet = new RussianAlphabet();
		List<Character> expectedList = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч',
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь',
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
		);

		List<Character> actualList = alphabet.getShuffle();

		assertNotEquals(expectedList, actualList);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)}.
	 */
	@Test
	public void getRange()
	{
		RussianAlphabet alphabet = new RussianAlphabet();
		List<Character> expectedList = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П'
		);

		List<Character> actualList = alphabet.get(1, 33);

		assertArrayEquals(expectedList.toArray(), actualList.toArray());
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)} c выходом за минимальную границу.
	 */
	@Test
	public void getRangeOutOfBoundsMin()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		assertThrows(IndexOutOfBoundsException.class, () -> {
			alphabet.get(0, 33);
		});
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)}c выходом за максимальную границу.
	 */
	@Test
	public void getRangeOutOfBoundsMax()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		assertThrows(IndexOutOfBoundsException.class, () -> {
			alphabet.get(1, 67);
		});
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)} с инвертированной границей.
	 */
	@Test
	public void getRangeInversion()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		assertThrows(IllegalArgumentException.class, () -> {
			alphabet.get(33, 20);
		});
	}
	/**
	 * Проверка метода {@link AbstractAlphabet#getPosition(Character)}.
	 */
	@Test
	public void getPositionByLetter()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		Integer actualPosition = alphabet.getPosition('н');

		assertEquals(30, actualPosition);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getPosition(Character)} с некорректным значением.
	 */
	@Test
	public void getPositionByLetterNotCorrect()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		Integer actualPosition = alphabet.getPosition('W');

		assertNull(actualPosition);
	}


	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer)}.
	 */
	@Test
	public void getLetterByPosition()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		Character actualLetter = alphabet.get(28);

		assertEquals('м', actualLetter);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer)} с некорректным значением.
	 */
	@Test
	public void getLetterByPositionNotCorrect()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		Character actualLetter = alphabet.get(0);

		assertNull(actualLetter);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#allMatch(String)}.
	 */
	@Test
	public void allMatch()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.allMatch("Камчатка");

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#allMatch(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"",
		"Kino",
		"КиноW",
		"Кино Камчатка",
		"KinoКамчатка",
	})
	public void allMatchNotCorrect(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.allMatch(value);

		assertFalse(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#anyMatch(String)}.
	 */
	@Test
	public void anyMatch()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.anyMatch("Дождь для нас");

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#anyMatch(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"",
		"Kino",
	})
	public void anyMatchNotCorrect(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.anyMatch("");

		assertFalse(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#noneMatch(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"Kamchatka",
	})
	public void noneMatch(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.noneMatch(value);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#noneMatch(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"",
		"KinoЪ",
	})
	public void noneMatchNotCorrect(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.noneMatch(value);

		assertFalse(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#contains(Character)}.
	 */
	@Test
	public void contains()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.contains('У');

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#contains(Character)} с некорректным значением.
	 */
	@Test
	public void containsNotCorrect()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.contains('W');

		assertFalse(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getRandom(Integer)}.
	 */
	@Test
	public void getRandom()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		List<Character> actualList1 = alphabet.getRandom(0);
		List<Character> actualList2 = alphabet.getRandom(1);
		List<Character> actualList3 = alphabet.getRandom(20);
		List<Character> actualList4 = alphabet.getRandom(100);

		assertEquals(0, actualList1.size());
		assertEquals(1, actualList2.size());
		assertEquals(20, actualList3.size());
		assertEquals(100, actualList4.size());
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#clearMismatches(String)}.
	 */
	@Test
	public void clearMismatches()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		String actualString = alphabet.clearMismatches(
				"Солнце мое, взгляни на меня - My ладонь превратилась в кулак"
		);

		assertEquals("Солнцемоевзглянинаменяладоньпревратиласьвкулак", actualString);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#clearMatches(String)}.
	 */
	@Test
	public void clearMatches()
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		String actualString = alphabet.clearMatches(
				"Солнце мое, взгляни на меня - My ладонь превратилась в кулак"
		);

		assertEquals(" ,    - My    ", actualString);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#isSorted(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"а", "аб", "ааббвв", "еёжз", "ЕЁЖЗ", "АбвгДеЁ", "в", "Я", "ББ", "ЁееддГб", "Лк",
		"АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя",
		"яЯюЮэЭьЬыЫъЪщЩшШчЧцЦхХфФуУтТсСрРпПоОнНмМлЛкКйЙиИзЗжЖёЁеЕдДгГвВбБаА",
		"ЯЮЭЬЫЪЩШЧЦХФУТСРПОНМЛКЙИЗЖЁЕДГВБА",
		"АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ",
		"яюэьыъщшчцхфутсрпонмлкйизжёедгвба",
		"абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
	})
	public void isSorted(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSorted(value);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#isSorted(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "0", "абв1где", "абА", "АЁв", "едг1вба",
		"ЯяАаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮю",
		"юЮэЭьЬыЫъЪщЩшШчЧцЦхХфФуУтТсСрРпПоОнНмМлЛкКйЙиИзЗжЖёЁеЕдДгГвВбБаАяЯ"
	})
	public void isSortedNotCorrect(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSorted(value);

		assertFalse(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#isSortedAsc(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"а", "аб", "ааббвв", "еёжз", "ЕЁЖЗ", "АбвгДеЁ",
		"АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя",
		"АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ",
		"абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
	})
	public void isSortedAsc(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSortedAsc(value);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#isSortedAsc(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "0", "ба", "Ба", "абв1где",
		"ЯяАаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮю"
	})
	public void isSortedAscNotCorrect(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSortedAsc(value);

		assertFalse(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#isSortedDesc(String)}.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"в", "Я", "ББ", "ЁееддГб", "Лк",
		"яЯюЮэЭьЬыЫъЪщЩшШчЧцЦхХфФуУтТсСрРпПоОнНмМлЛкКйЙиИзЗжЖёЁеЕдДгГвВбБаА",
		"ЯЮЭЬЫЪЩШЧЦХФУТСРПОНМЛКЙИЗЖЁЕДГВБА",
		"яюэьыъщшчцхфутсрпонмлкйизжёедгвба"
	})
	public void isSortedDesc(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSortedDesc(value);

		assertTrue(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#isSortedDesc(String)} с некорректным значением.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"", "0", "аб", "Аб", "едг1вба",
		"юЮэЭьЬыЫъЪщЩшШчЧцЦхХфФуУтТсСрРпПоОнНмМлЛкКйЙиИзЗжЖёЁеЕдДгГвВбБаАяЯ"
	})
	public void isSortedDescNotCorrect(String value)
	{
		RussianAlphabet alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSortedDesc(value);

		assertFalse(actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#toArray()}.
	 */
	@Test
	public void toArray()
	{
		RussianAlphabet alphabet = new RussianAlphabet();
		Character[] expectedArray = new Character[]{
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч',
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь',
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
		};

		Character[] actualArray = alphabet.toArray();

		assertArrayEquals(expectedArray, actualArray);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#toString(String)}.
	 */
	@Test
	public void toStringSeparator()
	{
		RussianAlphabet alphabet = new RussianAlphabet();
		String expectedString = "А,а,Б,б,В,в,Г,г,Д,д,Е,е,Ё,ё,Ж,ж,З,з,И,и," +
			"Й,й,К,к,Л,л,М,м,Н,н,О,о,П,п,Р,р,С,с,Т,т,У,у,Ф,ф,Х,х," +
			"Ц,ц,Ч,ч,Ш,ш,Щ,щ,Ъ,ъ,Ы,ы,Ь,ь,Э,э,Ю,ю,Я,я";

		String actualString = alphabet.toString(",");

		assertEquals(expectedString, actualString);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#toString()}.
	 */
	@Test
	public void testToString()
	{
		RussianAlphabet alphabet = new RussianAlphabet();
		String expectedString = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";

		String actualString = alphabet.toString();

		assertEquals(expectedString, actualString);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#statistics(String)}.
	 */
	@Test
	public void statistics()
	{
		RussianAlphabet alphabet = new RussianAlphabet();
		String value = """
			Дом стоит, свет горит
			Из окна видна даль
			Так откуда взялась печаль?
			""";

		Map<Character, Integer> actualMap = alphabet.statistics(value);

		assertEquals(1, actualMap.get('Д'));
		assertEquals(1, actualMap.get('Т'));
		assertEquals(1, actualMap.get('п'));
		assertEquals(5, actualMap.get('о'));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#statistics(String)} с отсутствующими буквами в значении.
	 */
	@Test
	public void statisticsNotLetter()
	{
		RussianAlphabet alphabet = new RussianAlphabet();
		String value = """
			И я должен прийти к девяти, на работу свою,
			Но сейчас уже без десяти, а я только встаю
			""";

		Map<Character, Integer> actualMap = alphabet.statistics(value);

		assertEquals(0, actualMap.get('щ'));
		assertEquals(0, actualMap.get('Я'));
		assertEquals(0, actualMap.get('ъ'));
		assertEquals(0, actualMap.get('Ж'));
	}
}