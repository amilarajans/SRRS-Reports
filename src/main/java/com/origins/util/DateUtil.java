package com.origins.util;

import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by Amila-Kumara on 10/02/2017.
 */
@Component
public class DateUtil {

	public long getMonths(Date startDate, Date endDate) {
		LocalDateTime date1 = LocalDate.from(startDate.toInstant()).atTime(0, 0, 0, 0);
		LocalDateTime date2 = LocalDate.from(endDate.toInstant()).atTime(0, 0, 0, 0);

		return ChronoUnit.MONTHS.between(date1, date2);
	}

	public long getDays(LocalDate startDate, LocalDate endDate) {
		return Duration.between(startDate, endDate).toDays();
	}

	public Stream<LocalDateTime> getDaysBetween(LocalDateTime startDate, LocalDateTime endDate) {
		return LongStream.range(0, Duration.between(startDate, endDate).toDays()).mapToObj(startDate::plusDays);
	}

	public static String getFormatedDate(LocalDateTime startDate) {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(startDate);
	}
}
