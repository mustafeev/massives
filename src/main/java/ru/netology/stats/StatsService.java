package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        long result = sum(sales);
        return result / 12;
    }
public int maximum(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
    for (int i= 0; i<sales.length; i++) {
        if (sales [i] >= maxSale) {
            maxSale = sales[i];
            maxMonth = i;
        }

    }
    return maxMonth +1;
}

    public int minimum(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i= 0; i<sales.length; i++) {
            if (sales [i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }

        }
        return minMonth +1;
    }

}
