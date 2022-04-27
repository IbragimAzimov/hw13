package com.company;

import java.util.Objects;
import java.util.Scanner;

public class AgeGame {
    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] RangeQuestions = new String[8];
        RangeQuestions[0] = "Ваш возраст до 9 лет включительно? Ответьте \"Да\" или \" Нет\" ";
        RangeQuestions[1] = "Ваш возраст от 10 до 18 включительно? Ответьте \"Да\" или \" Нет\" ";
        RangeQuestions[2] = "Ваш возраст от 19 до 27 включительно? Ответьте \"Да\" или \" Нет\" ";
        RangeQuestions[3] = "Ваш возраст от 28 до 36 включительно? Ответьте \"Да\" или \" Нет\" ";
        RangeQuestions[4] = "Ваш возраст от 37 до 45 включительно? Ответьте \"Да\" или \" Нет\" ";
        RangeQuestions[5] = "Ваш возраст от 46 до 54 включительно? Ответьте \"Да\" или \" Нет\" ";
        RangeQuestions[6] = "Ваш возраст от 55 до 63 включительно? Ответьте \"Да\" или \" Нет\" ";
        RangeQuestions[7] = "Ваш возраст от 64 до 72 включительно? Ответьте \"Да\" или \" Нет\" ";

        int interval;
        String Answer;

        System.out.println("Здравствуйте, это игра на угадывание возраста.");
        System.out.println("Пожалуйста, отвечайте на нижеследующие вопросы.");
        for (int i = 0; i < 7; i++ ){
            System.out.println(RangeQuestions[i]);
            Answer = scanner.nextLine();
            if (Objects.equals(Answer, "Да") || Objects.equals(Answer, "да") ){
                interval = i;
                System.out.println("1) Вам нужно будет загадать число, " +
                        "запишите где нибудь (все след. операции тоже можете записать), \n" +
                        "2) а затем умножьте на 9. \n" +
                        "3) Теперь добавьте ваш возраст. \n" +
                        "4) Далее вам нужно будет сложить все числа что у вас получилось после добавления вашего возраста \n" +
                        "до тех пор пока не получится однозначное число (от 1 до 9)\n" +
                        "Например: 12345 -> 1+2+3+4+5 = 15 -> 1+5 = 6");
                System.out.println("Прошу ввести это число: ");
                int sumNumber = scanner.nextInt();
                System.out.println("Вам: " + (9 * interval + sumNumber));

                break;
            }
            else if (Objects.equals(Answer, "Нет") || Objects.equals(Answer, "нет") ){
                continue;
            }
            else{
                System.out.println("Вы ответили не правильно. Игра будет остановлена");
                break;
            }
        }

    }

}
