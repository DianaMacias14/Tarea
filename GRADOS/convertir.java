import java.util.Scanner;

public class convertir{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double grados,convercion;
        int opcion;
        System.out.println("Ingrese los grados Celsius:");
        grados = teclado.nextDouble();
        System.out.println("Ingrese el numero de la opcion que desea convertir:");
        System.out.println("1.-Fahrenheit \n 2.-Kelvin");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                convercion=(grados*9/5)+32;
                System.out.println("A grados Fahrenheit son:"+convercion);
                break;
                case 2:
                convercion=grados+273.15;
                System.out.println("A grados Kelvin son:"+convercion);
                break;
        
            default:
                System.out.println("No existe esa opcion");
                
        }
    }
}