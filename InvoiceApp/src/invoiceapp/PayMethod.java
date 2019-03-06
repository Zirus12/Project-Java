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
public class PayMethod {
    private String pway;
    private String cost_pway;

    public PayMethod(String pway, String cost_pway) {
        if((!pway.equals("Paypal")||!pway.equals("paypal"))||(!pway.equals("Cash")||!pway.equals("cash"))||(!pway.equals("Card")||(!pway.equals("card"))))
            throw new RuntimeException();
        else
            this.pway = pway;
        this.cost_pway = cost_pway;
    }

    public String getPway() {
        return pway;
    }

    public void setPway(String pway) {
        if((!pway.equals("Paypal")||!pway.equals("paypal"))||(!pway.equals("Cash")||!pway.equals("cash"))||(!pway.equals("Card")||(!pway.equals("card"))))
            throw new RuntimeException();
        else
            this.pway = pway;
    }

    public String getCost_pway() {
        return cost_pway;
    }

    public void setCost_pway(String cost_pway) {
        this.cost_pway = cost_pway;
    }

    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "PayMethod{" + "pway=" + pway + ", cost_pway=" + cost_pway + '}';
    }
}
