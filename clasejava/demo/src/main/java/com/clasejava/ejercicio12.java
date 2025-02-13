package com.clasejava;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su monto inicial");
        double capitalInicial = teclado.nextDouble();

        System.out.println("Ingrese la tasa de interes anual (%): ");
        double tasaAnual = teclado.nextDouble();

        System.out.println("Ingrese el numero de años de inveresion ");
        int años = teclado.nextInt();

        System.out.println("seleccione la frecuencia de capitalizacion: ");
        System.out.println("1. mensual\n2 trimestral\n3 semestral\n. Anual ");
        System.out.println("opcion:");

        int opcion = teclado.nextInt();

        int numero = 1;

        switch (opcion) {
            case 1:
                numero = 12;

                break;
            case 2:
                numero = 4;
                break;
            case 3:
                numero = 2;
                break;
            case 4:
                numero = 1;
                break;

            default:
              System.out.println("opcion invalida, se usara la capitalizacion anual");
                break;
        }

        System.out.printf("\n%-5s %-15s %-15s %-15s\n", "Año", "Capital Inicial", "Interés Ganado", "Nuevo Saldo");
        System.out.println("---------------------------------------------------------");

        double saldo = capitalInicial;
         for (int i = 1; i <= años; i++){
         double saldoFinal = saldo * Math.pow(1 + (tasaAnual / numero), numero); // AQUI formule el interes compuesto
         double interesGanado = saldoFinal - saldo;

         System.out.printf("%-5d  %-15.2f  %-15.2f  %-15.2f\n", i, saldo, interesGanado, saldoFinal );
         
         saldo = saldoFinal; // aqui actualizo el saldo pra el proximo año

         }

         teclado.close();

    }

}
