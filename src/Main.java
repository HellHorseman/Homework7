public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
    int total = 0;
    int putAside = 15_000;
    int month = 1;
    while (total < 2_459_000) {
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        month++;
        total = total + putAside;
    }
    }

    public static void task2 () {
        System.out.println("Задача 2");
    int i = 0;
    while (i < 10) {
        i++;
        System.out.print(i + " ");
    }
        System.out.println();
    for (int ii = 10; ii >= 1; ii--) {
        System.out.print(ii + " ");
    }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
    int countryPopulation = 12_000_000;
    int yearBirthrate = 17 * 12_000;
    int yearDeathRate = 8 * 12_000;
    for (int year = 1; year <= 10; year++) {
        countryPopulation = countryPopulation + (yearBirthrate - yearDeathRate);
        System.out.println("Год " + year + ", численность населения составляет " + countryPopulation);
    }
    }
    public static void task4 () {
        System.out.println("Задача 4");
    int deposit = 15_000;
    int monthlyInterest = 7;
    for (int i = 1; deposit <= 12_000_000; i++) {
        int percents = deposit / 100 * monthlyInterest;
        deposit = deposit + percents;
        System.out.println("Месяц " + i + ", накоплено " + deposit + " рублей");
    }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int deposit = 15_000;
        int monthlyInterest = 7;
        for (int i = 1; deposit <= 12_000_000; i++) {
            int percents = deposit / 100 * monthlyInterest;
            deposit = deposit + percents;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", накоплено " + deposit + " рублей");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int deposit = 15_000;
        int monthlyInterest = 7;
        int totalTime = 9 * 12;
        int month = 1;
        while (month <= totalTime) {
            int percents = deposit / 100 * monthlyInterest;
            deposit = deposit + percents;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накоплено " + deposit + " рублей");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
    public static void task8 () {
        System.out.println("Задача 8");

    }
}