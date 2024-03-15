package problema2;
import java.util.Scanner;

public class ClasificacionPersonas {
    public static void main(String[] args) {
        Scanner LEER = new Scanner(System.in);
        int cantidadPersonas = 50;
        int personasMayores = 0;
        int personasMenores = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;
        int totalMujeres = 0;
        /* Vamos a iterar o pedir 50 diferentes datos de personas y para cada uno de ellos vamos a ir clasificando en una categoria
         y al final del bucle se imprime cuantos en cada categoria hay. */
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Dime el sexo, si es Masculino o Femenino " + (i + 1) + " (M/F): ");
            /* tambien he puesto i+1 para que tengamos un recuento porque numero de persona vamos cuyos datos estamos pidiendo */
            
            char sexo = LEER.next().charAt(0);
            System.out.println("Dime la edad " + (i + 1) + ": ");
            int edad = LEER.nextInt();

            Persona persona = new Persona(edad, sexo);
            /* Como se pedia que el objeto PERSONA debe ser estrucutrado de forma que tenga edad y sexo, la forma que se ma ha ocurrido es
            crear un objeto de tipo de clase Persona donde he encapsulado estos dos parametros y también hace que el código sea más legible */


            if (persona.esMayor()) {
                personasMayores++;
                if (persona.getSexo() == 'M') {
                    hombresMayores++;
                } else {
                    totalMujeres++;
                }
            } else {
                personasMenores++;
                if (persona.getSexo() == 'F') {
                    mujeresMenores++;
                    totalMujeres++;
                }
            }
        }

        double porcentajeMayores = (double) personasMayores / cantidadPersonas * 100;
        double porcentajeMujeres = (double) totalMujeres / cantidadPersonas * 100;

        System.out.println("Cantidad de personas mayores de edad: " + personasMayores);
        System.out.println("Cantidad de personas menores de edad: " + personasMenores);
        System.out.println("Cantidad de hombres mayores de edad: " + hombresMayores);
        System.out.println("Cantidad de mujeres menores de edad: " + mujeresMenores);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");

        LEER.close();
    }
}

class Persona {
    private int edad;
    private char sexo;

    public Persona(int edad, char sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

    public boolean esMayor() {
        return edad >= 18;
    }

    public char getSexo() {
        return sexo;
    }
}
