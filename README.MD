# Alphabet

Алфавиты языков мира.

### Список поддерживаемых алфавитов

* Русский
* Белорусский
* Кириллица
* Английский
* Греческий

## Использование

### Буквы алфавита

#### Получение букв алфавита

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.getLetters();
/*
Результат выполнения:
[
    А, а, Б, б, В, в, Г, г, Д, д, Е, е, 
    Ё, ё, Ж, ж, З, з, И, и, Й, й, К, к, 
    Л, л, М, м, Н, н, О, о, П, п, Р, р, 
    С, с, Т, т, У, у, Ф, ф, Х, х, Ц, ц, 
    Ч, ч, Ш, ш, Щ, щ, Ъ, ъ, Ы, ы, Ь, ь, 
    Э, э, Ю, ю, Я, я
]
*/
```

Аналог в виде константы:

```java
RussianAlphabet.LETTERS;
```

#### Получение букв алфавита в обратном порядке

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.getReverse();
/*
Результат выполнения:
[
    я, Я, ю, Ю, э, Э, ь, Ь, ы, Ы, ъ, Ъ,
    щ, Щ, ш, Ш, ч, Ч, ц, Ц, х, Х, ф, Ф, 
    у, У, т, Т, с, С, р, Р, п, П, о, О, 
    н, Н, м, М, л, Л, к, К, й, Й, и, И, 
    з, З, ж, Ж, ё, Ё, е, Е, д, Д, г, Г, 
    в, В, б, Б, а, А
]
*/
```

#### Получение букв алфавита в перемешанном порядке

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.getShuffle();
/*
Результат выполнения:
[
    Ж, Ё, С, Ш, ф, У, э, о, ю, Я, Т, и, 
    я, Ц, г, з, Н, И, Е, Ч, Э, е, м, Д, 
    О, т, у, й, З, Г, Ю, д, п, Ъ, б, ш, 
    с, Ф, р, ч, Б, х, л, Ы, к, Л, а, К, 
    Щ, в, Р, ё, В, ъ, ь, Х, П, ы, Й, ц, 
    М, н, ж, щ, А, Ь
]
*/
```

#### Получение среза букв алфавита

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.getLetters(1, 3);
/*
Результат выполнения:
[
    А, а, Б
]
*/
```

#### Проверка принадлежности буквы к алфавиту

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.contains('ё');
// Результат выполнения: true
```

#### Получение буквы по позиции в алфавите

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.getLetter(29);
// Результат выполнения: с
```

