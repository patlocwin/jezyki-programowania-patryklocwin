package lab01.zadanie3;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Dictionary hashMapDictionary = new Dictionary(new HashMap<>());
        Dictionary treeMapDictionary = new Dictionary(new TreeMap<>());

        addSampleWords(hashMapDictionary);
        addSampleWords(treeMapDictionary);

        DictionaryPrinter printer = new DictionaryPrinter();
        printer.print("HashMap (kolejność jest zależna od hashCode):", hashMapDictionary);
        printer.print("TreeMap (kolejność jest alfabetyczna):", treeMapDictionary);

        System.out.println("Liczba słów w słowniku: " + treeMapDictionary.size());
        System.out.println("Definicja słowa 'kawa': " + treeMapDictionary.getDefinition("kawa"));
    }

    private static void addSampleWords(Dictionary dictionary) {
        dictionary.addWord("laptop", "podręczny przenośny komputer");
        dictionary.addWord("kawa", "napój z ziaren kawowca");
        dictionary.addWord("rower", "pojazd na dwóch kołach napędzany siłą nóg");
        dictionary.addWord("zima", "pora roku po jesieni");
        dictionary.addWord("plecak", "torba którą można założyć na plecy");
        dictionary.addWord("telefon", "urządzenie do dzwonienia i pisania");
        dictionary.addWord("egzamin", "sprawdzian wiedzy");
    }
}
