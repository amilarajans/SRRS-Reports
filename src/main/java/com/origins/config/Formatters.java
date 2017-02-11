package com.origins.config;

import com.origins.components.conversion.DateFormatter;
import com.origins.components.conversion.LocalDateFormatter;
import com.origins.components.conversion.LocalDateTimeFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Amila-Kumara on 10/02/2017.
 */
@Configuration
public class Formatters {

	@Bean
	public DateFormatter dateFormatter() {
		return new DateFormatter();
	}

	@Bean
	public LocalDateFormatter localDateFormatter() {
		return new LocalDateFormatter();
	}

	@Bean
	public LocalDateTimeFormatter localDateTimeFormatter() {
		return new LocalDateTimeFormatter();
	}
}