#### Получение позиции буквы в алфавите

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.getPosition('ё');
// Результат выполнения: 14
```

### Прописные буквы алфавита

#### Получение прописных букв алфавита

```java
Alphabetical alphabet = new RussianAlphabet.UpperCase();
alphabet.getLetters();
/*
Результат выполнения:
[
    А, Б, В, Г, Д, Е, Ё, Ж, З, И, Й,
    К, Л, М, Н, О, П, Р, С, Т, У, Ф,
    Х, Ц, Ч, Ш, Щ, Ъ, Ы, Ь, Э, Ю, Я
]
*/
```

Аналог в виде константы:

```java
RussianAlphabet.UpperCase.LETTERS;
```

#### Получение прописных букв алфавита в обратном порядке

```java
Alphabetical alphabet = new RussianAlphabet.UpperCase();
alphabet.getReverse();
/*
Результат выполнения:
[
    Я, Ю, Э, Ь, Ы, Ъ, Щ, Ш, Ч, Ц, Х, 
    Ф, У, Т, С, Р, П, О, Н, М, Л, К, 
    Й, И, З, Ж, Ё, Е, Д, Г, В, Б, А
]
*/
```

#### Получение среза прописных букв алфавита

```java
Alphabetical alphabet = new RussianAlphabet.UpperCase();
alphabet.getLetters(1, 3);
/*
Результат выполнения:
[
    А, Б, В
]
*/
```

#### Проверка принадлежности буквы к алфавиту прописных букв

```java
Alphabetical alphabet = new RussianAlphabet.UpeerCase();
alphabet.contains('Я');
// Результат выполнения: true
```

#### Получение прописной буквы по позиции в алфавите

```java
Alphabetical alphabet = new RussianAlphabet.UpperCase();
alphabet.getLetter(29);
// Результат выполнения: Ы
```

#### Получение позиции буквы в алфавите

```java
Alphabetical alphabet = new RussianAlphabet.UpperCase();
alphabet.getPosition('Ё');
// Результат выполнения: 7
```

### Строчные буквы алфавита

#### Получение строчных букв алфавита

```java
Alphabetical alphabet = new RussianAlphabet.LowerCase();
alphabet.getLetters();
/*
Результат выполнения:
[
    а, б, в, г, д, е, ё, ж, з, и, й,
    к, л, м, н, о, п, р, с, т, у, ф,
    х, ц, ч, ш, щ, ъ, ы, ь, э, ю, я
]
*/
```

Аналог в виде константы:

```java
RussianAlphabet.LowerCase.LETTERS;
```

#### Получение строчных букв алфавита в обратном порядке

```java
Alphabetical alphabet = new RussianAlphabet.LowerCase();
alphabet.getReverse();
/*
Результат выполнения:
[
    я, ю, э, ь, ы, ъ, щ, ш, ч, ц, х, 
    ф, у, т, с, р, п, о, н, м, л, к, 
    й, и, з, ж, ё, е, д, г, в, б, а
]
*/
```

#### Получение среза строчных букв алфавита

```java
Alphabetical alphabet = new RussianAlphabet.LowerCase();
alphabet.getLetters(1, 3);
/*
Результат выполнения:
[
     а, б, в
]
*/
```

#### Проверка принадлежности буквы к алфавиту строчных букв

```java
Alphabetical alphabet = new RussianAlphabet.LowerCase();
alphabet.contains('ъ');
// Результат выполнения: true
```

#### Получение строчной буквы по позиции в алфавите

```java
Alphabetical alphabet = new RussianAlphabet.LowerCase();
alphabet.getLetter(29);
// Результат выполнения: ы
```

#### Получение позиции буквы в алфавите

```java
Alphabetical alphabet = new RussianAlphabet.LowerCase();
alphabet.getPosition('ё');
// Результат выполнения: 7
```

#### Получение букв алфавита в виде массива

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.toArray();
/*
Результат выполнения:
[
    А, а, Б, б, В, в, Г, г, Д, д, Е, е, 
    Ё, ё, Ж, ж, З, з, И, и, Й, й, К, к, 
    Л, л, М, м, Н, н, О, о, П, п, Р, р, 
    С, с, Т, т, У, у, Ф, ф, Х, х, Ц, ц, 
    Ч, ч, Ш, ш, Щ, щ, Ъ, ъ, Ы, ы, Ь, ь, 
    Э, э, Ю, ю, Я, я
]
*/
```

#### Получение букв алфавита в виде строки с разделителем

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.toString(",");
// Результат выполнения: А,а,Б,б,В,в,Г,г,Д,д,Е,е,Ё,ё,Ж,ж,З,з,И,и,Й,й,К,к,Л,л,М,м,Н,н,О,о,П,п,Р,р,С,с,Т,т,У,у,Ф,ф,Х,х,Ц,ц,Ч,ч,Ш,ш,Щ,щ,Ъ,ъ,Ы,ы,Ь,ь,Э,э,Ю,ю,Я,я
```

#### Получение букв алфавита в виде строки

```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.toString();
// Результат выполнения: АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя
```

## Установка

Для установки этого проекта, введите в терминале:

```bash
git clone https://github.com/kalenchukov/Alphabet.git
```

## Версии

Доступные [версии](https://github.com/kalenchukov/Alphabet/releases).

## Авторы

[Алексей Каленчуков](https://github.com/kalenchukov)

## Лицензия

[MIT](https://opensource.org/licenses/MIT)
