package aerolinea;
public class Pasajero {
    private String identificacion;
    private String nombre;

    public Pasajero(String identificacion, String nombre){
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Id: " + identificacion + ", Nombre: " + nombre;
    }

}
