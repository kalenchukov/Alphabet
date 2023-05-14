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
 * Класс букв алфавита бопомофо.
 *
 * @author Алексей Каленчуков
 */
public final class BopomofoAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u3105', '\u3106', '\u3107', '\u3108', '\u3109', '\u310A', 
			'\u310B', '\u310C', '\u310D', '\u310E', '\u310F', '\u3110', 
			'\u3111', '\u3112', '\u3113', '\u3114', '\u3115', '\u3116', 
			'\u3117', '\u3118', '\u3119', '\u311A', '\u311B', '\u311C', 
			'\u311D', '\u311E', '\u311F', '\u3120', '\u3121', '\u3122', 
			'\u3123', '\u3124', '\u3125', '\u3126', '\u3127', '\u3128', 
			'\u3129', '\u312A', '\u312B', '\u312C', '\u312D'
	);

	/**
	 * Конструктор для {@code BopomofoAlphabet}.
	 */
	public BopomofoAlphabet()
	{
		super(BopomofoAlphabet.LETTERS);
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

		final BopomofoAlphabet alphabet = (BopomofoAlphabet) obj;

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
