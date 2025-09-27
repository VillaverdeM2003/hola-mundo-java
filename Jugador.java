import java.util.ArrayList;
import java.util.List;

public class Jugador {
    public String nombre;
    private List<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new ArrayList<>();
    }

    public void recibirCartas(List<Carta> nuevasCartas) {
        mano.addAll(nuevasCartas);
    }

    public void descartar(Carta c) {
        mano.remove(c);
    }

    public List<Carta> getMano() {
        return mano;
    }

    @Override
    public String toString() {
        return nombre + " tiene: " + mano;
    }
}