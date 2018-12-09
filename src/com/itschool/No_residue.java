package com.itschool;

public class No_residue {
   private int number;

    public int getNumber() {
        return number;
    }

    No_residue(int number){
        if ((number % 2 == 0) && (number % 5 == 0) && (number % 3 == 0) && (number % 6 == 0) && (number % 9 == 0))
            System.out.println("Число " + "делится на 2,5,3,6,9 без остатка");
        else
            System.out.println("Число " + " не делится на 2,5,3,6,9 без остатка");

    }
}
