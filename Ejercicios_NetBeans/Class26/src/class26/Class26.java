/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class26;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Class26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("Bienvenidos al Menú");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.println("Escoja una de las opciones");
            opcion = obj.nextInt();

            switch (opcion) {
                case 1:
                    //Ingresar por teclado: La base y exponente de un número.
                    int base;
                    int exponente;
                    int resultado;
                    
                    System.out.println("Ingrese la base : ");
                    base = obj.nextInt();
                    System.out.println("Ingresar el exponente : ");
                    exponente = obj.nextInt();
                    
                    //Math.pow() retorna o eleva la base del exponente
                    resultado = (int)Math.pow(base, exponente);
                    System.out.println(base+" elevado a "+exponente+" es igual a "+resultado);
                    
                    
                    break;

                case 2:
                    //Ingresar por teclado una cantidad de números: Definir el número mayor - menor.
                    int num;
                    int nMenor=100000000;
                    int nMayor=0;
                    int numT;
                    
                    System.out.println("Ingrese la cantidad de numeros : ");
                    numT = obj.nextInt();
                    
                    for(int i = 1; i <= numT; i++ ){
                        System.out.println("Ingrese un valor : ");
                        num = obj.nextInt();
                        
                        if (num > nMayor) {
                            nMayor = num;     
                        }
                        if (num < nMenor) {
                            nMenor = num;
                        }     
                    }
                    System.out.println("El numero mayor fue : "+nMayor);
                    System.out.println("El numero menor fue : "+nMenor);
                    
                    break;

                case 3:
                    //Ingresar por teclado una cantidad de números: Definir la cantidad de pares, 
                    //cantidad de impares y el ganador. 
                    int cantP=0;
                    int cantI=0;
                    int cantT;
                    int numX;
                    String ganador;
                    
                    System.out.println("Ingrese la cantidad de numeros : ");
                    cantT = obj.nextInt();
                    
                    for(int i=1; i <= cantT; i++){
                        System.out.println("Ingrese un valor : ");
                        numX = obj.nextInt();
                        
                        if (numX % 2 ==0) {
                            cantP++;                          
                        }else {
                            cantI++;
                        }     
                    }
                    ganador = (cantP > cantI)?"pares":"impares";
                    System.out.println("Cantidad Pares : "+cantP);
                    System.out.println("Cantidad Impares : "+cantI);
                    System.out.println("El ganador es : "+ganador);
                    
                    break;

                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo numeros entre el 1 y el 4");

            }

        }
    }

}
