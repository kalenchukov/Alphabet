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
 * Класс букв алфавита хирагана.
 *
 * @author Aleksey Kalenchukov
 */
public final class HiraganaAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u304B', '\u304D', '\u304F', '\u3051', '\u3053', '\u3055', 
			'\u3057', '\u3059', '\u305B', '\u305D', '\u305F', '\u3061', 
			'\u3064', '\u3066', '\u3068', '\u306A', '\u306B', '\u306C', 
			'\u306D', '\u306E', '\u306F', '\u3072', '\u3075', '\u3078', 
			'\u307B', '\u307E', '\u307F', '\u3080', '\u3081', '\u3082', 
			'\u3084', '\u3086', '\u3088', '\u3089', '\u308A', '\u308B', 
			'\u308C', '\u308D', '\u308F', '\u3092', '\u3093', '\u304C', 
			'\u304E', '\u3050', '\u3052', '\u3054', '\u3056', '\u3058', 
			'\u305A', '\u305C', '\u305E', '\u3060', '\u3062', '\u3065', 
			'\u3067', '\u3069', '\u3070', '\u3073', '\u3076', '\u3079', 
			'\u307C', '\u3071', '\u3074', '\u3077', '\u307A', '\u307D', 
			'\u3083', '\u3085', '\u3087'
	);

	/**
	 * Конструктор для {@code HiraganaAlphabet}.
	 */
	public HiraganaAlphabet()
	{
		super(HiraganaAlphabet.LETTERS);
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

		final HiraganaAlphabet alphabet = (HiraganaAlphabet) obj;

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
