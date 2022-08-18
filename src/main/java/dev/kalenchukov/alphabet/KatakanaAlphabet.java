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
 * Класс букв алфавита катакана.
 */
public class KatakanaAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u30F3', '\u30EF', '\u30E9', '\u30E4', '\u30DE', '\u30CF', 
			'\u30CA', '\u30BF', '\u30B5', '\u30AB', '\u30A2', '\u30EA', 
			'\u30DF', '\u30D2', '\u30CB', '\u30C1', '\u30B7', '\u30AD', 
			'\u30A4', '\u30EB', '\u30E6', '\u30E0', '\u30D5', '\u30CC', 
			'\u30C4', '\u30B9', '\u30AF', '\u30A6', '\u30EC', '\u30E1', 
			'\u30D8', '\u30CD', '\u30C6', '\u30BB', '\u30B1', '\u30A8', 
			'\u30F2', '\u30ED', '\u30E8', '\u30E2', '\u30DB', '\u30CE', 
			'\u30C8', '\u30BD', '\u30B3', '\u30AA'
	);

	/**
	 * Конструктор для {@code KatakanaAlphabet}.
	 */
	public KatakanaAlphabet()
	{
		super(KatakanaAlphabet.LETTERS);
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

		final KatakanaAlphabet alphabet = (KatakanaAlphabet) obj;

		if (!Objects.equals(KatakanaAlphabet.LETTERS, alphabet.get())) {
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
		return KatakanaAlphabet.LETTERS.hashCode();
	}
}
