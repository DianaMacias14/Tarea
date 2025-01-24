import java.util.Scanner;

public class numero{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = (int)(Math.random()*100+1);
        int n, intento=0;
        System.out.println("Ingresa un numero entero");
            n = teclado.nextInt();
       
        while (n != num) {
            if(n > num){
                System.out.println("El numero es mayor");
                intento = intento + 1;
            }else{
                System.out.println("El numero es menor");
                intento = intento + 1;
            }
            System.out.println("Ingresa un numero entero");
            n = teclado.nextInt();

        }
        System.out.println("!ADIVINASTEE¡");

        
        

    }
}
