package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatsServiceTest {

    @Test

    public void testAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.allSales(sales);

        long expected = 180;
        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void testAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSum(sales);

        long expected = 15;
        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void testMonthMaximum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMaximum(sales);

        long expected = 8;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testMonthMinimum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMinimum(sales);

        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.belowAverage(sales);

        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.higherAverage(sales);

        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }


}