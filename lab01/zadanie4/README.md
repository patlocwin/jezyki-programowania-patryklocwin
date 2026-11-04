# Zadanie 5

## Treść zadania
Stwórz klasę reprezentującą zamówienie z polami, takimi jak numer zamówienia, data i kwota. Zaimplementuj interfejs Comparable, aby zamówienia były porównywane na podstawie daty. Stwórz listę zamówień i posortuj ją za pomocą Collections.sort(). Następnie wyświetl posortowaną listę.
Zmodyfikuj zadanie, aby tym razem użyć własnego komparatora do sortowania zamówień według kwoty. Wyświetl wynik i porównaj go z poprzednim.
## Uruchomienie
Główna klasa programu to `lab01.zadanie4.Main`.

Za pomocą Gradle (z katalogu głównego):
```bash
./gradlew run-lab01-zadanie4
```

Bezpośrednio przez Java:
```bash
javac -d out lab01/zadanie4/*.java
java -cp out lab01.zadanie4.Main
```
