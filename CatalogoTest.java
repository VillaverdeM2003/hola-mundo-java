package practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatalogoTest {

    @Test
    void testAgregarPelicula() {
        Catalogo catalogo = new Catalogo();
        Pelicula pelicula = new Pelicula("Titanic", "James Cameron", 1997, "Romance", 195);

        catalogo.agregarPelicula(pelicula);

        // Espero que el catálogo tenga 1 película
        String resultado = catalogo.toString();
        assertEquals("El catálogo tiene 1 películas.", resultado);
    }

    @Test
    void testBuscarPeliculaPorTitulo() {
        Catalogo catalogo = new Catalogo();
        Pelicula pelicula = new Pelicula("Avatar", "James Cameron", 2009, "Ciencia Ficción", 162);

        catalogo.agregarPelicula(pelicula);

        // Busco la película que sí existe
        String resultado = catalogo.buscarPeliculaPorTitulo("Avatar");
        assertEquals(pelicula.getInformacion(), resultado);

        // Busco una película que NO existe
        String resultado2 = catalogo.buscarPeliculaPorTitulo("Inception");
        assertEquals("No se encontró la película con el título: Inception", resultado2);
    }

    @Test
    void testGetPeliculas() {
        Catalogo catalogo = new Catalogo();

        // Caso catálogo vacío
        assertEquals("El catálogo está vacío.", catalogo.getPeliculas());

        // Agrego dos películas
        Pelicula p1 = new Pelicula("Gladiator", "Ridley Scott", 2000, "Acción", 155);
        Pelicula p2 = new Pelicula("Interstellar", "Christopher Nolan", 2014, "Ciencia Ficción", 169);

        catalogo.agregarPelicula(p1);
        catalogo.agregarPelicula(p2);

        // El resultado debe contener la información de las dos
        String resultado = catalogo.getPeliculas();
        assertTrue(resultado.contains("Gladiator"));
        assertTrue(resultado.contains("Interstellar"));
    }
}
