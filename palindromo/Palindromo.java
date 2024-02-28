
package palindromo;
import java.util.Scanner;

/**
 *
 * @author leonardo padilla
 */
public class Palindromo {

    public static void main(String[] args) {
        /*Solicitamos la palabra al usuario*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra a revisar:");
        String palabra = scanner.nextLine();

        /*Quitamos los espacios de la palabra y la pasamos a minusculas */
        palabra = palabra.toLowerCase() .replaceAll("\\s+", "");

        /* Creamos un arreglo donde almacenar la palabra */
        char[] arreglo = palabra.toCharArray();

        /* Creamos un arreglo para almacenar la palabra al reves */
        char[] arregloAlReves = new char[arreglo.length];

        /* Escribimos el arreglo hacia atras y la mandamos a imprimir*/
        for (int i = 0; i < arreglo.length; i++){
            arregloAlReves[i] = arreglo[arreglo.length - i - 1];
        }
        System.out.println(arregloAlReves);

        /*Comprobamos que las palabras sean las mismas en ambos arreglos de izquierda a derecha */
        boolean esPalindromo = true;
        for (int j = 0; j < arreglo.length; j++){
            if (arreglo[j] != arregloAlReves[j]){
                esPalindromo = false;
                break;
            }
        }

        /*Mandamos a imprimir a consola el resultado */
        if (esPalindromo){
            System.out.println("Es un palindromo");
        }
        else{
            System.out.println("No es un palindromo");
        }
    }
}
    