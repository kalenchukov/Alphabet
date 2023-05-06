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
 * Класс букв алфавита ол-чики.
 *
 * @author Aleksey Kalenchukov
 */
public final class OlChikiAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	private static final List<@NotNull Character> LETTERS = List.of(
			'\u1C50', '\u1C51', '\u1C52', '\u1C53', '\u1C54', '\u1C55', 
			'\u1C56', '\u1C57', '\u1C58', '\u1C59', '\u1C5A', '\u1C5B', 
			'\u1C5C', '\u1C5D', '\u1C5E', '\u1C5F', '\u1C60', '\u1C61', 
			'\u1C62', '\u1C63', '\u1C64', '\u1C65', '\u1C66', '\u1C67', 
			'\u1C68', '\u1C69', '\u1C6A', '\u1C6B', '\u1C6C', '\u1C6D', 
			'\u1C6E', '\u1C6F', '\u1C70', '\u1C71', '\u1C72', '\u1C73', 
			'\u1C74', '\u1C75', '\u1C76', '\u1C77', '\u1C78', '\u1C79', 
			'\u1C7A', '\u1C7B', '\u1C7C', '\u1C7D', '\u1C7E', '\u1C7F'
	);

	/**
	 * Конструктор для {@code OlChikiAlphabet}.
	 */
	public OlChikiAlphabet()
	{
		super(OlChikiAlphabet.LETTERS);
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

		final OlChikiAlphabet alphabet = (OlChikiAlphabet) obj;

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
