/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billmanager;

import java .util.Scanner;
/**
 *
 * @author MIDO
 */
public class normal {
    final int price;
    private String typeOfmeat;
    private String typeOfbread;
    final int  extraCheesePrice=15;
    final int extraTomatoPrice=10;
    final int drinkPrice=12;
    final int chipsPrice=13;

    public normal(int price) {
        this.price = price;
    }

    public normal(int price, String typeOfmeat, String typeOfbread) {
        this.price = price;
        this.typeOfmeat = typeOfmeat;
        this.typeOfbread = typeOfbread;
     
    }

    public void setTypeOfmeat(String typeOfmeat) {
        this.typeOfmeat = typeOfmeat;
    }

    public  void setTypeOfbread(String typeOfbread) {
        this.typeOfbread = typeOfbread;
    }
    

    public int getPrice() {
        return price;
    }

    public String getTypeOfmeat() {
        return typeOfmeat;
    }

    public String getTypeOfbread() {
        return typeOfbread;
    }

    public final int getExtraCheesePrice() {
        return extraCheesePrice;
    }

    public final int getExtraTomatoPrice() {
        return extraTomatoPrice;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public int getChipsPrice() {
        return chipsPrice;
    }
void bill()
{

   Scanner sc=new Scanner (System.in);
        System.out.println("what would you prefer, beef or chicken");
        String typeOfMeat =sc.nextLine();
        System.out.println("what would you prefer brown or white bread ");
        String typeOfBread=sc.nextLine();
        normal n1=new normal(50,typeOfMeat,typeOfBread);

        System.out.println("do you want any additions ,yes or nup");
        int additionPrice=0 ;
       
        String answer =sc.nextLine();
        String equalityTest="yes";
        if (answer.equals(equalityTest)) {
         System.out.println("do you want to add extra tomato ");
            String answer1 =sc.nextLine();
            if (answer1.equals(equalityTest)) {
               additionPrice=additionPrice+n1.getExtraTomatoPrice();
            }
            System.out.println("do you want to add extra cheese");
            String answer2=sc.next();
            if (answer2.equals(equalityTest)) {
                 additionPrice= additionPrice+n1.getExtraCheesePrice();
            }
            System.out.println("do you want to add drink");
             String answer3=sc.next();
            if (answer3.equals(equalityTest)) {
                 additionPrice= additionPrice+n1.getDrinkPrice();
            }
            System.out.println("do you want to add Chips");
             String answer4=sc.next();
             if (answer4.equals(equalityTest)) {
                 additionPrice= additionPrice+n1.getChipsPrice();
            }
                    }
    int totalPrice =additionPrice+n1.getPrice();
        System.out.println("total price is "+totalPrice);       
       }
            

}
    

