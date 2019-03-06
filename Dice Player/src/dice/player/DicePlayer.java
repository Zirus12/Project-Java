/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.player;

/**
 *
 * @author Alexandros
 */
public class DicePlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Two605DicePlayer x=new Two605DicePlayer("Alex", "Kesidis");
        System.out.println(x.play());
    }
    
}
