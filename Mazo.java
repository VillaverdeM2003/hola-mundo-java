import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
        restablecerMazo();
    }

    public void restablecerMazo() {
        cartas.clear();
        for (Carta.Tipo t : Carta.Tipo.values()) {
            for (int v = 1; v <= 13; v++) {
                cartas.add(new Carta(v, t));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> repartir(int cantidad) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad && !cartas.isEmpty(); i++) {
            mano.add(cartas.remove(0));
        }
        return mano;
    }

    public void agregarCartaAbajo(Carta c) {
        cartas.add(c);
    }

    public int cartasRestantes() {
        return cartas.size();
    }

    public void mostrarMazo() {
        for (Carta c : cartas) {
            System.out.println(c);
        }
    }
}

