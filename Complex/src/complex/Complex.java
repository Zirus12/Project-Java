/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author Alexandros
 */
public class Complex {
    private int a;
    private int b;
        
    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public Complex add(Complex op){
        Complex x=new Complex(this.a, this.b);
        x.a+=op.a;
        x.b+=op.b;
        return x;
    }
    
    public Complex subtract(Complex op){
        Complex x=new Complex(this.a, this.b);
        x.a-=op.a;
        x.b-=op.b;
        return x;
    }
    
    public Complex multiply(Complex op){
        Complex x=new Complex(this.a, this.b);
        x.a=x.a*op.a;
        x.b=x.b*op.b;
        return x;
    }
    
    public Complex divide(Complex op){
        Complex x=new Complex(this.a, this.b);
        x.a=x.a/op.a;
        x.b=x.b/op.b;
        return x;
    }

    @Override
    public String toString() {
        return "Complex{" + "a=" + a + ", b=" + b + '}';
    }
    
    
}
