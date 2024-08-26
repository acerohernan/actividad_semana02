/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Programa para crear un informe de venta por producto
 * @author Hernan
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // declarar variables
        String producto;
        double costoProducto, precioProducto, gananciaUnitaria, gananciaTotal;
        int numeroVentas, porcentajeGanancia;
        Scanner scanner = new Scanner(System.in);
        
        // entrada de datos
        System.out.println("Ingresa el nombre del producto: ");
        producto = scanner.nextLine();
        
        System.out.println("Ingresa el costo del producto: ");
        costoProducto = scanner.nextDouble();
        
        System.out.println("Ingresa el precio de venta del producto: ");
        precioProducto = scanner.nextDouble();
        
        System.out.println("Ingresa el número de ventas: ");
        numeroVentas = scanner.nextInt();
        
        // procesado de datos
        gananciaUnitaria = precioProducto - costoProducto;
        porcentajeGanancia = (int) Math.floor((gananciaUnitaria / costoProducto ) * 100);
        gananciaTotal = gananciaUnitaria * numeroVentas;
        
        // salida de datos
        System.out.println("La ganancia por " + producto + " es de " + gananciaUnitaria);
        System.out.println("El porcentaje de ganancia unitario es de " + porcentajeGanancia + "%");
        System.out.println("La ganancia total de este periodo es de: " + gananciaTotal);
    }
}
