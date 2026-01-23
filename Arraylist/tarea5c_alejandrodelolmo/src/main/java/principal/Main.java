package principal;

import biblioteca.CatalogoLibros;
import libro.Libro;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro(); // Libro default

        // Creamos 4 libros, 3 diferentes 1 repetido
        Libro l2 = new Libro("Don quijote de la mancha", "Miguel de cervantes", 1232342342761L, LocalDate.now(), true, Libro.Genero.NOVELA);
        Libro l3 = new Libro("La riqueza de las naciones", "Adam Smith", 9867453645364L, LocalDate.of(1776, 3, 9), true, Libro.Genero.RELATO);
        Libro l4 = new Libro("El principito", "Antoine  de Saint-Exupery", 7685674563123L, LocalDate.of(1943, 4, 1), true, Libro.Genero.NOVELA);
        Libro l5 = new Libro("El principito 2", "Antoine  de Saint-Exupery", 7685674563123L, LocalDate.of(1943, 4, 1), true, Libro.Genero.NOVELA);


        //Probamos el metodo prestar y devolver
        System.out.println("El libro " + l2.getTitulo() + " esta disponible: " + l2.isDisponible());
        l2.prestar();
        System.out.println("El libro " + l2.getTitulo() + " esta disponible: " + l2.isDisponible());
        l2.devolver();
        System.out.println("El libro " + l2.getTitulo() + " esta disponible: " + l2.isDisponible());

        System.out.println("----------------------");
        System.out.println("Hash codes");
        System.out.println("----------------------");
        System.out.println("l1 " + l1.hashCode());
        System.out.println("l2 " + l2.hashCode());
        System.out.println("l3 " + l3.hashCode());
        System.out.println("l4 " + l4.hashCode());
        System.out.println("l5 " + l5.hashCode());

        System.out.println("----------------------");
        System.out.println("Equals");
        System.out.println("----------------------");
        System.out.println("l1 " + l1.equals(l4));
        System.out.println("l4 " + l4.equals(l5));

        // Catalogo Libros

        CatalogoLibros libros1 = new CatalogoLibros();
        CatalogoLibros libros2 = new CatalogoLibros();

        // Añadimos los libros a los catalogos
        libros1.guardar(l1);
        libros1.guardar(l2);
        libros1.guardar(l3);
        libros2.guardar(l3);
        libros2.guardar(l4);
        libros2.guardar(l5);


        System.out.println("Buscamos el libro l2");
        libros1.buscar(l2);

        System.out.println("Metemos el libro l2 en la posicion 1");
        libros1.cambiar(1, l2);

        String eleccion;
        int eleccionMenu;
        // Hacemos un do while que se repite todas las veces hasta que el usuario decida salir (0)
        do {
            // Mostramos el menu
            eleccion = JOptionPane.showInputDialog("""
                    1- Ver la cantidad de libros de la lista
                    2- Ver si la lista esta vacia
                    3- Obtener el libro deseado
                    4- Cambiar de posicion en la lista un libro
                    5- Añadir un libro nuevo a la lista
                    6- Eliminar el libro de una posicion concreta
                    7- Eliminar el libro de un ISBN concreto
                    8- Imprimir todos los libros de la lista
                    9- Buscar en que posicion se encuentra un libro
                    10- Buscar los libros de un autor
                    11- Buscar el libro con un ISBN concreto
                    0- Salir
                    """);
            eleccionMenu = Integer.parseInt(eleccion);
            // Hacemos un par textblock para ahorrar un poco de texto mas abajo
            String listasString = """
                    1- Catalogo 1
                    2- Catalogo 2
                    """;
            String listasLibros = """
                    1- %s
                    2- %s
                    3- %s
                    4- %s
                    5- %s
                    """.formatted(l1, l2, l3, l4, l5);

            // Hacemos un switch con la Eleccion que del usuario
            switch (eleccionMenu) {

                case 1 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    switch (eleccionLista) {
                        case "1" -> {
                            JOptionPane.showMessageDialog(null, libros1.cantidad() + " Libros");
                        }
                        case "2" -> {
                            JOptionPane.showMessageDialog(null, libros2.cantidad() + " Libros");
                        }
                    }
                }

                case 2 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    switch (eleccionLista) {
                        case "1" -> {
                            JOptionPane.showMessageDialog(null, libros1.estaVacia());
                        }
                        case "2" -> {
                            JOptionPane.showMessageDialog(null, libros2.estaVacia());
                        }
                    }
                }
                case 3 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    String eleccionLibro = JOptionPane.showInputDialog("¿En que posicion se encuentra el libro?");
                    switch (eleccionLista) {
                        case "1" -> {
                            JOptionPane.showMessageDialog(null, libros1.obtener(Integer.parseInt(eleccionLibro)));
                        }
                        case "2" -> {
                            JOptionPane.showMessageDialog(null, libros2.obtener(Integer.parseInt(eleccionLibro)));
                        }
                    }
                }

                case 4 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    Libro libroACambiar = null;
                    String eleccionPosicion = JOptionPane.showInputDialog("¿Cual es la nueva posicion?");
                    String eleccionLibro = JOptionPane.showInputDialog(listasLibros);
                    switch (eleccionLibro) {
                        case "1" -> {
                            libroACambiar = l1;
                        }
                        case "2" -> {
                            libroACambiar = l2;
                        }
                        case "3" -> {
                            libroACambiar = l3;
                        }
                        case "4" -> {
                            libroACambiar = l4;
                        }
                        case "5" -> {
                            libroACambiar = l5;
                        }
                    }
                    switch (eleccionLista) {
                        case "1" -> {
                            libros1.cambiar(Integer.parseInt(eleccionPosicion), libroACambiar);
                        }
                        case "2" -> {
                            libros2.cambiar(Integer.parseInt(eleccionPosicion), libroACambiar);
                        }
                    }
                    
                }

                case 5 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    Libro libroACambiar = null;
                    String eleccionLibro = JOptionPane.showInputDialog(listasLibros);
                    switch (eleccionLibro) {
                        case "1" -> {
                            libroACambiar = l1;
                        }
                        case "2" -> {
                            libroACambiar = l2;
                        }
                        case "3" -> {
                            libroACambiar = l3;
                        }
                        case "4" -> {
                            libroACambiar = l4;
                        }
                        case "5" -> {
                            libroACambiar = l5;
                        }
                    }
                    switch (eleccionLista) {
                        case "1" -> {
                            libros1.guardar(libroACambiar);
                        }
                        case "2" -> {
                            libros2.guardar(libroACambiar);
                        }
                    }

                }

                case 6 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    String eleccionPosicion = JOptionPane.showInputDialog("Introduce la posicion del libro a eliminar");
                    switch (eleccionLista) {
                        case "1" -> {
                            libros1.eliminar(Integer.parseInt(eleccionPosicion));
                        }
                        case "2" -> {
                            libros2.eliminar(Integer.parseInt(eleccionPosicion));
                        }
                    }
                }
                case 7 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    String eleccionISBN = JOptionPane.showInputDialog("Introduce el ISBN del libro a eliminar");
                    switch (eleccionLista) {
                        case "1" -> {
                            libros1.eliminar(eleccionISBN);
                        }
                        case "2" -> {
                            libros2.eliminar(eleccionISBN);
                        }
                    }
                }
                case 8 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    switch (eleccionLista) {
                        case "1" -> {
                            libros1.imprimir();
                        }
                        case "2" -> {
                            libros2.imprimir();
                        }
                    }
                }
                case 9 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    String eleccionLibro = JOptionPane.showInputDialog(listasLibros);
                    Libro libroElegido = null;
                    switch (eleccionLibro) {
                        case "1" -> libroElegido = l1;
                        case "2" -> libroElegido = l2;
                        case "3" -> libroElegido = l3;
                        case "4" -> libroElegido = l4;
                        case "5" -> libroElegido = l5;
                    }
                    switch (eleccionLista) {
                        case "1" -> {
                            JOptionPane.showMessageDialog(null, libros1.buscar(libroElegido));
                        }
                        case "2" -> {
                            JOptionPane.showMessageDialog(null, libros2.buscar(libroElegido));
                        }
                    }
                }
                case 10 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    String eleccionAutor = JOptionPane.showInputDialog("Introduce el autor");
                    switch (eleccionLista) {
                        case "1" -> {
                            JOptionPane.showMessageDialog(null, libros1.buscar(eleccionAutor).toString());
                        }
                        case "2" -> {
                            JOptionPane.showMessageDialog(null, libros2.buscar(eleccionAutor));
                        }
                    }
                }
                case 11 -> {
                    String eleccionLista = JOptionPane.showInputDialog(listasString);
                    String eleccionISBN = JOptionPane.showInputDialog("Introduce el ISBN del libro");
                    switch (eleccionLista) {
                        case "1" -> {
                            JOptionPane.showMessageDialog(null, libros1.buscar(Long.parseLong(eleccionISBN)));
                        }
                        case "2" -> {
                            JOptionPane.showMessageDialog(null, libros2.buscar(Long.parseLong(eleccionISBN)));
                        }
                    }
                }
            }
        } while (eleccionMenu != 0);
    }

}
