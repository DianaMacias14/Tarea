package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

double peso, altura, masa;
Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese su peso en kilogramos;");
peso= teclado.nextDouble();
System.out.println("Ingrese su altura en metros");
altura=teclado.nextDouble();
masa=peso/(altura*altura);
System.out.println("Su indice de masa corporal es:"+masa);
    }
}




