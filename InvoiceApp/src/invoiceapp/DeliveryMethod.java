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
public class DeliveryMethod {
    private String dway;
    private String cost_dway;

    public DeliveryMethod(String dway, String cost_dway) {
        if(!dway.equals("Courier")||!dway.equals("courier")||!dway.equals("Post")||!dway.equals("post")||!dway.equals("Delivery")||!dway.equals("delivery"))
            throw new RuntimeException();
        else
            this.dway = dway;
        this.cost_dway = cost_dway;
    }

    public String getDway() {
        return dway;
    }

    public void setDway(String dway) {
        if(!dway.equals("Courier")||!dway.equals("courier")||!dway.equals("Post")||!dway.equals("post")||!dway.equals("Delivery")||!dway.equals("delivery"))
            throw new RuntimeException();
        else
            this.dway = dway;
    }

    public String getCost_dway() {
        return cost_dway;
    }

    public void setCost_dway(String cost_dway) {
        this.cost_dway = cost_dway;
    }

    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "DeliveryMethod{" + "dway=" + dway + ", cost_dway=" + cost_dway + '}';
    }
}
