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
 * Класс букв реджангского алфавита.
 *
 * @author Aleksey Kalenchukov
 */
public final class RejangAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA930', '\uA931', '\uA932', '\uA933', '\uA934', '\uA935', 
			'\uA936', '\uA937', '\uA938', '\uA939', '\uA93A', '\uA93B', 
			'\uA93C', '\uA93D', '\uA93E', '\uA93F', '\uA940', '\uA941', 
			'\uA942', '\uA943', '\uA944', '\uA945', '\uA946', '\uA947', 
			'\uA948', '\uA949', '\uA94A', '\uA94B', '\uA94C', '\uA94D', 
			'\uA94E', '\uA94F', '\uA950', '\uA951', '\uA952', '\uA953', 
			'\uA95F'
	);

	/**
	 * Конструктор для {@code RejangAlphabet}.
	 */
	public RejangAlphabet()
	{
		super(RejangAlphabet.LETTERS);
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

		final RejangAlphabet alphabet = (RejangAlphabet) obj;

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
