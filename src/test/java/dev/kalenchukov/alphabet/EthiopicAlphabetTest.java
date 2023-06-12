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

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link EthiopicAlphabet}.
 *
 * @author Алексей Каленчуков
 */
public class EthiopicAlphabetTest
{
	/**
	 * Проверка метода {@link EthiopicAlphabet#get()}.
	 */
	@Test
	public void get()
	{
		EthiopicAlphabet alphabet = new EthiopicAlphabet();
		List<Character> expectedList = List.of(
			'ሀ', 'ሁ', 'ሂ', 'ሃ', 'ሄ', 'ህ', 
			'ሆ', 'ለ', 'ሉ', 'ሊ', 'ላ', 'ሌ', 
			'ል', 'ሎ', 'ሏ', 'ሐ', 'ሑ', 'ሒ', 
			'ሓ', 'ሔ', 'ሕ', 'ሖ', 'ሗ', 'መ', 
			'ሙ', 'ሚ', 'ማ', 'ሜ', 'ም', 'ሞ', 
			'ሟ', 'ፙ', 'ሠ', 'ሡ', 'ሢ', 'ሣ', 
			'ሤ', 'ሥ', 'ሦ', 'ሧ', 'ረ', 'ሩ', 
			'ሪ', 'ራ', 'ሬ', 'ር', 'ሮ', 'ሯ', 
			'ፘ', 'ሰ', 'ሱ', 'ሲ', 'ሳ', 'ሴ', 
			'ስ', 'ሶ', 'ሷ', 'ቀ', 'ቁ', 'ቂ', 
			'ቃ', 'ቄ', 'ቅ', 'ቆ', 'ቋ', 'በ', 
			'ቡ', 'ቢ', 'ባ', 'ቤ', 'ብ', 'ቦ', 
			'ቧ', 'ተ', 'ቱ', 'ቲ', 'ታ', 'ቴ', 
			'ት', 'ቶ', 'ቷ', 'ኀ', 'ኁ', 'ኂ', 
			'ኃ', 'ኄ', 'ኅ', 'ኆ', 'ኋ', 'ነ', 
			'ኑ', 'ኒ', 'ና', 'ኔ', 'ን', 'ኖ', 
			'ኗ', 'አ', 'ኡ', 'ኢ', 'ኣ', 'ኤ', 
			'እ', 'ኦ', 'ኧ', 'ከ', 'ኩ', 'ኪ', 
			'ካ', 'ኬ', 'ክ', 'ኮ', 'ኳ', 'ወ', 
			'ዉ', 'ዊ', 'ዋ', 'ዌ', 'ው', 'ዎ', 
			'ዐ', 'ዑ', 'ዒ', 'ዓ', 'ዔ', 'ዕ', 
			'ዖ', 'ዘ', 'ዙ', 'ዚ', 'ዛ', 'ዜ', 
			'ዝ', 'ዞ', 'ዟ', 'የ', 'ዩ', 'ዪ', 
			'ያ', 'ዬ', 'ይ', 'ዮ', 'ደ', 'ዱ', 
			'ዲ', 'ዳ', 'ዴ', 'ድ', 'ዶ', 'ዷ', 
			'ገ', 'ጉ', 'ጊ', 'ጋ', 'ጌ', 'ግ', 
			'ጎ', 'ጓ', 'ጠ', 'ጡ', 'ጢ', 'ጣ', 
			'ጤ', 'ጥ', 'ጦ', 'ጧ', 'ጰ', 'ጱ', 
			'ጲ', 'ጳ', 'ጴ', 'ጵ', 'ጶ', 'ጷ', 
			'ጸ', 'ጹ', 'ጺ', 'ጻ', 'ጼ', 'ጽ', 
			'ጾ', 'ጿ', 'ፀ', 'ፁ', 'ፂ', 'ፃ', 
			'ፄ', 'ፅ', 'ፆ', 'ፈ', 'ፉ', 'ፊ', 
			'ፋ', 'ፌ', 'ፍ', 'ፎ', 'ፏ', 'ፚ', 
			'ፐ', 'ፑ', 'ፒ', 'ፓ', 'ፔ', 'ፕ', 
			'ፖ', 'ፗ', 'ፘ', 'ፙ', 'ፚ', '፝', 
			'፞', '፟', '፠', '፡', '።', '፣', 
			'፤', '፥', '፦', '፧', '፨', '፩', 
			'፪', '፫', '፬', '፭', '፮', '፯', 
			'፰', '፱', '፲', '፳', '፴', '፵', 
			'፶', '፷', '፸', '፹', '፺', '፻', 
			'፼'
		);

		List<Character> actualList = alphabet.get();

		assertThat(actualList).containsSequence(expectedList);
	}
}
