/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpassengersapp;

/**
 *
 * @author Alexandros
 */
public class CarPassenger {
    private final String mark="MAZDA 3";
    private final String model="SEDAN";
    private final int released=2000;
    private final String num="KBA1234";
    private String name;
    private String surname;
    private double weight;
    private int age;
    private int passengers=0;
    private int kids=0;
    
    public CarPassenger(String name, String surname, double weight, int age) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;        
        this.passengers+=1;
        this.age=age;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getReleased() {
        return released;
    }

    public String getNum() {
        return num;
    }

    public void showDetails(){
        System.out.println(this);
    }

    public void addPassenger(int weight, int age){
        if(passengers<=5 && age<17 && kids<2){
            this.kids+=1;
            this.passengers+=1;
        }
        else if(passengers<=5)
            this.passengers+=1;
        else{
            System.out.println("The amount of passengers exceeds the one that is allowed");
            throw new RuntimeException();            
        }
        this.weight+=weight;
    }
    
    public boolean CarWeightIsValid(){
        return weight<=400;
    }
    
    public boolean KidsIsValid(){
        return kids<=2;
    }
    
    public int prostimoTroxaias(){
        if(CarWeightIsValid())
            return 0;
        return 500;
    }
    
    public boolean afairesiPinakidon(){
        return !(KidsIsValid() && CarWeightIsValid());
    }
    
    public int CarsAge(int todayage){
        return todayage-released;
    }
}
