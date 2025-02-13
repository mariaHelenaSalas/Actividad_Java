package com.clasejava;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el monto del prestamo: ");
        double prestamo = teclado.nextDouble();

        System.out.println("Ingrese la tasa de interes anual (%): ");
        double tasaAnual = teclado.nextDouble();

        System.out.println("Ingrese el plazo del prestamo (en años): ");
        int años = teclado.nextInt();

        // aqui voy a calcular parametros
        double rTasaInteresMes = (tasaAnual / 100) / 12;
        int nTotalDeAnos = años * 12;

        // bueno aqui calculo la cuota fija mensual
        double CuotaFijaMensual = (prestamo * rTasaInteresMes) / (1 - Math.pow(1 + rTasaInteresMes, nTotalDeAnos));

        System.out.println("\nTabla de Amortización:");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s\n",
                "N° Cuota", "Saldo Inicial", "Cuota Mensual", "Interés pagado", "Capital", "Saldo Pendiente");

       double saldopendiente = prestamo;

       for (int cuota = 1; cuota <= nTotalDeAnos; cuota++){
        double interesPagado = saldopendiente * rTasaInteresMes; //con esto calculo el interes del mes
        double capitalPagado = CuotaFijaMensual - interesPagado;
        saldopendiente -= capitalPagado; // aqui rest rl capital pago al saldo pendiente

        System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f\n",
            cuota, saldopendiente + capitalPagado, CuotaFijaMensual, interesPagado, capitalPagado, saldopendiente);
       }
        
       teclado.close();
    }
}
