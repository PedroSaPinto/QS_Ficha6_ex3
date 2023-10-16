package org.example;

public class NumDigitos {

    public NumDigitos(){

    }

    public int verDigitos(int num){
        String s =Integer.toString(num);
        int digitos = s.length();
        return digitos;
    }
}
