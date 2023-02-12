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
 * Класс букв алфавита манипури.
 */
public class MeeteiMayekAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uABC0', '\uABC1', '\uABC2', '\uABC3', '\uABC4', '\uABC5', 
			'\uABC6', '\uABC7', '\uABC8', '\uABC9', '\uABCA', '\uABCB', 
			'\uABCC', '\uABCD', '\uABCE', '\uABCF', '\uABD0', '\uABD1', 
			'\uABD2', '\uABD3', '\uABD4', '\uABD5', '\uABD6', '\uABD7', 
			'\uABD8', '\uABD9', '\uABDA', '\uABDB', '\uABDC', '\uABDD', 
			'\uABDE', '\uABDF', '\uABE0', '\uABE1', '\uABE2', '\uABE3', 
			'\uABE4', '\uABE5', '\uABE6', '\uABE7', '\uABE8', '\uABE9', 
			'\uABEA', '\uABEB', '\uABEC', '\uABED'
	);

	/**
	 * Конструктор для {@code MeeteiMayekAlphabet}.
	 */
	public MeeteiMayekAlphabet()
	{
		super(MeeteiMayekAlphabet.LETTERS);
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

		final MeeteiMayekAlphabet alphabet = (MeeteiMayekAlphabet) obj;

		if (!Objects.equals(MeeteiMayekAlphabet.LETTERS, alphabet.get())) {
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
		return MeeteiMayekAlphabet.LETTERS.hashCode();
	}
}
