package problema1;
import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        Scanner LEER = new Scanner(System.in);
        System.out.println("Dime un número");
        int numero = LEER.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El nùmero introducido es un numero par");
            System.out.println("A continuación se pueden ver todos los numeros pares hasta 0");
            for (int i = numero; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("El numero introducido es un numero impar.");
            System.out.println("A continuación se pueden ver todos los números impares hasta 1");
            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
        LEER.close();
    }
}
