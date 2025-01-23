import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //contador de digitos
       Scanner teclado = new Scanner(System.in);
       int numero, contador=0;
       System.out.println("Ingresa un número: ");
       numero = teclado.nextInt();
       while (numero!=0){
        
        numero=numero/10;
        contador=contador+1;
       }
       if(numero<1){
        
        numero=numero/10;
        contador=contador+1;
       }
       System.out.println("Tiene: " + contador+ " digitos");
    }
}
