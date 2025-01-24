package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int letra;
        String l;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese una letra");
        l=teclado.nextLine();
        if(l.equals("a")){
            System.out.println("La letra es vocal"+l);
        }else if(l.equals("e")){
            System.out.println("La letra es vocal"+l);
        }else if(l.equals("i")){
            System.out.println("La letra es vocal"+l);
         } else if(l.equals("o")){
            System.out.println("La letra es vocal"+l);
         }else if(l.equals("u")){
            System.out.println("La letra es vocal"+l);
         }else{
            System.out.println("La letra no es vocal"+l); 
        }
    

    }
}