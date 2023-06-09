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

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link AbstractAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class AbstractAlphabetTest
{
	private static final Alphabetical ALPHABET = new RussianAlphabet();

	/**
	 * Проверка метода {@link AbstractAlphabet#getFirst()}.
	 */
	@Test
	public void getFirst()
	{
		assertEquals('А', ALPHABET.getFirst());
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getLast()}.
	 */
	@Test
	public void getLast()
	{
		assertEquals('я', ALPHABET.getLast());
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getReverse()}.
	 */
	@Test
	public void getReverse()
	{
		List<Character> expected = List.of(
			'я', 'Я', 'ю', 'Ю', 'э', 'Э', 'ь', 'Ь', 'ы', 'Ы',
			'ъ', 'Ъ', 'щ', 'Щ', 'ш', 'Ш', 'ч', 'Ч', 'ц', 'Ц', 'х', 'Х',
			'ф', 'Ф', 'у', 'У', 'т', 'Т', 'с', 'С', 'р', 'Р', 'п', 'П',
			'о', 'О', 'н', 'Н', 'м', 'М', 'л', 'Л', 'к', 'К', 'й', 'Й',
			'и', 'И', 'з', 'З', 'ж', 'Ж', 'ё', 'Ё', 'е', 'Е', 'д', 'Д',
			'г', 'Г', 'в', 'В', 'б', 'Б', 'а', 'А'
		);

		assertArrayEquals(expected.toArray(), ALPHABET.getReverse().toArray());

		assertEquals(Optional.of('А'), Optional.ofNullable(expected.get(65)));
		assertEquals(Optional.of('а'), Optional.ofNullable(expected.get(64)));
		assertEquals(Optional.of('Б'), Optional.ofNullable(expected.get(63)));
		assertEquals(Optional.of('б'), Optional.ofNullable(expected.get(62)));
		assertEquals(Optional.of('В'), Optional.ofNullable(expected.get(61)));
		assertEquals(Optional.of('в'), Optional.ofNullable(expected.get(60)));
		assertEquals(Optional.of('Г'), Optional.ofNullable(expected.get(59)));
		assertEquals(Optional.of('г'), Optional.ofNullable(expected.get(58)));
		assertEquals(Optional.of('Д'), Optional.ofNullable(expected.get(57)));
		assertEquals(Optional.of('д'), Optional.ofNullable(expected.get(56)));
		assertEquals(Optional.of('Е'), Optional.ofNullable(expected.get(55)));
		assertEquals(Optional.of('е'), Optional.ofNullable(expected.get(54)));
		assertEquals(Optional.of('Ё'), Optional.ofNullable(expected.get(53)));
		assertEquals(Optional.of('ё'), Optional.ofNullable(expected.get(52)));
		assertEquals(Optional.of('Ж'), Optional.ofNullable(expected.get(51)));
		assertEquals(Optional.of('ж'), Optional.ofNullable(expected.get(50)));
		assertEquals(Optional.of('З'), Optional.ofNullable(expected.get(49)));
		assertEquals(Optional.of('з'), Optional.ofNullable(expected.get(48)));
		assertEquals(Optional.of('И'), Optional.ofNullable(expected.get(47)));
		assertEquals(Optional.of('и'), Optional.ofNullable(expected.get(46)));
		assertEquals(Optional.of('Й'), Optional.ofNullable(expected.get(45)));
		assertEquals(Optional.of('й'), Optional.ofNullable(expected.get(44)));
		assertEquals(Optional.of('К'), Optional.ofNullable(expected.get(43)));
		assertEquals(Optional.of('к'), Optional.ofNullable(expected.get(42)));
		assertEquals(Optional.of('Л'), Optional.ofNullable(expected.get(41)));
		assertEquals(Optional.of('л'), Optional.ofNullable(expected.get(40)));
		assertEquals(Optional.of('М'), Optional.ofNullable(expected.get(39)));
		assertEquals(Optional.of('м'), Optional.ofNullable(expected.get(38)));
		assertEquals(Optional.of('Н'), Optional.ofNullable(expected.get(37)));
		assertEquals(Optional.of('н'), Optional.ofNullable(expected.get(36)));
		assertEquals(Optional.of('О'), Optional.ofNullable(expected.get(35)));
		assertEquals(Optional.of('о'), Optional.ofNullable(expected.get(34)));
		assertEquals(Optional.of('П'), Optional.ofNullable(expected.get(33)));
		assertEquals(Optional.of('п'), Optional.ofNullable(expected.get(32)));
		assertEquals(Optional.of('Р'), Optional.ofNullable(expected.get(31)));
		assertEquals(Optional.of('р'), Optional.ofNullable(expected.get(30)));
		assertEquals(Optional.of('С'), Optional.ofNullable(expected.get(29)));
		assertEquals(Optional.of('с'), Optional.ofNullable(expected.get(28)));
		assertEquals(Optional.of('Т'), Optional.ofNullable(expected.get(27)));
		assertEquals(Optional.of('т'), Optional.ofNullable(expected.get(26)));
		assertEquals(Optional.of('У'), Optional.ofNullable(expected.get(25)));
		assertEquals(Optional.of('у'), Optional.ofNullable(expected.get(24)));
		assertEquals(Optional.of('Ф'), Optional.ofNullable(expected.get(23)));
		assertEquals(Optional.of('ф'), Optional.ofNullable(expected.get(22)));
		assertEquals(Optional.of('Х'), Optional.ofNullable(expected.get(21)));
		assertEquals(Optional.of('х'), Optional.ofNullable(expected.get(20)));
		assertEquals(Optional.of('Ц'), Optional.ofNullable(expected.get(19)));
		assertEquals(Optional.of('ц'), Optional.ofNullable(expected.get(18)));
		assertEquals(Optional.of('Ч'), Optional.ofNullable(expected.get(17)));
		assertEquals(Optional.of('ч'), Optional.ofNullable(expected.get(16)));
		assertEquals(Optional.of('Ш'), Optional.ofNullable(expected.get(15)));
		assertEquals(Optional.of('ш'), Optional.ofNullable(expected.get(14)));
		assertEquals(Optional.of('Щ'), Optional.ofNullable(expected.get(13)));
		assertEquals(Optional.of('щ'), Optional.ofNullable(expected.get(12)));
		assertEquals(Optional.of('Ъ'), Optional.ofNullable(expected.get(11)));
		assertEquals(Optional.of('ъ'), Optional.ofNullable(expected.get(10)));
		assertEquals(Optional.of('Ы'), Optional.ofNullable(expected.get(9)));
		assertEquals(Optional.of('ы'), Optional.ofNullable(expected.get(8)));
		assertEquals(Optional.of('Ь'), Optional.ofNullable(expected.get(7)));
		assertEquals(Optional.of('ь'), Optional.ofNullable(expected.get(6)));
		assertEquals(Optional.of('Э'), Optional.ofNullable(expected.get(5)));
		assertEquals(Optional.of('э'), Optional.ofNullable(expected.get(4)));
		assertEquals(Optional.of('Ю'), Optional.ofNullable(expected.get(3)));
		assertEquals(Optional.of('ю'), Optional.ofNullable(expected.get(2)));
		assertEquals(Optional.of('Я'), Optional.ofNullable(expected.get(1)));
		assertEquals(Optional.of('я'), Optional.ofNullable(expected.get(0)));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getShuffle()}.
	 */
	@Test
	public void getShuffle()
	{
		List<Character> expected = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т',
			'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч',
			'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь',
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
		);

		List<Character> actual = ALPHABET.getShuffle();

		assertNotEquals(expected, actual);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)}.
	 */
	@Test
	public void getRange()
	{
		List<Character> expected = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П'
		);

		List<Character> actual = ALPHABET.get(1, 33);

		assertArrayEquals(expected.toArray(), actual.toArray());
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)} c выходом за минимальную границу.
	 */
	@Test
	public void getRangeOutOfBoundsMin()
	{
		assertThrows(IndexOutOfBoundsException.class, () -> {
			ALPHABET.get(0, 33);
		});
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)}c выходом за максимальную границу.
	 */
	@Test
	public void getRangeOutOfBoundsMax()
	{
		assertThrows(IndexOutOfBoundsException.class, () -> {
			ALPHABET.get(1, 67);
		});
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)} с инвертированной границей.
	 */
	@Test
	public void getRangeInversion()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			ALPHABET.get(33, 20);
		});
	}
	/**
	 * Проверка метода {@link AbstractAlphabet#getPosition(Character)}.
	 */
	@Test
	public void getPositionByLetter()
	{
		assertEquals(Optional.of(30), Optional.ofNullable(ALPHABET.getPosition('н')));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getPosition(Character)} с некорректным значением.
	 */
	@Test
	public void getPositionByLetterNotCorrect()
	{
		assertNull(ALPHABET.getPosition('W'));
	}


	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer)}.
	 */
	@Test
	public void getLetterByPosition()
	{
		assertEquals(Optional.of('м'), Optional.ofNullable(ALPHABET.get(28)));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer)} с некорректным значением.
	 */
	@Test
	public void getLetterByPositionNotCorrect()
	{
		assertNull(ALPHABET.get(0));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#allMatch(String)}.
	 */
	@Test
	public void allMatch()
	{
		assertTrue(ALPHABET.allMatch("Камчатка"));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#allMatch(String)} с некорректным значением.
	 */
	@Test
	public void allMatchNotCorrect()
	{
		assertFalse(ALPHABET.allMatch(""));
		assertFalse(ALPHABET.allMatch("Kino"));
		assertFalse(ALPHABET.allMatch("КиноW"));
		assertFalse(ALPHABET.allMatch("Кино Камчатка"));
		assertFalse(ALPHABET.allMatch("KinoКамчатка"));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#anyMatch(String)}.
	 */
	@Test
	public void anyMatch()
	{
		assertTrue(ALPHABET.anyMatch("Дождь для нас"));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#anyMatch(String)} с некорректным значением.
	 */
	@Test
	public void anyMatchNotCorrect()
	{
		assertFalse(ALPHABET.anyMatch(""));
		assertFalse(ALPHABET.anyMatch("Kino"));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#noneMatch(String)}.
	 */
	@Test
	public void noneMatch()
	{
		assertTrue(ALPHABET.noneMatch("Kamchatka"));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#noneMatch(String)} с некорректным значением.
	 */
	@Test
	public void noneMatchNotCorrect()
	{
		assertFalse(ALPHABET.noneMatch(""));
		assertFalse(ALPHABET.noneMatch("KinoЪ"));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#contains(Character)}.
	 */
	@Test
	public void contains()
	{
		assertTrue(ALPHABET.contains('У'));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#contains(Character)} с некорректным значением.
	 */
	@Test
	public void containsNotCorrect()
	{
		assertFalse(ALPHABET.contains('W'));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getRandom(Integer)}.
	 */
	@Test
	public void getRandom()
	{
		assertEquals(0, ALPHABET.getRandom(0).size());
		assertEquals(1, ALPHABET.getRandom(1).size());
		assertEquals(20, ALPHABET.getRandom(20).size());
		assertEquals(100, ALPHABET.getRandom(100).size());
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#clearMismatches(String)}.
	 */
	@Test
	public void clearMismatches()
	{
		assertEquals(
			"Солнцемоевзглянинаменяладоньпревратиласьвкулак",
			ALPHABET.clearMismatches("Солнце мое, взгляни на меня - My ладонь превратилась в кулак")
		);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#clearMatches(String)}.
	 */
	@Test
	public void clearMatches()
	{
		assertEquals(
			" ,    - My    ",
			ALPHABET.clearMatches("Солнце мое, взгляни на меня - My ладонь превратилась в кулак")
		);
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
		assertTrue(ALPHABET.isSorted(value));
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
		assertFalse(ALPHABET.isSorted(value));
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
		assertTrue(ALPHABET.isSortedAsc(value));
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
		assertFalse(ALPHABET.isSortedAsc(value));
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
		assertTrue(ALPHABET.isSortedDesc(value));
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
		assertFalse(ALPHABET.isSortedDesc(value));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#toArray()}.
	 */
	@Test
	public void toArray()
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
	 * Проверка метода {@link AbstractAlphabet#toString(String)}.
	 */
	@Test
	public void toStringSeparator()
	{
		String expected = "А,а,Б,б,В,в,Г,г,Д,д,Е,е,Ё,ё,Ж,ж,З,з,И,и," +
			"Й,й,К,к,Л,л,М,м,Н,н,О,о,П,п,Р,р,С,с,Т,т,У,у,Ф,ф,Х,х," +
			"Ц,ц,Ч,ч,Ш,ш,Щ,щ,Ъ,ъ,Ы,ы,Ь,ь,Э,э,Ю,ю,Я,я";

		assertEquals(expected, ALPHABET.toString(","));
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#toString()}.
	 */
	@Test
	public void testToString()
	{
		String expected = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";

		assertEquals(expected, ALPHABET.toString());
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#statistics(String)}.
	 */
	@Test
	public void statistics()
	{
		String value = """
			Дом стоит, свет горит
			Из окна видна даль
			Так откуда взялась печаль?
			""";

		Map<Character, Integer> statistics = ALPHABET.statistics(value);

		assertEquals(1, statistics.get('Д').intValue());
		assertEquals(1, statistics.get('Т').intValue());
		assertEquals(1, statistics.get('п').intValue());
		assertEquals(5, statistics.get('о').intValue());
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#statistics(String)} с некорректным значением.
	 */
	@Test
	public void statisticsNotCorrect()
	{
		String value = """
			И я должен прийти к девяти, на работу свою,
			Но сейчас уже без десяти, а я только встаю
			""";

		Map<Character, Integer> statistics = ALPHABET.statistics(value);

		assertEquals(0, statistics.get('щ').intValue());
		assertEquals(0, statistics.get('Я').intValue());
		assertEquals(0, statistics.get('ъ').intValue());
		assertEquals(0, statistics.get('Ж').intValue());
	}
}