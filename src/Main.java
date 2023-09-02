public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
    }

    public static void findLeapYear(int leapYear) {
        if (leapYear % 4 == 0) {
            System.out.println(leapYear + " год - високосный год");
        } else {
            System.out.println(leapYear + " год - невисокосный год");
        }
    }

    public static void task1() {
        System.out.println("\n Задача 1 \n");

        int year = 2024;
        findLeapYear(year);
    }
}