/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class06;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
        Scanner obj = new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.println("Introduzca el primer número : ");
        x = obj.nextInt();
        System.out.println("Introduzca el segundo número : ");
        y = obj.nextInt();
        
        int suma = x+y;
        int resta = x-y;
        int multiplicacion = x*y;
        double division = x/y;
        
        System.out.println("Suma es: "+suma);
        System.out.println("Resta es: "+resta);
        System.out.println("Multiplicacion es: "+multiplicacion);
        System.out.println("División es: "+division);
    }
    
}
