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
 * Класс букв бенгальского алфавита.
 */
public class BengaliAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0985', '\u0986', '\u0987', '\u0988', '\u0989', '\u098A', 
			'\u098B', '\u098F', '\u0990', '\u0993', '\u0994', '\u0995', 
			'\u0996', '\u0997', '\u0998', '\u0999', '\u099A', '\u099B', 
			'\u099C', '\u099D', '\u099E', '\u099F', '\u09A0', '\u09A1', 
			'\u09A2', '\u09A3', '\u09A4', '\u09A5', '\u09A6', '\u09A7', 
			'\u09A8', '\u09AA', '\u09AB', '\u09AC', '\u09AD', '\u09AE', 
			'\u09AF', '\u09B0', '\u09B2', '\u09B6', '\u09B7', '\u09B8', 
			'\u09B9', '\u09DF', '\u09DC', '\u09DD', '\u09CE', '\u0981', 
			'\u0982', '\u0983', '\u09CD'
	);

	/**
	 * Конструктор для {@code BengaliAlphabet}.
	 */
	public BengaliAlphabet()
	{
		super(BengaliAlphabet.LETTERS);
	}

	/**
	 * @see Object#equals(Object)
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

		final BengaliAlphabet alphabet = (BengaliAlphabet) obj;

		if (!Objects.equals(BengaliAlphabet.LETTERS, alphabet.get())) {
			return false;
		}

		return true;
	}

	/**
	 * @see Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return BengaliAlphabet.LETTERS.hashCode();
	}
}
