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
 * Класс букв алфавита глаголицы.
 */
public class GlagoliticAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u2C00', '\u2C01', '\u2C02', '\u2C03', '\u2C04', '\u2C05', 
			'\u2C06', '\u2C07', '\u2C08', '\u2C09', '\u2C0A', '\u2C0B', 
			'\u2C0C', '\u2C0D', '\u2C0E', '\u2C0F', '\u2C10', '\u2C11', 
			'\u2C12', '\u2C13', '\u2C14', '\u2C15', '\u2C2B', '\u2C16', 
			'\u2C17', '\u2C18', '\u2C19', '\u2C1A', '\u2C1B', '\u2C1C', 
			'\u2C1D', '\u2C1E', '\u2C1F', '\u2C20', '\u2C21', '\u2C22', 
			'\u2C23', '\u2C24', '\u2C26', '\u2C27', '\u2C28', '\u2C29', 
			'\u2C2A'
	);

	/**
	 * Конструктор для {@code GlagoliticAlphabet}.
	 */
	public GlagoliticAlphabet()
	{
		super(GlagoliticAlphabet.LETTERS);
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

		final GlagoliticAlphabet alphabet = (GlagoliticAlphabet) obj;

		if (!Objects.equals(this.get(), alphabet.get())) {
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
