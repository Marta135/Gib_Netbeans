
package prueba_git;
/** Programa que lea dos cadenas e indique cual es mayor
 * * @author marti
 */
import java.util.Scanner;

public class Prueba_Git {

    public static void main(String[] args) {
        
        String cadena1, cadena2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introudce una cadena: ");
        cadena1 =teclado.next();
        System.out.print("Introudce otra cadena: ");
        cadena2 =teclado.next();
        
        System.out.println(cadena1.compareTo(cadena2)<0?
                "La primera cadena introducida es mayor"
                :cadena1.compareTo(cadena2) == 0? "Son iguales de tamaño"
                :"La segunda cadena introducida es mayor");
        
        teclado.close();
    }
    
}
