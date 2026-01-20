package principal;

import Estudiante.CarteraEstudiante;
import Estudiante.Estudiante;
import biblioteca.CatalogoLibros;
import libro.Libro;
import Estudiante.Prestamo;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class NuevoMain {
    public static void main(String[] args) {
        Libro l1 = new Libro(); // Libro default

        // Creamos 4 libros, 3 diferentes 1 repetido
        Libro l2 = new Libro("Don quijote de la mancha", "Miguel de cervantes", 1232342342761L, LocalDate.now(), true, Libro.Genero.NOVELA);
        Libro l3 = new Libro("La riqueza de las naciones", "Adam Smith", 9867453645364L, LocalDate.of(1776, 3, 9), true, Libro.Genero.RELATO);
        Libro l4 = new Libro("El principito", "Antoine  de Saint-Exupery", 7685674563123L, LocalDate.of(1943, 4, 1), true, Libro.Genero.NOVELA);
        Libro l5 = new Libro("El principito 2", "Antoine  de Saint-Exupery", 7685674563123L, LocalDate.of(1943, 4, 1), true, Libro.Genero.NOVELA);


        // Ahora creamos los estudiantes

        Estudiante est1 = new Estudiante("Alejandro","Del olmo","65432145K");
        Estudiante est2 = new Estudiante("Juan","Lopez","87643243K");
        Estudiante est3 = new Estudiante("Fernando","Vindel","87645443K");
        Estudiante est4 = new Estudiante("Eva","Tortosa","87640943K");
        Estudiante est5 = new Estudiante("Sofia","Martinez","87648743K");
        Estudiante est6 = new Estudiante("Isabel","Martinez","87642143K");



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

        // Creamos las carteras de estudiantes
        CarteraEstudiante estudiantesMatematicas = new CarteraEstudiante();
        CarteraEstudiante estudiantesFisica = new CarteraEstudiante();

        // Añadimos unos cuantos estudiantes por cada cartera
        estudiantesMatematicas.añadir(est1);
        estudiantesMatematicas.añadir(est2);
        estudiantesMatematicas.añadir(est3);
        estudiantesMatematicas.añadir(est4);

        estudiantesFisica.añadir(est2);
        estudiantesFisica.añadir(est3);
        estudiantesFisica.añadir(est4);
        estudiantesFisica.añadir(est5);
        estudiantesFisica.añadir(est6);

        ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
        Prestamo prestamo1 = new Prestamo(LocalDate.now(),l2,est1);
        Prestamo prestamo2 = new Prestamo(LocalDate.now(),l1,est1);
        Prestamo prestamo3 = new Prestamo(LocalDate.now(),l4,est4);

        listaPrestamos.add(prestamo1);
        listaPrestamos.add(prestamo2);
        listaPrestamos.add(prestamo3);

        String eleccionMenu = "0";
        String aux;
        do {
            eleccionMenu = JOptionPane.showInputDialog("""
                1- Ver libros de un catalogo
                2- Ver estudiantes
                3- Hacer un prestamo
                4- Ver los prestamos
                0- Salir
                """);
            switch (eleccionMenu){
                case "1" -> {
                    aux = JOptionPane.showInputDialog(null,"""
                            ¿Que catalogo desea ver?
                            1- Catalogo 1
                            2- Catalogo 2
                            """);
                    switch (aux){
                        case "1" -> {
                            System.out.println("Libros 1");
                            libros1.imprimir();
                        }
                        case "2" -> {
                            System.out.println("Libros 2");
                            libros2.imprimir();
                        }
                    }
                }
                case "2" -> {
                    aux = JOptionPane.showInputDialog(null, """
                            ¿Que cartera de estudiante desea ver?
                            1- Estudiantes de matematicas
                            2- Estudiantes de fisica
                            """);
                    switch (aux){
                        case "1" -> {
                            System.out.println("Estudiantes de matematicas");
                            estudiantesMatematicas.imprimir();
                        }
                        case "2" -> {
                            System.out.println("Estudiantes de Fisica");
                            estudiantesFisica.imprimir();
                        }
                    }
                }
                case "3" -> {
                    aux = JOptionPane.showInputDialog("""
                            Prestamo
                            ¿De que estudiante es el prestamo;
                            1- %s
                            2- %s
                            3- %s
                            4- %s
                            5- %s
                            6- %s
                            """.formatted(est1,est2,est3,est4,est5,est6));
                    Estudiante estudiantePrestamo = null;
                    switch (aux){
                        case "1" -> estudiantePrestamo = est1;
                        case "2" -> estudiantePrestamo = est2;
                        case "3" -> estudiantePrestamo = est3;
                        case "4" -> estudiantePrestamo = est4;
                        case "5" -> estudiantePrestamo = est5;
                        case "6" -> estudiantePrestamo = est6;
                    }
                    Libro libroPrestamo = null;
                    aux = JOptionPane.showInputDialog("""
                            Prestamo
                            ¿Que libro es el prestado?;
                            1- %s
                            2- %s
                            3- %s
                            4- %s
                            5- %s
                            """.formatted(l1,l2,l3,l4,l5));
                    switch (aux){
                        case "1" -> libroPrestamo = l1;
                        case "2" -> libroPrestamo = l2;
                        case "3" -> libroPrestamo = l3;
                        case "4" -> libroPrestamo = l4;
                        case "5" -> libroPrestamo = l5;
                    }
                    Prestamo prestamonuevo = new Prestamo(LocalDate.now(),libroPrestamo,estudiantePrestamo);
                    listaPrestamos.add(prestamonuevo);
                    prestamonuevo = null;

                }
                case "4" -> {
                    for (int i = 0; i < listaPrestamos.size(); i++) {
                        System.out.print("Prestamo " + (i+1) + " = ");
                        System.out.println(listaPrestamos.get(i));
                    }
                    System.out.println("--------------------------");
                }
            }
        } while (!(eleccionMenu.equals("0")));
    }
}
