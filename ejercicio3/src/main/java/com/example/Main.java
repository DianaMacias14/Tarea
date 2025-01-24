package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int moneda;
        double pesos, conversion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de pesos a convertir");
        pesos=teclado.nextDouble();
        System.out.println("Ingrese el valor de la moneda");
        moneda=teclado.nextInt();
        switch (moneda){
            case 1:
            conversion= pesos*20.47;
            System.out.println("El valor en dolares es: "+conversion);
            break;
            case 2:
            conversion= pesos*0.047;
            System.out.println("El valor en euros es: "+conversion);
            break;
            case 3:
            conversion= pesos*1.66152;
            System.out.println("El valor en baht es: "+conversion);
            break;
            case 4:
            conversion= pesos*7.65;
            System.out.println("El valor en yenes es: "+conversion);
            break;
            case 5:
            conversion= pesos*70.25;
            System.out.println("El valor en won es: "+conversion);
            break;
            case 6:
            conversion= pesos*0.078;
            System.out.println("El valor en dolar australiano es: "+conversion);
            break;
            case 7:
            conversion=pesos*0.18;
            System.out.println("El valor en soles es: "+conversion);
            break;
            case 8:
            conversion=pesos*0.070;
            System.out.println("El valor en dolar canadiense es: "+conversion);
            break;
            case 9:
            conversion=pesos*0.34;
            System.out.println("El valor en bolivares es: "+conversion);
            break;
            case 10:
            conversion=pesos*51.17;
            System.out.println("El valor en pesos argentinos es: "+conversion);
            break;
            default:
                System.out.println("No existe");

        }
        
    }
}