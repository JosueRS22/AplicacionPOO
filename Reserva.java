package aerolinea;
public class Reserva {
    private Pasajero pasajero;
    private Vuelo vuelo;
    private Asiento asiento;
    private Equipaje equipaje;

    public Reserva(Pasajero pasajero, Vuelo vuelo, Asiento asiento, Equipaje equipaje) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.equipaje = equipaje;
    }

    public double calcularTotal() {
        double precioAsiento = asiento.obtenerCosto();
        return precioAsiento + equipaje.getCosto() + vuelo.getCosto();
    }

    @Override
    public String toString() {
        return "El pasajero: " + pasajero + ", en el vuelo: " + vuelo + ", con el asiento: " + asiento + ", con equipaje: " + equipaje + ", pagará: " + calcularTotal();
    }

}
