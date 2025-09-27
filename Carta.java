public class Carta {

    public enum Tipo {
        DIAMANTE, CORAZON, TREBOL, PICAS
    }   
    private int valor;
    private Tipo tipo;

    
    public Carta(int valor, Tipo tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        String valorDelString;
        switch (valor) {
            case 1:  valorDelString = "A"; 
            break;
            case 11: valorDelString = "J"; 
            break;
            case 12: valorDelString = "Q"; 
            break;
            case 13: valorDelString = "K"; 
            break;
            default: valorDelString = String.valueOf(valor);//Para valores del 2-10.
        }
        return valorDelString + " de " + tipo; 
    }
}
