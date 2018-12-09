package com.itschool;

public class Change {

   public double bidValuta;
   public double offerValuta;
   public double sumMoney;


    public double getBidValuta() {
        return bidValuta;
    }

    public double getOfferValuta() {
        return offerValuta;
    }

    public double getSumMoney(){
        return sumMoney;
    }

    Change(double bidValuta, double offerValuta, double sumMoney){
        double moneyBid =  sumMoney / bidValuta;
        double moneyOffer = sumMoney / offerValuta;
        System.out.println("Покупка валюты (в долларах) : " + moneyBid);
        System.out.println("Продажа валюты (в долларах) : " + moneyOffer);

    }
}
