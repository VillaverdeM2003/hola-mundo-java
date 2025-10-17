public class Obstaculo implements ElementoDinamico, Destruible {
    @Override
    public void mover() {
        System.out.println("El obstáculo se mueve ligeramente por el entorno.");
    }

    @Override
    public void destruye() {
        System.out.println("El obstáculo ha sido destruido.");
    }
}
