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
 * Класс букв алфавита деванагари.
 */
public class DevanagariAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0915', '\u0916', '\u0917', '\u0918', '\u0919', '\u091A', 
			'\u091B', '\u091C', '\u091D', '\u091E', '\u091F', '\u0920', 
			'\u0921', '\u0922', '\u0923', '\u0924', '\u0925', '\u0926', 
			'\u0927', '\u0928', '\u092A', '\u092B', '\u092C', '\u092D', 
			'\u092E', '\u092F', '\u0930', '\u0932', '\u0935', '\u0936', 
			'\u0937', '\u0938', '\u0939', '\u0958', '\u0959', '\u095A', 
			'\u095B', '\u095C', '\u095D', '\u095E', '\u095F', '\u0905', 
			'\u0906', '\u093E', '\u0907', '\u093F', '\u0908', '\u0940', 
			'\u0909', '\u0941', '\u090A', '\u0942', '\u090B', '\u0943', 
			'\u0960', '\u0944', '\u090C', '\u0962', '\u0961', '\u0963', 
			'\u090F', '\u0947', '\u0910', '\u0948', '\u0912', '\u094A', 
			'\u0913', '\u094B', '\u0914', '\u094C', '\u0901', '\u0902', 
			'\u0903', '\u094D', '\u0945'
	);

	/**
	 * Конструктор для {@code DevanagariAlphabet}.
	 */
	public DevanagariAlphabet()
	{
		super(DevanagariAlphabet.LETTERS);
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

		final DevanagariAlphabet alphabet = (DevanagariAlphabet) obj;

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
