import java.util.Scanner;

public class comparar{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,cantidad, mayor = 0, menor=0, iguales=0;
        System.out.println("¿Cuantos va a ingresar?");
        cantidad = teclado.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
             numero = teclado.nextInt();

            if (numero > 0) {
                mayor++;
            } else if (numero < 0) {
                menor++;
            } else {
                iguales++;



    }
}
System.out.println("Numeros mayores que 0: " + mayor);
        System.out.println("Numeros menores que 0: " + menor);
        System.out.println("Numeros iguales a 0: " + iguales);
}
}

