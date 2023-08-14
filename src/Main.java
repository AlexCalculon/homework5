public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOs = 1;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int year = 2023;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int clientOs = 1;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int distance = 500;
        int time = -1;

        if (distance <= 20) {
            time = 1;
        } else if (distance > 20 && distance <= 60) {
            time = 2;
        } else if (distance > 60 && distance <= 100) {
            time = 3;
            System.out.println(time);

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int month = 5;

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный месяц");
        }
    }
}