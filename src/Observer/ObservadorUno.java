package Observer;

public class ObservadorUno extends Observador{

    private int valorDls = 1160;

    public ObservadorUno(Sujeto sujeto){
        super(sujeto);
    }
    @Override
    public void actualizar() {
        System.out.println("De Dls a Peso Ars: " + valorDls * sujeto.getEstado());
    }
}
