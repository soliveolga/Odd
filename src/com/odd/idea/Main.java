package com.odd.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int count = input.nextInt();

        int summa = 0;
        int i;
        for(i = 1; i <= count; i += 2) {
            summa += i;
        }
        System.out.println(summa);
    }
}

