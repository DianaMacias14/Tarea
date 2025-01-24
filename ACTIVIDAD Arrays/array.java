import java.util.Scanner;
public class array {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner= new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0 ;
        System.out.println("Ingresa numeros enteros");

        for(int i=0; i<numeros.length; i++){
            System.out.println("Numero"+ (i+1) + ":");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
    }
    System.out.println("La suma de los numero es:"+ suma);
    }
}