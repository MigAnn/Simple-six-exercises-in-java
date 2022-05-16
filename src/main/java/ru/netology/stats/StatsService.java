package ru.netology.stats;

//        Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
//        Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int medium(int[] sales) {   //в этом задании я бы стала использовать переменную double вместо int так как
        // была вероятность того, что число могло быть дробным, но у нас целое число
        int sum = sum(sales);
        int month = 0;
        int medium=0;
        for (int sale : sales) {
            month = sales.length;
            medium = sum/month;
        }
        return medium ;
    }

    public int maxSales(int[] sales) {
        int maxSales = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxSales]) {
                maxSales = month;
            }
            month = month + 1;
        }
        return maxSales + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int mediumMin(int[] sales) {
        int month = 0;
        int medium = medium(sales);
        for (int sale : sales) {
            if (sale < medium) {
                month++;
            }
        }
        return month;
    }

    public int mediumMax(int[] sales) {
        int month=0;
        int medium = medium(sales);
        for (int sale : sales) {
            if (sale > medium) {
                month++;
            }
        }
        return month;
    }
}


