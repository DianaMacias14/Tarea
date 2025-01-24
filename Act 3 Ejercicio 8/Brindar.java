import java.util.Scanner;

public class Brindar{

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre de una pelicula, artista, serie:(Harry Styles, Yo antes de ti, Diarios de Vampiros, Romeo Santos, A el no le gustas tanto)" );
        String prefer= teclado.nextLine().toLowerCase();
        prefer=teclado.nextLine();

        switch (prefer) {
            case "Harry Styles":
            System.out.println("Harry Edward Styles es un cantante, compositor y actor británico" );
                break;       
            case " Yo antes de ti":
            System.out.println(" Yo antes de ti es una pelicula. La vida de Louisa Clark, una chica alegre y alocada, que va empalmando un trabajo con otro para ayudar a su familia a subsistir" );
                break;
            case "Diarios de Vampiros":
            System.out.println("Harry Edward Styles es un cantante, compositor y actor británico" );
                break;
            case "Romeo Santos":
            System.out.println("Anthony Santos, conocido artísticamente como Romeo Santos, es un cantante, productor discográfico, compositor, actor estadounidense. Es considerado en la mayor parte de América como el Rey de la Bachata" );
                break;
            case "A el no le gustas tanto":
            System.out.println("A el no le gustas tanto es una pelicula que trata de Amigos y amantes intentan navegar a través de las complejidades de las relaciones modernas, algunas veces malinterpretando las verdaderas intenciones del sexo opuesto" );
                break;
            default:
            System.out.println("Lo siento no encontre esa informacion");
                break;   
        }
    }
}
