package com.itschool;
public class Positive_Negative {
    private int number;

    public int getNumber() {
        return number;
    }

    Positive_Negative(int number){
        if (number > 0)
            System.out.println("Вы ввели положительное число");
                    else if (number < 0)
            System.out.println("Вы ввели отрицательное число");
    }

}
