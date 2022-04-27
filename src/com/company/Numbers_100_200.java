package com.company;

// Перебрать числа от 100 до 200.
// Просуммировать числа кратные 3 (числа которые делятся на 3 без остатка) и отнять от этой суммы сумму чисел кратных 4.
// Вывести сумму кратных 3, сумму кратных 4, и разницу сумм.

public class Numbers_100_200 {
    public static void main (String[] args){
        int Sum_3 = 0;
        int Sum_4 = 0;

        for (int numbers = 100; numbers <= 200; numbers++){
            if (numbers % 3 == 0){
                Sum_3 = Sum_3 + numbers;
            }
        }
        System.out.println("Сумма чисел кратных на 3: " + Sum_3);

        for (int numbers = 100; numbers <= 200; numbers++){
            if (numbers % 4 == 0){
                Sum_4 = Sum_4 + numbers;
            }
        }
        System.out.println("Сумма чисел кратных на 4: " + Sum_4);
        System.out.println("Разница: " + (Sum_3 - Sum_4));
    }
}
