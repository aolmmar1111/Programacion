package principal;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Estudiante.CarteraEstudiante;
import Estudiante.Estudiante;
import Estudiante.ListaPrestamo;
import Estudiante.Prestamo;
import libro.Libro;

public class Main2 {
    
    private static CarteraEstudiante carteraEstudiantes = new CarteraEstudiante();
    private static ListaPrestamo listaPrestamos = new ListaPrestamo();
    private static ArrayList<Libro> catalogoLibros = new ArrayList<>();
    private static int contadorIdPrestamo = 1;

    public static void main(String[] args) {
        cargarDatosPrueba();
        
        String opcion;
        do {
            opcion = mostrarMenuPrincipal();
            if (opcion != null) {
                ejecutarOpcion(opcion);
            }
        } while (opcion != null && !opcion.equals("0"));
        
        JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
    }

    private static String mostrarMenuPrincipal() {
        return JOptionPane.showInputDialog(null, """
            ═══════════════════════════════════════════
                  SISTEMA DE GESTIÓN BIBLIOTECA
            ═══════════════════════════════════════════
            
            1️⃣  Gestión de Libros
            2️⃣  Gestión de Estudiantes
            3️⃣  Gestión de Préstamos
            4️⃣  Consultas y Reportes
            0️⃣  Salir
            
            Selecciona una opción:
            """, "Menú Principal", JOptionPane.QUESTION_MESSAGE);
    }

