package de.carstenkremser.neuefische;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
        System.out.println("aktueller Zeitpunkt: " + currentZonedDateTime.format(formatter));

        ZonedDateTime inTwoWeeks = currentZonedDateTime.plusWeeks(2);
        System.out.println("2 Wochen später: " + inTwoWeeks.format(formatter));

        System.out.println("jetzt verglichen mit in 2 Wochen: " + currentZonedDateTime.compareTo(inTwoWeeks));
        System.out.println("jetzt ist vor in 2 Wochen: " + currentZonedDateTime.isBefore(inTwoWeeks));
        System.out.println("jetzt ist nach in 2 Wochen: " + currentZonedDateTime.isAfter(inTwoWeeks));

        long randomSeconds = Math.round(Math.random()*60*60*24*365*5);
        ZonedDateTime randomDate = ZonedDateTime.now().plusSeconds(randomSeconds);

        System.out.println("Der Unterschied in Monaten  zwischen jetzt und " + randomDate + " ist: " + ChronoUnit.MONTHS.between(currentZonedDateTime, randomDate));
        System.out.println("Der Unterschied in Tagen    zwischen jetzt und " + randomDate + " ist: " + ChronoUnit.DAYS.between(currentZonedDateTime, randomDate));
        System.out.println("Der Unterschied in Stunden  zwischen jetzt und " + randomDate + " ist: " + ChronoUnit.HOURS.between(currentZonedDateTime, randomDate));
        System.out.println("Der Unterschied in Minuten  zwischen jetzt und " + randomDate + " ist: " + ChronoUnit.MINUTES.between(currentZonedDateTime, randomDate));
        System.out.println("Der Unterschied in Sekunden zwischen jetzt und " + randomDate + " ist: " + ChronoUnit.SECONDS.between(currentZonedDateTime, randomDate));

    }
}