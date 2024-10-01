
package com.mycompany.poo;

import java.util.Scanner;


public class EjercicioVector {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //Variable de tipo Vector
        float[] alturas;
        alturas = new float[5];
        //Lectura y Guardar Alturas
        for(int i=0;i<5;i++){
            System.out.println("Ingrese la altura de la persona");
            alturas[i]=sc.nextFloat();
        }
        //Calcular Promedio
        float suma=0, promedio=0;
        for(int j=0;j<5;j++){
            suma=suma+alturas[j];       
        }
         System.out.println("La suma Total: "+suma);
        promedio=suma/5;
        System.out.println("Promedio de alturas: "+promedio);
        // Contar los mayores y menores
        int may , men;
        may=0;
        men=0;
        for(int j=0;j<5;j++){
            if(alturas[j] > promedio){
                may++;
            }else if (alturas[j] < promedio){
                men++;
            }      
        }
        System.out.println("La Cantidad mayor del promedio es: "+may);
        System.out.println("La Cantidad mayor del promedio es: "+men);

    }
    
}
