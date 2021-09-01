/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class25;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Class25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menú while - switch
        Scanner obj = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("\n");
            System.out.println("\033[0;35mBienvenidos al Menú");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.println("Escoja una de las opciones");
            opcion = obj.nextInt();

            switch (opcion) {
                case 1:                 
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números del 1 al 4");
            }
        }
    }
}
