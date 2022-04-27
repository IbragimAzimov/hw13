package com.company;

public class Practice {
    public static void main(String[] args) {
        int a = 10222222;
        while (a > 9) {
            a = sum(a);
        }
        System.out.println(a);
    }
    private static int sum(int a) {
        int sum = 0;
        while (a > 0) {
            sum = sum + (a % 10);
            a = a / 10;
        }
        return sum;
    }

}
