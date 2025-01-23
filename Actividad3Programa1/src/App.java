import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //calculadora de calificaciones finales
        int parcial, proyecto, examen_final;
        double promedio;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la calificación del parcial: ");
            parcial = teclado.nextInt();
            System.out.println("Ingresa la calificación de tu proyecto: ");
            proyecto = teclado.nextInt();
            System.out.println("Ingresa la calificación de tu examen final: ");
            examen_final = teclado.nextInt();
            if(parcial>=0 && parcial<=100 && proyecto>=0 && proyecto<=100 && examen_final>=0 && examen_final<=100){
                promedio = (parcial*.40) + (proyecto*.30) + (examen_final*.30);
                System.out.println("Tu promedio final es: " +promedio);
            }else{
            System.out.println("ERROR");
            }
    }
}
