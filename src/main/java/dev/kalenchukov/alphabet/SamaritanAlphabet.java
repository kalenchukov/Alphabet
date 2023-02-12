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
 * Класс букв самаритянского алфавита.
 */
public class SamaritanAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0800', '\u0801', '\u0802', '\u0803', '\u0804', '\u0805', 
			'\u0806', '\u0807', '\u0808', '\u0809', '\u080A', '\u080B', 
			'\u080C', '\u080D', '\u080E', '\u080F', '\u0810', '\u0811', 
			'\u0812', '\u0813', '\u0814', '\u0815', '\u0816', '\u0817', 
			'\u0818', '\u0819', '\u081A', '\u081B', '\u081C', '\u081D', 
			'\u081E', '\u081F', '\u0820', '\u0821', '\u0822', '\u0823', 
			'\u0824', '\u0825', '\u0826', '\u0827', '\u0828', '\u0829', 
			'\u082A', '\u082B', '\u082C', '\u082D', '\u0830', '\u0831',
			'\u0832', '\u0833', '\u0834', '\u0835', '\u0836', '\u0837',
			'\u0838', '\u0839', '\u083A', '\u083B', '\u083C', '\u083D',
			'\u083E'
	);

	/**
	 * Конструктор для {@code SamaritanAlphabet}.
	 */
	public SamaritanAlphabet()
	{
		super(SamaritanAlphabet.LETTERS);
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

		final SamaritanAlphabet alphabet = (SamaritanAlphabet) obj;

		if (!Objects.equals(SamaritanAlphabet.LETTERS, alphabet.get())) {
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
		return SamaritanAlphabet.LETTERS.hashCode();
	}
}
