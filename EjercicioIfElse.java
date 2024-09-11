
package ejerciciosjavapoo;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class EjercicioIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double PrecioComputadora = 500.0;
        
        System.out.println("Ingrese el número de computadoras que desea comprar: ");
        int cantidad = scanner.nextInt();
        
        double Descuento = 0;
        double TotalSinDescuento = cantidad * PrecioComputadora;
        double TotalConDescuento;
        
        if (cantidad < 5){
            Descuento = 0.10;
        }
        else if (cantidad >= 5 && cantidad < 10) {
           Descuento = 0.20;
        }
        else if (cantidad >= 10) {
            Descuento = 0.40;
        }
        TotalConDescuento = TotalSinDescuento - (TotalSinDescuento * Descuento);
        
        System.out.println("El total sin descuento es: U$"+ TotalSinDescuento);
        System.out.println("El descuento aplicado es: "+ (Descuento * 100)+"%");
        System.out.println("El total con descuento es: U$ "+TotalConDescuento);
        
        
    }
 
}
