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

public class TatarAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new TatarAlphabet();

	/**
	 * Проверяет получение букв алфавита.
	 */
	@Test
	public void testGet()
	{
		List<Character> letters = List.of(
			'А', 'а', 'Ә', 'ә', 'Б', 'б', 
			'В', 'в', 'Г', 'г', 'Д', 'д', 
			'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 
			'Җ', 'җ', 'З', 'з', 'И', 'и', 
			'Й', 'й', 'К', 'к', 'Л', 'л', 
			'М', 'м', 'Н', 'н', 'Ң', 'ң', 
			'О', 'о', 'Ө', 'ө', 'П', 'п', 
			'Р', 'р', 'С', 'с', 'Т', 'т', 
			'У', 'у', 'Ү', 'ү', 'Ф', 'ф', 
			'Х', 'х', 'Һ', 'һ', 'Ц', 'ц', 
			'Ч', 'ч', 'Ш', 'ш', 'Щ', 'щ', 
			'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь', 
			'Э', 'э', 'Ю', 'ю', 'Я', 'я'
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

		assertTrue(ALPHABET.equals(new TatarAlphabet()));
	}

	/**
	 * Проверка хэш-кода.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new TatarAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}