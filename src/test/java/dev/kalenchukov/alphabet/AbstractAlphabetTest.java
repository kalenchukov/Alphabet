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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

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
		Alphabetical alphabet = new RussianAlphabet();

		char actualLetter = alphabet.getFirst();

		assertThat(actualLetter).isEqualTo('А');
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getLast()}.
	 */
	@Test
	public void getLast()
	{
		Alphabetical alphabet = new RussianAlphabet();

		char actualLetter = alphabet.getLast();

		assertThat(actualLetter).isEqualTo('я');
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getReverse()}.
	 */
	@Test
	public void getReverse()
	{
		Alphabetical alphabet = new RussianAlphabet();
		List<Character> expectedList = List.of(
			'я', 'Я', 'ю', 'Ю', 'э', 'Э', 'ь', 'Ь', 'ы', 'Ы',
			'ъ', 'Ъ', 'щ', 'Щ', 'ш', 'Ш', 'ч', 'Ч', 'ц', 'Ц', 'х', 'Х',
			'ф', 'Ф', 'у', 'У', 'т', 'Т', 'с', 'С', 'р', 'Р', 'п', 'П',
			'о', 'О', 'н', 'Н', 'м', 'М', 'л', 'Л', 'к', 'К', 'й', 'Й',
			'и', 'И', 'з', 'З', 'ж', 'Ж', 'ё', 'Ё', 'е', 'Е', 'д', 'Д',
			'г', 'Г', 'в', 'В', 'б', 'Б', 'а', 'А'
		);

		List<Character> actualList = alphabet.getReverse();

		assertThat(actualList).containsSequence(expectedList);

		assertThat(expectedList.get(65)).isEqualTo('А');
		assertThat(expectedList.get(64)).isEqualTo('а');
		assertThat(expectedList.get(63)).isEqualTo('Б');
		assertThat(expectedList.get(62)).isEqualTo('б');
		assertThat(expectedList.get(61)).isEqualTo('В');
		assertThat(expectedList.get(60)).isEqualTo('в');
		assertThat(expectedList.get(59)).isEqualTo('Г');
		assertThat(expectedList.get(58)).isEqualTo('г');
		assertThat(expectedList.get(57)).isEqualTo('Д');
		assertThat(expectedList.get(56)).isEqualTo('д');
		assertThat(expectedList.get(55)).isEqualTo('Е');
		assertThat(expectedList.get(54)).isEqualTo('е');
		assertThat(expectedList.get(53)).isEqualTo('Ё');
		assertThat(expectedList.get(52)).isEqualTo('ё');
		assertThat(expectedList.get(51)).isEqualTo('Ж');
		assertThat(expectedList.get(50)).isEqualTo('ж');
		assertThat(expectedList.get(49)).isEqualTo('З');
		assertThat(expectedList.get(48)).isEqualTo('з');
		assertThat(expectedList.get(47)).isEqualTo('И');
		assertThat(expectedList.get(46)).isEqualTo('и');
		assertThat(expectedList.get(45)).isEqualTo('Й');
		assertThat(expectedList.get(44)).isEqualTo('й');
		assertThat(expectedList.get(43)).isEqualTo('К');
		assertThat(expectedList.get(42)).isEqualTo('к');
		assertThat(expectedList.get(41)).isEqualTo('Л');
		assertThat(expectedList.get(40)).isEqualTo('л');
		assertThat(expectedList.get(39)).isEqualTo('М');
		assertThat(expectedList.get(38)).isEqualTo('м');
		assertThat(expectedList.get(37)).isEqualTo('Н');
		assertThat(expectedList.get(36)).isEqualTo('н');
		assertThat(expectedList.get(35)).isEqualTo('О');
		assertThat(expectedList.get(34)).isEqualTo('о');
		assertThat(expectedList.get(33)).isEqualTo('П');
		assertThat(expectedList.get(32)).isEqualTo('п');
		assertThat(expectedList.get(31)).isEqualTo('Р');
		assertThat(expectedList.get(30)).isEqualTo('р');
		assertThat(expectedList.get(29)).isEqualTo('С');
		assertThat(expectedList.get(28)).isEqualTo('с');
		assertThat(expectedList.get(27)).isEqualTo('Т');
		assertThat(expectedList.get(26)).isEqualTo('т');
		assertThat(expectedList.get(25)).isEqualTo('У');
		assertThat(expectedList.get(24)).isEqualTo('у');
		assertThat(expectedList.get(23)).isEqualTo('Ф');
		assertThat(expectedList.get(22)).isEqualTo('ф');
		assertThat(expectedList.get(21)).isEqualTo('Х');
		assertThat(expectedList.get(20)).isEqualTo('х');
		assertThat(expectedList.get(19)).isEqualTo('Ц');
		assertThat(expectedList.get(18)).isEqualTo('ц');
		assertThat(expectedList.get(17)).isEqualTo('Ч');
		assertThat(expectedList.get(16)).isEqualTo('ч');
		assertThat(expectedList.get(15)).isEqualTo('Ш');
		assertThat(expectedList.get(14)).isEqualTo('ш');
		assertThat(expectedList.get(13)).isEqualTo('Щ');
		assertThat(expectedList.get(12)).isEqualTo('щ');
		assertThat(expectedList.get(11)).isEqualTo('Ъ');
		assertThat(expectedList.get(10)).isEqualTo('ъ');
		assertThat(expectedList.get(9)).isEqualTo('Ы');
		assertThat(expectedList.get(8)).isEqualTo('ы');
		assertThat(expectedList.get(7)).isEqualTo('Ь');
		assertThat(expectedList.get(6)).isEqualTo('ь');
		assertThat(expectedList.get(5)).isEqualTo('Э');
		assertThat(expectedList.get(4)).isEqualTo('э');
		assertThat(expectedList.get(3)).isEqualTo('Ю');
		assertThat(expectedList.get(2)).isEqualTo('ю');
		assertThat(expectedList.get(1)).isEqualTo('Я');
		assertThat(expectedList.get(0)).isEqualTo('я');
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getShuffle()}.
	 */
	@Test
	public void getShuffle()
	{
		Alphabetical alphabet = new RussianAlphabet();
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

		assertThat(actualList).doesNotContainSequence(expectedList);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)}.
	 */
	@Test
	public void getRange()
	{
		Alphabetical alphabet = new RussianAlphabet();
		List<Character> expectedList = List.of(
			'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д',
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и',
			'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н',
			'О', 'о', 'П'
		);

		List<Character> actualList = alphabet.get(1, 33);

		assertThat(actualList).containsSequence(expectedList);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)} c выходом за минимальную границу.
	 */
	@Test
	public void getRangeOutOfBoundsMin()
	{
		Alphabetical alphabet = new RussianAlphabet();

		assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
			alphabet.get(0, 33);
		});
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)}c выходом за максимальную границу.
	 */
	@Test
	public void getRangeOutOfBoundsMax()
	{
		Alphabetical alphabet = new RussianAlphabet();

		assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
			alphabet.get(1, 67);
		});
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer, Integer)} с инвертированной границей.
	 */
	@Test
	public void getRangeInversion()
	{
		Alphabetical alphabet = new RussianAlphabet();

		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
			alphabet.get(33, 20);
		});
	}
	/**
	 * Проверка метода {@link AbstractAlphabet#getPosition(Character)}.
	 */
	@Test
	public void getPositionByLetter()
	{
		Alphabetical alphabet = new RussianAlphabet();

		Integer actualPosition = alphabet.getPosition('н');

		assertThat(actualPosition).isEqualTo(30);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getPosition(Character)} с некорректным значением.
	 */
	@Test
	public void getPositionByLetterNotCorrect()
	{
		Alphabetical alphabet = new RussianAlphabet();

		Integer actualPosition = alphabet.getPosition('W');

		assertThat(actualPosition).isNull();
	}


	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer)}.
	 */
	@Test
	public void getLetterByPosition()
	{
		Alphabetical alphabet = new RussianAlphabet();

		Character actualLetter = alphabet.get(28);

		assertThat(actualLetter).isEqualTo('м');
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#get(Integer)} с некорректным значением.
	 */
	@Test
	public void getLetterByPositionNotCorrect()
	{
		Alphabetical alphabet = new RussianAlphabet();

		Character actualLetter = alphabet.get(0);

		assertThat(actualLetter).isNull();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#allMatch(String)}.
	 */
	@Test
	public void allMatch()
	{
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.allMatch("Камчатка");

		assertThat(actual).isTrue();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.allMatch(value);

		assertThat(actual).isFalse();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#anyMatch(String)}.
	 */
	@Test
	public void anyMatch()
	{
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.anyMatch("Дождь для нас");

		assertThat(actual).isTrue();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.anyMatch("");

		assertThat(actual).isFalse();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.noneMatch(value);

		assertThat(actual).isTrue();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.noneMatch(value);

		assertThat(actual).isFalse();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#contains(Character)}.
	 */
	@Test
	public void contains()
	{
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.contains('У');

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#contains(Character)} с некорректным значением.
	 */
	@Test
	public void containsNotCorrect()
	{
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.contains('W');

		assertThat(actual).isFalse();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#getRandom(Integer)}.
	 */
	@Test
	public void getRandom()
	{
		Alphabetical alphabet = new RussianAlphabet();

		List<Character> actualList1 = alphabet.getRandom(0);
		List<Character> actualList2 = alphabet.getRandom(1);
		List<Character> actualList3 = alphabet.getRandom(20);
		List<Character> actualList4 = alphabet.getRandom(100);

		assertThat(actualList1).hasSize(0);
		assertThat(actualList2).hasSize(1);
		assertThat(actualList3).hasSize(20);
		assertThat(actualList4).hasSize(100);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#clearMismatches(String)}.
	 */
	@Test
	public void clearMismatches()
	{
		Alphabetical alphabet = new RussianAlphabet();

		String actualString = alphabet.clearMismatches(
				"Солнце мое, взгляни на меня - My ладонь превратилась в кулак"
		);

		assertThat(actualString).isEqualTo("Солнцемоевзглянинаменяладоньпревратиласьвкулак");
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#clearMatches(String)}.
	 */
	@Test
	public void clearMatches()
	{
		Alphabetical alphabet = new RussianAlphabet();

		String actualString = alphabet.clearMatches(
				"Солнце мое, взгляни на меня - My ладонь превратилась в кулак"
		);

		assertThat(actualString).isEqualTo(" ,    - My    ");
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSorted(value);

		assertThat(actual).isTrue();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSorted(value);

		assertThat(actual).isFalse();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSortedAsc(value);

		assertThat(actual).isTrue();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSortedAsc(value);

		assertThat(actual).isFalse();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSortedDesc(value);

		assertThat(actual).isTrue();
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
		Alphabetical alphabet = new RussianAlphabet();

		boolean actual = alphabet.isSortedDesc(value);

		assertThat(actual).isFalse();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#toArray()}.
	 */
	@Test
	public void toArray()
	{
		Alphabetical alphabet = new RussianAlphabet();
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

		assertThat(actualArray).containsSequence(expectedArray);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#toString(String)}.
	 */
	@Test
	public void toStringSeparator()
	{
		Alphabetical alphabet = new RussianAlphabet();
		String expectedString = "А,а,Б,б,В,в,Г,г,Д,д,Е,е,Ё,ё,Ж,ж,З,з,И,и," +
			"Й,й,К,к,Л,л,М,м,Н,н,О,о,П,п,Р,р,С,с,Т,т,У,у,Ф,ф,Х,х," +
			"Ц,ц,Ч,ч,Ш,ш,Щ,щ,Ъ,ъ,Ы,ы,Ь,ь,Э,э,Ю,ю,Я,я";

		String actualString = alphabet.toString(",");

		assertThat(actualString).isEqualTo(expectedString);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#toString()}.
	 */
	@Test
	public void testToString()
	{
		Alphabetical alphabet = new RussianAlphabet();
		String expectedString = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";

		String actualString = alphabet.toString();

		assertThat(actualString).isEqualTo(expectedString);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#statistics(String)}.
	 */
	@Test
	public void statistics()
	{
		Alphabetical alphabet = new RussianAlphabet();
		String value = """
			Дом стоит, свет горит
			Из окна видна даль
			Так откуда взялась печаль?
			""";

		Map<Character, Integer> actualMap = alphabet.statistics(value);

		assertThat(actualMap.get('Д')).isEqualTo(1);
		assertThat(actualMap.get('Т')).isEqualTo(1);
		assertThat(actualMap.get('п')).isEqualTo(1);
		assertThat(actualMap.get('о')).isEqualTo(5);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#statistics(String)} с отсутствующими буквами в значении.
	 */
	@Test
	public void statisticsNotLetter()
	{
		Alphabetical alphabet = new RussianAlphabet();
		String value = """
			И я должен прийти к девяти, на работу свою,
			Но сейчас уже без десяти, а я только встаю
			""";

		Map<Character, Integer> actualMap = alphabet.statistics(value);

		assertThat(actualMap.get('щ')).isEqualTo(0);
		assertThat(actualMap.get('Я')).isEqualTo(0);
		assertThat(actualMap.get('ъ')).isEqualTo(0);
		assertThat(actualMap.get('Ж')).isEqualTo(0);
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		Alphabetical alphabet1 = new RussianAlphabet();
		Alphabetical alphabet2 = new RussianAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#equals(Object)} с {@code null}.
	 */
	@Test
	public void testEqualsNull()
	{
		Alphabetical alphabet1 = new RussianAlphabet();
		Alphabetical alphabet2 = null;

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isFalse();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#equals(Object)} с разными классами.
	 */
	@Test
	public void testEqualsDifferentClass()
	{
		Alphabetical alphabet1 = new RussianAlphabet();
		Alphabetical alphabet2 = new EnglishAlphabet();

		boolean actual = alphabet1.equals(alphabet2);

		assertThat(actual).isFalse();
	}

	/**
	 * Проверка метода {@link AbstractAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		Alphabetical alphabet1 = new RussianAlphabet();
		Alphabetical alphabet2 = new RussianAlphabet();

		int expectedHashCode = alphabet1.hashCode();
		int actualHashCode = alphabet2.hashCode();

		assertThat(actualHashCode).isEqualTo(expectedHashCode);
	}
}