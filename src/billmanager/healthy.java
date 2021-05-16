/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billmanager;

import java.util.Scanner;

/**
 *
 * @author MIDO
 */
public class healthy extends normal {

    public healthy(int price, String typeOfmeat, String typeOfbread) {
        super(price, typeOfmeat, typeOfbread);
    }

    public healthy(int price) {
        super(price);
    }

    @Override
    public void setTypeOfbread(String typeOfbread) {
        super.setTypeOfbread(typeOfbread); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTypeOfmeat(String typeOfmeat) {
        super.setTypeOfmeat(typeOfmeat); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public int getChipsPrice() {
        return super.getChipsPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDrinkPrice() {
        return super.getDrinkPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTypeOfbread() {
        return super.getTypeOfbread(); //To change body of generated methods, choose Tools | Templates.
    }
  @Override
    public String getTypeOfmeat() {
        return super.getTypeOfmeat(); //To change body of generated methods, choose Tools | Templates.
    }
 @Override
    public int getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }
 @Override
    void bill() {
       healthy h1=new healthy(50);
           Scanner sc=new Scanner (System.in);
            System.out.println("what would you prefer, beef or chicken");
            String typeOfMeat =sc.nextLine();
                 System.out.println("do you want any additions ,yes or nup");
            int additionPrice=0 ;
            String answer =sc.nextLine();
            String equalityTest="yes";
            if (answer.equals(equalityTest))
            {
                System.out.println("do you want to add drink");
             String answer3=sc.next();
            if (answer3.equals(equalityTest)) {
                 additionPrice= additionPrice+h1.getDrinkPrice();
            }
                 System.out.println("do you want to add Chips");
             String answer4=sc.next();
             if (answer4.equals(equalityTest)) {
                 additionPrice= additionPrice+h1.getChipsPrice();
            }
                    }
             int totalPrice =additionPrice+h1.getPrice();
                 System.out.println("total price is "+totalPrice);       
       }
         
    }

  

   

    

