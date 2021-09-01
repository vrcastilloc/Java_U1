/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class19;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Class19 {

    Scanner obj = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menú while - if
        Scanner obj = new Scanner(System.in);
        Class19 ejercicios = new Class19();
        String opcion = "";

        while (!opcion.equalsIgnoreCase("d")) {
            System.out.println("\n");
            System.out.println("\033[0;35mBienvenidos Al Menú");
            System.out.println("Escoja una de las opciones");
            System.out.println("a. Ejecutar el ejercicio 1");
            System.out.println("b. Ejecutar el ejercicio 2 ");
            System.out.println("c Ejecutar el ejercicio 3");
            System.out.println("d. Salir ");
            System.out.println(" ");
            System.out.println("Su opción será :");
            opcion = obj.next();
            if (opcion.equalsIgnoreCase("a")) {
                ejercicios.ejercicio1();
            }
            if (opcion.equalsIgnoreCase("b")) {
                ejercicios.ejercicio2();
            }
            if (opcion.equalsIgnoreCase("c")) {
                ejercicios.ejercicio3();
            }
        }
    }

    public void ejercicio1() {   
    }

    public void ejercicio2() {        
    }

    public void ejercicio3() {
    }
}
