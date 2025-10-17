public class Arma implements Inventariable {
    @Override
    public void registrar() {
        System.out.println("Arma registrada en el inventario.");
    }

    @Override
    public void borrar() {
        System.out.println("Arma eliminada del inventario.");
    }
}
