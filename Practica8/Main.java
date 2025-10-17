public class Main {
    public static void main(String[] args) {
        // Crear dos niveles distintos
        Nivel nivel1 = new Nivel();
        Nivel nivel2 = new Nivel();

        // Simulación del primer nivel
        System.out.println("=== NIVEL 1 ===");
        nivel1.iniciar();
        nivel1.moverElementosDinamicos();
        nivel1.destruirElementos();
        nivel1.finalizar();

        // Simulación del segundo nivel
        System.out.println("\n=== NIVEL 2 ===");
        nivel2.iniciar();
        nivel2.moverElementosDinamicos();
        nivel2.destruirElementos();
        nivel2.finalizar();
    }
}
