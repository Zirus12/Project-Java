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
public class ProductByWeight implements Invoice{
    private String name;
    private int kgPrice;
    private int grWeight;

    public ProductByWeight(String name, int kgPrice){
        this.name = name;
        this.kgPrice = kgPrice;
        this.grWeight=1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKgPrice() {
        return kgPrice;
    }

    public void setKgPrice(int kgPrice) {
        this.kgPrice = kgPrice;
    }

    public int getGrWeight() {
        return grWeight;
    }

    public void setGrWeight(int grWeight) {
        this.grWeight = grWeight;
    }
    
    public double kilograms(){
        return grWeight/1000;
    }

    @Override
    public double cost() {
        return kgPrice;
    }

    @Override
    public void addAmount(int value) {
        this.grWeight+=value;
    }

    @Override
    public void resetAmount() {
        this.grWeight=1000;
    }

    @Override
    public void showdetails() {
        System.out.println(this.name + ' ' + this.grWeight + ' ' + this.kgPrice + '€');
    }
    
}
