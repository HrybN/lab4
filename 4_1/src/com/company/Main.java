package com.company;

public class Main {

    public static void main(String[] args) {

        // Перший спосіб
        for (int i = 500; i <= 650; i += 10) {
            System.out.println(i);
        }

        // Другий спосіб
        int x = 500;
        while(x <= 650) {
            System.out.println(x);
            x += 10;
        }

        // Третій спосіб
        int a = 500;
        do {
            System.out.println(a);
            a += 10;
        } while(a <= 650);
    }
}
