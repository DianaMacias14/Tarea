package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int[]numeros = new int[8];
            int mayor,menor;
            Scanner Scanner = new Scanner(System.in);
            for(int i=0; i<numeros.length; i++){
                System.out.println("Numero "+(i+1)+": ");
                numeros[i]=Scanner.nextInt();

            }
                mayor=numeros[0];
                menor=numeros[0];
                
                for(int i=1; i<numeros.length; i++){
                    if(numeros[i]>mayor){
                        mayor=numeros[i];
                    }
                    if(numeros[i]<menor){
                        menor=numeros[i];
                    }
                }
                
            System.out.println("El numero mayor es: "+mayor);
        

    }
}