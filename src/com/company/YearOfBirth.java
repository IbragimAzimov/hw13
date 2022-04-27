package com.company;

// 4.Нужно ввести год рождения, программа должна вывести сколько человеку лет и в високосный ли год он родился.

import java.awt.*;
import java.util.Scanner;

public class YearOfBirth {
    public static void main (String[] args){
        System.out.println("Введите год Вашего рождения:");
        Scanner scanner = new Scanner(System.in);
        int BirthYear = scanner.nextInt();
        int Age = 2022 - BirthYear;
        String Year;
        String TextYear;

        if (BirthYear % 4 == 0){
            if (BirthYear % 100 != 0){
                Year = "високосным";
            }
            else if (BirthYear % 400 ==0){
                Year = "високосным";
            }
            else {
                Year = "не високосным";
            }
        }
        else {
            Year = "не високосным";
        }

        if (Age == 1 ){
            TextYear = "год";
        }
        else if (Age >= 2 && Age <= 4){
            TextYear = "года";
        }
        else if (Age >= 5 && Age <= 20){
            TextYear = "лет";
        }
        else if (Age % 10 == 1){
            TextYear = "год";
        }
        else if (Age % 10 >= 2 && Age % 10 <= 4){
            TextYear = "года";
        }
        else {
            TextYear = "лет";
        }

        System.out.println("Вам " + Age + " " + TextYear + "." );
        System.out.println("Год Вашего рождения является "  + Year + ".");

    }
}
