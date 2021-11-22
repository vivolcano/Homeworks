package homeworks.homework17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static final String STR = "Тридцать три корабля лавировали, лавировали, лавировали, да не вылавировали";

    public static void main(String[] args) {

        Map<String, Integer> mapWords = new HashMap<>();
        String[] words = STR.split(" ");

        for (String word : words) {
            if (mapWords.containsKey(word)) {
                mapWords.put(word, mapWords.get(word) + 1);
            } else
                mapWords.put(word, 1);
        }

        Set<Map.Entry<String, Integer>> entries = mapWords.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("'" + entry.getKey() + "' = " + entry.getValue() + " раз(а)");
        }
    }
}
