package ru.netology.stats;
//Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
//Кол-во месяцев, в которых продажи были выше среднего (см. п.2)


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
        int medium = 0;
        for (int sale : sales) {
            medium += sale;
        }
        return medium / sales.length;
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
        int mounth = 0;
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        int medium = sum / 12;
        for (int sale : sales) {
            if (sale < medium) {
                mounth++;
            }
        }
        return mounth;
    }

    public int mediumMax(int[] sales) {
        int mounth = 0;
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        int medium = sum / 12;
        for (int sale : sales) {
            if (sale > medium) {
                mounth++;
            }
        }
        return mounth;
    }
}





