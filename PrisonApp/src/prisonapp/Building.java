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
public class Building{
    private final int created=2018;
    private final String name="Φυλακές Καβάλας";
    private final String street="Άγιος Λουκάς";
    String Wardname;
    int MaxCells;
    int NumCells;

    public Building(String Wardname, int MaxCells, int NumCells) {
        this.Wardname = Wardname;
        this.MaxCells = MaxCells;
        this.NumCells = NumCells;
    }
    
    
}
