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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Objects;

/**
 * Класс букв сингальского алфавита.
 */
public class SinhalaAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0D85', '\u0D86', '\u0D87', '\u0D88', '\u0D89', '\u0D8A', 
			'\u0D8B', '\u0D8C', '\u0D8D', '\u0D8E', '\u0D8F', '\u0D90', 
			'\u0D91', '\u0D92', '\u0D93', '\u0D94', '\u0D95', '\u0D96', 
			'\u0D9A', '\u0D9B', '\u0D9C', '\u0D9D', '\u0D9E', '\u0D9F', 
			'\u0DA0', '\u0DA1', '\u0DA2', '\u0DA3', '\u0DA4', '\u0DA7', 
			'\u0DA8', '\u0DA9', '\u0DAA', '\u0DAB', '\u0DAC', '\u0DAD', 
			'\u0DAE', '\u0DAF', '\u0DB0', '\u0DB1', '\u0DB3', '\u0DB4', 
			'\u0DB5', '\u0DB6', '\u0DB7', '\u0DB8', '\u0DB9', '\u0DBA', 
			'\u0DBB', '\u0DBD', '\u0DC0', '\u0DC5', '\u0DC1', '\u0DC2', 
			'\u0DC3', '\u0DC4', '\u0DC6', '\u0DCA', '\u0DCF', '\u0DD0', 
			'\u0DD1', '\u0DD2', '\u0DD3', '\u0DD4', '\u0DD6', '\u0DD8', 
			'\u0DD9', '\u0DDA', '\u0DDB', '\u0DDC', '\u0DDD', '\u0DDE', 
			'\u0DDF', '\u0DF2', '\u0DF3', '\u0DF4'
	);

	/**
	 * Конструктор для {@code SinhalaAlphabet}.
	 */
	public SinhalaAlphabet()
	{
		super(SinhalaAlphabet.LETTERS);
	}

	/**
	 * @see Alphabetical#equals(Object)
	 */
	@Override
	public boolean equals(@Nullable final Object obj)
	{
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		final SinhalaAlphabet alphabet = (SinhalaAlphabet) obj;

		if (!Objects.equals(SinhalaAlphabet.LETTERS, alphabet.get())) {
			return false;
		}

		return true;
	}

	/**
	 * @see Alphabetical#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return this.get().hashCode();
	}
}
