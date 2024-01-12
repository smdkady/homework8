package ru.netology.stats;

public class StatsService {
    public int allSales(long[] sales) {
        int allSales = 0;

        for (int i = 0; i < sales.length; i++) {
            allSales += sales[i];
        }

        return allSales;
    }

    public int averageSum(long[] sales) {
        int allSales = 0;

        for (int i = 0; i < sales.length; i++) {
            allSales += sales[i];
        }
        int averageSum = allSales / 12;
        return averageSum;


    }

    public int monthMaximum(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }


        }
        return monthMaxSale + 1;
    }

    public int monthMinimum(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }


        }
        return monthMinSale + 1;
    }

    public int belowAverage(long[] sales) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum(sales)) {
                counter++;
            }
        }

        return counter;
    }

    public int higherAverage(long[] sales) {
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum(sales)) {
                counter++;
            }
        }

        return counter;
    }
}
