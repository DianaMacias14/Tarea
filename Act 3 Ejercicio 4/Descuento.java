import java.util.Scanner;

public class Descuento{
     public static void main(String[] args) {
          @SuppressWarnings("resource")
          Scanner scanner= new Scanner(System.in);
          System.out.print("Ingresa el precio de un producto");
          double precio=scanner.nextDouble();
          double descuento=0.0;
          
          if (precio <= 100){
               descuento=0.0;
          }else if (precio> 100 && precio <=200){
               descuento=0.10;
          }else if (precio> 200 && precio <=500){
               descuento=0.20;
          }else if (precio> 500){
               descuento=0.25;
          }
     
          double montoDescuento = precio *descuento;

          System.out.println("Precio:$"+ precio);
          System.out.println("Descuento: $"+ montoDescuento);
     }
}

     

