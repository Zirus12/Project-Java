/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Person;

/**
 *
 * @author Alexandros
 */
public class Person {
    private String Name;
    private String Surname;
    private int Gender;
    
    public Person(String Name, String Surname, int Gender){
        this.Name=Name;
        this.Surname=Surname;
        this.Gender=Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int Gender) {
        this.Gender = Gender;
    }
    
}
