/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp;

/**
 *
 * @author Alexandros
 */
public class Cell extends Ward {
    private String wing;
    private int number;
    private double size;

    public Cell(String Wardname, int MaxCells, int NumCells, String Name, int MaxCell, int Cells, String wing, int number, double size) {
        super(Wardname, MaxCells, NumCells, Name, MaxCell, Cells);
        if(wing.equals(Name))
            this.wing = wing;
        else{
            System.out.println("The ward doesn't exist");
            throw new RuntimeException();
        }    
        if(number<=MaxCells)
            this.number = number;
        else{
            System.out.println("The number of Cells exceed the maximum number");
            throw new RuntimeException();
        }    
        this.size = size;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cell{" + "wing=" + wing + ", number=" + number + ", size=" + size + '}';
    }
    
    public void displayFullDetails(){
        System.out.println(super.toString()+" "+this);
    }
}
