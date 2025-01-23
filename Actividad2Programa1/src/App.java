import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //calcular area de un rectangulo
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la base de un rectangulo: ");
        base = teclado.nextDouble();
        System.out.println("Ingresa la altura de un rectangulo: ");
        altura = teclado.nextDouble();
        area=base*altura;
        System.out.println("El area de un rectangulo es: " + area);
    }
}