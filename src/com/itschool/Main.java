package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Change conversion1 = new Change(27.700, 28.020,100);


        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        Positive_Negative numbers = new Positive_Negative(number);


        No_residue num = new No_residue(number);

        
        BankClass kredit = new BankClass(700);

    }
}
