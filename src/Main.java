import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //Задача 1

    public static void findLeapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год - високосный год");
        } else {
            System.out.println(leapYear + " год - невисокосный год");
        }
    }

    public static void task1() {
        System.out.println("\n Задача 1 \n");

        int year = 2000;
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

    //Задача 3

    public static void deliveryTime(int distance) {
        int time = 1;
        if (distance <= 20) {
            System.out.println("Потребуется " + time + " день \n");
        } else if (distance >= 20 && distance < 60){
            System.out.println("Потребуется " + time * 2 + " дня \n");
        } else if (distance >= 60 && distance <= 100) {
            System.out.println("Потребуется " + time * 3 + " дня \n");
        } else if (distance > 100) {
            System.out.println("Свыше 100км доставки нет \n");
        }
    }

    public static void task3() {
        System.out.println("\n Задача 3 \n");

        int distance = 11;
        deliveryTime(distance);
    }
}