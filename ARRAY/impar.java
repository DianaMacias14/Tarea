import java.util.Scanner;

public class impar{

    public static void main(String[] args) {
        
    
       Scanner teclado = new Scanner(System.in);

        
        int[] numeros = new int[10];

        
        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        
        int contadorPares = 0;
        int contadorImpares = 0;

        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        
        System.out.println("Hay: " + contadorPares +"pares");
        System.out.println("Hay: " + contadorImpares + "impares");

       
}
}
