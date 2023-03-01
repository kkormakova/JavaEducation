package org.example;

import java.util.Scanner;

//Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//        Пример: 1 2 1 2 -1 1 3 1 3 -1 0
//        2 -1 переход - 2 в сумму
//        3 -1 переход 3 в сумму
//        суммарно выведет 5
public class hw2 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел в нашей последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Введите числа нашей последовательности по одному: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n-1 ; i++) {
            int num2 = 0;
            if (i != n-2){
                num2 = scanner.nextInt();
            } else {
                System.out.println(num2);
            }
            if (num>0 && num2<0){
                sum += num;
            }
            num = num2;
        }
        System.out.println("Сумма положительных чисел, после которых следует отрицательное число = " + sum);
    }
}
