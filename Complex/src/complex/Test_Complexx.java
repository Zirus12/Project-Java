/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author Alexandros
 */
public class Test_Complexx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complex y=new Complex(5, 8);
        Complex z=new Complex(15,6);
        System.out.println(y.add(z));
        System.out.println(y.subtract(z));
        System.out.println(y.multiply(z));
        System.out.println(y.divide(z));
    }
    
}
