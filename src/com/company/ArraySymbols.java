package com.company;

// 3.Есть массив из символов {'р','а','б','о','т','а','н','е','в','о','л','к'}.
// Нужно сохранить в новый массив только те символы, которые не повторяются.

public class ArraySymbols {
    public static void main (String[] args){
    char [] arr = new char[]{'р','а','б','о','т','а','н','е','в','о','л','к','г','л','к','к','к','к'};
    int count = 0;
    int arrLength = arr.length;

    for (int i = 1; i < arrLength; i++){
        boolean Check = true;
        for (int j = i-1; j >= 0; j--){
            if (arr[i] == arr[j]){
                count++;
                Check = false;
                break;
            }
        }
        if (Check == true) {
//        System.out.print(arr[i] + ", ");
        }
    }
    System.out.println();
    System.out.println("размер массива - " + arr.length);
    System.out.println("количество повторяющихся символов - " + count);

        System.out.println();
        System.out.println("Новый массив:");
    char [] Newarray = new char[arrLength - count];
    Newarray [0] = arr [0];
            int ind = 0;
        System.out.print(Newarray[0]);
        for (int i = 1; i < arrLength; i++){
            boolean Check = true;
            for (int j = i-1; j >= 0; j--){
                if (arr[i] == arr[j]){

                    Check = false;
                    break;
                }
            }
            if (Check == true) {
                ind++;
                Newarray[ind] = arr[i];
                System.out.print("," + Newarray[ind]);
            }
        }

    }

}
