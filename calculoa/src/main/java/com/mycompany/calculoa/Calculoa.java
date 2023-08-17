/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoa;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Calculoa {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("la suma");
      System.out.println("ingrese el numero");
      
      int numero1 = scanner.nextInt();
      
      System.out.println("ingrese el segundo numero: ");
      int numero2 = scanner.nextInt();
      
      int suma = numero1 + numero2 ;
        System.out.println("la suma de " + numero1 + " + " + numero2 + " es: " + suma);
        System.out.println();
        
    }
}
