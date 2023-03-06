package org.example;

import java.util.Scanner;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Числа: ");
        int num1 = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < n-1; i++) {
            int num2 = scanner.nextInt();
            if (num1>num2){
                check = false;
            }
            num1 = num2;
        }
        scanner.close();
        System.out.println("Последовательность явдяется возрастающей - "+check);
    }
}
