public class Main {
    public static void main(String[] args) {
        // Aqui creo el
        Catalogo catalogo = new Catalogo();

        // Crear 3 películas
        Pelicula p1 = new Pelicula("Matrix", "Hermanas Wachowski", 1999, "Ciencia ficción", 136);
        Pelicula p2 = new Pelicula("Titanic", "James Cameron", 1997, "Romance", 195);
        Pelicula p3 = new Pelicula("Avatar", "James Cameron", 2009, "Ciencia ficción", 162);

        // Agregar al catálogo
        catalogo.agregarPelicula(p1);
        catalogo.agregarPelicula(p2);
        catalogo.agregarPelicula(p3);

        // Mostrar todas
        System.out.println(catalogo.getPeliculas());

        // Buscar una
        System.out.println("Buscando Titanic:");
        System.out.println(catalogo.buscarPeliculaPorTitulo("Titanic"));
    }
}