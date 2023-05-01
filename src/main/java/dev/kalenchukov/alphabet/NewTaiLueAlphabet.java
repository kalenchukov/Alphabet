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
 * Класс букв нового алфавита лы.
 *
 * @author Aleksey Kalenchukov
 */
public class NewTaiLueAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1980', '\u1981', '\u1982', '\u1983', '\u1984', '\u1985', 
			'\u1986', '\u1987', '\u1988', '\u1989', '\u198A', '\u198B', 
			'\u198C', '\u198D', '\u198E', '\u198F', '\u1990', '\u1991', 
			'\u1992', '\u1993', '\u1994', '\u1995', '\u1996', '\u1997', 
			'\u1998', '\u1999', '\u199A', '\u199B', '\u199C', '\u199D', 
			'\u199E', '\u199F', '\u19A1', '\u19A2', '\u19A3', '\u19A4', 
			'\u19A5', '\u19A6', '\u19A7', '\u19A8', '\u19A9', '\u19AA', 
			'\u19AB', '\u19B0', '\u19B1', '\u19B2', '\u19B3', '\u19B4', 
			'\u19B5', '\u19B6', '\u19B7', '\u19B8', '\u19B9', '\u19BA', 
			'\u19BB', '\u19BC', '\u19BD', '\u19BE', '\u19BF', '\u19C0', 
			'\u19C1', '\u19C2', '\u19C3', '\u19C4', '\u19C5', '\u19C6', 
			'\u19C7', '\u19C8', '\u19C9'
	);

	/**
	 * Конструктор для {@code NewTaiLueAlphabet}.
	 */
	public NewTaiLueAlphabet()
	{
		super(NewTaiLueAlphabet.LETTERS);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param obj {@inheritDoc}
	 * @return {@inheritDoc}
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

		final NewTaiLueAlphabet alphabet = (NewTaiLueAlphabet) obj;

		if (!Objects.equals(this.get(), alphabet.get())) {
			return false;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	public int hashCode()
	{
		return this.get().hashCode();
	}
}
