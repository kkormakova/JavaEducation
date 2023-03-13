package org.example;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */

public class hw1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число с которого начнется список: ");
        int n = scanner.nextInt();
        System.out.println("Введите длину списка: ");
        int l = scanner.nextInt();
        scanner.close();
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = n; i < n+l; i++) {
            ls.add(i);
        }
        System.out.println("Наш список: "+ls);
        for (int i = 0; i < ls.size()-1; i++) {
            int temp = ls.pollLast();
            ls.add(i, temp);
        }
        System.out.println("Перевернутый список: "+ls);
    }
}
