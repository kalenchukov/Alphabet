/*
 * Copyright 2022 Алексей Каленчуков
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
 * Класс букв алфавита каннада.
 */
public class KannadaAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0C85', '\u0C86', '\u0C87', '\u0C88', '\u0C89', '\u0C8A', 
			'\u0C8B', '\u0CE0', '\u0C8E', '\u0C8F', '\u0C90', '\u0C92', 
			'\u0C93', '\u0C94', '\u0C95', '\u0C96', '\u0C97', '\u0C98', 
			'\u0C99', '\u0C9A', '\u0C9B', '\u0C9C', '\u0C9D', '\u0C9E', 
			'\u0C9F', '\u0CA0', '\u0CA1', '\u0CA2', '\u0CA3', '\u0CA4', 
			'\u0CA5', '\u0CA6', '\u0CA7', '\u0CA8', '\u0CAA', '\u0CAB', 
			'\u0CAC', '\u0CAD', '\u0CAE', '\u0CAF', '\u0CB0', '\u0CB1', 
			'\u0CB2', '\u0CB5', '\u0CB6', '\u0CB7', '\u0CB8', '\u0CB9', 
			'\u0CB3', '\u0CDE', '\u0CC0', '\u0CC1', '\u0CC2', '\u0CC3', 
			'\u0CC4', '\u0CC6', '\u0CC7', '\u0CC8', '\u0CCA', '\u0CCB', 
			'\u0CCC', '\u0CCD'
	);

	/**
	 * Конструктор для {@code KannadaAlphabet}.
	 */
	public KannadaAlphabet()
	{
		super(KannadaAlphabet.LETTERS);
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

		final KannadaAlphabet alphabet = (KannadaAlphabet) obj;

		if (!Objects.equals(KannadaAlphabet.LETTERS, alphabet.get())) {
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
		return KannadaAlphabet.LETTERS.hashCode();
	}
}
