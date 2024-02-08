package Strategy;

public class MainEstrategia {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        Estrategia estrategiaUno= new EstrategiaConcretaUno();
        Estrategia estrategiaDos= new EstrategiaConcretaDos();

        contexto.setEstrategia(estrategiaUno);
        System.out.println(contexto.ejecutarEstrategia());
        System.out.println("Cambiando estrategia");
        contexto.setEstrategia(estrategiaDos);
        System.out.println(contexto.ejecutarEstrategia());

    }
}
