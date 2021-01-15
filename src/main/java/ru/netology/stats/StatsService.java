package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSales(int[] sales) {
        int sum = 0;
        int averagesales = 0;
        for (int sale : sales) {
            sum += sale;
            averagesales = sum / sales.length;
        }
        return averagesales;
    }

    public int calculateNumberMonthMaxSales(int[] sales) {
        int maxSales = sales[sales.length - 1];
        int number = 0;
        for (int i = sales.length - 1; i >= 0; i--) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                number = i + 1;
            }
        }
        return number;
    }

    public int calculateNumberMonthMinSales(int[] sales) {
        int minSales = sales[sales.length - 1];
        int number = 0;
        for (int i = sales.length - 1; i >= 0; i--) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                number = i + 1;
            }
        }
        return number;
    }

    public int calculateNumberMonthLessAverageSales(int[] sales) {
        int sum = 0;
        int averagesales = 0;
        int counter = 0;
        for (int sale : sales) {
            sum += sale;
            averagesales = sum / sales.length;
        }
        for (int i = 0; i < sales.length; i++) {
            if (averagesales > sales[i]) {
                counter++;
            }
        }
        return counter;
    }
    public int calculateNumberMonthOverAverageSales(int[] sales) {
        int sum = 0;
        int averagesales = 0;
        int counter = 0;
        for (int sale : sales) {
            sum += sale;
            averagesales = sum / sales.length;
        }
        for (int i = 0; i < sales.length; i++) {
            if (averagesales < sales[i]) {
                counter++;
            }
        }
        return counter;
    }


}