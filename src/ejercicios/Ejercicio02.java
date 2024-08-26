/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 * Programa para calcular la hipotenusa de un triángulo rectángulo
 * @author Hernan
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        // declarar variables
        double catetoOpuesto, catetoAdyacente, hipotenusa;
        Scanner scanner = new Scanner(System.in);
        
        // entrada de datos
        System.out.println("Ingresa el cateto opuesto de tu triángulo: ");
        catetoOpuesto = scanner.nextDouble();
        
        System.out.println("Ingresa el cateto adyacente de tu triángulo: ");
        catetoAdyacente = scanner.nextDouble();
        
        // procesamiento de datos
        hipotenusa = Math.sqrt(Math.pow(catetoOpuesto, 2) + Math.pow(catetoAdyacente, 2));
        
        // salida de datos
        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);
    }
}
