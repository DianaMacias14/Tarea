public class NumerosDivisibles{
    public static void main(String[] args){
        System.out.println("Numeros divisibles por 3");
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
        System.out.println("\nNumeros divisibles por 5" );
        for (int i = 1; i<= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}