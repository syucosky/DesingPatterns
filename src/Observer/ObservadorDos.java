package Observer;

public class ObservadorDos extends Observador{
    private double valorDls = 0.20;

    public ObservadorDos(Sujeto sujeto){
        super(sujeto);
    }
    @Override
    public void actualizar() {
        System.out.println("De Dls a Real: " + valorDls * sujeto.getEstado());
    }
}
