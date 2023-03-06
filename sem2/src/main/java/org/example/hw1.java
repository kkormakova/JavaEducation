package org.example;

import java.util.Scanner;

//Дана последовательность N целых чисел. Найти сумму простых чисел.
public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество целых чисел в последовательности: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Числа: ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (checkNumber(num)){
                sum += num;
            }
        }
        scanner.close();
        System.out.println("Сумма простых чисел ="+sum);
    }
     public static boolean checkNumber(int n){
        if (n==1){
            return false;
        }
        if (n==2){
            return true;
        }
        if (n%2==0){
            return false;
        }
         for (int i = 3; i*i <= n; i+=2) {
             if (n%i==0){
                 return false;
             }
         }
         return true;
     }
}
