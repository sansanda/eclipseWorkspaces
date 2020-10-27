package others;

import java.util.Scanner;

public class BusquedaSecuencial {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        int arreglo[] = {1, 2, 4, 5, 6, 7, 8, 9,};
        int dato;
        //para saber si ya encontramos o no el valor
        boolean band = false;

        System.out.println("Digite un número del 1 al 10 para buscarlo en el arreglo");
        
        
        dato = Integer.parseInt(scanner.nextLine());

        int i = 0;
        while (i < 8 && band == false) {
            if (arreglo[i] == dato) {
                band = true;
            }
            i++;
        }
        if (band == false) {
        	System.out.println("El número no se encontró en el arreglo.");
        } else {
        	System.out.println("El número se ha encontrado en el arreglo en la posición: " + (i - 1));
        }
    }
}