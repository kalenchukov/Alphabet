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
 * Класс букв алфавита силхети нагари.
 *
 * @author Aleksey Kalenchukov
 */
public final class SylotiNagriAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	private static final List<@NotNull Character> LETTERS = List.of(
			'\uA800', '\uA801', '\uA802', '\uA803', '\uA804', '\uA805', 
			'\uA806', '\uA807', '\uA808', '\uA809', '\uA80A', '\uA80B', 
			'\uA80C', '\uA80D', '\uA80E', '\uA80F', '\uA810', '\uA811', 
			'\uA812', '\uA813', '\uA814', '\uA815', '\uA816', '\uA817', 
			'\uA818', '\uA819', '\uA81A', '\uA81B', '\uA81C', '\uA81D', 
			'\uA81E', '\uA81F', '\uA820', '\uA821', '\uA822', '\uA823', 
			'\uA824', '\uA825', '\uA826', '\uA827', '\uA828', '\uA829', 
			'\uA82A', '\uA82B'
	);

	/**
	 * Конструктор для {@code SylotiNagriAlphabet}.
	 */
	public SylotiNagriAlphabet()
	{
		super(SylotiNagriAlphabet.LETTERS);
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

		final SylotiNagriAlphabet alphabet = (SylotiNagriAlphabet) obj;

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
