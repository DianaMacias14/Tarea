import java.util.Scanner;
public class palindromo {
    static Scanner scanner= new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Ingresa un texto");
            String texto = scanner.nextLine();
        if (esPalindromo(texto)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int inicio = 0;
        int fin = textoLimpio.length() - 1;

        while (inicio < fin) {
            if (textoLimpio.charAt(inicio) != textoLimpio.charAt(fin)) {
                return false; 
            }
            inicio++;
            fin--;
        }

        return true; 
    }
}

