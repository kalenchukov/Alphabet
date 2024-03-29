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
 * Класс букв слогового алфавита йи.
 *
 * @author Алексей Каленчуков
 */
public final class YiSyllablesAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\uA000', '\uA001', '\uA002', '\uA003', '\uA004', '\uA005', 
			'\uA006', '\uA007', '\uA008', '\uA009', '\uA00A', '\uA00B', 
			'\uA00C', '\uA00D', '\uA00E', '\uA00F', '\uA010', '\uA011', 
			'\uA012', '\uA013', '\uA014', '\uA015', '\uA016', '\uA017', 
			'\uA018', '\uA019', '\uA01A', '\uA01B', '\uA01C', '\uA01D', 
			'\uA01E', '\uA01F', '\uA020', '\uA021', '\uA022', '\uA023', 
			'\uA024', '\uA025', '\uA026', '\uA027', '\uA028', '\uA029', 
			'\uA02A', '\uA02B', '\uA02C', '\uA02D', '\uA02E', '\uA02F', 
			'\uA030', '\uA031', '\uA032', '\uA033', '\uA034', '\uA035', 
			'\uA036', '\uA037', '\uA038', '\uA039', '\uA03A', '\uA03B', 
			'\uA03C', '\uA03D', '\uA03E', '\uA03F', '\uA040', '\uA041', 
			'\uA042', '\uA043', '\uA044', '\uA045', '\uA046', '\uA047', 
			'\uA048', '\uA049', '\uA04A', '\uA04B', '\uA04C', '\uA04D', 
			'\uA04E', '\uA04F', '\uA050', '\uA051', '\uA052', '\uA053', 
			'\uA054', '\uA055', '\uA056', '\uA057', '\uA058', '\uA059', 
			'\uA05A', '\uA05B', '\uA05C', '\uA05D', '\uA05E', '\uA05F', 
			'\uA060', '\uA061', '\uA062', '\uA063', '\uA064', '\uA065', 
			'\uA066', '\uA067', '\uA068', '\uA069', '\uA06A', '\uA06B', 
			'\uA06C', '\uA06D', '\uA06E', '\uA06F', '\uA070', '\uA071', 
			'\uA072', '\uA073', '\uA074', '\uA075', '\uA076', '\uA077', 
			'\uA078', '\uA079', '\uA07A', '\uA07B', '\uA07C', '\uA07D', 
			'\uA07E', '\uA07F', '\uA080', '\uA081', '\uA082', '\uA083', 
			'\uA084', '\uA085', '\uA086', '\uA087', '\uA088', '\uA089', 
			'\uA08A', '\uA08B', '\uA08C', '\uA08D', '\uA08E', '\uA08F', 
			'\uA090', '\uA091', '\uA092', '\uA093', '\uA094', '\uA095', 
			'\uA096', '\uA097', '\uA098', '\uA099', '\uA09A', '\uA09B', 
			'\uA09C', '\uA09D', '\uA09E', '\uA09F', '\uA0A0', '\uA0A1', 
			'\uA0A2', '\uA0A3', '\uA0A4', '\uA0A5', '\uA0A6', '\uA0A7', 
			'\uA0A8', '\uA0A9', '\uA0AA', '\uA0AB', '\uA0AC', '\uA0AD', 
			'\uA0AE', '\uA0AF', '\uA0B0', '\uA0B1', '\uA0B2', '\uA0B3', 
			'\uA0B4', '\uA0B5', '\uA0B6', '\uA0B7', '\uA0B8', '\uA0B9', 
			'\uA0BA', '\uA0BB', '\uA0BC', '\uA0BD', '\uA0BE', '\uA0BF', 
			'\uA0C0', '\uA0C1', '\uA0C2', '\uA0C3', '\uA0C4', '\uA0C5', 
			'\uA0C6', '\uA0C7', '\uA0C8', '\uA0C9', '\uA0CA', '\uA0CB', 
			'\uA0CC', '\uA0CD', '\uA0CE', '\uA0CF', '\uA0D0', '\uA0D1', 
			'\uA0D2', '\uA0D3', '\uA0D4', '\uA0D5', '\uA0D6', '\uA0D7', 
			'\uA0D8', '\uA0D9', '\uA0DA', '\uA0DB', '\uA0DC', '\uA0DD', 
			'\uA0DE', '\uA0DF', '\uA0E0', '\uA0E1', '\uA0E2', '\uA0E3', 
			'\uA0E4', '\uA0E5', '\uA0E6', '\uA0E7', '\uA0E8', '\uA0E9', 
			'\uA0EA', '\uA0EB', '\uA0EC', '\uA0ED', '\uA0EE', '\uA0EF', 
			'\uA0F0', '\uA0F1', '\uA0F2', '\uA0F3', '\uA0F4', '\uA0F5', 
			'\uA0F6', '\uA0F7', '\uA0F8', '\uA0F9', '\uA0FA', '\uA0FB', 
			'\uA0FC', '\uA0FD', '\uA0FE', '\uA0FF', '\uA100', '\uA101', 
			'\uA102', '\uA103', '\uA104', '\uA105', '\uA106', '\uA107', 
			'\uA108', '\uA109', '\uA10A', '\uA10B', '\uA10C', '\uA10D', 
			'\uA10E', '\uA10F', '\uA110', '\uA111', '\uA112', '\uA113', 
			'\uA114', '\uA115', '\uA116', '\uA117', '\uA118', '\uA119', 
			'\uA11A', '\uA11B', '\uA11C', '\uA11D', '\uA11E', '\uA11F', 
			'\uA120', '\uA121', '\uA122', '\uA123', '\uA124', '\uA125', 
			'\uA126', '\uA127', '\uA128', '\uA129', '\uA12A', '\uA12B', 
			'\uA12C', '\uA12D', '\uA12E', '\uA12F', '\uA130', '\uA131', 
			'\uA132', '\uA133', '\uA134', '\uA135', '\uA136', '\uA137', 
			'\uA138', '\uA139', '\uA13A', '\uA13B', '\uA13C', '\uA13D', 
			'\uA13E', '\uA13F', '\uA140', '\uA141', '\uA142', '\uA143', 
			'\uA144', '\uA145', '\uA146', '\uA147', '\uA148', '\uA149', 
			'\uA14A', '\uA14B', '\uA14C', '\uA14D', '\uA14E', '\uA14F', 
			'\uA150', '\uA151', '\uA152', '\uA153', '\uA154', '\uA155', 
			'\uA156', '\uA157', '\uA158', '\uA159', '\uA15A', '\uA15B', 
			'\uA15C', '\uA15D', '\uA15E', '\uA15F', '\uA160', '\uA161', 
			'\uA162', '\uA163', '\uA164', '\uA165', '\uA166', '\uA167', 
			'\uA168', '\uA169', '\uA16A', '\uA16B', '\uA16C', '\uA16D', 
			'\uA16E', '\uA16F', '\uA170', '\uA171', '\uA172', '\uA173', 
			'\uA174', '\uA175', '\uA176', '\uA177', '\uA178', '\uA179', 
			'\uA17A', '\uA17B', '\uA17C', '\uA17D', '\uA17E', '\uA17F', 
			'\uA180', '\uA181', '\uA182', '\uA183', '\uA184', '\uA185', 
			'\uA186', '\uA187', '\uA188', '\uA189', '\uA18A', '\uA18B', 
			'\uA18C', '\uA18D', '\uA18E', '\uA18F', '\uA190', '\uA191', 
			'\uA192', '\uA193', '\uA194', '\uA195', '\uA196', '\uA197', 
			'\uA198', '\uA199', '\uA19A', '\uA19B', '\uA19C', '\uA19D', 
			'\uA19E', '\uA19F', '\uA1A0', '\uA1A1', '\uA1A2', '\uA1A3', 
			'\uA1A4', '\uA1A5', '\uA1A6', '\uA1A7', '\uA1A8', '\uA1A9', 
			'\uA1AA', '\uA1AB', '\uA1AC', '\uA1AD', '\uA1AE', '\uA1AF', 
			'\uA1B0', '\uA1B1', '\uA1B2', '\uA1B3', '\uA1B4', '\uA1B5', 
			'\uA1B6', '\uA1B7', '\uA1B8', '\uA1B9', '\uA1BA', '\uA1BB', 
			'\uA1BC', '\uA1BD', '\uA1BE', '\uA1BF', '\uA1C0', '\uA1C1', 
			'\uA1C2', '\uA1C3', '\uA1C4', '\uA1C5', '\uA1C6', '\uA1C7', 
			'\uA1C8', '\uA1C9', '\uA1CA', '\uA1CB', '\uA1CC', '\uA1CD', 
			'\uA1CE', '\uA1CF', '\uA1D0', '\uA1D1', '\uA1D2', '\uA1D3', 
			'\uA1D4', '\uA1D5', '\uA1D6', '\uA1D7', '\uA1D8', '\uA1D9', 
			'\uA1DA', '\uA1DB', '\uA1DC', '\uA1DD', '\uA1DE', '\uA1DF', 
			'\uA1E0', '\uA1E1', '\uA1E2', '\uA1E3', '\uA1E4', '\uA1E5', 
			'\uA1E6', '\uA1E7', '\uA1E8', '\uA1E9', '\uA1EA', '\uA1EB', 
			'\uA1EC', '\uA1ED', '\uA1EE', '\uA1EF', '\uA1F0', '\uA1F1', 
			'\uA1F2', '\uA1F3', '\uA1F4', '\uA1F5', '\uA1F6', '\uA1F7', 
			'\uA1F8', '\uA1F9', '\uA1FA', '\uA1FB', '\uA1FC', '\uA1FD', 
			'\uA1FE', '\uA1FF', '\uA200', '\uA201', '\uA202', '\uA203', 
			'\uA204', '\uA205', '\uA206', '\uA207', '\uA208', '\uA209', 
			'\uA20A', '\uA20B', '\uA20C', '\uA20D', '\uA20E', '\uA20F', 
			'\uA210', '\uA211', '\uA212', '\uA213', '\uA214', '\uA215', 
			'\uA216', '\uA217', '\uA218', '\uA219', '\uA21A', '\uA21B', 
			'\uA21C', '\uA21D', '\uA21E', '\uA21F', '\uA220', '\uA221', 
			'\uA222', '\uA223', '\uA224', '\uA225', '\uA226', '\uA227', 
			'\uA228', '\uA229', '\uA22A', '\uA22B', '\uA22C', '\uA22D', 
			'\uA22E', '\uA22F', '\uA230', '\uA231', '\uA232', '\uA233', 
			'\uA234', '\uA235', '\uA236', '\uA237', '\uA238', '\uA239', 
			'\uA23A', '\uA23B', '\uA23C', '\uA23D', '\uA23E', '\uA23F', 
			'\uA240', '\uA241', '\uA242', '\uA243', '\uA244', '\uA245', 
			'\uA246', '\uA247', '\uA248', '\uA249', '\uA24A', '\uA24B', 
			'\uA24C', '\uA24D', '\uA24E', '\uA24F', '\uA250', '\uA251', 
			'\uA252', '\uA253', '\uA254', '\uA255', '\uA256', '\uA257', 
			'\uA258', '\uA259', '\uA25A', '\uA25B', '\uA25C', '\uA25D', 
			'\uA25E', '\uA25F', '\uA260', '\uA261', '\uA262', '\uA263', 
			'\uA264', '\uA265', '\uA266', '\uA267', '\uA268', '\uA269', 
			'\uA26A', '\uA26B', '\uA26C', '\uA26D', '\uA26E', '\uA26F', 
			'\uA270', '\uA271', '\uA272', '\uA273', '\uA274', '\uA275', 
			'\uA276', '\uA277', '\uA278', '\uA279', '\uA27A', '\uA27B', 
			'\uA27C', '\uA27D', '\uA27E', '\uA27F', '\uA280', '\uA281', 
			'\uA282', '\uA283', '\uA284', '\uA285', '\uA286', '\uA287', 
			'\uA288', '\uA289', '\uA28A', '\uA28B', '\uA28C', '\uA28D', 
			'\uA28E', '\uA28F', '\uA290', '\uA291', '\uA292', '\uA293', 
			'\uA294', '\uA295', '\uA296', '\uA297', '\uA298', '\uA299', 
			'\uA29A', '\uA29B', '\uA29C', '\uA29D', '\uA29E', '\uA29F', 
			'\uA2A0', '\uA2A1', '\uA2A2', '\uA2A3', '\uA2A4', '\uA2A5', 
			'\uA2A6', '\uA2A7', '\uA2A8', '\uA2A9', '\uA2AA', '\uA2AB', 
			'\uA2AC', '\uA2AD', '\uA2AE', '\uA2AF', '\uA2B0', '\uA2B1', 
			'\uA2B2', '\uA2B3', '\uA2B4', '\uA2B5', '\uA2B6', '\uA2B7', 
			'\uA2B8', '\uA2B9', '\uA2BA', '\uA2BB', '\uA2BC', '\uA2BD', 
			'\uA2BE', '\uA2BF', '\uA2C0', '\uA2C1', '\uA2C2', '\uA2C3', 
			'\uA2C4', '\uA2C5', '\uA2C6', '\uA2C7', '\uA2C8', '\uA2C9', 
			'\uA2CA', '\uA2CB', '\uA2CC', '\uA2CD', '\uA2CE', '\uA2CF', 
			'\uA2D0', '\uA2D1', '\uA2D2', '\uA2D3', '\uA2D4', '\uA2D5', 
			'\uA2D6', '\uA2D7', '\uA2D8', '\uA2D9', '\uA2DA', '\uA2DB', 
			'\uA2DC', '\uA2DD', '\uA2DE', '\uA2DF', '\uA2E0', '\uA2E1', 
			'\uA2E2', '\uA2E3', '\uA2E4', '\uA2E5', '\uA2E6', '\uA2E7', 
			'\uA2E8', '\uA2E9', '\uA2EA', '\uA2EB', '\uA2EC', '\uA2ED', 
			'\uA2EE', '\uA2EF', '\uA2F0', '\uA2F1', '\uA2F2', '\uA2F3', 
			'\uA2F4', '\uA2F5', '\uA2F6', '\uA2F7', '\uA2F8', '\uA2F9', 
			'\uA2FA', '\uA2FB', '\uA2FC', '\uA2FD', '\uA2FE', '\uA2FF', 
			'\uA300', '\uA301', '\uA302', '\uA303', '\uA304', '\uA305', 
			'\uA306', '\uA307', '\uA308', '\uA309', '\uA30A', '\uA30B', 
			'\uA30C', '\uA30D', '\uA30E', '\uA30F', '\uA310', '\uA311', 
			'\uA312', '\uA313', '\uA314', '\uA315', '\uA316', '\uA317', 
			'\uA318', '\uA319', '\uA31A', '\uA31B', '\uA31C', '\uA31D', 
			'\uA31E', '\uA31F', '\uA320', '\uA321', '\uA322', '\uA323', 
			'\uA324', '\uA325', '\uA326', '\uA327', '\uA328', '\uA329', 
			'\uA32A', '\uA32B', '\uA32C', '\uA32D', '\uA32E', '\uA32F', 
			'\uA330', '\uA331', '\uA332', '\uA333', '\uA334', '\uA335', 
			'\uA336', '\uA337', '\uA338', '\uA339', '\uA33A', '\uA33B', 
			'\uA33C', '\uA33D', '\uA33E', '\uA33F', '\uA340', '\uA341', 
			'\uA342', '\uA343', '\uA344', '\uA345', '\uA346', '\uA347', 
			'\uA348', '\uA349', '\uA34A', '\uA34B', '\uA34C', '\uA34D', 
			'\uA34E', '\uA34F', '\uA350', '\uA351', '\uA352', '\uA353', 
			'\uA354', '\uA355', '\uA356', '\uA357', '\uA358', '\uA359', 
			'\uA35A', '\uA35B', '\uA35C', '\uA35D', '\uA35E', '\uA35F', 
			'\uA360', '\uA361', '\uA362', '\uA363', '\uA364', '\uA365', 
			'\uA366', '\uA367', '\uA368', '\uA369', '\uA36A', '\uA36B', 
			'\uA36C', '\uA36D', '\uA36E', '\uA36F', '\uA370', '\uA371', 
			'\uA372', '\uA373', '\uA374', '\uA375', '\uA376', '\uA377', 
			'\uA378', '\uA379', '\uA37A', '\uA37B', '\uA37C', '\uA37D', 
			'\uA37E', '\uA37F', '\uA380', '\uA381', '\uA382', '\uA383', 
			'\uA384', '\uA385', '\uA386', '\uA387', '\uA388', '\uA389', 
			'\uA38A', '\uA38B', '\uA38C', '\uA38D', '\uA38E', '\uA38F', 
			'\uA390', '\uA391', '\uA392', '\uA393', '\uA394', '\uA395', 
			'\uA396', '\uA397', '\uA398', '\uA399', '\uA39A', '\uA39B', 
			'\uA39C', '\uA39D', '\uA39E', '\uA39F', '\uA3A0', '\uA3A1', 
			'\uA3A2', '\uA3A3', '\uA3A4', '\uA3A5', '\uA3A6', '\uA3A7', 
			'\uA3A8', '\uA3A9', '\uA3AA', '\uA3AB', '\uA3AC', '\uA3AD', 
			'\uA3AE', '\uA3AF', '\uA3B0', '\uA3B1', '\uA3B2', '\uA3B3', 
			'\uA3B4', '\uA3B5', '\uA3B6', '\uA3B7', '\uA3B8', '\uA3B9', 
			'\uA3BA', '\uA3BB', '\uA3BC', '\uA3BD', '\uA3BE', '\uA3BF', 
			'\uA3C0', '\uA3C1', '\uA3C2', '\uA3C3', '\uA3C4', '\uA3C5', 
			'\uA3C6', '\uA3C7', '\uA3C8', '\uA3C9', '\uA3CA', '\uA3CB', 
			'\uA3CC', '\uA3CD', '\uA3CE', '\uA3CF', '\uA3D0', '\uA3D1', 
			'\uA3D2', '\uA3D3', '\uA3D4', '\uA3D5', '\uA3D6', '\uA3D7', 
			'\uA3D8', '\uA3D9', '\uA3DA', '\uA3DB', '\uA3DC', '\uA3DD', 
			'\uA3DE', '\uA3DF', '\uA3E0', '\uA3E1', '\uA3E2', '\uA3E3', 
			'\uA3E4', '\uA3E5', '\uA3E6', '\uA3E7', '\uA3E8', '\uA3E9', 
			'\uA3EA', '\uA3EB', '\uA3EC', '\uA3ED', '\uA3EE', '\uA3EF', 
			'\uA3F0', '\uA3F1', '\uA3F2', '\uA3F3', '\uA3F4', '\uA3F5', 
			'\uA3F6', '\uA3F7', '\uA3F8', '\uA3F9', '\uA3FA', '\uA3FB', 
			'\uA3FC', '\uA3FD', '\uA3FE', '\uA3FF', '\uA400', '\uA401', 
			'\uA402', '\uA403', '\uA404', '\uA405', '\uA406', '\uA407', 
			'\uA408', '\uA409', '\uA40A', '\uA40B', '\uA40C', '\uA40D', 
			'\uA40E', '\uA40F'
	);

	/**
	 * Конструктор для {@code YiSyllablesAlphabet}.
	 */
	public YiSyllablesAlphabet()
	{
		super(YiSyllablesAlphabet.LETTERS);
	}
}
