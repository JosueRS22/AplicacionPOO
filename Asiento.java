package aerolinea;
public abstract class Asiento {
    private int numero;
    private boolean ocupado;

    public Asiento(int numero){
        this.numero = numero;
        this.ocupado = false;
    }

    public int getNumero(){
        return numero;
    }

    public boolean getOcupado(){
        return ocupado;
    }

    public void ocuparAsiento(){
        if(!ocupado){
            ocupado = true;
        } else {
            System.out.println("Asiento no disponible.");
        }
    }

    public abstract double obtenerCosto();

    @Override
    public String toString() {
        return ("Asiento número: " + numero + ", Tipo de asiento: " + this.getClass().getSimpleName() + ", Costo: " + obtenerCosto());
    }


}
