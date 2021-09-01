/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class18;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Class18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que calcule 3 notas de un alumno e ingrese por teclado.
        Scanner obj = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        int prom = 0;
        
        System.out.println("Ingrese la nota 1: ");
        x = obj.nextInt();
        System.out.println("Ingrese la nota 2: ");
        y = obj.nextInt();
        System.out.println("Ingresa la nota 3: ");
        z = obj.nextInt();
        
        prom = ((x+y+z)/3);
        
        System.out.println("Nota n°1 es: "+x);
        System.out.println("Nota n°2 es: "+y);
        System.out.println("Nota n°3 es: "+z);
        System.out.println("El promedio es: "+prom);
    }
    
}
