package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.MINUTES;

public class UtilidadesFechas {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        LocalDate copia = copia(fecha);
        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime copia1 = fecha1.plusMinutes(4);
        System.out.println(diasMes(fecha));
        System.out.println("¿Es bisiesto?:"+bisiesto(fecha));
        // System.out.println(diaSemana(fecha));
        System.out.println(mostrarFechaLarga(fecha)); 
        System.out.println(sumarDias(5, copia));
        copia = sumarDias(6, copia);
        System.out.println("DIA DE LA SEMANA: "+ diaSemana(fecha)); 
        System.out.println(diasTranscurridos(fecha, copia)) ;
        System.out.println(siguienteDia(fecha));
        System.out.println(anteriorDia(fecha));
        System.out.println(minutosEntre(fecha1, copia1));
    }
    public static boolean bisiesto(LocalDate fecha){
        return fecha.isLeapYear();
    }
    public static LocalDate copia(LocalDate fecha){
        LocalDate copia1 = LocalDate.of(fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth());
        return copia1;
    }
    public static int diasMes (LocalDate fecha){
        return fecha.lengthOfMonth();
    }
    public static String diaSemana (LocalDate fecha){
        DateTimeFormatter diaSemana = DateTimeFormatter.ofPattern("c");
        return fecha.format(diaSemana);
    }
    public static String mostrarFechaLarga (LocalDate fecha){
        DateTimeFormatter fechaLarga = DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' yyyy");
        return fechaLarga.format(fecha);
        
    }
    public static LocalDate sumarDias (long numeroDias, LocalDate fecha){
        return fecha.plusDays(numeroDias);
    }
    public static int diasTranscurridos (LocalDate fechaInicial, LocalDate fechaFinal){
        return fechaFinal.compareTo(fechaInicial);
    }
    public static LocalDate siguienteDia (LocalDate fecha){
        return fecha.plusDays(1);
    }
    public static LocalDate anteriorDia (LocalDate fecha){
        return fecha.plusDays(-1);
    }
    public static long minutosEntre (LocalDateTime fecha1 ,LocalDateTime fecha2){
        return MINUTES.between(fecha1,fecha2);
    }
    public static LocalDateTime sumarSegundos (long numeroSegundos, LocalDateTime fecha){
        LocalDateTime copia = fecha.plusSeconds(numeroSegundos);
        return copia;
    }
}