package com.clasejava;

public class ejericiometodo {
    public static int sumar(int a) {
        return a + 8;

    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        System.out.println("Suma con un numero: " + sumar(6));
        System.out.println("Sumar con dos numeros: " + sumar(6, 10));
    }

}
