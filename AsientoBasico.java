package aerolinea;
public class AsientoBasico extends Asiento{

    public AsientoBasico(int numero){
        super(numero);
    }

    @Override
    public double obtenerCosto(){
        return 50;
    }
}
