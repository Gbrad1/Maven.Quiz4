package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    Map<String, Integer> mapOfStrings;

    public WordCounter(String... strings) {
         mapOfStrings = new HashMap<>();
         for (String element : strings) {
             if (mapOfStrings.containsKey(element)) {
                 mapOfStrings.put(element, mapOfStrings.get(element) + 1);
             } else
             mapOfStrings.put(element, 1);
         }
    }

    public Map<String, Integer> getWordCountMap() {
        return mapOfStrings;
    }
}
