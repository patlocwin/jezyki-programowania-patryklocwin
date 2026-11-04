# Zadanie 9 z listy

## Treść zadania
Stwórz klasę reprezentującą zwierzę z polami, takimi jak gatunek, wiek i waga. Napisz komparator, który sortuje zwierzęta najpierw według gatunku, a następnie według wieku. Stwórz listę zwierząt i posortuj ją za pomocą tego komparatora. Wyświetl posortowaną listę.
Rozwiń zadanie, aby tym razem użyć niestandardowego komparatora, który sortuje zwierzęta na podstawie wagi od najlżejszego do najcięższego. Wyświetl wynik i porównaj go z poprzednim.

## Uruchomienie
Główna klasa programu to `lab01.zadanie2.Main`.

Za pomocą Gradle (z katalogu głównego):
```bash
./gradlew run-lab01-zadanie2
```

Bezpośrednio przez Java:
```bash
javac -d out lab01/zadanie2/*.java
java -cp out lab01.zadanie2.Main
```
