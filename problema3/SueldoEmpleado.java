package problema3;
import java.util.Scanner;

public class SueldoEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las horas que has trabajado durante la semana: ");
        int HorasTrabajadas = scanner.nextInt();
        System.out.println("Dime la tarifa que se aplica por hora ");
        double tarifa = scanner.nextDouble();

        double sueldo;

        if (HorasTrabajadas > 40) {
            int horasExtras = HorasTrabajadas - 40;
            double TarifaExtraHoras=(tarifa*(1.5));
            sueldo = (40 * tarifa) + (horasExtras * TarifaExtraHoras);
        } else {
            sueldo = HorasTrabajadas * tarifa;
        }

        System.out.println("El sueldo del trabajador total es lo siguiente sumando horas extras si las hay: " + sueldo);

        scanner.close();
    }
}
