package com.company;

import java.util.Scanner;

// Банкомат выдаёт купюры по 200, 500, 1000, 2000 и 5000 сом.
// Клиент вносит сумму которую хочет снять. Нужно выдать варианты снятия этой суммы:
// Одну комбинацию купюр вывести только один раз (не допускать повторов одних и тех же комбинаций).
// Если не найдено ни одной комбинации для снятия купюр вывести “Сумма недоступна для снятия”.
// Имеется лимит(ограничение) на снятие 60 тыс сом.

public class Banknotes {
    public static void main (String[] args){
        System.out.println("              ВВЕДИТЕ СУММУ ДЛЯ СНЯТИЯ");
        System.out.println("(ВНИМАНИЕ: Максимальная сумма для снятия не должна превышать 60 тысяч сом. \n              Снимаемая сумма должна быть кратным на 100)");

        Scanner scanner = new Scanner(System.in);
        int Cash = scanner.nextInt();

        int Count = 0;

        if (Cash > 60000){
            System.out.println("Снимаемая сумма превышает максимальный лимит 60 тысяч сом!");
        }
        else if (Cash % 100 > 0){
            System.out.println("Сумма недоступна для снятия. \n(Снимаемая сумма должна быть кратным на 100!)");
        }
        else if (Cash == 300){
            System.out.println("Сумма недоступна для снятия. \n(Введите 200 или 400)");
        }
        else {

            for (int B5000 = 0; B5000 <= Cash / 5000; B5000++){
                for (int B2000 = 0; B2000 <= Cash / 2000; B2000++){
                    for (int B1000 = 0; B1000 <= Cash / 1000; B1000++){
                        for (int B500 = 0; B500 <= Cash / 500; B500++){
                            for (int B200 = 0; B200 <= Cash / 200; B200++){
                                if (B5000 * 5000 + B2000 * 2000 + B1000 * 1000 + B500 * 500 + B200 * 200 == Cash){
                                    Count++;
                                    System.out.print(Count + ") ");
                                    if (B5000 > 0){
                                        System.out.print("5000 (" + B5000 + " шт),");
                                    }
                                    if (B2000 > 0){
                                        System.out.print("2000 (" + B2000 + " шт),");
                                    }
                                    if (B1000 > 0){
                                        System.out.print("1000 (" + B1000 + " шт),");
                                    }
                                    if (B500 > 0){
                                        System.out.print("500 (" + B500 + " шт),");
                                    }
                                    if (B200 > 0){
                                        System.out.print("200 (" + B200 + " шт)");
                                    }
                                    System.out.println();
                                }

                            }
                        }
                    }
                }
            }



        }


    }
}
