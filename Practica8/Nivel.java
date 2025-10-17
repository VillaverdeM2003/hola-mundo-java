public class Nivel {
    // Relaciones (composición y agregación)
    private Inventario inventario;
    private Obstaculo obstaculo;
    private Personaje personaje;
    private Utileria utileria;
    private CheckPoint checkpoint;

    // Constructor
    public Nivel() {
        inventario = new Inventario();  // Agregación
        obstaculo = new Obstaculo();    // Composición
        personaje = new Personaje();    // Composición
        utileria = new Utileria();      // Composición
        checkpoint = new CheckPoint();  // Composición
    }

    // Métodos del nivel
    public void iniciar() {
        System.out.println("Nivel iniciado.");
        inventario.mostrarContenido();
        checkpoint.registrar();
    }

    public void moverElementosDinamicos() {
        System.out.println("\nMoviendo elementos dinámicos...");
        personaje.mover();
        obstaculo.mover();
        utileria.mover();
    }

    public void destruirElementos() {
        System.out.println("\nDestruyendo elementos...");
        personaje.destruye();
        obstaculo.destruye();
    }

    public void finalizar() {
        System.out.println("\nNivel completado.");
        checkpoint.borrar();
    }
}
