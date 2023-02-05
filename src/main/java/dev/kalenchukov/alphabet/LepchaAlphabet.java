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
 * Класс букв алфавита лепча.
 */
public class LepchaAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1C00', '\u1C01', '\u1C02', '\u1C03', '\u1C04', '\u1C05', 
			'\u1C06', '\u1C07', '\u1C08', '\u1C09', '\u1C0A', '\u1C0B', 
			'\u1C0C', '\u1C0D', '\u1C0E', '\u1C0F', '\u1C10', '\u1C11', 
			'\u1C12', '\u1C13', '\u1C14', '\u1C15', '\u1C16', '\u1C17', 
			'\u1C18', '\u1C19', '\u1C1A', '\u1C1B', '\u1C1C', '\u1C1D', 
			'\u1C1E', '\u1C1F', '\u1C20', '\u1C21', '\u1C22', '\u1C23', 
			'\u1C24', '\u1C25', '\u1C26', '\u1C27', '\u1C28', '\u1C29', 
			'\u1C2A', '\u1C2B', '\u1C2C', '\u1C2D', '\u1C2E', '\u1C2F', 
			'\u1C30', '\u1C31', '\u1C32', '\u1C33', '\u1C34', '\u1C35', 
			'\u1C36', '\u1C37', '\u1C4D', '\u1C4E', '\u1C4F'
	);

	/**
	 * Конструктор для {@code LepchaAlphabet}.
	 */
	public LepchaAlphabet()
	{
		super(LepchaAlphabet.LETTERS);
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

		final LepchaAlphabet alphabet = (LepchaAlphabet) obj;

		if (!Objects.equals(LepchaAlphabet.LETTERS, alphabet.get())) {
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
		return LepchaAlphabet.LETTERS.hashCode();
	}
}
