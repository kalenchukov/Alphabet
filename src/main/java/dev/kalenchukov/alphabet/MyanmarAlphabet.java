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
 * Класс букв бирманского алфавита.
 *
 * @author Алексей Каленчуков
 */
public final class MyanmarAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1000', '\u1001', '\u1002', '\u1003', '\u1004', '\u1005', 
			'\u1006', '\u1007', '\u1008', '\u100A', '\u100B', '\u100C', 
			'\u100D', '\u100E', '\u100F', '\u1010', '\u1011', '\u1012', 
			'\u1013', '\u1014', '\u1015', '\u1016', '\u1017', '\u1018', 
			'\u1019', '\u101A', '\u101B', '\u101C', '\u101D', '\u101E', 
			'\u101F', '\u1020', '\u1021', '\u1022', '\u1023', '\u1024', 
			'\u1025', '\u1026', '\u1027', '\u1028', '\u1029', '\u102A', 
			'\u102B', '\u102C', '\u102D', '\u102E', '\u102F', '\u1030', 
			'\u1031', '\u1032', '\u1033', '\u1034', '\u1035', '\u1036', 
			'\u1037', '\u1038', '\u1039', '\u103A', '\u103B', '\u103C', 
			'\u103D', '\u103E', '\u103F', '\u1040', '\u1041', '\u1042', 
			'\u1043', '\u1044', '\u1045', '\u1046', '\u1047', '\u1048', 
			'\u1049', '\u104A', '\u104B', '\u104C', '\u104D', '\u104E', 
			'\u104F', '\u1050', '\u1051', '\u1052', '\u1053', '\u1054', 
			'\u1055', '\u1056', '\u1057', '\u1058', '\u1059', '\u105A', 
			'\u105B', '\u105C', '\u105D', '\u105E', '\u105F', '\u1060'
	);

	/**
	 * Конструктор для {@code MyanmarAlphabet}.
	 */
	public MyanmarAlphabet()
	{
		super(MyanmarAlphabet.LETTERS);
	}
}
