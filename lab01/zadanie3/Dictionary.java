package lab01.zadanie3;

import java.util.Collections;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> entries;

    public Dictionary(Map<String, String> entries) {
        this.entries = entries;
    }

    public void addWord(String word, String definition) {
        entries.put(word, definition);
    }

    public String getDefinition(String word) {
        return entries.get(word);
    }

    public int size() {
        return entries.size();
    }

    public Map<String, String> getEntries() {
        return Collections.unmodifiableMap(entries);
    }
}
