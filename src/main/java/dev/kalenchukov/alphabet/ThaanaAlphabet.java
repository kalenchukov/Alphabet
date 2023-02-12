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
 * Класс букв алфавита тана.
 */
public class ThaanaAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0780', '\u0781', '\u0782', '\u0783', '\u0784', '\u0785', 
			'\u0786', '\u0787', '\u0788', '\u0789', '\u078A', '\u078B', 
			'\u078C', '\u078D', '\u078E', '\u078F', '\u0790', '\u0791', 
			'\u0792', '\u0793', '\u0794', '\u0795', '\u0796', '\u0797', 
			'\u0798', '\u0799', '\u079A', '\u079B', '\u079C', '\u079D', 
			'\u079E', '\u079F', '\u07A0', '\u07A1', '\u07A2', '\u07A3', 
			'\u07A4', '\u07A5', '\u07A6', '\u07A7', '\u07A8', '\u07A9', 
			'\u07AA', '\u07AB', '\u07AC', '\u07AD', '\u07AE', '\u07AF', 
			'\u07B0', '\u07B1'
	);

	/**
	 * Конструктор для {@code ThaanaAlphabet}.
	 */
	public ThaanaAlphabet()
	{
		super(ThaanaAlphabet.LETTERS);
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

		final ThaanaAlphabet alphabet = (ThaanaAlphabet) obj;

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
