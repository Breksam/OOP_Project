/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billmanager;
import java.util.ArrayList;
import java .util.Scanner ;

/**
 *
 * @author MIDO
 */
public class BillManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cod.e application logic her
        normal n1=new normal(50);
        healthy h1=new healthy(50);
        deluxe d1=new deluxe (50);
        Scanner sc=new Scanner (System.in);
        System.out.println("enter name of your sandwich");
        String SandWichName =sc.next();
        String normal="normal";
        String deluxe="deluxe";
        String healthy="healthy";
        if(SandWichName.equals(normal))
        {
        n1.bill();
        }else if (SandWichName.equals(healthy))
        {
            h1.bill();
        }
        else if (SandWichName.equals(deluxe))
        {
            d1.bill();
        }else{
        
            System.out.println("enter the nme correctly");
        }
    }
}

