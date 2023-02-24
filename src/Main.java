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

    }
    public static void task4 () {
        System.out.println("Задача 4");

    }
    public static void task5 () {
        System.out.println("Задача 5");

    }
    public static void task6 () {
        System.out.println("Задача 6");

    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
    public static void task8 () {
        System.out.println("Задача 8");

    }
}