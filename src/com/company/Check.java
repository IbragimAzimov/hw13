package com.company;


public class Check {
    public static void main (String[] args){
        char [] arr = new char[]{'р','а','б','о','т','а','н','е','в','о','л','к'};
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
                if (Check == true){
                    System.out.print(arr[i] + ", ");

                }
            }
        System.out.println(arr.length);
        System.out.println(count);




    }
}
