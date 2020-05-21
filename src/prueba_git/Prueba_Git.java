
package prueba_git;
/** Programa que lea dos cadenas
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
        
        teclado.close();
    }
    
}
