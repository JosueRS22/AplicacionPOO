package aerolinea;
public class AsientoVIP extends Asiento{

    public AsientoVIP(int numero){
        super(numero);
    }

    @Override
    public double obtenerCosto(){
        return 110;
    }

}
