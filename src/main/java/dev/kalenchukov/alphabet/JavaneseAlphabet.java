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
 * Класс букв яванского алфавита.
 *
 * @author Алексей Каленчуков
 */
public final class JavaneseAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA980', '\uA981', '\uA982', '\uA983', '\uA984', '\uA985', 
			'\uA986', '\uA987', '\uA988', '\uA989', '\uA98A', '\uA98B', 
			'\uA98C', '\uA98D', '\uA98E', '\uA98F', '\uA990', '\uA991', 
			'\uA992', '\uA993', '\uA994', '\uA995', '\uA996', '\uA997', 
			'\uA998', '\uA999', '\uA99A', '\uA99B', '\uA99C', '\uA99D', 
			'\uA99E', '\uA99F', '\uA9A0', '\uA9A1', '\uA9A2', '\uA9A3', 
			'\uA9A4', '\uA9A5', '\uA9A6', '\uA9A7', '\uA9A8', '\uA9A9', 
			'\uA9AA', '\uA9AB', '\uA9AC', '\uA9AD', '\uA9AE', '\uA9AF', 
			'\uA9B0', '\uA9B1', '\uA9B2', '\uA9B3', '\uA9B4', '\uA9B5', 
			'\uA9B6', '\uA9B7', '\uA9B8', '\uA9B9', '\uA9BA', '\uA9BB', 
			'\uA9BC', '\uA9BD', '\uA9BE', '\uA9BF', '\uA9C0', '\uA9C1', 
			'\uA9C2', '\uA9C3', '\uA9C4', '\uA9C5', '\uA9C6', '\uA9C7', 
			'\uA9C8', '\uA9C9', '\uA9CA', '\uA9CB', '\uA9CC', '\uA9CD'
	);

	/**
	 * Конструктор для {@code JavaneseAlphabet}.
	 */
	public JavaneseAlphabet()
	{
		super(JavaneseAlphabet.LETTERS);
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

		final JavaneseAlphabet alphabet = (JavaneseAlphabet) obj;

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
