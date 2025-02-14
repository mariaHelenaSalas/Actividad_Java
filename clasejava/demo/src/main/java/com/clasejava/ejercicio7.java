package com.clasejava;
import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
    
        Random random =  new Random();
        int min = 1;
        int max = 100;
        
        int customNumber = min + random.nextInt(max - min + 1);
        System.out.println("Numero aleatorio:"+  min + " y " + max + " es: " + customNumber);
    }
}
