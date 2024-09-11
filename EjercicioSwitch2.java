
package ejerciciosjavapoo;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class EjercicioSwitch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el tipo de carro: ");
        System.out.println("1. Auto ");
        System.out.println("2. SUV ");
        System.out.println("3. camioneta ");
        int tipocarro = scanner.nextInt();
        
        String tipoSeleccionado = "";
        String colorSeleccionado = "";
        
        switch (tipocarro) {
            case 1: 
                tipoSeleccionado = "Auto ";
                break;
            case 2: 
                tipoSeleccionado = "SUV ";
                break;
            case 3:
                tipoSeleccionado = "camioneta ";
                break;
            default:
                System.out.println("Opcion invalida de tipo de carro. ");
                return;
                
        }
           System.out.println("Seleccione el color: ");
           System.out.println("1. Negro ");
           System.out.println("2. Blanco ");
           System.out.println("3. Rojo ");
           int colorcarro = scanner.nextInt();
           
           switch (colorcarro) {
               case 1:
                   colorSeleccionado = "Negro";
                   break;
               case 2: 
                   colorSeleccionado = "Blanco";
                   break;
               case 3:
                   colorSeleccionado = "Rojo";
                   break;
               default:
                   System.out.println("Opcion invalida de color");
                   return;
                   
           }
        
        System.out.println("Has seleccionado un "+ tipoSeleccionado + "de color "+ colorSeleccionado+ ".");
        
    }
   
}
