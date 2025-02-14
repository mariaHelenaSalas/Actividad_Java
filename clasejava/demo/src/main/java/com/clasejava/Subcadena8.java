package com.clasejava;

import java.util.Scanner;

public class Subcadena8 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese una palabra:");


        String s = teclado.nextLine();


        int start = teclado.nextInt();
        int end = teclado.nextInt();


        System.out.println(s.substring(start, end));

        teclado.close();
    }
}
