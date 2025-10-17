public class CheckPoint implements Inventariable {
    @Override
    public void registrar() {
        System.out.println("Checkpoint guardado.");
    }

    @Override
    public void borrar() {
        System.out.println("Checkpoint eliminado.");
    }
}
