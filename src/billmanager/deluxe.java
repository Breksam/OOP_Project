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
public class deluxe extends normal  {
        public deluxe(int price, String typeOfmeat, String typeOfbread) {
        super(price, typeOfmeat, typeOfbread);
        }
    public deluxe(int price) {
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
        System.out.println(" deluxe meal ,bief burger in white roll bread ,chips and drink");   
        System.out.println("total price is 60 L.E");
    }

}
        
    

    

