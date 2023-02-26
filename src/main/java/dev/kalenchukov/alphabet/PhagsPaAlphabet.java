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
 * Класс букв алфавита пагба-ламы.
 */
public class PhagsPaAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA840', '\uA841', '\uA842', '\uA843', '\uA844', '\uA845', 
			'\uA846', '\uA847', '\uA848', '\uA849', '\uA84A', '\uA84B', 
			'\uA84C', '\uA84D', '\uA84E', '\uA84F', '\uA850', '\uA851', 
			'\uA852', '\uA853', '\uA854', '\uA855', '\uA856', '\uA857', 
			'\uA858', '\uA859', '\uA85A', '\uA85B', '\uA85C', '\uA85D', 
			'\uA85E', '\uA85F', '\uA860', '\uA861', '\uA862', '\uA863', 
			'\uA864', '\uA865', '\uA866', '\uA867', '\uA868', '\uA869', 
			'\uA86A', '\uA86B', '\uA86C', '\uA86D', '\uA86E', '\uA86F', 
			'\uA870', '\uA871', '\uA872', '\uA873', '\uA874', '\uA875', 
			'\uA876', '\uA877'
	);

	/**
	 * Конструктор для {@code PhagsPaAlphabet}.
	 */
	public PhagsPaAlphabet()
	{
		super(PhagsPaAlphabet.LETTERS);
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

		final PhagsPaAlphabet alphabet = (PhagsPaAlphabet) obj;

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
