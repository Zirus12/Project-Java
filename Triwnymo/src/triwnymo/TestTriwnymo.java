/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triwnymo;

/**
 *
 * @author Alexandros
 */
public class TestTriwnymo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triwnymo x=new Triwnymo(2, 6, 1);
        Triwnymo y=new Triwnymo(2, 9, 2);
        System.out.println("Diakrinousa: " +x.diakrinousa()+ ", X1: "+x.x1()+ ", X2: "+x.x2());
        System.out.println("Diakrinousa: " +y.diakrinousa()+ ", X1: "+y.x1()+ ", X2: "+y.x2());
    }
    
}
