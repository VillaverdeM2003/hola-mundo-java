import java.util.List;

public class Juego {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        mazo.barajar();

        
        Jugador j1 = new Jugador("Manuel");
        Jugador j2 = new Jugador("Carlos");

       
        j1.recibirCartas(mazo.repartir(5));
        j2.recibirCartas(mazo.repartir(5));

        System.out.println(j1);
        System.out.println(j2);
        System.out.println("Cartas restantes en mazo: " + mazo.cartasRestantes());

      
        List<Carta> manoJ1 = j1.getMano();
        if (!manoJ1.isEmpty()) {
            Carta cartaDevuelta = manoJ1.get(0);
            j1.descartar(cartaDevuelta);
            mazo.agregarCartaAbajo(cartaDevuelta);
            System.out.println("\n" + j1.nombre + " devolvió " + cartaDevuelta);
        }

        System.out.println("\nCartas restantes en mazo: " + mazo.cartasRestantes());
    }
}