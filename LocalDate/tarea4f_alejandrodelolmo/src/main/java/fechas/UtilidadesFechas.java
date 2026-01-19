package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.MINUTES;

public class UtilidadesFechas {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();

        // Copiar en una nueva instancia de LocalDate e inicialición de variables
        LocalDate copia = copia(fecha);
        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime copia1 = fecha1.plusMinutes(4);
        long numeroDias = 3;
        long numerosSegundos = 20;
        
        // Comprobaciones que los metodos funcionan
        System.out.println("¿Es la fecha" + fecha.toString() + "bisiesta?" + bisiesto(fecha));
        System.out.println("El mes " +fecha.getMonth() + " tiene " + diasMes(fecha));
        System.out.println("Hoy es el dia de la semana " + diaSemana(fecha));
        System.out.println(mostrarFechaLarga(fecha));
        System.out.println("Si le sumamos " + numeroDias + " dias a " + fecha.toString() + " la nueva fecha será " + sumarDias(numeroDias, fecha));
        copia = fecha.plusDays(5);
        System.out.println("La diferencia de dias entre " + fecha + " y " + copia + " es de " + diasTranscurridos(fecha, copia) + " dias");
        System.out.println("Si sumamos un dia a " + fecha + " nos dará " + siguienteDia(fecha));
        System.out.println("Si le quitamos un dia a " + fecha + " nos dará " + anteriorDia(fecha));
        System.out.println("La diferencia de minutos entre " + fecha1.toString() + " y " + copia1.toString() + " es de " + minutosEntre(fecha1, copia1));
        System.out.println("Si ha " + fecha1 + " le sumamos " + numerosSegundos + " nos dará " + sumarSegundos(numerosSegundos, fecha1));
    }

    // Con el metodo isLeapYear comprobaremos si es bisiesto o no
    public static boolean bisiesto(LocalDate fecha){
        return fecha.isLeapYear();
    }

    // Crearemos un nuevo objeto y a este le meteremos los mismos
    // valores que tiene fecha con LocalDate.of (parametros)
    public static LocalDate copia(LocalDate fecha){
        LocalDate copia1 = LocalDate.of(fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth());
        return copia1;
    }

    // Para saber cuantos dias tiene el mes de la fecha introducida
    // Usaremos el metodo lengthOfMonth
    public static int diasMes (LocalDate fecha){
        return fecha.lengthOfMonth();
    }

    // Para mostrar el numero de la semana lo haremos formateando la fecha con
    // DateTimeFormatter, haremos un patron que solo nos muestre el dia de la 
    // semana introduciendo en el patron "c"
    public static int diaSemana (LocalDate fecha){
        DateTimeFormatter diaSemana = DateTimeFormatter.ofPattern("c");
        
        // Aqui cambiaremos el domingo del numero 7 al 0 como pide el enunciado
        if (Integer.parseInt(fecha.format(diaSemana)) == 7) {
            return 0;
        }else {
            return Integer.parseInt(fecha.format(diaSemana));
        }
    }

    // Mostraremos la fecha larga, este formato lo he contruido gracias a la documentación
    // de oracle https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    public static String mostrarFechaLarga (LocalDate fecha){
        // "EEEE" muestre el dia completo
        // "dd" muestra el numero del dia del mes
        // 'de' es un string que muestra el texto introducido entre comillas simples
        // MMMM muestra el nombre del mes
        // yyyy muestra el año 
        DateTimeFormatter fechaLarga = DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' yyyy");
        return fechaLarga.format(fecha);
        
    }

    // Sumamos los dias con el metodo plusDays
    public static LocalDate sumarDias (long numeroDias, LocalDate fecha){
        return fecha.plusDays(numeroDias);
    }

    // Compararemos los dias que han pasado con el metodo compareTo
    public static int diasTranscurridos (LocalDate fechaInicial, LocalDate fechaFinal){
        return fechaFinal.compareTo(fechaInicial);
    }

    // Para ver el siguiente dia tendremos que simplemente devolver la fecha con 1 dia más
    public static LocalDate siguienteDia (LocalDate fecha){
        return fecha.plusDays(1);
    }

    // Exactamente lo mismo pero con un dia menos
    public static LocalDate anteriorDia (LocalDate fecha){
        return fecha.plusDays(-1);
    }

    // Para ver cuantos minutos han pasado usaremos el metodo between de
    // ChronoUnit donde si pones la medida en este caso MINUTES podemos usar
    // un par de metodos, tambien podria haber usado el metodo until pero esta
    // forma me ha gustado mas y me parece mas intuitiva
    public static long minutosEntre (LocalDateTime fecha1 ,LocalDateTime fecha2){
        return MINUTES.between(fecha1,fecha2);
    }

    // Para sumar los segundos usaremos el metodo de LocalDateTime plusSeconds
    public static LocalDateTime sumarSegundos (long numeroSegundos, LocalDateTime fecha){
        LocalDateTime copia = fecha.plusSeconds(numeroSegundos);
        return copia;
    }

    // finiquitao 🤙
}