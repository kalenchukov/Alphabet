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

public class BashkirAlphabetUpperCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BashkirAlphabet.UpperCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'А', 'Б', 'В', 'Г', 'Ғ', 'Д', 
			'Ҙ', 'Е', 'Ё', 'Ж', 'З', 'И', 
			'Й', 'К', 'Ҡ', 'Л', 'М', 'Н', 
			'Ң', 'О', 'Ө', 'П', 'Р', 'С', 
			'Ҫ', 'Т', 'У', 'Ү', 'Ф', 'Х', 
			'Һ', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 
			'Ы', 'Ь', 'Э', 'Ә', 'Ю', 'Я'
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

		assertTrue(ALPHABET.equals(new BashkirAlphabet.UpperCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BashkirAlphabet.UpperCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.UpperCase().hashCode());
	}
}
