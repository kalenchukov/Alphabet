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

public class ArmenianAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new ArmenianAlphabet.LowerCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'ա', 'բ', 'գ', 'դ', 'ե', 'զ', 
			'է', 'ը', 'թ', 'ժ', 'ի', 'լ', 
			'խ', 'ծ', 'կ', 'հ', 'ձ', 'ղ', 
			'ճ', 'մ', 'յ', 'ն', 'շ', 'ո', 
			'չ', 'պ', 'ջ', 'ռ', 'ս', 'վ', 
			'տ', 'ր', 'ց', 'ւ', 'փ', 'ք', 
			'օ', 'ֆ'
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

		assertFalse(ALPHABET.equals(new RussianAlphabet.LowerCase()));

		assertTrue(ALPHABET.equals(new ArmenianAlphabet.LowerCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new ArmenianAlphabet.LowerCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.LowerCase().hashCode());
	}
}
