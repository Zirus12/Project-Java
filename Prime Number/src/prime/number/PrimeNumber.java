/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.number;

/**
 *
 * @author Alexandros
 */
public class PrimeNumber {
    private int value;

    public PrimeNumber(int val) {
        for(int i=2; i<=val/2; i++)
            if(val%i==0)
                throw new RuntimeException();
        this.value = val;
    }
    
    public static boolean isPrime(int val){
        for(int i=2; i<=val/2; i++)
            if(val%i==0)
                return false;
        return true;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int val) {
        for(int i=2; i<=val/2; i++)
            if(val%i==0)
                throw new RuntimeException();
        this.value = val;
    }
    
    public static int getNext(int val){
        int x=val;
        boolean o = false;
        do{
            o=true;
            x+=1;
            for(int i=2; i<=x/2; i++)
                if(x%i==0)
                    o=false;
        }while(!o);
        return x;
    }
    
    public int getNext(){
        int x=value;
        do{
            x+=1;
            if(isPrime(x))
                return x;
        }while(!isPrime(x));
        return 0;
    }
}
