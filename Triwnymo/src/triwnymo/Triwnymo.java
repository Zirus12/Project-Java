/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triwnymo;

/**
 *
 * @author Alexandros
 */
public class Triwnymo {
    private double a;
    private double b;
    private double g;

    public Triwnymo(double a, double b, double g) {
        this.a = a;
        this.b = b;
        this.g = g;
    }
    
    public double diakrinousa(){
        return (b*b)-4*a*g;
    }
    
    public double x1(){
        return (-b+Math.sqrt(diakrinousa()))/2*a;
    }
    
    public double x2(){
        return (-b-Math.sqrt(diakrinousa()))/2*a;
    }
}
