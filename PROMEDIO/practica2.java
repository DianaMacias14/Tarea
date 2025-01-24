import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {
        float numero1,numero2,numero3,suma;
        float promedio;
        Scanner  teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        numero1 = teclado.nextFloat();
        System.out.println("Ingrese el segundo numero:");
        numero2 = teclado.nextFloat();
        System.out.println("Ingrese el tercer numero:");
        numero3 = teclado.nextFloat();

        suma = numero1 + numero2 + numero3;
        promedio = suma/3;

        System.out.println("El promedio es:" + promedio);

        
    }
}


