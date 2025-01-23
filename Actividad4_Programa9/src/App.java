import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //calculadora basica con menu
        Double numero1, numero2, operacion;
        String opcion, continuar;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un númro");
        numero1 = teclado.nextDouble();
        System.out.println("Ingresa otro númro");
        numero2 = teclado.nextDouble();
        System.out.println("Ingresa la operación(suma, resta, multiplicación, división)");
        opcion = teclado.next();
        switch (opcion) {
            case "suma":
            
                operacion = numero1+ numero2;
                System.out.println("La suma es: " + operacion);
                System.out.println("¿Deseas continuar o salir?");
                continuar = teclado.next();
            
                while (continuar=="continuar");
                System.out.println("Ingresa un númro");
        numero1 = teclado.nextDouble();
        System.out.println("Ingresa otro númro");
        numero2 = teclado.nextDouble();;
        operacion = numero1 + numero2;
                System.out.println("La suma es: " + operacion);
                while (continuar=="salir");
                System.out.println("Salio de la calculadora");
                break;
            
                case "resta":
              
                    operacion = numero1 - numero2;
                    System.out.println("La resta es: " + operacion);
                    System.out.println("¿Deseas continuar o salir?");
                    continuar = teclado.next();
                
                    while (continuar=="continuar");
                    System.out.println("Ingresa un númro");
            numero1 = teclado.nextDouble();
            System.out.println("Ingresa otro númro");
            numero2 = teclado.nextDouble();
            operacion = numero1 - numero2;
                    System.out.println("La resta es: " + operacion);
                    while (continuar=="salir");
                    System.out.println("Salio de la calculadora");
                    break;
                    
                    case "multiplicacion":
                    
                        operacion = numero1 * numero2;
                        System.out.println("La multiplicacion es: " + operacion);
                        System.out.println("¿Deseas continuar o salir?");
                        continuar = teclado.next();
                    
                        while (continuar=="continuar");
                        System.out.println("Ingresa un númro");
                numero1 = teclado.nextDouble();
                System.out.println("Ingresa otro númro");
                numero2 = teclado.nextDouble();
                operacion = numero1 * numero2;
                        System.out.println("La multiplicacion es: " + operacion);
                        while (continuar=="salir");
                        System.out.println("Salio de la calculadora");
                        break;

                        case "division":
                        if(numero2>0){
                            operacion = numero1/numero2;
                            System.out.println("La división es: " + operacion);
                            System.out.println("¿Deseas continuar o salir?");
                            continuar = teclado.next();
                        
                            while (continuar=="continuar");
                            System.out.println("Ingresa un númro");
                    numero1 = teclado.nextDouble();
                    System.out.println("Ingresa otro númro");
                    numero2 = teclado.nextDouble();
                    operacion = numero1/numero2;
                            System.out.println("La divisón es: " + operacion);
                            while (continuar=="salir");
                            System.out.println("Salio de la calculadora");
                        }else{
                            System.out.println("No se puede dividir entre 0");
                        }
                            break;    
            default:
            System.out.println("No existe la operación solicitada");
        }
    }
}
