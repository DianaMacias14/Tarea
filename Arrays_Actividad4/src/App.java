import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //invertir elementos de 6 elementos ingresados
       int [] numero = new int[6];
       Scanner teclado = new Scanner(System.in);
       for(int i=0; i< numero.length; i++){
        System.out.println("Ingresa un número");
        numero[i] = teclado.nextInt();
       }
       int [] array2 = new int[6];
       
       for(int i=numero.length-1; i>=0; i--){
            for(int j = 0; j<numero.length; j++){
                array2[j] = numero[i];
            }
       }

       System.out.println(Arrays.toString(array2));
    }
}
