import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Remplasar las a por las o
        String palabra;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa una palabra: ");
       palabra= teclado.nextLine();
       palabra = palabra.replaceAll("a", "o");
       System.out.println(palabra);
    }
}
