import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Pelicula> peliculas;

    // Constructor de la clase "Catalogo"
    public Catalogo() {
        peliculas = new ArrayList<Pelicula>();
    }

    // Agregar película
    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    // Mostrar todas las películas
    public String getPeliculas() {
        if (peliculas.size() == 0) {
            return "El catálogo está vacío.";
        }

        String info = "";
        int i = 1;

        for (Pelicula p : peliculas) {
            info = info + "Película " + i + ":\n";
            info = info + p.getInformacion() + "\n\n";
            i = i + 1;
        }

        return info;
    }

    // Buscar película por título
    public String buscarPeliculaPorTitulo(String titulo) {
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equals(titulo)) {
                return p.getInformacion();
            }
        }
        return "No se encontró la película con el título: " + titulo;
    }

    // Representación del catálogo
    public String toString() {
        return "El catálogo tiene " + peliculas.size() + " películas.";
    }
}
