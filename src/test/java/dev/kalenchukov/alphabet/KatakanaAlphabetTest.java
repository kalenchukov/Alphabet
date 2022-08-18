/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.alphabet;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class KatakanaAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new KatakanaAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ン', 'ワ', 'ラ', 'ヤ', 'マ', 'ハ', 
			'ナ', 'タ', 'サ', 'カ', 'ア', 'リ', 
			'ミ', 'ヒ', 'ニ', 'チ', 'シ', 'キ', 
			'イ', 'ル', 'ユ', 'ム', 'フ', 'ヌ', 
			'ツ', 'ス', 'ク', 'ウ', 'レ', 'メ', 
			'ヘ', 'ネ', 'テ', 'セ', 'ケ', 'エ', 
			'ヲ', 'ロ', 'ヨ', 'モ', 'ホ', 'ノ', 
			'ト', 'ソ', 'コ', 'オ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка сравнения объектов.
	 */
	@Test
	public void testEquals()
	{
		assertFalse(ALPHABET.equals(null));

		assertTrue(ALPHABET.equals(ALPHABET));

		assertFalse(ALPHABET.equals(new RussianAlphabet()));

		assertTrue(ALPHABET.equals(new KatakanaAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new KatakanaAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
