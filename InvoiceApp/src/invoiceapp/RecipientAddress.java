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
public class RecipientAddress {
    private String name;
    private String surname;
    private String street;
    private String num;
    private String postcode;

    public RecipientAddress(String name, String surname, String street, String num, String postcode) {
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.num = num;
        this.postcode = postcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    public void display(){
        System.out.println(this);       
    }

    @Override
    public String toString() {
        return "RecipientAddress{" + "name=" + name + ", surname=" + surname + ", street=" + street + ", num=" + num + ", postcode=" + postcode + '}';
    }
    
}
