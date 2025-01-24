import java.util.Scanner;

public class impar{
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        
        do {
            System.out.print("Ingrese un numero que sea positivio y entero: ");
            numero = teclado.nextInt();
        } while (numero <= 0);

        System.out.println("Numeros impares desde 1 hasta " + numero + ":");
        
        int i = 1;
        do {
            if (i % 2 != 0) { 
                System.out.println(i);
            }
            i++; 
        } while (i <= numero); 

    }
}