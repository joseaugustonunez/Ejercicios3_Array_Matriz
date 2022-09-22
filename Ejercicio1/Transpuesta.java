package Ejercicio1;

import java.util.Scanner;

public class Transpuesta {
    int fila;
    int columna;
    int matriz[][];
    int transpuesta[][];

    public void ordenarMatriz(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingresar la Fila:");
       fila = scanner.nextInt();
       System.out.println("Ingresar la Columna:");
       columna = scanner.nextInt();
   
       matriz = new int [fila][columna];
       transpuesta= new int [fila][columna];
    }
    public void agregarMatriz(){
       for (int i = 0; i <matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
              Scanner scanner = new Scanner(System.in);
               int valor;
                  System.out.println("Ingresar valor a la Matriz:");
                   valor = scanner.nextInt();
                   
                   matriz[i][j]= valor;
           }
       }
     }
     public void mostrarMatriz(){
       System.out.println("La Matriz Normal:");
       for (int i = 0; i <matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               System.out.print("[" + matriz[i][j] + "]");
           }
         System.out.println("");
       }
     }
     public void transponerMatriz(){
       for (int i = 0; i <matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               transpuesta[j][i]= matriz[i][j];
           }
       }
   }   
   
   public void matrizTranspuesta(){
       System.out.println("La Matriz Transpuesta es:");
       for (int j= 0; j<matriz[0].length; j++) {
           for (int i = 0; i < matriz.length; i++) {
               System.out.print("[" + matriz[i][j] + "]");
           }
         System.out.println("");
       }
     }  
}
