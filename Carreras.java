package Carreras;
import java.util.Scanner;


public class Carreras {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido por ingresar los datos solicitados");
        System.out.print("Ingrese la cantidad de vehiculos: ");
        int numVehiculos = scanner.nextInt();

        for (int i = 1; i <= numVehiculos; i++) {
            System.out.println("Vehiculo #" + i);
            calcularVelocidadPromedioVehiculo(scanner);
        }

        scanner.close();
        System.out.println("Gracias!");
    }

    private static void calcularVelocidadPromedioVehiculo(Scanner scanner) {
        int numVueltas;
        double tiempoTotal = 0.0;

        System.out.print("Ingrese la cantidad de vueltas recorridas: ");
        numVueltas = scanner.nextInt();

        for (int i = 1; i <= numVueltas; i++) {
            System.out.print("Ingrese el tiempo en segundos de la vuelta #" + i + ": ");
            double tiempoVuelta = scanner.nextDouble();
            tiempoTotal += tiempoVuelta;
        }

        double velocidadPromedio = calcularVelocidadPromedio(tiempoTotal, numVueltas);
        System.out.println("La velocidad promedio del vehiculo es: " + velocidadPromedio + " m/s");
    }

    private static double calcularVelocidadPromedio(double tiempoTotal, int numVueltas) {
        if (numVueltas == 0) {
            return 0.0;
        }
        return numVueltas / tiempoTotal;
    }
}