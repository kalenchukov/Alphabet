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
 * Класс букв мандейского алфавита.
 *
 * @author Aleksey Kalenchukov
 */
public final class MandaicAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	private static final List<@NotNull Character> LETTERS = List.of(
			'\u0840', '\u0841', '\u0842', '\u0843', '\u0844', '\u0845', 
			'\u0846', '\u0847', '\u0848', '\u0849', '\u084A', '\u084B', 
			'\u084C', '\u084D', '\u084E', '\u084F', '\u0850', '\u0851', 
			'\u0852', '\u0853', '\u0854', '\u0855', '\u0856', '\u0857', 
			'\u0858', '\u0859', '\u085A', '\u085B', '\u085E'
	);

	/**
	 * Конструктор для {@code MandaicAlphabet}.
	 */
	public MandaicAlphabet()
	{
		super(MandaicAlphabet.LETTERS);
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

		final MandaicAlphabet alphabet = (MandaicAlphabet) obj;

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
