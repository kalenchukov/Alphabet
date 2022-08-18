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

public class BashkirAlphabetLowerCaseTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new BashkirAlphabet.LowerCase();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'а', 'б', 'в', 'г', 'ғ', 'д', 
			'ҙ', 'е', 'ё', 'ж', 'з', 'и', 
			'й', 'к', 'ҡ', 'л', 'м', 'н', 
			'ң', 'о', 'ө', 'п', 'р', 'с', 
			'ҫ', 'т', 'у', 'ү', 'ф', 'х', 
			'һ', 'ц', 'ч', 'ш', 'щ', 'ъ', 
			'ы', 'ь', 'э', 'ә', 'ю', 'я'
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

		assertTrue(ALPHABET.equals(new BashkirAlphabet.LowerCase()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new BashkirAlphabet.LowerCase().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet.LowerCase().hashCode());
	}
}
