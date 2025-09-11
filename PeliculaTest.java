package practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeliculaTest {

    @Test
    void testEsClasica() {
        Pelicula peliculaVieja = new Pelicula("Casablanca", "Michael Curtiz", 1942, "Drama", 102);
        Pelicula peliculaNueva = new Pelicula("Avengers: Endgame", "Anthony Russo", 2019, "Acción", 181);

        assertTrue(peliculaVieja.esClasica(), "La película debería ser considerada clásica");
        assertFalse(peliculaNueva.esClasica(), "La película no debería ser considerada clásica");
    }

    @Test
    void testGetInformacion() {
        Pelicula pelicula = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia ficción", 148);
        String info = pelicula.getInformacion();

        assertTrue(info.contains("Título: Inception"));
        assertTrue(info.contains("Director: Christopher Nolan"));
        assertTrue(info.contains("Año de estreno: 2010"));
        assertTrue(info.contains("Género: Ciencia ficción"));
        assertTrue(info.contains("Duración: 148 minutos"));
        assertTrue(info.contains("¿Clásica?: Sí") || info.contains("¿Clásica?: No"));
    }

    @Test
    void testToString() {
        Pelicula pelicula = new Pelicula("Titanic", "James Cameron", 1997, "Romance", 195);
        String str = pelicula.toString();
        
        assertEquals("Titanic (1997) - Romance - 195 min - Dir: James Cameron", str);
    }
}
