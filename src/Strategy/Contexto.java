package Strategy;

public class Contexto {
    private Estrategia estrategia;

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public String ejecutarEstrategia() {
        return estrategia.ejecutar();
    }

}
