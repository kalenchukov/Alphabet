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
 * Класс букв алфавита бамум.
 */
public class BamumAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA6A0', '\uA6A1', '\uA6A2', '\uA6A3', '\uA6A4', '\uA6A5', 
			'\uA6A6', '\uA6A7', '\uA6A8', '\uA6A9', '\uA6AA', '\uA6AB', 
			'\uA6AC', '\uA6AD', '\uA6AE', '\uA6AF', '\uA6B0', '\uA6B1', 
			'\uA6B2', '\uA6B3', '\uA6B4', '\uA6B5', '\uA6B6', '\uA6B7', 
			'\uA6B8', '\uA6B9', '\uA6BA', '\uA6BB', '\uA6BC', '\uA6BD', 
			'\uA6BE', '\uA6BF', '\uA6C0', '\uA6C1', '\uA6C2', '\uA6C3', 
			'\uA6C4', '\uA6C5', '\uA6C6', '\uA6C7', '\uA6C8', '\uA6C9', 
			'\uA6CA', '\uA6CB', '\uA6CC', '\uA6CD', '\uA6CE', '\uA6CF', 
			'\uA6D0', '\uA6D1', '\uA6D2', '\uA6D3', '\uA6D4', '\uA6D5', 
			'\uA6D6', '\uA6D7', '\uA6D8', '\uA6D9', '\uA6DA', '\uA6DB', 
			'\uA6DC', '\uA6DD', '\uA6DE', '\uA6DF', '\uA6E0', '\uA6E1', 
			'\uA6E2', '\uA6E3', '\uA6E4', '\uA6E5', '\uA6E6', '\uA6E7', 
			'\uA6E8', '\uA6E9', '\uA6EA', '\uA6EB', '\uA6EC', '\uA6ED', 
			'\uA6EE', '\uA6EF'
	);

	/**
	 * Конструктор для {@code BamumAlphabet}.
	 */
	public BamumAlphabet()
	{
		super(BamumAlphabet.LETTERS);
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

		final BamumAlphabet alphabet = (BamumAlphabet) obj;

		if (!Objects.equals(BamumAlphabet.LETTERS, alphabet.get())) {
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
		return BamumAlphabet.LETTERS.hashCode();
	}
}
