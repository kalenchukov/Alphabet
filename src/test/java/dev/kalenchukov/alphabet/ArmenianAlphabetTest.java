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

public class ArmenianAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new ArmenianAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'Ա', 'ա', 'Բ', 'բ', 'Գ', 'գ', 
			'Դ', 'դ', 'Ե', 'ե', 'Զ', 'զ', 
			'Է', 'է', 'Ը', 'ը', 'Թ', 'թ', 
			'Ժ', 'ժ', 'Ի', 'ի', 'Լ', 'լ', 
			'Խ', 'խ', 'Ծ', 'ծ', 'Կ', 'կ', 
			'Հ', 'հ', 'Ձ', 'ձ', 'Ղ', 'ղ', 
			'Ճ', 'ճ', 'Մ', 'մ', 'Յ', 'յ', 
			'Ն', 'ն', 'Շ', 'շ', 'Ո', 'ո', 
			'Չ', 'չ', 'Պ', 'պ', 'Ջ', 'ջ', 
			'Ռ', 'ռ', 'Ս', 'ս', 'Վ', 'վ', 
			'Տ', 'տ', 'Ր', 'ր', 'Ց', 'ց', 
			'Ւ', 'ւ', 'Փ', 'փ', 'Ք', 'ք', 
			'Օ', 'օ', 'Ֆ', 'ֆ'
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

		assertTrue(ALPHABET.equals(new ArmenianAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new ArmenianAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
