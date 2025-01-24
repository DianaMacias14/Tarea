import java.util.Scanner;
public class secuencia {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner= new Scanner(System.in);
    System.out.println("Ingresa el primer numero de la secuencia");
    int primerNumero =scanner.nextInt();

    System.out.println("Ingresa la diferencia entres dos numeros");
    int diferencia =scanner.nextInt();

    System.out.println("Ingresa el numero maximo");
    int numeroMaximo =scanner.nextInt();
    int numeroActual = primerNumero;

    System.out.println("Secuencia aritmetica");

    do{
        System.out.println(numeroActual+ " ");
        numeroActual += diferencia;


    } while (numeroActual <= numeroMaximo);

    }
}
