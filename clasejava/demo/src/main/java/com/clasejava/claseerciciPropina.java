package com.clasejava;

import java.util.Scanner;

public class claseerciciPropina {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("        SIMULADOR DE PROPINA      ");
            System.out.println("==================================");
            System.out.println("1. Calcular propina y total a pagar");
            System.out.println("2. Calcular total a pagar dividido entre varias personas");
            System.out.println("3. Salir");
            System.out.println("==================================");
            System.out.println("por favor, elige una opcion (1-3)");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    calcularPropinas(teclado);

                    break;

                case 2:
                  dividirCuenta(teclado);

                    break;

                case 3:
                    System.out.println("¡Gracias por usar el simulador dee propina!");

                    break;

                default:
                    System.out.println("opcion invalida");

            }

        } while (opcion != 3);

       teclado.close();

    }
    
    
    public static void calcularPropinas(Scanner teclado) {
       
        String respuesta;

        do {

            System.out.println("\n=====================================");
            System.out.println("         Cálculo de propina            ");
            System.out.println("=======================================");
    
            System.out.println("Ingrese el monto de la cuenta: $");
            double cuenta = teclado.nextDouble();
    
            System.out.println("Ingrese el porcentaje de propina (%): ");
            double porcentaje = teclado.nextDouble();
    
            double propina = cuenta * (porcentaje / 100);
            double total = cuenta + propina;
    
            System.out.printf("El calculode la propina es: $%.2f\n", propina);
            System.out.printf("El total a pagar es: $%.2f\n", total);

            System.out.println("Desea calcular nuevamente? (S/N): ");
            respuesta = teclado.next();

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public static void dividirCuenta(Scanner teclado) {

        String respuesta;

        do {

            System.out.println("\n ===================================");
            System.out.println("    Dividir Cuenta entre varias Personas");
            System.out.println("========================================");

            System.out.println("Ingrese el monto total de la cuenta: ");
            double cuenta = teclado.nextDouble();

            System.out.println("Ingrese el porcentaje de propina (%): ");
            double porcentaje = teclado.nextDouble();

            System.out.println("Ingrese el numero de persona: ");
            int numPersonas = teclado.nextInt();

            double propina =  cuenta * (porcentaje / 100);
            double total = cuenta + propina;
            double montoPersona = total / numPersonas;
            
            System.out.printf("La propina calculada es: $%.2f\n", propina);
            System.out.printf("El total a pagar es:  $%.2f\n", total);
            System.out.printf("Monto por persona: $%.2f\n", montoPersona);

            System.out.println(" Deseas calcular nuevamente? (S/N)");
            respuesta = teclado.next();


        } while (respuesta.equalsIgnoreCase(("S")));

        teclado.close();
        
    }


}