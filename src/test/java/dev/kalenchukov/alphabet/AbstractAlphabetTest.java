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

import org.junit.jupiter.api.Nested;
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
	 * Класс проверки метода {@link AbstractAlphabet#toList(int, int)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class ToList
	{
		/**
		 * Проверка метода {@link AbstractAlphabet#toList(int, int)}.
		 */
		@Test
		public void toListRange()
		{
			Alphabetical alphabet = new RussianAlphabet();
			List<Character> expectedList = List.of(
				'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е', 'е', 'Ё', 'ё',
				'Ж', 'ж', 'З', 'з', 'И', 'и', 'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м',
				'Н', 'н', 'О', 'о', 'П'
			);

			List<Character> actualList = alphabet.toList(1, 33);

			assertThat(actualList).containsSequence(expectedList);
		}

		/**
		 * Проверка метода {@link AbstractAlphabet#toList(int, int)} с выходом за минимальную границу.
		 */
		@Test
		public void toListRangeOutOfBoundsMin()
		{
			Alphabetical alphabet = new RussianAlphabet();

			assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
				alphabet.toList(0, 33);
			});
		}

		/**
		 * Проверка метода {@link AbstractAlphabet#toList(int, int)}c выходом за максимальную границу.
		 */
		@Test
		public void toListRangeOutOfBoundsMax()
		{
			Alphabetical alphabet = new RussianAlphabet();

			assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
				alphabet.toList(1, 67);
			});
		}

		/**
		 * Проверка метода {@link AbstractAlphabet#toList(int, int)} с инвертированной границей.
		 */
		@Test
		public void toListRangeInversion()
		{
			Alphabetical alphabet = new RussianAlphabet();

			assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
				alphabet.toList(33, 20);
			});
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#getPosition(char)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class GetPosition
	{
		/**
		 * Проверка метода {@link AbstractAlphabet#getPosition(char)}.
		 */
		@Test
		public void getPositionByLetter()
		{
			Alphabetical alphabet = new RussianAlphabet();

			Integer actualPosition = alphabet.getPosition('н');

			assertThat(actualPosition).isEqualTo(30);
		}

		/**
		 * Проверка метода {@link AbstractAlphabet#getPosition(char)} с некорректным значением.
		 */
		@Test
		public void getPositionByLetterNotCorrect()
		{
			Alphabetical alphabet = new RussianAlphabet();

			Integer actualPosition = alphabet.getPosition('W');

			assertThat(actualPosition).isNull();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#get(int)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Get
	{
		/**
		 * Проверка метода {@link AbstractAlphabet#get(int)}.
		 */
		@Test
		public void get()
		{
			Alphabetical alphabet = new RussianAlphabet();

			Character actualLetter = alphabet.get(28);

			assertThat(actualLetter).isEqualTo('м');
		}

		/**
		 * Проверка метода {@link AbstractAlphabet#get(int)} с некорректным значением.
		 */
		@Test
		public void getNotCorrect()
		{
			Alphabetical alphabet = new RussianAlphabet();

			Character actualLetter = alphabet.get(0);

			assertThat(actualLetter).isNull();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#allMatch(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class AllMatch
	{
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
			"", "Kino", "КиноW", "Кино Камчатка", "KinoКамчатка",
		})
		public void allMatchNotCorrect(String value)
		{
			Alphabetical alphabet = new RussianAlphabet();

			boolean actual = alphabet.allMatch(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#anyMatch(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class AnyMatch
	{
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
			"", "Kino",
		})
		public void anyMatchNotCorrect(String value)
		{
			Alphabetical alphabet = new RussianAlphabet();

			boolean actual = alphabet.anyMatch(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#noneMatch(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class NoneMatch
	{
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
			"", "KinoЪ",
		})
		public void noneMatchNotCorrect(String value)
		{
			Alphabetical alphabet = new RussianAlphabet();

			boolean actual = alphabet.noneMatch(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#contains(char)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Contains
	{
		/**
		 * Проверка метода {@link AbstractAlphabet#contains(char)}.
		 */
		@Test
		public void contains()
		{
			Alphabetical alphabet = new RussianAlphabet();

			boolean actual = alphabet.contains('У');

			assertThat(actual).isTrue();
		}

		/**
		 * Проверка метода {@link AbstractAlphabet#contains(char)} с некорректным значением.
		 */
		@Test
		public void containsNotCorrect()
		{
			Alphabetical alphabet = new RussianAlphabet();

			boolean actual = alphabet.contains('W');

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#isSorted(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class IsSorted
	{
		/**
		 * Проверка метода {@link AbstractAlphabet#isSorted(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"а",
			"аб",
			"ааббвв",
			"еёжз",
			"ЕЁЖЗ",
			"АбвгДеЁ",
			"в",
			"Я",
			"ББ",
			"ЁееддГб",
			"Лк",
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
			"",
			"0",
			"абв1где",
			"абА",
			"АЁв",
			"едг1вба",
			"ЯяАаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮю",
			"юЮэЭьЬыЫъЪщЩшШчЧцЦхХфФуУтТсСрРпПоОнНмМлЛкКйЙиИзЗжЖёЁеЕдДгГвВбБаАяЯ"
		})
		public void isSortedNotCorrect(String value)
		{
			Alphabetical alphabet = new RussianAlphabet();

			boolean actual = alphabet.isSorted(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#isSortedAsc(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class IsSortedAsc
	{
		/**
		 * Проверка метода {@link AbstractAlphabet#isSortedAsc(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"а",
			"аб",
			"ааббвв",
			"еёжз",
			"ЕЁЖЗ",
			"АбвгДеЁ",
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
			"", "0", "ба", "Ба", "абв1где", "ЯяАаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮю"
		})
		public void isSortedAscNotCorrect(String value)
		{
			Alphabetical alphabet = new RussianAlphabet();

			boolean actual = alphabet.isSortedAsc(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#isSortedDesc(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class IsSortedDesc
	{
		/**
		 * Проверка метода {@link AbstractAlphabet#isSortedDesc(String)}.
		 */
		@ParameterizedTest
		@ValueSource(strings = {
			"в",
			"Я",
			"ББ",
			"ЁееддГб",
			"Лк",
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
			"", "0", "аб", "Аб", "едг1вба", "юЮэЭьЬыЫъЪщЩшШчЧцЦхХфФуУтТсСрРпПоОнНмМлЛкКйЙиИзЗжЖёЁеЕдДгГвВбБаАяЯ"
		})
		public void isSortedDescNotCorrect(String value)
		{
			Alphabetical alphabet = new RussianAlphabet();

			boolean actual = alphabet.isSortedDesc(value);

			assertThat(actual).isFalse();
		}
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#statistics(String)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Statistics
	{
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
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#equals(Object)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Equals
	{
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
	}

	/**
	 * Класс проверки метода {@link AbstractAlphabet#hashCode()}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class HashCode
	{
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

		/**
		 * Проверка метода {@link AbstractAlphabet#hashCode()} с разными классами.
		 */
		@Test
		public void testHashCodeDifferentClass()
		{
			Alphabetical alphabet1 = new RussianAlphabet();
			Alphabetical alphabet2 = new EnglishAlphabet();

			int expectedHashCode = alphabet1.hashCode();
			int actualHashCode = alphabet2.hashCode();

			assertThat(actualHashCode).isNotEqualTo(expectedHashCode);
		}
	}

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
	 * Проверка метода {@link AbstractAlphabet#getRandom(int)}.
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
}