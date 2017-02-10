package com.origins.config;

import com.origins.components.conversion.LocalDateFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.origins.components.conversion.DateFormatter;

/**
 * Created by Amila-Kumara on 10/02/2017.
 */
@Configuration
public class Formatters {

    @Bean
    public DateFormatter dateFormatter() {
        return new  DateFormatter();
    }

    @Bean
    public LocalDateFormatter localDateFormatter() {
        return new  LocalDateFormatter();
    }
}
