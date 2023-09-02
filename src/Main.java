import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    //Задача 1

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

    //Задача 2

    public static void whichVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке \n ");
        } else  if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке \n");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке \n");
        } else  if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке \n");
        }
    }

    public static void task2() {
        System.out.println("\n Задача 2 \n");

        int deviceYear = 2023;
        int deviceOS = 0;
        whichVersion(deviceOS, deviceYear);
    }
}