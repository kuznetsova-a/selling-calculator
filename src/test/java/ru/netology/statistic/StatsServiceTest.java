package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSellingAmount() {
        StatsService service = new StatsService();

        int[] sellingByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sellingAmount(sellingByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSelling() {
        StatsService service = new StatsService();

        int[] sellingByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.averageSelling(sellingByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthWithBestSelling() {
        StatsService service = new StatsService();

        int[] sellingByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthWithBestSelling(sellingByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthWithWorstSelling() {
        StatsService service = new StatsService();

        int[] sellingByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthWithWorstSelling(sellingByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthCountWithSellingUnderAverage() {
        StatsService service = new StatsService();

        int[] sellingByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthCountWithSellingUnderAverage(sellingByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthCountWithSellingAboveAverage() {
        StatsService service = new StatsService();

        int[] sellingByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthCountWithSellingAboveAverage(sellingByMonth);

        assertEquals(expected, actual);
    }
}