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
 * Класс букв лаосского алфавита.
 */
public class LaoAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0E81', '\u0E82', '\u0E84', '\u0E87', '\u0E88', '\u0EAA', 
			'\u0E8A', '\u0E8D', '\u0E94', '\u0E95', '\u0E96', '\u0E97', 
			'\u0E99', '\u0E9A', '\u0E9B', '\u0E9C', '\u0E9D', '\u0E9E', 
			'\u0E9F', '\u0EA1', '\u0EA2', '\u0EA5', '\u0EA7', '\u0EAB', 
			'\u0EAD', '\u0EAE', '\u0EAF', '\u0EB0', '\u0EB1', '\u0EB2', 
			'\u0EB3', '\u0EB4', '\u0EB5', '\u0EB6', '\u0EB7', '\u0EB8', 
			'\u0EB9', '\u0EBB', '\u0EBC', '\u0EBD', '\u0EC0', '\u0EC1', 
			'\u0EC2', '\u0EC3', '\u0EC4', '\u0EC6'
	);

	/**
	 * Конструктор для {@code LaoAlphabet}.
	 */
	public LaoAlphabet()
	{
		super(LaoAlphabet.LETTERS);
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

		final LaoAlphabet alphabet = (LaoAlphabet) obj;

		if (!Objects.equals(LaoAlphabet.LETTERS, alphabet.get())) {
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
		return LaoAlphabet.LETTERS.hashCode();
	}
}
