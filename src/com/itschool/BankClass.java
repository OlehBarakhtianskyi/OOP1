package com.itschool;

import java.util.Scanner;

public class BankClass {
    private double mustPay;
    private double pay = 0;
    private double sumPay = 0;

    public double getSumPay() {
        return sumPay;
    }

    public double getMustPay() {
        return mustPay;
    }

    public double getPay() {
        return pay;
    }
    Scanner scan = new Scanner(System.in);

    BankClass(double mustPay){
        for (int i = 0; i < 7; i++)
        {
                System.out.println("Прошёл месяц, внесите платёж за кредит!");
                System.out.print("Внести (грн) ->");
                pay = scan.nextDouble();
                sumPay = sumPay + pay;
        }
                if (sumPay < mustPay)
                    System.out.println("Вы не погасили задолженость! Заплатите ->" + (mustPay - sumPay));
            else if (sumPay > mustPay)
                System.out.println("Сумма переплаты составляет: " + (sumPay - mustPay));
            else if (sumPay == mustPay)
                System.out.println("Задолжность погашена");
    }


}


