package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
int calificacion;
Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese su calificación");
calificacion=teclado.nextInt();
if(calificacion>=90 && calificacion<=100){
    System.out.println("A");
}
else if(calificacion>=80 && calificacion<=89){
    System.out.println("B");
}
else if(calificacion>=70 && calificacion<=79){
    System.out.println("C");
}
else if(calificacion>=60 && calificacion<=69){
    System.out.println("D");
}
else{
    System.out.println("F");
}
    
}
}