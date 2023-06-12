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
 * Класс букв башкирского алфавита.
 *
 * @author Алексей Каленчуков
 */
public final class BashkirAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0410', '\u0430', '\u0411', '\u0431', '\u0412', '\u0432', 
			'\u0413', '\u0433', '\u0492', '\u0493', '\u0414', '\u0434', 
			'\u0498', '\u0499', '\u0415', '\u0435', '\u0401', '\u0451', 
			'\u0416', '\u0436', '\u0417', '\u0437', '\u0418', '\u0438', 
			'\u0419', '\u0439', '\u041A', '\u043A', '\u04A0', '\u04A1', 
			'\u041B', '\u043B', '\u041C', '\u043C', '\u041D', '\u043D', 
			'\u04A2', '\u04A3', '\u041E', '\u043E', '\u04E8', '\u04E9', 
			'\u041F', '\u043F', '\u0420', '\u0440', '\u0421', '\u0441', 
			'\u04AA', '\u04AB', '\u0422', '\u0442', '\u0423', '\u0443', 
			'\u04AE', '\u04AF', '\u0424', '\u0444', '\u0425', '\u0445', 
			'\u04BA', '\u04BB', '\u0426', '\u0446', '\u0427', '\u0447', 
			'\u0428', '\u0448', '\u0429', '\u0449', '\u042A', '\u044A', 
			'\u042B', '\u044B', '\u042C', '\u044C', '\u042D', '\u044D', 
			'\u04D8', '\u04D9', '\u042E', '\u044E', '\u042F', '\u044F'
	);

	/**
	 * Конструктор для {@code BashkirAlphabet}.
	 */
	public BashkirAlphabet()
	{
		super(BashkirAlphabet.LETTERS);
	}

	/**
	 * Класс прописных букв башкирского алфавита.
	 *
	 * @author Алексей Каленчуков
	 */
	public static final class UpperCase extends AbstractAlphabet implements AlphabeticalUpperCase
	{
		/**
		 * Коды прописных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0410', '\u0411', '\u0412', '\u0413', '\u0492', '\u0414', 
			'\u0498', '\u0415', '\u0401', '\u0416', '\u0417', '\u0418', 
			'\u0419', '\u041A', '\u04A0', '\u041B', '\u041C', '\u041D', 
			'\u04A2', '\u041E', '\u04E8', '\u041F', '\u0420', '\u0421', 
			'\u04AA', '\u0422', '\u0423', '\u04AE', '\u0424', '\u0425', 
			'\u04BA', '\u0426', '\u0427', '\u0428', '\u0429', '\u042A', 
			'\u042B', '\u042C', '\u042D', '\u04D8', '\u042E', '\u042F'
		);

		/**
		 * Конструктор для {@code BashkirAlphabet.UpperCase}.
		 */
		public UpperCase()
		{
			super(BashkirAlphabet.UpperCase.LETTERS);
		}
	}

	/**
	 * Класс строчных букв башкирского алфавита.
	 *
	 * @author Алексей Каленчуков
	 */
	public static final class LowerCase extends AbstractAlphabet implements AlphabeticalLowerCase
	{
		/**
		 * Коды строчных букв в Unicode.
		 */
		@Unmodifiable
		@NotNull
		public static final List<@NotNull Character> LETTERS = List.of(
			'\u0430', '\u0431', '\u0432', '\u0433', '\u0493', '\u0434', 
			'\u0499', '\u0435', '\u0451', '\u0436', '\u0437', '\u0438', 
			'\u0439', '\u043A', '\u04A1', '\u043B', '\u043C', '\u043D', 
			'\u04A3', '\u043E', '\u04E9', '\u043F', '\u0440', '\u0441', 
			'\u04AB', '\u0442', '\u0443', '\u04AF', '\u0444', '\u0445', 
			'\u04BB', '\u0446', '\u0447', '\u0448', '\u0449', '\u044A', 
			'\u044B', '\u044C', '\u044D', '\u04D9', '\u044E', '\u044F'
		);

		/**
		 * Конструктор для {@code BashkirAlphabet.LowerCase}.
		 */
		public LowerCase()
		{
			super(BashkirAlphabet.LowerCase.LETTERS);
		}
	}
}
