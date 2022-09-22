package Ejercicio2;

import java.util.Scanner;

public class Arreglo {
    int arreglo[];
    int elemento;
    int num;
    int cont;
    int n;

    public void agregarArreglo(){
      Scanner scanner= new Scanner(System.in);
      System.out.print("Cantidad de numeros en el arreglo:");
      n = scanner.nextInt();
      
      arreglo = new int [n];
      num=cont+n;
    }
    public void ingresarArreglo(){
        for(int i=0; i<num; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresar valor al Arreglo:");
            elemento= scanner.nextInt();
             arreglo[i]=elemento;

        }
    }
    public void mostrarArreglo(){
        for(int i=0; i<num; i++){
            System.out.println("Dato ["+ i +"]=" +arreglo[i]);
        }
    }
    public void buscarDato(){
      Scanner scanner= new Scanner(System.in);
      System.out.print("ingrese el dato Buscar:");
      int dato;
      dato = scanner.nextInt();
      int bandera = 0;
      int captura;
      for(int i=0; i<num; i++){
         if(arreglo[i]==dato){
            captura=i;
            bandera = bandera + 1;
            if(bandera==1){
                System.out.println("Dato Encontrado");
                System.out.print("ingrese el dato a Remplazar:");
                int nuevo;
                nuevo = scanner.nextInt();
                arreglo[captura]= nuevo;
            } else{
                System.out.println("Dato NO Existe");
            }
        } 
    }
}
    public void arregloNuevo(){
        for(int i=0; i<num; i++){
            System.out.println("Dato ["+ i +"]=" +arreglo[i]);
        }
        
    }  
    public void eliminarDato(){
    Scanner scanner= new Scanner(System.in);
      System.out.print("ingrese el dato a Eliminar:");
      int  eliminar;
      eliminar = scanner.nextInt();
      int bandera = 0;
      int captura=0;
      cont =0;
      for(int i=0; i<num; i++){
         if(arreglo[i]==eliminar){
            captura=i;
            bandera = bandera+1;
        
            if(bandera==1){
                if( captura == (num-1)){
                    num=num-1;
                    cont=num;
                }
                else{
                    for(i=captura;i<num-1;i++){
                        arreglo[i]=arreglo[i+1];
                    }
                    num=num-1;
                    cont=num;
                }
            } else{
                System.out.println("Dato no Encontrado");
            }  
        }
    }   
}
public void arregloEliminado(){
    for(int i=0; i<num; i++){
        System.out.println("Dato ["+ i +"]=" +arreglo[i]);
    }
    
}
}  
