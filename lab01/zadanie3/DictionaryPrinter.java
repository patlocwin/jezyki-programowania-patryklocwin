package lab01.zadanie3;

import java.util.Map;

public class DictionaryPrinter {
    public void print(String title, Dictionary dictionary) {
        System.out.println(title);
        for (Map.Entry<String, String> entry : dictionary.getEntries().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
    }
}
