package com.origins.components.conversion;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component
public class LocalDateTimeFormatter implements Formatter<LocalDateTime> {

	public LocalDateTimeFormatter() {
		super();
	}

	@Override
	public LocalDateTime parse(final String text, final Locale locale) throws ParseException {
		return LocalDateTime.parse(text, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	}

	@Override
	public String print(final LocalDateTime object, final Locale locale) {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(object);
	}

}
