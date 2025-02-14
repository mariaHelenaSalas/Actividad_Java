package com.clasejava;

import java.util.Scanner;

public class SimulacionBancaria11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrrese el saldo inicial de la cuenta");
        double saldo = teclado.nextDouble();

        System.out.println("Ingrese su deposito mensual fijo");
        double depositoMensul = teclado.nextDouble();

        System.out.println("Ingrese la tqasa de interes anual (%)");
        double tasaInteresAnual = teclado.nextDouble();

        System.out.println("Ingrese el numero de  meses de simulacion: ");
        int meses = teclado.nextInt();

        double tasaInteresMensual = tasaInteresAnual / 12 / 100; // con esto calculo la tasa de intere menual

        System.out.printf("%-10s  %-15s %-15s %-15s  %-15s%n",
                "Mes", "Saldo Incial", "Deposito", "Inteeres", "Nueo Saldo");

        for (int mes = 1; mes <= meses; mes++) {
            double saldoInicial = saldo;
            double interesGenerado = saldo * tasaInteresMensual; // aca estoy realizando el paso de simulacio
            saldo += depositoMensul + interesGenerado;

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15.2f%n",
                    mes, saldoInicial, depositoMensul, interesGenerado, saldo);

        }
        teclado.close();

    }

}
