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
 * Класс букв алфавита лимбу.
 */
public class LimbuAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1900', '\u1901', '\u1902', '\u1903', '\u1904', '\u1905', 
			'\u1906', '\u1907', '\u1908', '\u1909', '\u190A', '\u190B', 
			'\u190C', '\u190D', '\u190E', '\u190F', '\u1910', '\u1911', 
			'\u1912', '\u1913', '\u1914', '\u1915', '\u1916', '\u1917', 
			'\u1918', '\u1919', '\u191A', '\u191B', '\u191C', '\u191D', 
			'\u191E', '\u1920', '\u1921', '\u1922', '\u1923', '\u1924', 
			'\u1925', '\u1926', '\u1927', '\u1928', '\u1929', '\u192A', 
			'\u192B', '\u1920', '\u1921', '\u1922', '\u1923', '\u1924', 
			'\u1925', '\u1926', '\u1927', '\u1928', '\u1929', '\u192A', 
			'\u192B', '\u1940'
	);

	/**
	 * Конструктор для {@code LimbuAlphabet}.
	 */
	public LimbuAlphabet()
	{
		super(LimbuAlphabet.LETTERS);
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

		final LimbuAlphabet alphabet = (LimbuAlphabet) obj;

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
