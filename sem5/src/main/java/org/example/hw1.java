package org.example;

/**
 * Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 */

import java.util.HashMap;
import java.util.Map;

public class hw1 {
    public static void main(String[] args) {
        Map<String, Integer> mapStr = new HashMap<>();
        String str = "  Россия  где-то идет вперед всей планеты. Планета — это не Россия";
        String[] words = str.trim().split("\\s+");
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (Character.isLetter(word.charAt(i)) || word.charAt(i)=='-') {
                    sb.append(word.charAt(i));
                }
            }
            String s = sb.toString().toLowerCase();
            if (!s.isEmpty()) {
                mapStr.putIfAbsent(s, 0);
                mapStr.put(s, mapStr.get(s) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mapStr.entrySet()) {
            System.out.println("'" + entry.getKey() + "' встретилось: " + entry.getValue() + " раз(а)");
        }
    }
}
