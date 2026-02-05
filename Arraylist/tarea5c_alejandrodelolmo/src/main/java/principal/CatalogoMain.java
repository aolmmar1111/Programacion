package principal;

import java.time.LocalDate;

import Estudiante.Estudiante;
import Estudiante.ListaPrestamo;
import Estudiante.Prestamo;
import libro.Libro;

public class CatalogoMain {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Alejandro", "Del olmo", "87654323I");
        Estudiante est2 = new Estudiante("Alejandro", "paez", "88754323I");
        Libro l1 = new Libro();
        Libro l2 = new Libro("titulo", "aturo", 8767564534332L, LocalDate.now(), true, Libro.Genero.FICCION);

        Prestamo p1 = new Prestamo(LocalDate.now(), l1, est1, 1);
        Prestamo p2 = new Prestamo(LocalDate.now(), l2, est2, 2);

        ListaPrestamo prestamos1 = new ListaPrestamo();
        prestamos1.Guardar(p1);
        prestamos1.Guardar(p2);
        prestamos1.BorrarPrestamo(1);
        prestamos1.BuscarPrestamoPorID(1);
        prestamos1.BuscarPrestamosDeUnLibro(l1);
        prestamos1.OrdenarListaPorId();
        prestamos1.OrdenarListaPorFechaInicio();
        prestamos1.OrdenarListaPorTitulo();
    }
}
