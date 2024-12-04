package aerolinea;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vuelo vuelo1 = new Vuelo("AF123", "Madrid", "Paris", 150.0, "8am");
        ArrayList<Asiento> asientos = new ArrayList<>();
        asientos.add(new AsientoBasico(1));
        asientos.add(new AsientoBasico(2));
        asientos.add(new AsientoAvanzado(3));
        asientos.add(new AsientoVIP(4));

        System.out.println("Bienvenido al sistema de reservas de vuelos.");
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Realizar reserva");
            System.out.println("2. Ver asientos disponibles");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("\nIntroduce el nombre del pasajero: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el DNI del pasajero: ");
                    String dni = scanner.nextLine();
                    Pasajero pasajero = new Pasajero(nombre, dni);

                    System.out.println("\nSelecciona el tipo de asiento:");
                    System.out.println("1. Básico");
                    System.out.println("2. Avanzado");
                    System.out.println("3. VIP");
                    System.out.print("Elige una opción: ");
                    int tipoAsiento = scanner.nextInt();

                    Asiento asientoSeleccionado = null;
                    for (Asiento asiento : asientos) {
                        if (asiento instanceof AsientoBasico && tipoAsiento == 1 && !asiento.getOcupado()) {
                            asientoSeleccionado = asiento;
                            break;
                        } else if (asiento instanceof AsientoAvanzado && tipoAsiento == 2 && !asiento.getOcupado()) {
                            asientoSeleccionado = asiento;
                            break;
                        } else if (asiento instanceof AsientoVIP && tipoAsiento == 3 && !asiento.getOcupado()) {
                            asientoSeleccionado = asiento;
                            break;
                        }
                    }

                    if (asientoSeleccionado == null) {
                        System.out.println("No hay asientos disponibles para el tipo seleccionado.");
                        continue;
                    }

                    // Ocupar el asiento
                    asientoSeleccionado.ocuparAsiento();

                    // Crear equipaje
                    System.out.print("\nIntroduce la cantidad de maletas: ");
                    int maletas = scanner.nextInt();
                    Equipaje equipaje = new Equipaje(maletas);

                    // Crear y mostrar la reserva
                    Reserva reserva = new Reserva(pasajero, vuelo1, asientoSeleccionado, equipaje);
                    System.out.println("\nReserva realizada: ");
                    System.out.println(reserva);
                    break;

                case 2:
                    System.out.println("\nAsientos disponibles:");
                    boolean hayDisponibles = false;
                    for (Asiento asiento : asientos) {
                        if (!asiento.getOcupado()) {
                            System.out.println(asiento);
                            hayDisponibles = true;
                        }
                    }
                    if (!hayDisponibles) {
                        System.out.println("No hay asientos disponibles.");
                    }
                    break;

                case 3:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de reservas.");
                    break;
                
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
