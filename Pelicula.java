public class Pelicula {
    private String titulo;
    private String director;
    private int anoEstreno;  
    private String genero;
    private int duracion;

    // Constructor
    public Pelicula(String titulo, String director, int anoEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anoEstreno =  anoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    // Devuelve toda la info de la película
    public String getInformacion() {
        String info = "Título: " + titulo + "\n";
        info = info + "Director: " + director + "\n";
        info = info + "Año de estreno: " + anoEstreno + "\n";
        info = info + "Género: " + genero + "\n";
        info = info + "Duración: " + duracion + " minutos\n";

        if (esClasica()) {
            info = info + "¿Clásica?: Sí";
        } else {
            info = info + "¿Clásica?: No";
        }

        return info;
    }

    // Si la pelicula es clásica tiene más de 25 años
    public boolean esClasica() {
        int anoActual = 2025;
        int edad = anoActual -  anoEstreno;
        if (edad > 25) {
            return true;
        } else {
            return false;
        }
    }

    // Representación en texto del objeto
    public String toString() {
        return titulo + " (" + anoEstreno + ") - " + genero + " - " + duracion + " min - Dir: " + director;
    }

    // Getter para buscar por título
    public String getTitulo() {
        return titulo;
    }
}
