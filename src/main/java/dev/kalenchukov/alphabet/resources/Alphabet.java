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

package dev.kalenchukov.alphabet.resources;

import dev.kalenchukov.alphabet.*;
import org.jetbrains.annotations.NotNull;

/**
 * Перечисление алфавитов.
 *
 * @author Aleksey Kalenchukov
 */
public enum Alphabet
{
	/**
	 * Арабский.
	 */
	ARAB(new ArabAlphabet()),

	/**
	 * Армянский.
	 */
	ARMENIAN(new ArmenianAlphabet()),

	/**
	 * Балийский.
	 */
	BALINESE(new BalineseAlphabet()),

	/**
	 * Бамум.
	 */
	BAMUM(new BamumAlphabet()),

	/**
	 * Башкирский.
	 */
	BASHKIR(new BashkirAlphabet()),

	/**
	 * Батакский.
	 */
	BATAK(new BatakAlphabet()),

	/**
	 * Белорусский.
	 */
	BELARUSIAN(new BelarusianAlphabet()),

	/**
	 * Бенгальский.
	 */
	BENGALI(new BengaliAlphabet()),

	/**
	 * Бопомофо.
	 */
	BOPOMOFO(new BopomofoAlphabet()),

	/**
	 * Бугийский.
	 */
	BUGINESE(new BugineseAlphabet()),

	/**
	 * Бухид.
	 */
	BUHID(new BuhidAlphabet()),

	/**
	 * Болгарский.
	 */
	BULGARIAN(new BulgarianAlphabet()),

	/**
	 * Чамский.
	 */
	CHAM(new ChamAlphabet()),

	/**
	 * Чероки.
	 */
	CHEROKEE(new CherokeeAlphabet()),

	/**
	 * Пиньинь.
	 */
	CHINESE(new ChineseAlphabet()),

	/**
	 * Коптский.
	 */
	COPTIC(new CopticAlphabet()),

	/**
	 * Кириллица.
	 */
	CYRILLIC(new CyrillicAlphabet()),

	/**
	 * Чешский.
	 */
	CZECH(new CzechAlphabet()),

	/**
	 * Деванагари.
	 */
	DEVANAGARI(new DevanagariAlphabet()),

	/**
	 * Английский.
	 */
	ENGLISH(new EnglishAlphabet()),

	/**
	 * Эсперанто.
	 */
	ESPERANTO(new EsperantoAlphabet()),

	/**
	 * Эфиопский.
	 */
	ETHIOPIC(new EthiopicAlphabet()),

	/**
	 * Французский.
	 */
	FRENCH(new FrenchAlphabet()),

	/**
	 * Грузинский.
	 */
	GEORGIAN(new GeorgianAlphabet()),

	/**
	 * Немецкий.
	 */
	GERMAN(new GermanAlphabet()),

	/**
	 * Глаголица.
	 */
	GLAGOLITIC(new GlagoliticAlphabet()),

	/**
	 * Греческий.
	 */
	GREEK(new GreekAlphabet()),

	/**
	 * Гуджарати.
	 */
	GUJARATI(new GujaratiAlphabet()),

	/**
	 * Гурмукхи.
	 */
	GURMUKHI(new GurmukhiAlphabet()),

	/**
	 * Хангыль.
	 */
	HANGUL(new HangulAlphabet()),

	/**
	 * Хануноо.
	 */
	HANUNOO(new HanunooAlphabet()),

	/**
	 * Еврейский.
	 */
	HEBREW(new HebrewAlphabet()),

	/**
	 * Хирагана.
	 */
	HIRAGANA(new HiraganaAlphabet()),

	/**
	 * Венгерский.
	 */
	HUNGARIAN(new HungarianAlphabet()),

	/**
	 * Международный фонетический.
	 */
	INTERNATIONAL_PHONETIC(new InternationalPhoneticAlphabet()),

	/**
	 * Итальянский.
	 */
	ITALIAN(new ItalianAlphabet()),

	/**
	 * Яванский.
	 */
	JAVANESE(new JavaneseAlphabet()),

	/**
	 * Каннада.
	 */
	KANNADA(new KannadaAlphabet()),

	/**
	 * Катакана.
	 */
	KATAKANA(new KatakanaAlphabet()),

	/**
	 * Кайях Ли.
	 */
	KAYAH_LI(new KayahLiAlphabet()),

	/**
	 * Казахский.
	 */
	KAZAKH(new KazakhAlphabet()),

	/**
	 * Кхмерский.
	 */
	KHMER(new KhmerAlphabet()),

	/**
	 * Лаосский.
	 */
	LAO(new LaoAlphabet()),

	/**
	 * Латинский.
	 */
	LATIN(new LatinAlphabet()),

