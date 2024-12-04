package aerolinea;
public class Equipaje {
    private int cantidadMaletas;
    private double costo;

    public Equipaje(int cantidadMaletas){
        this.cantidadMaletas = cantidadMaletas;
        this.costo = calcularCosto(cantidadMaletas);
    }

    private double calcularCosto(int cantidadMaletas) {
        if (cantidadMaletas >= 1 && cantidadMaletas <= 2) {
            return 50;
        } else if (cantidadMaletas >= 3 && cantidadMaletas <= 4) {
            return 80;
        } else if (cantidadMaletas >= 5) {
            return 110;
        }
        return 0;
    }

    public int getCantidadMaletas() {
        return cantidadMaletas;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Cantidad de maletas: " + cantidadMaletas + ", Costo: " + costo;
    }
}