    private static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1" -> menuLibros();
            case "2" -> menuEstudiantes();
            case "3" -> menuPrestamos();
            case "4" -> menuConsultas();
            case "0" -> {}
            default -> JOptionPane.showMessageDialog(null, "❌ Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ============ MENÚ LIBROS ============
    private static void menuLibros() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(null, """
                ─── GESTIÓN DE LIBROS ───
                
                1. Añadir libro
                2. Ver todos los libros (Consola)
                3. Buscar libro por ISBN
                4. Modificar libro
                5. Eliminar libro
                6. Ver géneros disponibles
                7. Prestar/Devolver libro
                0. Volver
                
                Opción:
                """, "Gestión de Libros", JOptionPane.QUESTION_MESSAGE);

            if (opcion == null) break;
            
            switch (opcion) {
                case "1" -> añadirLibro();
                case "2" -> verTodosLosLibros();
                case "3" -> buscarLibroPorIsbn();
                case "4" -> modificarLibro();
                case "5" -> eliminarLibro();
                case "6" -> verGeneros();
                case "7" -> prestarDevolverLibro();
                case "0" -> {}
                default -> JOptionPane.showMessageDialog(null, "❌ Opción inválida");
            }
        } while (opcion != null && !opcion.equals("0"));
    }

    private static void añadirLibro() {
        try {
            String titulo = JOptionPane.showInputDialog(null, "Título del libro:", "Añadir Libro", JOptionPane.QUESTION_MESSAGE);
            if (titulo == null) return;
            
            String autor = JOptionPane.showInputDialog(null, "Autor:", "Añadir Libro", JOptionPane.QUESTION_MESSAGE);
            if (autor == null) return;
            
            String isbnStr = JOptionPane.showInputDialog(null, "ISBN (13 dígitos):", "Añadir Libro", JOptionPane.QUESTION_MESSAGE);
            if (isbnStr == null) return;
            Long isbn = Long.parseLong(isbnStr);
            
            String añoStr = JOptionPane.showInputDialog(null, "Año de publicación:", "Añadir Libro", JOptionPane.QUESTION_MESSAGE);
            if (añoStr == null) return;
            int año = Integer.parseInt(añoStr);
            
            String mesStr = JOptionPane.showInputDialog(null, "Mes de publicación (1-12):", "Añadir Libro", JOptionPane.QUESTION_MESSAGE);
            if (mesStr == null) return;
            int mes = Integer.parseInt(mesStr);
            
            String diaStr = JOptionPane.showInputDialog(null, "Día de publicación:", "Añadir Libro", JOptionPane.QUESTION_MESSAGE);
            if (diaStr == null) return;
            int dia = Integer.parseInt(diaStr);
            
            LocalDate fecha = LocalDate.of(año, mes, dia);
            
            String generoOpc = JOptionPane.showInputDialog(null, """
                Selecciona el género:
                
                1. NOVELA - Historias con elementos mágicos
                2. FICCION - Obra basada en hechos imaginarios
                3. POESIA - Composición literaria con ritmo
                4. RELATO - Narración breve en prosa
                
                Opción:
                """, "Añadir Libro", JOptionPane.QUESTION_MESSAGE);
            
            if (generoOpc == null) return;
            Libro.Genero genero = obtenerGenero(generoOpc);

            Libro libro = new Libro(titulo, autor, isbn, fecha, true, genero);
            catalogoLibros.add(libro);
            
            JOptionPane.showMessageDialog(null, "✅ Libro añadido correctamente:\n\n" + libro, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "❌ Error: Formato de número inválido", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "❌ Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void verTodosLosLibros() {
        if (catalogoLibros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "📚 No hay libros en el catálogo", "Catálogo vacío", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // MODIFICACIÓN: Salida por consola en lugar de JOptionPane
            JOptionPane.showMessageDialog(null, "👁️ Revisa la consola para ver el listado de libros.", "Ver Libros", JOptionPane.INFORMATION_MESSAGE);
            
            System.out.println("\n══════════════════════════════════════════");
            System.out.println("            CATÁLOGO DE LIBROS");
            System.out.println("══════════════════════════════════════════");
            for (int i = 0; i < catalogoLibros.size(); i++) {
                Libro l = catalogoLibros.get(i);
                String estado = l.isDisponible() ? "[DISPONIBLE]" : "[PRESTADO]";
                System.out.printf("[%d] %-30s | Autor: %-20s | %s\n", i, l.getTitulo(), l.getAutor(), estado);
            }
            System.out.println("══════════════════════════════════════════\n");
        }
    }

    private static void buscarLibroPorIsbn() {
        String isbnStr = JOptionPane.showInputDialog(null, "Introduce el ISBN del libro:", "Buscar Libro", JOptionPane.QUESTION_MESSAGE);
        if (isbnStr == null) return;
        
        try {
            Long isbn = Long.parseLong(isbnStr);
            Libro encontrado = null;
            
            for (Libro libro : catalogoLibros) {
                if (libro.getIsbn().equals(isbn)) {
                    encontrado = libro;
                    break;
                }
            }
            
            if (encontrado != null) {
                JOptionPane.showMessageDialog(null, "✅ Libro encontrado:\n\n" + encontrado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "❌ No se encontró ningún libro con ese ISBN", "No encontrado", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "❌ ISBN inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void modificarLibro() {
        if (catalogoLibros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay libros para modificar");
            return;
        }
        
        String[] opciones = new String[catalogoLibros.size()];
        for (int i = 0; i < catalogoLibros.size(); i++) {
            opciones[i] = "[" + i + "] " + catalogoLibros.get(i).getTitulo();
        }
        
        String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona el libro a modificar:", 
            "Modificar Libro", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        if (seleccion == null) return;
        
        int indice = Integer.parseInt(seleccion.substring(1, seleccion.indexOf("]")));
        Libro libro = catalogoLibros.get(indice);
        
        String nuevoTitulo = JOptionPane.showInputDialog(null, "Nuevo título (actual: " + libro.getTitulo() + "):", 
            libro.getTitulo());
        if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
            libro.setTitulo(nuevoTitulo);
        }
        
        String nuevoAutor = JOptionPane.showInputDialog(null, "Nuevo autor (actual: " + libro.getAutor() + "):", 
            libro.getAutor());
        if (nuevoAutor != null && !nuevoAutor.isEmpty()) {
            libro.setAutor(nuevoAutor);
        }
        
        JOptionPane.showMessageDialog(null, "✅ Libro modificado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void eliminarLibro() {
        if (catalogoLibros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay libros para eliminar");
            return;
        }
        
        String[] opciones = new String[catalogoLibros.size()];
        for (int i = 0; i < catalogoLibros.size(); i++) {
            opciones[i] = "[" + i + "] " + catalogoLibros.get(i).getTitulo();
        }
        
        String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona el libro a eliminar:", 
            "Eliminar Libro", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        if (seleccion == null) return;
        
        int indice = Integer.parseInt(seleccion.substring(1, seleccion.indexOf("]")));
        Libro eliminado = catalogoLibros.remove(indice);
        
        JOptionPane.showMessageDialog(null, "✅ Libro eliminado: " + eliminado.getTitulo(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void verGeneros() {
        StringBuilder sb = new StringBuilder("═══ GÉNEROS DISPONIBLES ═══\n\n");
        for (Libro.Genero genero : Libro.Genero.values()) {
            sb.append("📖 ").append(genero.name()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Géneros", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void prestarDevolverLibro() {
        String accion = JOptionPane.showInputDialog(null, """
            ¿Qué deseas hacer?
            
            1. Prestar libro
            2. Devolver libro
            
            Opción:
            """, "Prestar/Devolver", JOptionPane.QUESTION_MESSAGE);
        
        if (accion == null) return;
        
        if (accion.equals("1")) {
            if (catalogoLibros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay libros disponibles");
                return;
            }
            
            String[] opciones = new String[catalogoLibros.size()];
            for (int i = 0; i < catalogoLibros.size(); i++) {
                String estado = catalogoLibros.get(i).isDisponible() ? "✅" : "❌";
                opciones[i] = "[" + i + "] " + estado + " " + catalogoLibros.get(i).getTitulo();
            }
            
            String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona el libro:", 
                "Prestar Libro", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            
            if (seleccion != null) {
                int indice = Integer.parseInt(seleccion.substring(1, seleccion.indexOf("]")));
                Libro libro = catalogoLibros.get(indice);
                
                if (!libro.isDisponible()) {
                    JOptionPane.showMessageDialog(null, "❌ Este libro ya está prestado", "No disponible", JOptionPane.WARNING_MESSAGE);
                } else {
                    libro.prestar();
                    JOptionPane.showMessageDialog(null, "✅ Libro prestado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if (accion.equals("2")) {
            if (catalogoLibros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay libros");
                return;
            }
            
            String[] opciones = new String[catalogoLibros.size()];
            for (int i = 0; i < catalogoLibros.size(); i++) {
                String estado = catalogoLibros.get(i).isDisponible() ? "✅" : "❌";
                opciones[i] = "[" + i + "] " + estado + " " + catalogoLibros.get(i).getTitulo();
            }
            
            String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona el libro:", 
                "Devolver Libro", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            
            if (seleccion != null) {
                int indice = Integer.parseInt(seleccion.substring(1, seleccion.indexOf("]")));
                Libro libro = catalogoLibros.get(indice);
                
                if (libro.isDisponible()) {
                    JOptionPane.showMessageDialog(null, "❌ Este libro no está prestado", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    libro.devolver();
                    JOptionPane.showMessageDialog(null, "✅ Libro devuelto correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    // ============ MENÚ ESTUDIANTES ============
    private static void menuEstudiantes() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(null, """
                ─── GESTIÓN DE ESTUDIANTES ───
                
                1. Añadir estudiante
                2. Ver todos los estudiantes (Consola)
                3. Buscar estudiante por DNI
                4. Eliminar estudiante
                0. Volver
                
                Opción:
                """, "Gestión de Estudiantes", JOptionPane.QUESTION_MESSAGE);

            if (opcion == null) break;
            
            switch (opcion) {
                case "1" -> añadirEstudiante();
                case "2" -> mostrarEstudiantes();
                case "3" -> buscarEstudiantePorDni();
                case "4" -> eliminarEstudiante();
                case "0" -> {}
                default -> JOptionPane.showMessageDialog(null, "❌ Opción inválida");
            }
        } while (opcion != null && !opcion.equals("0"));
    }

    private static void añadirEstudiante() {
        String nombre = JOptionPane.showInputDialog(null, "Nombre del estudiante:", "Añadir Estudiante", JOptionPane.QUESTION_MESSAGE);
        if (nombre == null) return;
        
        String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Añadir Estudiante", JOptionPane.QUESTION_MESSAGE);
        if (apellidos == null) return;
        
        String dni = JOptionPane.showInputDialog(null, "DNI (8 dígitos + letra):", "Añadir Estudiante", JOptionPane.QUESTION_MESSAGE);
        if (dni == null) return;

        Estudiante estudiante = new Estudiante(nombre, apellidos, dni);
        carteraEstudiantes.añadir(estudiante);
        
        JOptionPane.showMessageDialog(null, "✅ Estudiante añadido:\n\n" + estudiante, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void mostrarEstudiantes() {
        JOptionPane.showMessageDialog(null, "👁️ Revisa la consola para ver los estudiantes.", "Info", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("           LISTA DE ESTUDIANTES");
        System.out.println("══════════════════════════════════════════");
        carteraEstudiantes.imprimir();
        System.out.println("══════════════════════════════════════════\n");
    }

    private static void buscarEstudiantePorDni() {
        String dni = JOptionPane.showInputDialog(null, "Introduce el DNI:", "Buscar Estudiante", JOptionPane.QUESTION_MESSAGE);
        if (dni == null) return;
        
        JOptionPane.showMessageDialog(null, "Revisa la consola para ver el resultado", "Info", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("\n─── Buscando estudiante con DNI: " + dni + " ───");
        carteraEstudiantes.imprimir(); // Nota: CarteraEstudiante.imprimir no filtra, imprime todo.
    }

    private static void eliminarEstudiante() {
        String metodo = JOptionPane.showInputDialog(null, """
            ¿Cómo deseas eliminar?
            
            1. Por DNI
            2. Por posición
            
            Opción:
            """, "Eliminar Estudiante", JOptionPane.QUESTION_MESSAGE);
        
        if (metodo == null) return;
        
        if (metodo.equals("1")) {
            String dni = JOptionPane.showInputDialog(null, "DNI del estudiante:", "Eliminar", JOptionPane.QUESTION_MESSAGE);
            if (dni != null) {
                carteraEstudiantes.borrar(dni);
                JOptionPane.showMessageDialog(null, "✅ Estudiante eliminado (si existía)", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (metodo.equals("2")) {
            // Mostrar lista para saber qué posición borrar
            System.out.println("\n═══ LISTA DE ESTUDIANTES ═══");
            carteraEstudiantes.imprimir();
            
            String posStr = JOptionPane.showInputDialog(null, "Posición del estudiante (mira la consola):", "Eliminar", JOptionPane.QUESTION_MESSAGE);
            if (posStr != null) {
                try {
                    int pos = Integer.parseInt(posStr);
                    carteraEstudiantes.borrar(pos);
                    JOptionPane.showMessageDialog(null, "✅ Estudiante eliminado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "❌ Error al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    // ============ MENÚ PRÉSTAMOS ============
    private static void menuPrestamos() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(null, """
                ─── GESTIÓN DE PRÉSTAMOS ───
                
                1. Realizar préstamo
                2. Devolver préstamo
                3. Modificar fecha de devolución
                4. Buscar préstamo por ID
                5. Ver todos los préstamos (Consola)
                0. Volver
                
                Opción:
                """, "Gestión de Préstamos", JOptionPane.QUESTION_MESSAGE);

            if (opcion == null) break;
            
            switch (opcion) {
                case "1" -> realizarPrestamo();
                case "2" -> devolverPrestamo();
                case "3" -> modificarFechaPrestamo();
                case "4" -> buscarPrestamoPorId();
                case "5" -> verTodosPrestamos();
                case "0" -> {}
                default -> JOptionPane.showMessageDialog(null, "❌ Opción inválida");
            }
        } while (opcion != null && !opcion.equals("0"));
    }

    private static void realizarPrestamo() {
        if (catalogoLibros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "❌ No hay libros disponibles", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Seleccionar libro
        String[] opcionesLibros = new String[catalogoLibros.size()];
        for (int i = 0; i < catalogoLibros.size(); i++) {
            Libro l = catalogoLibros.get(i);
            String estado = l.isDisponible() ? "✅" : "❌";
            opcionesLibros[i] = "[" + i + "] " + estado + " " + l.getTitulo() + " - " + l.getAutor();
        }
        
        String libroSel = (String) JOptionPane.showInputDialog(null, "Selecciona el libro:", 
            "Realizar Préstamo", JOptionPane.QUESTION_MESSAGE, null, opcionesLibros, opcionesLibros[0]);
        
        if (libroSel == null) return;
        
        int indiceLibro = Integer.parseInt(libroSel.substring(1, libroSel.indexOf("]")));
        Libro libro = catalogoLibros.get(indiceLibro);
        
        if (!libro.isDisponible()) {
            JOptionPane.showMessageDialog(null, "❌ Este libro no está disponible", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Datos del estudiante
        String nombre = JOptionPane.showInputDialog(null, "Nombre del estudiante:", "Préstamo", JOptionPane.QUESTION_MESSAGE);
        if (nombre == null) return;
        
        String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Préstamo", JOptionPane.QUESTION_MESSAGE);
        if (apellidos == null) return;
        
        String dni = JOptionPane.showInputDialog(null, "DNI:", "Préstamo", JOptionPane.QUESTION_MESSAGE);
        if (dni == null) return;
        
        Estudiante estudiante = new Estudiante(nombre, apellidos, dni);
        
        try {
            Prestamo prestamo = new Prestamo(LocalDate.now(), libro, estudiante, contadorIdPrestamo++);
            listaPrestamos.Guardar(prestamo);
            libro.prestar();
            
            JOptionPane.showMessageDialog(null, 
                "✅ Préstamo realizado correctamente\n\n" +
                "ID: " + (contadorIdPrestamo - 1) + "\n" +
                "Libro: " + libro.getTitulo() + "\n" +
                "Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellidos() + "\n" +
                "Fecha: " + LocalDate.now(), 
                "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "❌ Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void devolverPrestamo() {
        String idStr = JOptionPane.showInputDialog(null, "ID del préstamo a devolver:", "Devolver Préstamo", JOptionPane.QUESTION_MESSAGE);
        if (idStr == null) return;
        
        try {
            int id = Integer.parseInt(idStr);
            Prestamo prestamo = listaPrestamos.BuscarPrestamoPorID(id);
            
            if (prestamo != null) {
                prestamo.getL1().devolver();
                listaPrestamos.BorrarPrestamo(prestamo);
                JOptionPane.showMessageDialog(null, "✅ Libro devuelto correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "❌ No se encontró el préstamo con ID: " + id, "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "❌ ID inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void modificarFechaPrestamo() {
        String idStr = JOptionPane.showInputDialog(null, "ID del préstamo:", "Modificar Fecha", JOptionPane.QUESTION_MESSAGE);
        if (idStr == null) return;
        
        try {
            int id = Integer.parseInt(idStr);
            Prestamo prestamo = listaPrestamos.BuscarPrestamoPorID(id);
            
            if (prestamo != null) {
                String añoStr = JOptionPane.showInputDialog(null, "Nuevo año:", "Modificar", JOptionPane.QUESTION_MESSAGE);
                String mesStr = JOptionPane.showInputDialog(null, "Nuevo mes:", "Modificar", JOptionPane.QUESTION_MESSAGE);
                String diaStr = JOptionPane.showInputDialog(null, "Nuevo día:", "Modificar", JOptionPane.QUESTION_MESSAGE);
                
                if (añoStr != null && mesStr != null && diaStr != null) {
                    int año = Integer.parseInt(añoStr);
                    int mes = Integer.parseInt(mesStr);
                    int dia = Integer.parseInt(diaStr);
                    
                    prestamo.setFechaDevolucion(LocalDate.of(año, mes, dia));
                    JOptionPane.showMessageDialog(null, "✅ Fecha modificada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "❌ Préstamo no encontrado", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void buscarPrestamoPorId() {
        String idStr = JOptionPane.showInputDialog(null, "ID del préstamo:", "Buscar Préstamo", JOptionPane.QUESTION_MESSAGE);
        if (idStr == null) return;
        
        try {
            int id = Integer.parseInt(idStr);
            Prestamo prestamo = listaPrestamos.BuscarPrestamoPorID(id);
            
            if (prestamo != null) {
                JOptionPane.showMessageDialog(null, "✅ Préstamo encontrado:\n\n" + prestamo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "❌ No se encontró el préstamo", "No encontrado", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "❌ ID inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void verTodosPrestamos() {
        JOptionPane.showMessageDialog(null, "👁️ Revisa la consola para ver los préstamos.", "Info", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("           LISTA DE PRÉSTAMOS");
        System.out.println("══════════════════════════════════════════");
        
        // MODIFICACIÓN: Implementación de la iteración.
        // Como ListaPrestamo no tiene un método getAll(), iteramos por los IDs generados.
        boolean hayPrestamos = false;
        for (int i = 1; i < contadorIdPrestamo; i++) {
            Prestamo p = listaPrestamos.BuscarPrestamoPorID(i);
            if (p != null) {
                System.out.println(p);
                hayPrestamos = true;
            }
        }
        
        if (!hayPrestamos) {
            System.out.println("No hay préstamos activos.");
        }
        System.out.println("══════════════════════════════════════════\n");
    }

    // ============ MENÚ CONSULTAS ============
    private static void menuConsultas() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(null, """
                ─── CONSULTAS Y REPORTES ───
                
                1. Préstamos de un libro
                2. Préstamos de un estudiante
                3. Préstamos vencidos
                4. Préstamos por fecha
                5. Ordenar por ID
                6. Ordenar por fecha inicio
                7. Ordenar por fecha devolución
                8. Ordenar por título
                9. Ordenar por nombre alumno
                0. Volver
                
                Opción:
                """, "Consultas", JOptionPane.QUESTION_MESSAGE);


            if (opcion == null) break;
            
            switch (opcion) {
                case "1" -> prestamosDeUnLibro();
                case "2" -> prestamosDeUnEstudiante();
                case "3" -> prestamosVencidos();
                case "4" -> prestamosPorFecha();
                case "5" -> { listaPrestamos.OrdenarListaPorId(); 
                              JOptionPane.showMessageDialog(null, "✅ Ordenado por ID"); }
                case "6" -> { listaPrestamos.OrdenarListaPorFechaInicio(); 
                              JOptionPane.showMessageDialog(null, "✅ Ordenado por fecha inicio"); }
                case "7" -> { listaPrestamos.OrdenarListaPorFechaDevolucion(); 
                              JOptionPane.showMessageDialog(null, "✅ Ordenado por fecha devolución"); }
                case "8" -> { listaPrestamos.OrdenarListaPorTitulo(); 
                              JOptionPane.showMessageDialog(null, "✅ Ordenado por título"); }
                case "9" -> { listaPrestamos.OrdenarListaPorNombreAlumno(); 
                              JOptionPane.showMessageDialog(null, "✅ Ordenado por nombre"); }
                case "0" -> {}
                default -> JOptionPane.showMessageDialog(null, "❌ Opción inválida");
            }
        } while (opcion != null && !opcion.equals("0"));
    }

    private static void prestamosDeUnLibro() {
        if (catalogoLibros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay libros");
            return;
        }
        
        String[] opciones = new String[catalogoLibros.size()];
        for (int i = 0; i < catalogoLibros.size(); i++) {
            opciones[i] = "[" + i + "] " + catalogoLibros.get(i).getTitulo();
        }
        
        String sel = (String) JOptionPane.showInputDialog(null, "Selecciona el libro:", 
            "Préstamos por Libro", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        if (sel != null) {
            int indice = Integer.parseInt(sel.substring(1, sel.indexOf("]")));
            ArrayList<Prestamo> prestamos = listaPrestamos.BuscarPrestamosDeUnLibro(catalogoLibros.get(indice));
            mostrarPrestamos(prestamos, "Préstamos del libro");
        }
    }

    private static void prestamosDeUnEstudiante() {
        String dni = JOptionPane.showInputDialog(null, "DNI del estudiante:", "Préstamos por Estudiante", JOptionPane.QUESTION_MESSAGE);
        if (dni == null) return;
        
        Estudiante est = new Estudiante("Temp", "Temp", dni);
        ArrayList<Prestamo> prestamos = listaPrestamos.BuscarPrestamosDeUnEstudiate(est);
        mostrarPrestamos(prestamos, "Préstamos del estudiante");
    }

    private static void prestamosVencidos() {
        ArrayList<Prestamo> prestamos = listaPrestamos.BuscarPrestamosVencidos();
        mostrarPrestamos(prestamos, "Préstamos vencidos");
    }

    private static void prestamosPorFecha() {
        try {
            String añoStr = JOptionPane.showInputDialog(null, "Año:", "Fecha", JOptionPane.QUESTION_MESSAGE);
            String mesStr = JOptionPane.showInputDialog(null, "Mes:", "Fecha", JOptionPane.QUESTION_MESSAGE);
            String diaStr = JOptionPane.showInputDialog(null, "Día:", "Fecha", JOptionPane.QUESTION_MESSAGE);
            
            if (añoStr != null && mesStr != null && diaStr != null) {
                int año = Integer.parseInt(añoStr);
                int mes = Integer.parseInt(mesStr);
                int dia = Integer.parseInt(diaStr);
                LocalDate fecha = LocalDate.of(año, mes, dia);
                
                ArrayList<Prestamo> prestamos = listaPrestamos.BuscarPrestamoFechaConcreta(fecha);
                mostrarPrestamos(prestamos, "Préstamos para " + fecha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error en la fecha", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void mostrarPrestamos(ArrayList<Prestamo> prestamos, String titulo) {
        // MODIFICACIÓN: Salida por consola en lugar de StringBuilder para el JOptionPane
        JOptionPane.showMessageDialog(null, "👁️ Revisa la consola para ver los resultados.", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("           " + titulo.toUpperCase());
        System.out.println("══════════════════════════════════════════");
        
        if (prestamos.isEmpty()) {
            System.out.println("❌ No se encontraron préstamos.");
        } else {
            for (Prestamo p : prestamos) {
                System.out.println(p);
            }
        }
        System.out.println("══════════════════════════════════════════\n");
    }

    // ============ UTILIDADES ============
    private static Libro.Genero obtenerGenero(String opcion) {
        return switch (opcion) {
            case "1" -> Libro.Genero.NOVELA;
            case "2" -> Libro.Genero.FICCION;
            case "3" -> Libro.Genero.POESIA;
            case "4" -> Libro.Genero.RELATO;
            default -> Libro.Genero.NOVELA;
        };
    }

    private static void cargarDatosPrueba() {
        // Libros de ejemplo
        catalogoLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 
            9788497592208L, LocalDate.of(1967, 5, 30), true, Libro.Genero.NOVELA));
        catalogoLibros.add(new Libro("1984", "George Orwell", 
            9788499890944L, LocalDate.of(1949, 6, 8), true, Libro.Genero.FICCION));
        catalogoLibros.add(new Libro("Veinte poemas de amor", "Pablo Neruda", 
            9788437604817L, LocalDate.of(1924, 6, 16), true, Libro.Genero.POESIA));
        
        // Estudiantes de ejemplo
        carteraEstudiantes.añadir(new Estudiante("Juan", "Pérez García", "12345678A"));
        carteraEstudiantes.añadir(new Estudiante("María", "López Martínez", "87654321B"));
        carteraEstudiantes.añadir(new Estudiante("Carlos", "Ruiz Sánchez", "11223344C"));
        
        System.out.println("✅ Datos de prueba cargados correctamente");
    }
}
