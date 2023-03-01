package org.example;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String ourStr = scanner.nextLine();
        System.out.println(WordsReverse(ourStr));
    }
    public static String WordsReverse(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            str.append(words[i]);
            if(i > 0){
                str.append(" ");
            }
        }
        return str.toString();
    }
}
