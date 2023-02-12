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
 * Класс букв алфавита саураштра.
 */
public class SaurashtraAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA892', '\uA893', '\uA894', '\uA895', '\uA896', '\uA897', 
			'\uA898', '\uA899', '\uA89A', '\uA89B', '\uA89C', '\uA89D', 
			'\uA89E', '\uA89F', '\uA8A0', '\uA8A1', '\uA8A2', '\uA8A3', 
			'\uA8A4', '\uA8A5', '\uA8A6', '\uA8A7', '\uA8A8', '\uA8A9', 
			'\uA8AA', '\uA8AB', '\uA8AC', '\uA8AD', '\uA8AE', '\uA8AF', 
			'\uA8B0', '\uA8B1', '\uA8B2', '\uA8B3', '\uA8B4', '\uA8B5', 
			'\uA8B6', '\uA8B7', '\uA8B8', '\uA8B9', '\uA8BA', '\uA8BB', 
			'\uA8BC', '\uA8BD', '\uA8BE', '\uA8BF', '\uA8C0', '\uA8C1', 
			'\uA8C2', '\uA8C3', '\uA8C4'
	);

	/**
	 * Конструктор для {@code SaurashtraAlphabet}.
	 */
	public SaurashtraAlphabet()
	{
		super(SaurashtraAlphabet.LETTERS);
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

		final SaurashtraAlphabet alphabet = (SaurashtraAlphabet) obj;

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
