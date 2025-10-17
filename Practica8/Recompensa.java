public class Recompensa implements Inventariable {
    @Override
    public void registrar() {
        System.out.println("Recompensa registrada en el inventario.");
    }

    @Override
    public void borrar() {
        System.out.println("Recompensa eliminada del inventario.");
    }
}
