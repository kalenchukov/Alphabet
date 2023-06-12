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
 * Класс букв эфиопского алфавита.
 *
 * @author Алексей Каленчуков
 */
public final class EthiopicAlphabet extends AbstractAlphabet implements AlphabeticalCase
{
	/**
	 * Коды букв в Unicode.
	 */
	@Unmodifiable
	@NotNull
	public static final List<@NotNull Character> LETTERS = List.of(
			'\u1200', '\u1201', '\u1202', '\u1203', '\u1204', '\u1205', 
			'\u1206', '\u1208', '\u1209', '\u120A', '\u120B', '\u120C', 
			'\u120D', '\u120E', '\u120F', '\u1210', '\u1211', '\u1212', 
			'\u1213', '\u1214', '\u1215', '\u1216', '\u1217', '\u1218', 
			'\u1219', '\u121A', '\u121B', '\u121C', '\u121D', '\u121E', 
			'\u121F', '\u1359', '\u1220', '\u1221', '\u1222', '\u1223', 
			'\u1224', '\u1225', '\u1226', '\u1227', '\u1228', '\u1229', 
			'\u122A', '\u122B', '\u122C', '\u122D', '\u122E', '\u122F', 
			'\u1358', '\u1230', '\u1231', '\u1232', '\u1233', '\u1234', 
			'\u1235', '\u1236', '\u1237', '\u1240', '\u1241', '\u1242', 
			'\u1243', '\u1244', '\u1245', '\u1246', '\u124B', '\u1260', 
			'\u1261', '\u1262', '\u1263', '\u1264', '\u1265', '\u1266', 
			'\u1267', '\u1270', '\u1271', '\u1272', '\u1273', '\u1274', 
			'\u1275', '\u1276', '\u1277', '\u1280', '\u1281', '\u1282', 
			'\u1283', '\u1284', '\u1285', '\u1286', '\u128B', '\u1290', 
			'\u1291', '\u1292', '\u1293', '\u1294', '\u1295', '\u1296', 
			'\u1297', '\u12A0', '\u12A1', '\u12A2', '\u12A3', '\u12A4', 
			'\u12A5', '\u12A6', '\u12A7', '\u12A8', '\u12A9', '\u12AA', 
			'\u12AB', '\u12AC', '\u12AD', '\u12AE', '\u12B3', '\u12C8', 
			'\u12C9', '\u12CA', '\u12CB', '\u12CC', '\u12CD', '\u12CE', 
			'\u12D0', '\u12D1', '\u12D2', '\u12D3', '\u12D4', '\u12D5', 
			'\u12D6', '\u12D8', '\u12D9', '\u12DA', '\u12DB', '\u12DC', 
			'\u12DD', '\u12DE', '\u12DF', '\u12E8', '\u12E9', '\u12EA', 
			'\u12EB', '\u12EC', '\u12ED', '\u12EE', '\u12F0', '\u12F1', 
			'\u12F2', '\u12F3', '\u12F4', '\u12F5', '\u12F6', '\u12F7', 
			'\u1308', '\u1309', '\u130A', '\u130B', '\u130C', '\u130D', 
			'\u130E', '\u1313', '\u1320', '\u1321', '\u1322', '\u1323', 
			'\u1324', '\u1325', '\u1326', '\u1327', '\u1330', '\u1331', 
			'\u1332', '\u1333', '\u1334', '\u1335', '\u1336', '\u1337', 
			'\u1338', '\u1339', '\u133A', '\u133B', '\u133C', '\u133D', 
			'\u133E', '\u133F', '\u1340', '\u1341', '\u1342', '\u1343', 
			'\u1344', '\u1345', '\u1346', '\u1348', '\u1349', '\u134A', 
			'\u134B', '\u134C', '\u134D', '\u134E', '\u134F', '\u135A', 
			'\u1350', '\u1351', '\u1352', '\u1353', '\u1354', '\u1355', 
			'\u1356', '\u1357', '\u1358', '\u1359', '\u135A', '\u135D', 
			'\u135E', '\u135F', '\u1360', '\u1361', '\u1362', '\u1363', 
			'\u1364', '\u1365', '\u1366', '\u1367', '\u1368', '\u1369', 
			'\u136A', '\u136B', '\u136C', '\u136D', '\u136E', '\u136F', 
			'\u1370', '\u1371', '\u1372', '\u1373', '\u1374', '\u1375', 
			'\u1376', '\u1377', '\u1378', '\u1379', '\u137A', '\u137B', 
			'\u137C'
	);

	/**
	 * Конструктор для {@code EthiopicAlphabet}.
	 */
	public EthiopicAlphabet()
	{
		super(EthiopicAlphabet.LETTERS);
	}
}
