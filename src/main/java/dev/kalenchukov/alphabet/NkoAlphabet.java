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
 * Класс букв алфавита нко.
 */
public class NkoAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u07C0', '\u07C1', '\u07C2', '\u07C3', '\u07C4', '\u07C5', 
			'\u07C6', '\u07C7', '\u07C8', '\u07C9', '\u07CA', '\u07CB', 
			'\u07CC', '\u07CD', '\u07CE', '\u07CF', '\u07D0', '\u07D1', 
			'\u07D2', '\u07D3', '\u07D4', '\u07D5', '\u07D6', '\u07D7', 
			'\u07D8', '\u07D9', '\u07DA', '\u07DB', '\u07DC', '\u07DD', 
			'\u07DE', '\u07DF', '\u07E0', '\u07E1', '\u07E2', '\u07E3', 
			'\u07E4', '\u07E5', '\u07E6', '\u07E7', '\u07E8', '\u07E9', 
			'\u07EA', '\u07EB', '\u07EC', '\u07ED', '\u07EE', '\u07EF', 
			'\u07F0', '\u07F1', '\u07F2', '\u07F3', '\u07F4', '\u07F5', 
			'\u07F6', '\u07F7', '\u07F8', '\u07F9', '\u07FA'
	);

	/**
	 * Конструктор для {@code NkoAlphabet}.
	 */
	public NkoAlphabet()
	{
		super(NkoAlphabet.LETTERS);
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

		final NkoAlphabet alphabet = (NkoAlphabet) obj;

		if (!Objects.equals(NkoAlphabet.LETTERS, alphabet.get())) {
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
		return NkoAlphabet.LETTERS.hashCode();
	}
}
