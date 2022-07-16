# Alphabet
Алфавиты языков мира.

### Список поддерживаемых алфавитов
* Русский
* Английский

### Получение букв алфавита
```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.getLetters();
/*
Результат выполнения:
[
    А, Б, В, Г, Д, Е, Ё, Ж, З, И, Й,
    К, Л, М, Н, О, П, Р, С, Т, У, Ф,
    Х, Ц, Ч, Ш, Щ, Ъ, Ы, Ь, Э, Ю, Я,
    а, б, в, г, д, е, ё, ж, з, и, й,
    к, л, м, н, о, п, р, с, т, у, ф,
    х, ц, ч, ш, щ, ъ, ы, ь, э, ю, я
]
*/
```

### Получение среза букв алфавита
```java
Alphabetical alphabet = new RussianAlphabet();
alphabet.getLetters(1, 3);
/*
Результат выполнения:
[
    А, Б, В
]
*/
```

Аналог в виде константы:
```java
RussianAlphabet.LETTERS;
```

### Получение прописных букв алфавита
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getLettersUpperCase();
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
RussianAlphabet.LETTERS_UPPER_CASE;
```

### Получение строчных букв алфавита
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getLettersLowerCase();
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
RussianAlphabet.LETTERS_LOWER_CASE;
```

### Проверка принадлежности буквы к алфавиту
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.isLetter('ё');
// Результат выполнения: true
```

### Проверка принадлежности буквы к алфавиту прописных букв
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.isLetterUpeerCase('Я');
// Результат выполнения: true
```

### Проверка принадлежности буквы к алфавиту строчных букв
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.isLetterLowerCase('ъ');
// Результат выполнения: true
```

### Получение позиции буквы в алфавите
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getPositionLetter('ё');
// Результат выполнения: 7
```

### Получение буквы по позиции в алфавите
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getLetterUpperCase(29);
// Результат выполнения: Ы
```