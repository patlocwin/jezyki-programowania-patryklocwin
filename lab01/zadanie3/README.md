# Zadanie 6

## Treść zadania
Zaimplementuj klasę reprezentującą samochód z polami takimi jak marka, model i numer rejestracyjny. Nadpisz metody equals() i hashCode(), aby porównywały samochody na podstawie numeru rejestracyjnego. Stwórz HashSet i dodaj kilka samochodów o tym samym numerze rejestracyjnym oraz kilka różnych. Przeanalizuj wynik.

## Uruchomienie
Główna klasa programu to `lab01.zadanie3.Main`.

Za pomocą Gradle (z katalogu głównego):
```bash
./gradlew run-lab01-zadanie3
```

Bezpośrednio przez Java:
```bash
javac -d out lab01/zadanie3/*.java
java -cp out lab01.zadanie3.Main
```
