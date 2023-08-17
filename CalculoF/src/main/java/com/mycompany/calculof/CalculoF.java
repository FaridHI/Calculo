/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculof;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class CalculoF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("La Resta");
               System.out.print("INGRESE EL PRIMER NUMERO: ");
               
               int numero3 = scanner.nextInt();
               
               System.out.print("INGRESE EL SEGUNDO NUMERO: ");
               int numero4 = scanner.nextInt();
               
               int resta = numero3 - numero4;
                   System.out.println("la resta de " + numero3 + " - " + numero4 + " es: " + resta);
               System.out.println();  
               
    }
}
