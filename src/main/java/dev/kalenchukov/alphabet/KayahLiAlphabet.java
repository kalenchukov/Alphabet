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
 * Класс букв алфавита кайях ли.
 *
 * @author Алексей Каленчуков
 */
public final class KayahLiAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA900', '\uA901', '\uA902', '\uA903', '\uA904', '\uA905', 
			'\uA906', '\uA907', '\uA908', '\uA909', '\uA90A', '\uA90B', 
			'\uA90C', '\uA90D', '\uA90E', '\uA90F', '\uA910', '\uA911', 
			'\uA912', '\uA913', '\uA914', '\uA915', '\uA916', '\uA917', 
			'\uA918', '\uA919', '\uA91A', '\uA91B', '\uA91C', '\uA91D', 
			'\uA91E', '\uA91F', '\uA920', '\uA921', '\uA922', '\uA923', 
			'\uA924', '\uA925', '\uA926', '\uA927', '\uA928', '\uA929', 
			'\uA92A', '\uA92B', '\uA92C', '\uA92D', '\uA92E', '\uA92F'
	);

	/**
	 * Конструктор для {@code KayahLiAlphabet}.
	 */
	public KayahLiAlphabet()
	{
		super(KayahLiAlphabet.LETTERS);
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

		final KayahLiAlphabet alphabet = (KayahLiAlphabet) obj;

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
