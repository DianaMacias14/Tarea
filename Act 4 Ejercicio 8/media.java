import java. util.Scanner;
public class media{
    public static Scanner scanner;
    
        public static void main(String[] args) {
            try (/*@SuppressWarnings({ "resource", "unused" })*/
            Scanner scanner = new Scanner(System.in)) {
                int suma = 0;
                int contador = 0;
                while (true) {
                    System.out.println("Ingresa un numero:");
                        int numero= scanner.nextInt();
                if (numero <0 ){
                    break;
                }
                suma += numero;
                contador ++;            
                }
                if (contador>0){
                    double media = (double) suma/contador;
                    System.out.printf("La media es:"+media);
                }
                else {
                    System.out.println("No se han ingresado numeros positivos:");   
                }
            }
    }
}

