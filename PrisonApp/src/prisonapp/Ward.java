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
public class Ward extends Building {
    String Name;
    private int MaxCell;
    private int Cells;
    private Cell x;
    
    public Ward(String Wardname, int MaxCells, int NumCells, String Name, int MaxCell, int Cells) {
        super(Wardname, MaxCells, NumCells);
        this.Name = Name;
        this.MaxCell = MaxCell;
        this.Cells = Cells;
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getMaxCell() {
        return MaxCell;
    }

    public void setMaxCell(int MaxCell) {
        this.MaxCell = MaxCell;
    }

    public int getCells() {
        return Cells;
    }

    public void setCells(int Cells) {
        this.Cells = Cells;
    }
    
    
}
