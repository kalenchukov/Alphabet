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
 * Класс букв алфавита лису.
 *
 * @author Алексей Каленчуков
 */
public final class LisuAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA4D0', '\uA4D1', '\uA4D2', '\uA4D3', '\uA4D4', '\uA4D5', 
			'\uA4D6', '\uA4D7', '\uA4D8', '\uA4D9', '\uA4DA', '\uA4DB', 
			'\uA4DC', '\uA4DD', '\uA4DE', '\uA4DF', '\uA4E0', '\uA4E1', 
			'\uA4E2', '\uA4E3', '\uA4E4', '\uA4E5', '\uA4E6', '\uA4E7', 
			'\uA4E8', '\uA4E9', '\uA4EA', '\uA4EB', '\uA4EC', '\uA4ED', 
			'\uA4EE', '\uA4EF', '\uA4F0', '\uA4F1', '\uA4F2', '\uA4F3', 
			'\uA4F4', '\uA4F5', '\uA4F6', '\uA4F7'
	);

	/**
	 * Конструктор для {@code LisuAlphabet}.
	 */
	public LisuAlphabet()
	{
		super(LisuAlphabet.LETTERS);
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

		final LisuAlphabet alphabet = (LisuAlphabet) obj;

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
