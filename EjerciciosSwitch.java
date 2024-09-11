
package ejerciciosjavapoo;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class EjerciciosSwitch {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Bienvenido a la tómbola del supermercado. ");
        System.out.println("Por favor ingresa su género (Hombre/Mujer) ");
        
        
        String genero = scanner.nextLine().toLowerCase();
        
        
        int bolita;
        
        if (genero.equals("hombre")){
            System.out.println("Por favor saque una bolita y digita el numero que te ha tocado");
            bolita = scanner.nextInt();
            
            switch (bolita){
                case 1:
                    System.out.println("!Felicidades! Has ganado un desodorante. ");
                    break;
                case 2: 
                    System.out.println("!Felicidades! Has ganado un Six-Pack de cerveza. ");
                    break;
                case 3:
                    System.out.println("!Felicidades! Has ganado una camiseta. ");
                    break;
                case 4:
                    System.out.println("!Felicidades! Has ganado una pantaloneta. ");
                case 5: 
                    System.out.println("!Felicidades! Has ganado una sudadera. ");
                default:
                    System.out.println("Numero de bolita no válido, el número debe ser entre 1 y 5. ");
                    break;
                    
                    
            }
            
        }
        else if (genero.equals("mujer")){
            System.out.println("Por favor, saque una bolita y digite el número que te ha tocado");
            bolita = scanner.nextInt();
            
            switch (bolita){
                case 1:
                    System.out.println("!Felicidades! Has ganado una lócion. ");
                    break;
                case 2: 
                    System.out.println("!Felicidades! Has ganado un bikini. ");
                    break;
                case 3:
                    System.out.println("!Felicidades! Has ganado una crema para la cara. ");
                    break;
                case 4: 
                    System.out.println("!Felicidades! Has ganado una plancha para el cabello. ");
                    break;
                case 5: 
                    System.out.println("!Felicidades! Has ganado un esmalte para uñas. ");
                    break;
                default:
                    System.out.println("Numero de bolita no válido,el número debe ser entre 1 y 5");
                    break;
                    
            }
            
                    
                    }
        else {
            System.out.println("Género no válido, debe ser 'Hombre' o 'Mujer'. ");
            
                 
        }
        
        
        
    }
 
}
