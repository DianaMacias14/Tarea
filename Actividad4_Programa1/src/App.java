import java.util.Scanner;

public class App {
    
    
        public static void main(String[] args) throws Exception {
            //Factorial de un número
           Scanner teclado = new Scanner(System.in);
           int numero, factorial=1;
           System.out.println("Ingresa un número: ");
           numero = teclado.nextInt();
           for(int i=1; i<=numero; i++){
            factorial = factorial * i;
       }
       System.out.println(factorial);
        }
}
