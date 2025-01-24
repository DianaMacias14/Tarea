import java.util.Scanner;

public class actividad{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt();

        if(edad >= 18){
            System.out.println("!YA PUEDES VOTAR¡");
        }else {
            System.out.println("Aun no puedes votar, eres menor de 18");

        }

    }
}