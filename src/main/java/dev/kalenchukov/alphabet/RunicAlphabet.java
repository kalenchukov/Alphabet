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
 * Класс букв германского рунического алфавита.
 *
 * @author Алексей Каленчуков
 */
public final class RunicAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u16A0', '\u16A1', '\u16A2', '\u16A3', '\u16A4', '\u16A5', 
			'\u16A6', '\u16A7', '\u16A8', '\u16A9', '\u16AA', '\u16AB', 
			'\u16AC', '\u16AD', '\u16AE', '\u16AF', '\u16B0', '\u16B1', 
			'\u16B2', '\u16B3', '\u16B4', '\u16B5', '\u16B6', '\u16B7', 
			'\u16B8', '\u16B9', '\u16BA', '\u16BB', '\u16BC', '\u16BD', 
			'\u16BE', '\u16BF', '\u16C0', '\u16C1', '\u16C2', '\u16C3', 
			'\u16C4', '\u16C5', '\u16C6', '\u16C7', '\u16C8', '\u16C9', 
			'\u16CA', '\u16CB', '\u16CC', '\u16CD', '\u16CE', '\u16CF', 
			'\u16D0', '\u16D1', '\u16D2', '\u16D3', '\u16D4', '\u16D5', 
			'\u16D6', '\u16D7', '\u16D8', '\u16D9', '\u16DA', '\u16DB', 
			'\u16DC', '\u16DD', '\u16DE', '\u16DF', '\u16E0', '\u16E1', 
			'\u16E2', '\u16E3', '\u16E4', '\u16E5', '\u16E6', '\u16E7', 
			'\u16E8', '\u16E9', '\u16EA', '\u16EB', '\u16EC', '\u16ED', 
			'\u16EE', '\u16EF', '\u16F0', '\u16F1', '\u16F2', '\u16F3', 
			'\u16F4', '\u16F5', '\u16F6', '\u16F7', '\u16F8'
	);

	/**
	 * Конструктор для {@code RunicAlphabet}.
	 */
	public RunicAlphabet()
	{
		super(RunicAlphabet.LETTERS);
	}
}
