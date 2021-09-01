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
public class Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que calcule el área de un rectángulo. (Ingresar por teclado ) A = (Base*ALtura)
        Scanner obj = new Scanner(System.in);
        int base;
        int altura;
        int area;
        
        System.out.println("Área de un rectangulo");
        System.out.println("Ingresar la longitud de la base en cm : ");
        base = obj.nextInt();
        System.out.println("Ingresar la altura en cm : ");
        altura = obj.nextInt();
        
        area = (base*altura);
        System.out.println("El área del rectangulo es "+(area)+"cm^2");
        
    }
    
}
