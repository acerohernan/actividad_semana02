/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 * Programa para calcular el interés de una hipoteca
 * @author Hernan
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        // declarar variables
        double montoTotal, tasaDeInteres, numeroAños, interes, totalConInteres;
        Scanner scanner = new Scanner(System.in);
        
        // entrada de datos
        System.out.println("Ingresa el monto total de la hipoteca: ");
        montoTotal = scanner.nextDouble();
        
        System.out.println("Ingresa la tasa de interés anual: ");
        tasaDeInteres = scanner.nextDouble();
        
        System.out.println("Ingresa el número de años: ");
        numeroAños = scanner.nextDouble();
        
        // procesamiento de datos
        interes = (tasaDeInteres / 100) * montoTotal * numeroAños;
        totalConInteres = montoTotal + interes;
        
        // salida de datos
        System.out.println("El monto de interes después de " + numeroAños + " año(s) será de: " + interes);
        System.out.println("El monto total pagado después de " + numeroAños + " año(s) será de: " + totalConInteres);
    }
}
