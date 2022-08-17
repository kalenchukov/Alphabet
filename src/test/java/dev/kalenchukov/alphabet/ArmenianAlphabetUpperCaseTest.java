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

public class ArmenianAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new ArmenianAlphabet.UpperCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'Ա', 'Բ', 'Գ', 'Դ', 'Ե', 'Զ', 
			'Է', 'Ը', 'Թ', 'Ժ', 'Ի', 'Լ', 
			'Խ', 'Ծ', 'Կ', 'Հ', 'Ձ', 'Ղ', 
			'Ճ', 'Մ', 'Յ', 'Ն', 'Շ', 'Ո', 
			'Չ', 'Պ', 'Ջ', 'Ռ', 'Ս', 'Վ', 
			'Տ', 'Ր', 'Ց', 'Ւ', 'Փ', 'Ք', 
			'Օ', 'Ֆ'
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

		assertFalse(ALPHABET.equals(new RussianAlphabet.UpperCase()));

		assertTrue(ALPHABET.equals(new ArmenianAlphabet.UpperCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new ArmenianAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
