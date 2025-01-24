package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int palabras;
        String p;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingresa las palabras");
        p=teclado.nextLine();
        p = p.toUpperCase();
        System.out.println(p);
    }
}