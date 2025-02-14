package com.clasejava;

import java.util.Scanner;

public class claseerciciPropina {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
        System.out.println("\n=====================================");
        System.out.println("           SIMULADOR DE PROPINA       ");
        System.out.println("=======================================");

        System.out.println("1. Calular propina y total a pagar");
        System.out.println("2. Calcular total a pagar dividido entre varias personas");
        System.out.println("3. Salir");
        System.out.println("===========================================");

        System.out.println("Por favor, elige una opcion(1-3)");

        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println();
                break;
        
            default:
                break;
        }

        }
    }

}
