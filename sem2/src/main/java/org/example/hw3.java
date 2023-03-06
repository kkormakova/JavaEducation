package org.example;

import java.util.Scanner;

//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        int sumInd = 0;
        System.out.println("Элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (Math.abs(array[i])>9 && Math.abs(array[i])<100){
                sumInd += i;

            }
        }
        scanner.close();
        System.out.println("Итоговый массив: ");
        for (int i = 0; i < n; i++) {
            if (array[i]<0){
                array[i] = sumInd;
            }
            System.out.print(array[i]+ " ");
        }
    }
}
