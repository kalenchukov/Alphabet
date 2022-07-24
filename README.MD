# Alphabet
Алфавиты языков мира.

### Список поддерживаемых алфавитов
* Русский
* Белорусский
* Кириллица
* Английский
* Греческий

### Получение букв алфавита
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

### Получение среза букв алфавита
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

### Получение среза прописных букв алфавита
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getLettersUpperCase(1, 3);
/*
Результат выполнения:
[
    А, Б, В
]
*/
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

### Получение среза строчных букв алфавита
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getLettersLowerCase(1, 3);
/*
Результат выполнения:
[
     а, б, в
]
*/
```

### Проверка принадлежности буквы к алфавиту
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.hasLetter('ё');
// Результат выполнения: true
```

### Проверка принадлежности буквы к алфавиту прописных букв
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.hasLetterUpeerCase('Я');
// Результат выполнения: true
```

### Проверка принадлежности буквы к алфавиту строчных букв
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.hasLetterLowerCase('ъ');
// Результат выполнения: true
```

### Получение позиции буквы в алфавите
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getPositionLetter('ё');
// Результат выполнения: 7
```

### Получение прописной буквы по позиции в алфавите
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getLetterUpperCase(29);
// Результат выполнения: Ы
```

### Получение строчной буквы по позиции в алфавите
```java
AlphabeticalCase alphabet = new RussianAlphabet();
alphabet.getLetterLowerCase(29);
// Результат выполнения: ы
```