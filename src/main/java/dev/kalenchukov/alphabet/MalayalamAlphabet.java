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
 * Класс букв алфавита малаялам.
 *
 * @author Алексей Каленчуков
 */
public final class MalayalamAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u0D05', '\u0D06', '\u0D07', '\u0D08', '\u0D09', '\u0D0A', 
			'\u0D0B', '\u0D0C', '\u0D0E', '\u0D0F', '\u0D10', '\u0D12', 
			'\u0D13', '\u0D14', '\u0D15', '\u0D16', '\u0D17', '\u0D18', 
			'\u0D19', '\u0D1A', '\u0D1B', '\u0D1C', '\u0D1D', '\u0D1E', 
			'\u0D1F', '\u0D20', '\u0D21', '\u0D22', '\u0D23', '\u0D24', 
			'\u0D25', '\u0D26', '\u0D27', '\u0D28', '\u0D2A', '\u0D2B', 
			'\u0D2C', '\u0D2D', '\u0D2E', '\u0D2F', '\u0D30', '\u0D32', 
			'\u0D35', '\u0D36', '\u0D37', '\u0D38', '\u0D39', '\u0D33', 
			'\u0D34', '\u0D31', '\u0D32', '\u0D33', '\u0D34', '\u0D35', 
			'\u0D36', '\u0D37', '\u0D38', '\u0D39', '\u0D3A', '\u0D3D', 
			'\u0D3E', '\u0D3F', '\u0D40', '\u0D41', '\u0D42', '\u0D43', 
			'\u0D44', '\u0D46', '\u0D47', '\u0D48', '\u0D4A', '\u0D4B', 
			'\u0D4C', '\u0D4D', '\u0D4E'
	);

	/**
	 * Конструктор для {@code MalayalamAlphabet}.
	 */
	public MalayalamAlphabet()
	{
		super(MalayalamAlphabet.LETTERS);
	}
}
