public class Main {
    public static void main(String[] args) {
        
        Carta carta1 = new Carta(1, Carta.Tipo.PICAS);
        Visualizador.carta(carta1, new Posicion(200, 50));
    }
}