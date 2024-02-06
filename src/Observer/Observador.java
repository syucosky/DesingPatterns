package Observer;

public abstract class Observador{
    protected Sujeto sujeto;

    public Observador(Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    public abstract void actualizar();

}
