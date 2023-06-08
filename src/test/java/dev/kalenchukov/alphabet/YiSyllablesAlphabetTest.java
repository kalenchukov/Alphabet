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
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link YiSyllablesAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class YiSyllablesAlphabetTest
{
	@NotNull
	public static final Alphabetical ALPHABET = new YiSyllablesAlphabet();

	/**
	 * Проверка метода {@link YiSyllablesAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		List<Character> letters = List.of(
			'ꀀ', 'ꀁ', 'ꀂ', 'ꀃ', 'ꀄ', 'ꀅ', 
			'ꀆ', 'ꀇ', 'ꀈ', 'ꀉ', 'ꀊ', 'ꀋ', 
			'ꀌ', 'ꀍ', 'ꀎ', 'ꀏ', 'ꀐ', 'ꀑ', 
			'ꀒ', 'ꀓ', 'ꀔ', 'ꀕ', 'ꀖ', 'ꀗ', 
			'ꀘ', 'ꀙ', 'ꀚ', 'ꀛ', 'ꀜ', 'ꀝ', 
			'ꀞ', 'ꀟ', 'ꀠ', 'ꀡ', 'ꀢ', 'ꀣ', 
			'ꀤ', 'ꀥ', 'ꀦ', 'ꀧ', 'ꀨ', 'ꀩ', 
			'ꀪ', 'ꀫ', 'ꀬ', 'ꀭ', 'ꀮ', 'ꀯ', 
			'ꀰ', 'ꀱ', 'ꀲ', 'ꀳ', 'ꀴ', 'ꀵ', 
			'ꀶ', 'ꀷ', 'ꀸ', 'ꀹ', 'ꀺ', 'ꀻ', 
			'ꀼ', 'ꀽ', 'ꀾ', 'ꀿ', 'ꁀ', 'ꁁ', 
			'ꁂ', 'ꁃ', 'ꁄ', 'ꁅ', 'ꁆ', 'ꁇ', 
			'ꁈ', 'ꁉ', 'ꁊ', 'ꁋ', 'ꁌ', 'ꁍ', 
			'ꁎ', 'ꁏ', 'ꁐ', 'ꁑ', 'ꁒ', 'ꁓ', 
			'ꁔ', 'ꁕ', 'ꁖ', 'ꁗ', 'ꁘ', 'ꁙ', 
			'ꁚ', 'ꁛ', 'ꁜ', 'ꁝ', 'ꁞ', 'ꁟ', 
			'ꁠ', 'ꁡ', 'ꁢ', 'ꁣ', 'ꁤ', 'ꁥ', 
			'ꁦ', 'ꁧ', 'ꁨ', 'ꁩ', 'ꁪ', 'ꁫ', 
			'ꁬ', 'ꁭ', 'ꁮ', 'ꁯ', 'ꁰ', 'ꁱ', 
			'ꁲ', 'ꁳ', 'ꁴ', 'ꁵ', 'ꁶ', 'ꁷ', 
			'ꁸ', 'ꁹ', 'ꁺ', 'ꁻ', 'ꁼ', 'ꁽ', 
			'ꁾ', 'ꁿ', 'ꂀ', 'ꂁ', 'ꂂ', 'ꂃ', 
			'ꂄ', 'ꂅ', 'ꂆ', 'ꂇ', 'ꂈ', 'ꂉ', 
			'ꂊ', 'ꂋ', 'ꂌ', 'ꂍ', 'ꂎ', 'ꂏ', 
			'ꂐ', 'ꂑ', 'ꂒ', 'ꂓ', 'ꂔ', 'ꂕ', 
			'ꂖ', 'ꂗ', 'ꂘ', 'ꂙ', 'ꂚ', 'ꂛ', 
			'ꂜ', 'ꂝ', 'ꂞ', 'ꂟ', 'ꂠ', 'ꂡ', 
			'ꂢ', 'ꂣ', 'ꂤ', 'ꂥ', 'ꂦ', 'ꂧ', 
			'ꂨ', 'ꂩ', 'ꂪ', 'ꂫ', 'ꂬ', 'ꂭ', 
			'ꂮ', 'ꂯ', 'ꂰ', 'ꂱ', 'ꂲ', 'ꂳ', 
			'ꂴ', 'ꂵ', 'ꂶ', 'ꂷ', 'ꂸ', 'ꂹ', 
			'ꂺ', 'ꂻ', 'ꂼ', 'ꂽ', 'ꂾ', 'ꂿ', 
			'ꃀ', 'ꃁ', 'ꃂ', 'ꃃ', 'ꃄ', 'ꃅ', 
			'ꃆ', 'ꃇ', 'ꃈ', 'ꃉ', 'ꃊ', 'ꃋ', 
			'ꃌ', 'ꃍ', 'ꃎ', 'ꃏ', 'ꃐ', 'ꃑ', 
			'ꃒ', 'ꃓ', 'ꃔ', 'ꃕ', 'ꃖ', 'ꃗ', 
			'ꃘ', 'ꃙ', 'ꃚ', 'ꃛ', 'ꃜ', 'ꃝ', 
			'ꃞ', 'ꃟ', 'ꃠ', 'ꃡ', 'ꃢ', 'ꃣ', 
			'ꃤ', 'ꃥ', 'ꃦ', 'ꃧ', 'ꃨ', 'ꃩ', 
			'ꃪ', 'ꃫ', 'ꃬ', 'ꃭ', 'ꃮ', 'ꃯ', 
			'ꃰ', 'ꃱ', 'ꃲ', 'ꃳ', 'ꃴ', 'ꃵ', 
			'ꃶ', 'ꃷ', 'ꃸ', 'ꃹ', 'ꃺ', 'ꃻ', 
			'ꃼ', 'ꃽ', 'ꃾ', 'ꃿ', 'ꄀ', 'ꄁ', 
			'ꄂ', 'ꄃ', 'ꄄ', 'ꄅ', 'ꄆ', 'ꄇ', 
			'ꄈ', 'ꄉ', 'ꄊ', 'ꄋ', 'ꄌ', 'ꄍ', 
			'ꄎ', 'ꄏ', 'ꄐ', 'ꄑ', 'ꄒ', 'ꄓ', 
			'ꄔ', 'ꄕ', 'ꄖ', 'ꄗ', 'ꄘ', 'ꄙ', 
			'ꄚ', 'ꄛ', 'ꄜ', 'ꄝ', 'ꄞ', 'ꄟ', 
			'ꄠ', 'ꄡ', 'ꄢ', 'ꄣ', 'ꄤ', 'ꄥ', 
			'ꄦ', 'ꄧ', 'ꄨ', 'ꄩ', 'ꄪ', 'ꄫ', 
			'ꄬ', 'ꄭ', 'ꄮ', 'ꄯ', 'ꄰ', 'ꄱ', 
			'ꄲ', 'ꄳ', 'ꄴ', 'ꄵ', 'ꄶ', 'ꄷ', 
			'ꄸ', 'ꄹ', 'ꄺ', 'ꄻ', 'ꄼ', 'ꄽ', 
			'ꄾ', 'ꄿ', 'ꅀ', 'ꅁ', 'ꅂ', 'ꅃ', 
			'ꅄ', 'ꅅ', 'ꅆ', 'ꅇ', 'ꅈ', 'ꅉ', 
			'ꅊ', 'ꅋ', 'ꅌ', 'ꅍ', 'ꅎ', 'ꅏ', 
			'ꅐ', 'ꅑ', 'ꅒ', 'ꅓ', 'ꅔ', 'ꅕ', 
			'ꅖ', 'ꅗ', 'ꅘ', 'ꅙ', 'ꅚ', 'ꅛ', 
			'ꅜ', 'ꅝ', 'ꅞ', 'ꅟ', 'ꅠ', 'ꅡ', 
			'ꅢ', 'ꅣ', 'ꅤ', 'ꅥ', 'ꅦ', 'ꅧ', 
			'ꅨ', 'ꅩ', 'ꅪ', 'ꅫ', 'ꅬ', 'ꅭ', 
			'ꅮ', 'ꅯ', 'ꅰ', 'ꅱ', 'ꅲ', 'ꅳ', 
			'ꅴ', 'ꅵ', 'ꅶ', 'ꅷ', 'ꅸ', 'ꅹ', 
			'ꅺ', 'ꅻ', 'ꅼ', 'ꅽ', 'ꅾ', 'ꅿ', 
			'ꆀ', 'ꆁ', 'ꆂ', 'ꆃ', 'ꆄ', 'ꆅ', 
			'ꆆ', 'ꆇ', 'ꆈ', 'ꆉ', 'ꆊ', 'ꆋ', 
			'ꆌ', 'ꆍ', 'ꆎ', 'ꆏ', 'ꆐ', 'ꆑ', 
			'ꆒ', 'ꆓ', 'ꆔ', 'ꆕ', 'ꆖ', 'ꆗ', 
			'ꆘ', 'ꆙ', 'ꆚ', 'ꆛ', 'ꆜ', 'ꆝ', 
			'ꆞ', 'ꆟ', 'ꆠ', 'ꆡ', 'ꆢ', 'ꆣ', 
			'ꆤ', 'ꆥ', 'ꆦ', 'ꆧ', 'ꆨ', 'ꆩ', 
			'ꆪ', 'ꆫ', 'ꆬ', 'ꆭ', 'ꆮ', 'ꆯ', 
			'ꆰ', 'ꆱ', 'ꆲ', 'ꆳ', 'ꆴ', 'ꆵ', 
			'ꆶ', 'ꆷ', 'ꆸ', 'ꆹ', 'ꆺ', 'ꆻ', 
			'ꆼ', 'ꆽ', 'ꆾ', 'ꆿ', 'ꇀ', 'ꇁ', 
			'ꇂ', 'ꇃ', 'ꇄ', 'ꇅ', 'ꇆ', 'ꇇ', 
			'ꇈ', 'ꇉ', 'ꇊ', 'ꇋ', 'ꇌ', 'ꇍ', 
			'ꇎ', 'ꇏ', 'ꇐ', 'ꇑ', 'ꇒ', 'ꇓ', 
			'ꇔ', 'ꇕ', 'ꇖ', 'ꇗ', 'ꇘ', 'ꇙ', 
			'ꇚ', 'ꇛ', 'ꇜ', 'ꇝ', 'ꇞ', 'ꇟ', 
			'ꇠ', 'ꇡ', 'ꇢ', 'ꇣ', 'ꇤ', 'ꇥ', 
			'ꇦ', 'ꇧ', 'ꇨ', 'ꇩ', 'ꇪ', 'ꇫ', 
			'ꇬ', 'ꇭ', 'ꇮ', 'ꇯ', 'ꇰ', 'ꇱ', 
			'ꇲ', 'ꇳ', 'ꇴ', 'ꇵ', 'ꇶ', 'ꇷ', 
			'ꇸ', 'ꇹ', 'ꇺ', 'ꇻ', 'ꇼ', 'ꇽ', 
			'ꇾ', 'ꇿ', 'ꈀ', 'ꈁ', 'ꈂ', 'ꈃ', 
			'ꈄ', 'ꈅ', 'ꈆ', 'ꈇ', 'ꈈ', 'ꈉ', 
			'ꈊ', 'ꈋ', 'ꈌ', 'ꈍ', 'ꈎ', 'ꈏ', 
			'ꈐ', 'ꈑ', 'ꈒ', 'ꈓ', 'ꈔ', 'ꈕ', 
			'ꈖ', 'ꈗ', 'ꈘ', 'ꈙ', 'ꈚ', 'ꈛ', 
			'ꈜ', 'ꈝ', 'ꈞ', 'ꈟ', 'ꈠ', 'ꈡ', 
			'ꈢ', 'ꈣ', 'ꈤ', 'ꈥ', 'ꈦ', 'ꈧ', 
			'ꈨ', 'ꈩ', 'ꈪ', 'ꈫ', 'ꈬ', 'ꈭ', 
			'ꈮ', 'ꈯ', 'ꈰ', 'ꈱ', 'ꈲ', 'ꈳ', 
			'ꈴ', 'ꈵ', 'ꈶ', 'ꈷ', 'ꈸ', 'ꈹ', 
			'ꈺ', 'ꈻ', 'ꈼ', 'ꈽ', 'ꈾ', 'ꈿ', 
			'ꉀ', 'ꉁ', 'ꉂ', 'ꉃ', 'ꉄ', 'ꉅ', 
			'ꉆ', 'ꉇ', 'ꉈ', 'ꉉ', 'ꉊ', 'ꉋ', 
			'ꉌ', 'ꉍ', 'ꉎ', 'ꉏ', 'ꉐ', 'ꉑ', 
			'ꉒ', 'ꉓ', 'ꉔ', 'ꉕ', 'ꉖ', 'ꉗ', 
			'ꉘ', 'ꉙ', 'ꉚ', 'ꉛ', 'ꉜ', 'ꉝ', 
			'ꉞ', 'ꉟ', 'ꉠ', 'ꉡ', 'ꉢ', 'ꉣ', 
			'ꉤ', 'ꉥ', 'ꉦ', 'ꉧ', 'ꉨ', 'ꉩ', 
			'ꉪ', 'ꉫ', 'ꉬ', 'ꉭ', 'ꉮ', 'ꉯ', 
			'ꉰ', 'ꉱ', 'ꉲ', 'ꉳ', 'ꉴ', 'ꉵ', 
			'ꉶ', 'ꉷ', 'ꉸ', 'ꉹ', 'ꉺ', 'ꉻ', 
			'ꉼ', 'ꉽ', 'ꉾ', 'ꉿ', 'ꊀ', 'ꊁ', 
			'ꊂ', 'ꊃ', 'ꊄ', 'ꊅ', 'ꊆ', 'ꊇ', 
			'ꊈ', 'ꊉ', 'ꊊ', 'ꊋ', 'ꊌ', 'ꊍ', 
			'ꊎ', 'ꊏ', 'ꊐ', 'ꊑ', 'ꊒ', 'ꊓ', 
			'ꊔ', 'ꊕ', 'ꊖ', 'ꊗ', 'ꊘ', 'ꊙ', 
			'ꊚ', 'ꊛ', 'ꊜ', 'ꊝ', 'ꊞ', 'ꊟ', 
			'ꊠ', 'ꊡ', 'ꊢ', 'ꊣ', 'ꊤ', 'ꊥ', 
			'ꊦ', 'ꊧ', 'ꊨ', 'ꊩ', 'ꊪ', 'ꊫ', 
			'ꊬ', 'ꊭ', 'ꊮ', 'ꊯ', 'ꊰ', 'ꊱ', 
			'ꊲ', 'ꊳ', 'ꊴ', 'ꊵ', 'ꊶ', 'ꊷ', 
			'ꊸ', 'ꊹ', 'ꊺ', 'ꊻ', 'ꊼ', 'ꊽ', 
			'ꊾ', 'ꊿ', 'ꋀ', 'ꋁ', 'ꋂ', 'ꋃ', 
			'ꋄ', 'ꋅ', 'ꋆ', 'ꋇ', 'ꋈ', 'ꋉ', 
			'ꋊ', 'ꋋ', 'ꋌ', 'ꋍ', 'ꋎ', 'ꋏ', 
			'ꋐ', 'ꋑ', 'ꋒ', 'ꋓ', 'ꋔ', 'ꋕ', 
			'ꋖ', 'ꋗ', 'ꋘ', 'ꋙ', 'ꋚ', 'ꋛ', 
			'ꋜ', 'ꋝ', 'ꋞ', 'ꋟ', 'ꋠ', 'ꋡ', 
			'ꋢ', 'ꋣ', 'ꋤ', 'ꋥ', 'ꋦ', 'ꋧ', 
			'ꋨ', 'ꋩ', 'ꋪ', 'ꋫ', 'ꋬ', 'ꋭ', 
			'ꋮ', 'ꋯ', 'ꋰ', 'ꋱ', 'ꋲ', 'ꋳ', 
			'ꋴ', 'ꋵ', 'ꋶ', 'ꋷ', 'ꋸ', 'ꋹ', 
			'ꋺ', 'ꋻ', 'ꋼ', 'ꋽ', 'ꋾ', 'ꋿ', 
			'ꌀ', 'ꌁ', 'ꌂ', 'ꌃ', 'ꌄ', 'ꌅ', 
			'ꌆ', 'ꌇ', 'ꌈ', 'ꌉ', 'ꌊ', 'ꌋ', 
			'ꌌ', 'ꌍ', 'ꌎ', 'ꌏ', 'ꌐ', 'ꌑ', 
			'ꌒ', 'ꌓ', 'ꌔ', 'ꌕ', 'ꌖ', 'ꌗ', 
			'ꌘ', 'ꌙ', 'ꌚ', 'ꌛ', 'ꌜ', 'ꌝ', 
			'ꌞ', 'ꌟ', 'ꌠ', 'ꌡ', 'ꌢ', 'ꌣ', 
			'ꌤ', 'ꌥ', 'ꌦ', 'ꌧ', 'ꌨ', 'ꌩ', 
			'ꌪ', 'ꌫ', 'ꌬ', 'ꌭ', 'ꌮ', 'ꌯ', 
			'ꌰ', 'ꌱ', 'ꌲ', 'ꌳ', 'ꌴ', 'ꌵ', 
			'ꌶ', 'ꌷ', 'ꌸ', 'ꌹ', 'ꌺ', 'ꌻ', 
			'ꌼ', 'ꌽ', 'ꌾ', 'ꌿ', 'ꍀ', 'ꍁ', 
			'ꍂ', 'ꍃ', 'ꍄ', 'ꍅ', 'ꍆ', 'ꍇ', 
			'ꍈ', 'ꍉ', 'ꍊ', 'ꍋ', 'ꍌ', 'ꍍ', 
			'ꍎ', 'ꍏ', 'ꍐ', 'ꍑ', 'ꍒ', 'ꍓ', 
			'ꍔ', 'ꍕ', 'ꍖ', 'ꍗ', 'ꍘ', 'ꍙ', 
			'ꍚ', 'ꍛ', 'ꍜ', 'ꍝ', 'ꍞ', 'ꍟ', 
			'ꍠ', 'ꍡ', 'ꍢ', 'ꍣ', 'ꍤ', 'ꍥ', 
			'ꍦ', 'ꍧ', 'ꍨ', 'ꍩ', 'ꍪ', 'ꍫ', 
			'ꍬ', 'ꍭ', 'ꍮ', 'ꍯ', 'ꍰ', 'ꍱ', 
			'ꍲ', 'ꍳ', 'ꍴ', 'ꍵ', 'ꍶ', 'ꍷ', 
			'ꍸ', 'ꍹ', 'ꍺ', 'ꍻ', 'ꍼ', 'ꍽ', 
			'ꍾ', 'ꍿ', 'ꎀ', 'ꎁ', 'ꎂ', 'ꎃ', 
			'ꎄ', 'ꎅ', 'ꎆ', 'ꎇ', 'ꎈ', 'ꎉ', 
			'ꎊ', 'ꎋ', 'ꎌ', 'ꎍ', 'ꎎ', 'ꎏ', 
			'ꎐ', 'ꎑ', 'ꎒ', 'ꎓ', 'ꎔ', 'ꎕ', 
			'ꎖ', 'ꎗ', 'ꎘ', 'ꎙ', 'ꎚ', 'ꎛ', 
			'ꎜ', 'ꎝ', 'ꎞ', 'ꎟ', 'ꎠ', 'ꎡ', 
			'ꎢ', 'ꎣ', 'ꎤ', 'ꎥ', 'ꎦ', 'ꎧ', 
			'ꎨ', 'ꎩ', 'ꎪ', 'ꎫ', 'ꎬ', 'ꎭ', 
			'ꎮ', 'ꎯ', 'ꎰ', 'ꎱ', 'ꎲ', 'ꎳ', 
			'ꎴ', 'ꎵ', 'ꎶ', 'ꎷ', 'ꎸ', 'ꎹ', 
			'ꎺ', 'ꎻ', 'ꎼ', 'ꎽ', 'ꎾ', 'ꎿ', 
			'ꏀ', 'ꏁ', 'ꏂ', 'ꏃ', 'ꏄ', 'ꏅ', 
			'ꏆ', 'ꏇ', 'ꏈ', 'ꏉ', 'ꏊ', 'ꏋ', 
			'ꏌ', 'ꏍ', 'ꏎ', 'ꏏ', 'ꏐ', 'ꏑ', 
			'ꏒ', 'ꏓ', 'ꏔ', 'ꏕ', 'ꏖ', 'ꏗ', 
			'ꏘ', 'ꏙ', 'ꏚ', 'ꏛ', 'ꏜ', 'ꏝ', 
			'ꏞ', 'ꏟ', 'ꏠ', 'ꏡ', 'ꏢ', 'ꏣ', 
			'ꏤ', 'ꏥ', 'ꏦ', 'ꏧ', 'ꏨ', 'ꏩ', 
			'ꏪ', 'ꏫ', 'ꏬ', 'ꏭ', 'ꏮ', 'ꏯ', 
			'ꏰ', 'ꏱ', 'ꏲ', 'ꏳ', 'ꏴ', 'ꏵ', 
			'ꏶ', 'ꏷ', 'ꏸ', 'ꏹ', 'ꏺ', 'ꏻ', 
			'ꏼ', 'ꏽ', 'ꏾ', 'ꏿ', 'ꐀ', 'ꐁ', 
			'ꐂ', 'ꐃ', 'ꐄ', 'ꐅ', 'ꐆ', 'ꐇ', 
			'ꐈ', 'ꐉ', 'ꐊ', 'ꐋ', 'ꐌ', 'ꐍ', 
			'ꐎ', 'ꐏ'
		);

		assertArrayEquals(letters.toArray(), ALPHABET.get().toArray());
	}

	/**
	 * Проверка метода {@link YiSyllablesAlphabet#equals(Object)}.
	 */
	@Test
	public void testEquals()
	{
		assertNotEquals(null, ALPHABET);

		assertEquals(ALPHABET, ALPHABET);

		assertNotEquals(ALPHABET, new RussianAlphabet());

		assertEquals(ALPHABET, new YiSyllablesAlphabet());
	}

	/**
	 * Проверка метода {@link YiSyllablesAlphabet#hashCode()}.
	 */
	@Test
	public void testHashCode()
	{
		assertEquals(ALPHABET.hashCode(), ALPHABET.hashCode());

		assertEquals(ALPHABET.hashCode(), new YiSyllablesAlphabet().hashCode());

		assertNotEquals(ALPHABET.hashCode(), new RussianAlphabet().hashCode());
	}
}
