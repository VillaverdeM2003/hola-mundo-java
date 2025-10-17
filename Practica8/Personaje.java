public class Personaje implements ElementoDinamico, Destruible {
    @Override
    public void mover() {
        System.out.println("El personaje se mueve por el nivel.");
    }

    @Override
    public void destruye() {
        System.out.println("El personaje ha sido derrotado.");
    }
}
