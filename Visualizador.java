import java.awt.*;

public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        Canvas canvas = Canvas.getCanvas();

        int ancho = 120;
        int alto = 160 ;


        
        Rectangle colorCarta = new Rectangle(p.getX(), p.getY(), ancho, alto);
        canvas.draw(new Object(), "black", colorCarta);

       
        String valor = getValorString(c.getValor());
        canvas.componentesCarta(valor, p.getX()+7, p.getY()+25, "white");

        
        String simbolo = getSimbolo(c.getTipo());
        int centroX = p.getX() + ancho / 2 - 5;
        int centroY = p.getY() + alto / 2;
        canvas.componentesCarta(simbolo, centroX, centroY, "red");
        
    }

    
    private static String getValorString(int valor) {
        switch (valor) {
            case 1:  return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(valor);
        }
    }

    private static String getSimbolo(Carta.Tipo tipo) {
        switch (tipo) {
            case DIAMANTE: return "♦";
            case CORAZON:  return "♥";
            case TREBOL:   return "♣";
            case PICAS:    return "♠";
            default:       return "?";
        }
        
    }
    
}
