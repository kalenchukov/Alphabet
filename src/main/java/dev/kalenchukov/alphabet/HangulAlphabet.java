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
 * Класс букв алфавита хангыль.
 */
public class HangulAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u3131', '\u3134', '\u3137', '\u3139', '\u3141', '\u3142', 
			'\u3145', '\u3147', '\u3148', '\u314A', '\u314B', '\u314C', 
			'\u314D', '\u314E', '\u314F', '\u3153', '\u3157', '\u315C', 
			'\u3161', '\u3163', '\u3151', '\u3155', '\u315B', '\u3160', 
			'\u3132', '\u3138', '\u3143', '\u3146', '\u3149', '\u3133', 
			'\u3135', '\u3136', '\u313A', '\u313B', '\u313C', '\u313D', 
			'\u313E', '\u313F', '\u3140', '\u3144', '\u3150', '\u3152', 
			'\u3154', '\u3156', '\u3158', '\u3159', '\u315A', '\u315D', 
			'\u315E', '\u315F', '\u3162'
	);

	/**
	 * Конструктор для {@code HangulAlphabet}.
	 */
	public HangulAlphabet()
	{
		super(HangulAlphabet.LETTERS);
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

		final HangulAlphabet alphabet = (HangulAlphabet) obj;

		if (!Objects.equals(HangulAlphabet.LETTERS, alphabet.get())) {
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
