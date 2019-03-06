/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.player;

import java.util.Random;
/**
 *
 * @author Alexandros
 */
public class FairDicePlayer implements Player {
    private String Name;
    private String Surname;
    private Random rand=new Random();
    private int x=rand.nextInt(6)+1; 
    
    public FairDicePlayer(String n, String s){
        Name=n;
        Surname=s;
    }

    @Override
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    @Override
    public int play(){
        this.x=rand.nextInt(6)+1;
        return x;
    }
    
    
}
