package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int palabra=0;
        String p;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        p=teclado.nextLine();
        for(int i = 0; i<=p.length()-1;i++){
            if(p.charAt(i)=='a'){
                palabra = palabra+1;
            }
        }
        System.out.println("La cantidad de letras a en la palabra es: "+palabra);
    }
}
    
