package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)
 */

public class hw2 {
    public static void main(String[] args) {
        String str = "  Россия  где-то идет вперед всей планеты. Планета — это не Россия";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое слово: ");
        String desired = scanner.next();
        scanner.close();
        Map <String, Integer> mapStr = new HashMap<>();
        mapStr.put(desired, 0);
        String[] words = str.trim().split("\\s+");
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (Character.isLetter(word.charAt(i)) || word.charAt(i)=='-') {
                    sb.append(word.charAt(i));
                }
            }
            String s = sb.toString();
            if (s.equalsIgnoreCase(desired)) {
                mapStr.put(desired, mapStr.get(desired) + 1);
            }
        }
        System.out.println("'" + desired + "' встретилось: " + mapStr.get(desired) + " раз(а)");
    }
}
