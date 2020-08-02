package ru.netology.statistic;

public class StatsService {
    public int sellingAmount(int[] sellingByMonth) {
        int result = 0;

        for(int i = 0; i < sellingByMonth.length; i++) {
            result += sellingByMonth[i];
        }

        return result;
    }
    public double averageSelling(int[] sellingByMonth) {
        int result = sellingAmount(sellingByMonth) / sellingByMonth.length;
        return result;
    }
    public int monthWithBestSelling(int[] sellingByMonth) {
        int result = 1;
        int maxValue = sellingByMonth[0];

        for(int i = 1; i < sellingByMonth.length; i++) {
            if (sellingByMonth[i] >= maxValue) {
                result = i + 1;
                maxValue = sellingByMonth[i];
            };
        }

        return result;
    }
    public int monthWithWorstSelling(int[] sellingByMonth) {
        int result = 1;
        int minValue = sellingByMonth[0];

        for(int i = 1; i < sellingByMonth.length; i++) {
            if (sellingByMonth[i] <= minValue) {
                result = i + 1;
                minValue = sellingByMonth[i];
            };
        }

        return result;
    }
    public int monthCountWithSellingUnderAverage(int[] sellingByMonth) {
        int result = 0;
        double average = averageSelling(sellingByMonth);

        for(int i = 0; i < sellingByMonth.length; i++) {
            if(sellingByMonth[i] < average) result++;
        }

        return result;
    }
    public int monthCountWithSellingAboveAverage(int[] sellingByMonth) {
        int result = 0;
        double average = averageSelling(sellingByMonth);

        for(int i = 0; i < sellingByMonth.length; i++) {
            if(sellingByMonth[i] > average) result++;
        }

        return result;
    }
}
