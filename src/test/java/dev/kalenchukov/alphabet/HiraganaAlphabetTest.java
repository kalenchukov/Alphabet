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

public class HiraganaAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new HiraganaAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'か', 'き', 'く', 'け', 'こ', 'さ', 
			'し', 'す', 'せ', 'そ', 'た', 'ち', 
			'つ', 'て', 'と', 'な', 'に', 'ぬ', 
			'ね', 'の', 'は', 'ひ', 'ふ', 'へ', 
			'ほ', 'ま', 'み', 'む', 'め', 'も', 
			'や', 'ゆ', 'よ', 'ら', 'り', 'る', 
			'れ', 'ろ', 'わ', 'を', 'ん', 'が', 
			'ぎ', 'ぐ', 'げ', 'ご', 'ざ', 'じ', 
			'ず', 'ぜ', 'ぞ', 'だ', 'ぢ', 'づ', 
			'で', 'ど', 'ば', 'び', 'ぶ', 'べ', 
			'ぼ', 'ぱ', 'ぴ', 'ぷ', 'ぺ', 'ぽ', 
			'ゃ', 'ゅ', 'ょ'
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

		assertTrue(ALPHABET.equals(new HiraganaAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new HiraganaAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
