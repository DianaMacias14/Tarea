package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num2=1, n;
        double resultado;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n=teclado.nextInt();
        do{
            resultado=Math.pow(num2,2);
            System.out.println(resultado);
            num2=num2+1;

        }while(num2!=n);
        
        System.out.println("El cuadrado del numero es: "+resultado);

    }
}