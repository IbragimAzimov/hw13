package com.company;

public class Practice1 {
    public static void main (String[] args){
       int a = 12345;
       while (a>9){
           a = sum (a);
       }
        System.out.println(a);
    }
    public static int sum (int a){
        int sum = 0;
        while (a>0){
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }
}
