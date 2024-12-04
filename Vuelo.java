package aerolinea;
public class Vuelo {
    private String vueloid;
    private String origen;
    private String destino;
    private double costo;
    private String horario;
    
    public Vuelo(String vueloid, String origen, String destino, double costo, String horario){
        this.vueloid = vueloid;
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.horario = horario;
    }

    public String getVuelo(){
        return vueloid;
    }

    public String getOrigen(){
        return origen;
    }

    public String getDestino(){
        return destino;
    }

    public double getCosto(){
        return costo;
    }

    public String getHorario(){
        return horario;
    }

    @Override
    public String toString() {
        return "Vuelo: " + vueloid + ", Origen: " + origen + ", Destino: " + destino + ", Boleto: " + costo;
    }

}
