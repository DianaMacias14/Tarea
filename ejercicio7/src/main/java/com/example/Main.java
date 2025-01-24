package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //calcular raiz cuadrada
        int raiz;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        raiz=teclado.nextInt();
        System.out.println(Math.sqrt(raiz));
    }
}