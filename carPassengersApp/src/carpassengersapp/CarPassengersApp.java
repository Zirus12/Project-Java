 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpassengersapp;

/**
 *
 * @author Alexandros
 */
public class CarPassengersApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarPassenger p1=new CarPassenger("Alex", "Example", 65.2, 21);
        p1.showDetails();
        
    }
    
}
