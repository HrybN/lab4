package com.company;

public class Main {

    public static void main(String[] args) {
        int n, f;
        f = 1;
        n = 10;
        int i;
        // #1
        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(n + "! = " + f);
        // #2
        while (i <= n) {
            i = 1;
            i++;
            f = f * i;
        }
        System.out.println(n + "! = " + f);

    }
}


