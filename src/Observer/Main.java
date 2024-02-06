package Observer;

public class Main {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();
        new ObservadorUno(sujeto);
        new ObservadorDos(sujeto);

        System.out.println("Primer cambio de estado: 1 dls");
        sujeto.setEstado(1);
        System.out.println("-------------------");
        System.out.println("Segundo cambio de estado: 2 dls");
        sujeto.setEstado(2);
    }
}
