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
 * Класс букв монгольского алфавита.
 */
public class MongolianAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1820', '\u1821', '\u1822', '\u1823', '\u1824', '\u1825', 
			'\u1826', '\u1827', '\u1828', '\u1829', '\u182A', '\u182B', 
			'\u182C', '\u182D', '\u182E', '\u182F', '\u1830', '\u1831', 
			'\u1832', '\u1833', '\u1834', '\u1835', '\u1836', '\u1837', 
			'\u1838', '\u1839', '\u183A', '\u183B', '\u183C', '\u183D', 
			'\u183E', '\u183F', '\u1840', '\u1841', '\u1842'
	);

	/**
	 * Конструктор для {@code MongolianAlphabet}.
	 */
	public MongolianAlphabet()
	{
		super(MongolianAlphabet.LETTERS);
	}

	/**
	 * @see Alphabetical#equals(Object)
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

		final MongolianAlphabet alphabet = (MongolianAlphabet) obj;

		if (!Objects.equals(this.get(), alphabet.get())) {
			return false;
		}

		return true;
	}

	/**
	 * @see Alphabetical#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return this.get().hashCode();
	}
}
