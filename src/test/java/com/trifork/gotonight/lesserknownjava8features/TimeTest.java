package com.trifork.gotonight.lesserknownjava8features;

import org.junit.Test;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class TimeTest {
    LocalDate today = LocalDate.now();

    @Test
    public void canFindDayOfChristmasIn2015() throws Exception {
        assertEquals("Friday", LocalDate.of(2014, 12, 25).plus(12, ChronoUnit.MONTHS).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }

    @Test
    public void canFindNumberOfDaysUntilChristmas() throws Exception {
        assertEquals("P4M13D", today.until(LocalDate.of(2014, 12, 25)).toString());
    }

    @Test
    public void canConvertOldDateToNewTime() throws Exception {
        assertEquals(
                LocalDateTime.now(),
                LocalDateTime.from(new Date().toInstant().atZone(ZoneId.systemDefault()))
        );
    }
}
