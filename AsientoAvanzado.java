package aerolinea;
public class AsientoAvanzado extends Asiento{

    public AsientoAvanzado(int numero){
        super(numero);
    }

    @Override
    public double obtenerCosto(){
        return 80;
    }
}
