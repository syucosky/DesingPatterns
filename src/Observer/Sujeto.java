package Observer;

import java.util.List;
import java.util.ArrayList;
public class Sujeto {
    private List<Observador> obs = new ArrayList<Observador>();
    private int estado;

    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado = estado;
        notificarObservadores();
    }

    public void agregarObservador(Observador observador){
        obs.add(observador);
    }

    public void notificarObservadores(){
        obs.forEach(observador -> observador.actualizar());
    }
}
