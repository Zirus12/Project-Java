/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceapp;

/**
 *
 * @author Alexandros
 */
public interface Invoice {
    public double cost();
    public void addAmount(int value);
    public void resetAmount();
    public void showdetails();
}
