/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Class9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ingresar por teclado un número: Declarar si es o no un número primo 
        Scanner x = new Scanner(System.in);
        int i;
        int num;
        int cont = 0;
        
        System.out.println("Ingresar un número : ");
        num = x.nextInt();
        
        for (i = 1; i < (num+1); i++) {
            if (num % i == 0) {
               cont++;
            }
        }
        if (cont != 2) {
            System.out.println("No es un número primo");
        } else {
            System.out.println("Si es un número primo");
        }
        
    }  
}
