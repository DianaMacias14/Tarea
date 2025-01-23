import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //calcular raiz cuadrada
        int raiz;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa un numero: ");
       raiz= teclado.nextInt();
       System.out.println(Math.sqrt(raiz));
    }
}
