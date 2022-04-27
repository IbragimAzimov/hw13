package com.company;

public class Distance {
    public static void  main (String[] args){

        String [] A = new String[] {"right", "left", "right", "shag", "right", "right", "right", "top", "step", "top", "down", "meter", "top", "top"};
        int Length = A.length;
        int X = 0;
        int Y = 0;
        double distance;

        for (int i = 0; i < Length; i++){
            if (A[i] == "right" || A[i] == "Right"){
                X +=1;
            }
            else if (A[i] == "left" || A[i] == "Left"){
                X -=1;
            }

        }
//        System.out.println("X= " + X);

        for (int j = 0; j < Length; j++){
            if (A[j] == "top" || A[j] == "Top"){
                Y +=1;
            }
            else if (A[j] == "down" || A[j] == "Down"){
                Y -=1;
            }

        }
//        System.out.println("Y= " + Y);

        distance = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
        System.out.println("Расстояние от точки начало " + distance + " метров");
    }

}
