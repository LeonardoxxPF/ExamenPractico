
package cuentaregresiva;

/**
 *
 * @author leonardo padilla
 */
public class CuentaRegresiva {

    public static void main(String[] args) {
        /*Iniciamos la cuenta regresiva*/
        int cuentaatras = 60;
        System.out.println("Esto es una cuenta regresiva de 60s");
        
        /*Realizamos el conteo hacia atras, vamos imprimiedo cada iteracion*/
        while (cuentaatras >=0){
            System.out.println("Cuenta regresiva:" + cuentaatras + "s");
        /*Realizamos una pausa cada iteracion con una duracionde 1000ms = 1s*/
            try{
               Thread.sleep(1000); 
            } catch
        /*Investigando: tenemos que manejar una excepcion para que permita indicarle
           al programa que se tiene que empezar a ejecutar la siguinete iteracion
            despus del sleep*/
            (InterruptedException e) {
                e.printStackTrace();
            }
        /*Disminuimos la cuenta atras para la siguiente iteracion*/
            cuentaatras--;
        }
        /*Fin del programa*/
        System.out.println("Termino la cuenta regresiva y el programa finalizo");
    }
    
}
