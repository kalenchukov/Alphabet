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
 * Класс букв слогового алфавита ваи.
 *
 * @author Алексей Каленчуков
 */
public final class VaiAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA500', '\uA501', '\uA502', '\uA503', '\uA504', '\uA505', 
			'\uA506', '\uA507', '\uA508', '\uA509', '\uA50A', '\uA50B', 
			'\uA50C', '\uA50D', '\uA50E', '\uA50F', '\uA510', '\uA511', 
			'\uA512', '\uA513', '\uA514', '\uA515', '\uA516', '\uA517', 
			'\uA518', '\uA519', '\uA51A', '\uA51B', '\uA51C', '\uA51D', 
			'\uA51E', '\uA51F', '\uA520', '\uA521', '\uA522', '\uA523', 
			'\uA524', '\uA525', '\uA526', '\uA527', '\uA528', '\uA529', 
			'\uA52A', '\uA52B', '\uA52C', '\uA52D', '\uA52E', '\uA52F', 
			'\uA530', '\uA531', '\uA532', '\uA533', '\uA534', '\uA535', 
			'\uA536', '\uA537', '\uA538', '\uA539', '\uA53A', '\uA53B', 
			'\uA53C', '\uA53D', '\uA53E', '\uA53F', '\uA540', '\uA541', 
			'\uA542', '\uA543', '\uA544', '\uA545', '\uA546', '\uA547', 
			'\uA548', '\uA549', '\uA54A', '\uA54B', '\uA54C', '\uA54D', 
			'\uA54E', '\uA54F', '\uA550', '\uA551', '\uA552', '\uA553', 
			'\uA554', '\uA555', '\uA556', '\uA557', '\uA558', '\uA559', 
			'\uA55A', '\uA55B', '\uA55C', '\uA55D', '\uA55E', '\uA55F', 
			'\uA560', '\uA561', '\uA562', '\uA563', '\uA564', '\uA565', 
			'\uA566', '\uA567', '\uA568', '\uA569', '\uA56A', '\uA56B', 
			'\uA56C', '\uA56D', '\uA56E', '\uA56F', '\uA570', '\uA571', 
			'\uA572', '\uA573', '\uA574', '\uA575', '\uA576', '\uA577', 
			'\uA578', '\uA579', '\uA57A', '\uA57B', '\uA57C', '\uA57D', 
			'\uA57E', '\uA57F', '\uA580', '\uA581', '\uA582', '\uA583', 
			'\uA584', '\uA585', '\uA586', '\uA587', '\uA588', '\uA589', 
			'\uA58A', '\uA58B', '\uA58C', '\uA58D', '\uA58E', '\uA58F', 
			'\uA590', '\uA591', '\uA592', '\uA593', '\uA594', '\uA595', 
			'\uA596', '\uA597', '\uA598', '\uA599', '\uA59A', '\uA59B', 
			'\uA59C', '\uA59D', '\uA59E', '\uA59F', '\uA5A0', '\uA5A1', 
			'\uA5A2', '\uA5A3', '\uA5A4', '\uA5A5', '\uA5A6', '\uA5A7', 
			'\uA5A8', '\uA5A9', '\uA5AA', '\uA5AB', '\uA5AC', '\uA5AD', 
			'\uA5AE', '\uA5AF', '\uA5B0', '\uA5B1', '\uA5B2', '\uA5B3', 
			'\uA5B4', '\uA5B5', '\uA5B6', '\uA5B7', '\uA5B8', '\uA5B9', 
			'\uA5BA', '\uA5BB', '\uA5BC', '\uA5BD', '\uA5BE', '\uA5BF', 
			'\uA5C0', '\uA5C1', '\uA5C2', '\uA5C3', '\uA5C4', '\uA5C5', 
			'\uA5C6', '\uA5C7', '\uA5C8', '\uA5C9', '\uA5CA', '\uA5CB', 
			'\uA5CC', '\uA5CD', '\uA5CE', '\uA5CF', '\uA5D0', '\uA5D1', 
			'\uA5D2', '\uA5D3', '\uA5D4', '\uA5D5', '\uA5D6', '\uA5D7', 
			'\uA5D8', '\uA5D9', '\uA5DA', '\uA5DB', '\uA5DC', '\uA5DD', 
			'\uA5DE', '\uA5DF', '\uA5E0', '\uA5E1', '\uA5E2', '\uA5E3', 
			'\uA5E4', '\uA5E5', '\uA5E6', '\uA5E7', '\uA5E8', '\uA5E9', 
			'\uA5EA', '\uA5EB', '\uA5EC', '\uA5ED', '\uA5EE', '\uA5EF', 
			'\uA5F0', '\uA5F1', '\uA5F2', '\uA5F3', '\uA5F4', '\uA5F5', 
			'\uA5F6', '\uA5F7', '\uA5F8', '\uA5F9', '\uA5FA', '\uA5FB', 
			'\uA5FC', '\uA5FD', '\uA5FE', '\uA5FF', '\uA600', '\uA601', 
			'\uA602', '\uA603', '\uA604', '\uA605', '\uA606', '\uA607', 
			'\uA608', '\uA609', '\uA60A', '\uA60B', '\uA60C', '\uA60D', 
			'\uA60E', '\uA60F', '\uA610', '\uA611', '\uA612', '\uA613', 
			'\uA614', '\uA615', '\uA616', '\uA617', '\uA618', '\uA619', 
			'\uA61A', '\uA61B', '\uA61C', '\uA61D', '\uA61E', '\uA61F', 
			'\uA620', '\uA621', '\uA622', '\uA623', '\uA624', '\uA625', 
			'\uA626', '\uA627', '\uA628', '\uA629', '\uA62A', '\uA62B'
	);

	/**
	 * Конструктор для {@code VaiAlphabet}.
	 */
	public VaiAlphabet()
	{
		super(VaiAlphabet.LETTERS);
	}
}
