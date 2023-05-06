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
 * Класс букв алфавита тай-вьет.
 *
 * @author Aleksey Kalenchukov
 */
public final class TaiVietAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	private static final List<@NotNull Character> LETTERS = List.of(
			'\uAA80', '\uAA81', '\uAA82', '\uAA83', '\uAA84', '\uAA85', 
			'\uAA86', '\uAA87', '\uAA88', '\uAA89', '\uAA8A', '\uAA8B', 
			'\uAA8C', '\uAA8D', '\uAA8E', '\uAA8F', '\uAA90', '\uAA91', 
			'\uAA92', '\uAA93', '\uAA94', '\uAA95', '\uAA96', '\uAA97', 
			'\uAA98', '\uAA99', '\uAA9A', '\uAA9B', '\uAA9C', '\uAA9D', 
			'\uAA9E', '\uAA9F', '\uAAA0', '\uAAA1', '\uAAA2', '\uAAA3', 
			'\uAAA4', '\uAAA5', '\uAAA6', '\uAAA7', '\uAAA8', '\uAAA9', 
			'\uAAAA', '\uAAAB', '\uAAAC', '\uAAAD', '\uAAAE', '\uAAAF', 
			'\uAAB0', '\uAAB1', '\uAAB2', '\uAAB3', '\uAAB4', '\uAAB5', 
			'\uAAB6', '\uAAB7', '\uAAB8', '\uAAB9', '\uAABA', '\uAABB', 
			'\uAABC', '\uAABD', '\uAABE', '\uAABF', '\uAAC0', '\uAAC1', 
			'\uAAC2'
	);

	/**
	 * Конструктор для {@code TaiVietAlphabet}.
	 */
	public TaiVietAlphabet()
	{
		super(TaiVietAlphabet.LETTERS);
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

		final TaiVietAlphabet alphabet = (TaiVietAlphabet) obj;

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
