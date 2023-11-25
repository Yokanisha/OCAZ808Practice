package Dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        // Ein LocalDateTime-Objekt erstellen (zum Beispiel das aktuelle Datum und die aktuelle Uhrzeit)
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Ein ZonedDateTime-Objekt erstellen, das die Zeitzone enthält
        ZonedDateTime zonedDateTime = ZonedDateTime.of(currentDateTime, ZoneId.systemDefault());

        // Formatter mit FormatStyle.FULL erstellen
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        String formattedFull = zonedDateTime.format(fullFormatter);
        System.out.println("Formatiert mit FormatStyle.FULL: " + formattedFull);

        // Formatter mit BASIC_ISO_DATE erstellen
        DateTimeFormatter basicIsoFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formattedBasicIso = currentDateTime.format(basicIsoFormatter);
        System.out.println("Formatiert mit BASIC_ISO_DATE: " + formattedBasicIso);
    }
}
