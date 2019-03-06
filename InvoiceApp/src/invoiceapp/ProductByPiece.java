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
public class ProductByPiece implements Invoice{
    private String name;
    private int quantity;
    private int price;
    
    public ProductByPiece(String n, int p){
        name=n;
        price=p;
        quantity=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public double cost(){
        return price;
    }
    
    @Override
    public void addAmount(int value){
        this.quantity+=value;
    }
    
    @Override
    public void resetAmount(){
        this.quantity=1;
    }
    
    @Override
    public void showdetails(){
        System.out.println(this.name + ' ' + this.quantity + ' ' + this.price + '€');
    }
}
