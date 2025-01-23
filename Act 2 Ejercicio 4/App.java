import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    double sal_bruto, porcentaje, porc_imp, ded, sal_neto, imp;
    @SuppressWarnings("resource")
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese su salario bruto mensual");
    sal_bruto= leer.nextDouble();
    System.out.println("Ingrese el porcentaje de impuestos");
    porcentaje = leer.nextDouble();
    System.out.println("Ingrese deducciones adicionales");
    ded = leer.nextDouble();
    porc_imp = porcentaje/100;
    imp = sal_bruto * porc_imp;
    sal_neto = sal_bruto - imp - ded;
    System.out.println("Su salario neto es:"+ sal_neto);
    System.out.println("El impuesto es:"+ imp);

    }
}   