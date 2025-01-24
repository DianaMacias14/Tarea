import java.util.Scanner;

public class maxcd{

     public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int x = b;
            b = a % b;
            a = x;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese un numero entero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int num2 = teclado.nextInt();

        
        int mcd = calcularMCD(num1, num2);

        
        System.out.println("El maximo coman divisor de es: " + mcd);


        
    }
}