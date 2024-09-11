
package ejerciciosjavapoo;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class EjercicioDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de nacimientos: ");
        int N = scanner.nextInt();
        scanner.nextLine();
        
        int cantidadMasculinos = 0;
        int cantidadFemeninos = 0;
        
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese el nombre del bebé: "+ i + ":");
            String nombre = scanner.nextLine();
            
            String sexo;
            do {
                System.out.println("Ingrese el sexo del bebe (M para masculino, F para femenino):");
                sexo = scanner.nextLine().toUpperCase();               
            }
            while (!sexo.equals("M")&& !sexo.equals("F"));
            if (sexo.equals("M")){
                cantidadMasculinos++;
            }
            else {
                cantidadFemeninos++;
            }
        }
        System.out.println("Total de bebés Masculinos: "+ cantidadMasculinos);
        System.out.println("Total de bebés Femeninas: "+cantidadFemeninos);
        
    }
 
}
