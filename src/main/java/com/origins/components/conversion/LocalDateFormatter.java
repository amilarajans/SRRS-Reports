package com.origins.components.conversion;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component
public class LocalDateFormatter implements Formatter<LocalDate> {

    public LocalDateFormatter() {
        super();
    }

    public LocalDate parse(final String text, final Locale locale) throws ParseException {
        return LocalDate.parse(text, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String print(final LocalDate object, final Locale locale) {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(object);
    }

}
