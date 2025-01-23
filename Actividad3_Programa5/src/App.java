import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Determinar la estación del año
        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.println("Ingresa el número del mes (1-12)");
        mes = teclado.nextInt();
        switch (mes) {
                case 1:
                System.out.println("Invierno");
                break;
                case 2:
                System.out.println("Invierno");
                break;
                case 3:
                System.out.println("Primavera");
                break;
                case 4:
                System.out.println("Primavera");
                break;
                case 5:
                System.out.println("Primavera");
                break;
                case 6:
                System.out.println("Verano");
                break;
                case 7:
                System.out.println("Verano");
                break;
                case 8:
                System.out.println("Verano");
                break;
                case 9:
                System.out.println("Otoño");
                break;
                case 10:
                System.out.println("Otoño");
                break;
                case 11:
                System.out.println("Otoño");
                break;
                case 12:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("NO EXISTE ESTE MES");
                break;
        }
    }
}