	/**
	 * Лепча.
	 */
	LEPCHA(new LepchaAlphabet()),

	/**
	 * Лимбу.
	 */
	LIMBU(new LimbuAlphabet()),

	/**
	 * Лису.
	 */
	LISU(new LisuAlphabet()),

	/**
	 * Малаялам.
	 */
	MALAYALAM(new MalayalamAlphabet()),

	/**
	 * Мандейский.
	 */
	MANDAIC(new MandaicAlphabet()),

	/**
	 * Манипури.
	 */
	MEETEI_MAYEK(new MeeteiMayekAlphabet()),

	/**
	 * Монгольский.
	 */
	MONGOLIAN(new MongolianAlphabet()),

	/**
	 * Бирманский.
	 */
	MYANMAR(new MyanmarAlphabet()),

	/**
	 * Лы (новый).
	 */
	NEW_TAI_LUE(new NewTaiLueAlphabet()),

	/**
	 * Нко.
	 */
	NKO(new NkoAlphabet()),

	/**
	 * Огамический.
	 */
	OGHAM(new OghamAlphabet()),

	/**
	 * Ол-чики.
	 */
	OL_CHIKI(new OlChikiAlphabet()),

	/**
	 * Ория.
	 */
	ORIYA(new OriyaAlphabet()),

	/**
	 * Пагба-ламы.
	 */
	PHAGS_PA(new PhagsPaAlphabet()),

	/**
	 * Польский.
	 */
	POLISH(new PolishAlphabet()),

	/**
	 * Реджангский.
	 */
	REJANG(new RejangAlphabet()),

	/**
	 * Германский рунический.
	 */
	RUNIC(new RunicAlphabet()),

	/**
	 * Русский.
	 */
	RUSSIAN(new RussianAlphabet()),

	/**
	 * Самаритянский.
	 */
	SAMARITAN(new SamaritanAlphabet()),

	/**
	 * Саураштра.
	 */
	SAURASHTRA(new SaurashtraAlphabet()),

	/**
	 * Сингальский.
	 */
	SINHALA(new SinhalaAlphabet()),

	/**
	 * Испанский.
	 */
	SPANISH(new SpanishAlphabet()),

	/**
	 * Сунданский.
	 */
	SUNDANESE(new SundaneseAlphabet()),

	/**
	 * Силхети нагари.
	 */
	SYLOTI_NAGRI(new SylotiNagriAlphabet()),

	/**
	 * Сирийский.
	 */
	SYRIAC(new SyriacAlphabet()),

	/**
	 * Тагальский.
	 */
	TAGALOG(new TagalogAlphabet()),

	/**
	 * Тагбанва.
	 */
	TAGBANWA(new TagbanwaAlphabet()),

	/**
	 * Лы.
	 */
	TAI_LE(new TaiLeAlphabet()),

	/**
	 * Ланна.
	 */
	TAI_THAM(new TaiThamAlphabet()),

	/**
	 * Тай-вьет.
	 */
	TAI_VIET(new TaiVietAlphabet()),

	/**
	 * Тамильский.
	 */
	TAMIL(new TamilAlphabet()),

	/**
	 * Татарский.
	 */
	TATAR(new TatarAlphabet()),

	/**
	 * Телугу.
	 */
	TELUGU(new TeluguAlphabet()),

	/**
	 * Тана.
	 */
	THAANA(new ThaanaAlphabet()),

	/**
	 * Тайский.
	 */
	THAI(new ThaiAlphabet()),

	/**
	 * Тибетский.
	 */
	TIBETAN(new TibetanAlphabet()),

	/**
	 * Тифанаг.
	 */
	TIFINAGH(new TifinaghAlphabet()),

	/**
	 * Турецкий.
	 */
	TURKISH(new TurkishAlphabet()),

	/**
	 * Украинский.
	 */
	UKRAINIAN(new UkrainianAlphabet()),

	/**
	 * Вай.
	 */
	VAI(new VaiAlphabet()),

	/**
	 * Йи.
	 */
	YI_SYLLABLES(new YiSyllablesAlphabet());

	/**
	 * Алфавит.
	 */
	@NotNull
	private final Alphabetical alphabet;

	/**
	 * Конструктор для {@code Alphabet}.
	 *
	 * @param alphabet алфавит.
	 */
	Alphabet(@NotNull final Alphabetical alphabet)
	{
		this.alphabet = alphabet;
	}

	/**
	 * Возвращает алфавит.
	 *
	 * @return алфавит.
	 */
	@NotNull
	public Alphabetical getAlphabet()
	{
		return this.alphabet;
	}

	/**
	 * Возвращает название константы.
	 *
	 * @return название константы.
	 */
	@NotNull
	@Override
	public String toString()
	{
		return this.name().replace('_', ' ');
	}
}
