public class Main {
    public static void yearCalculation(int yearValues) {
        if (yearValues % 4 == 0 && yearValues % 100 != 0 || yearValues % 400 == 0)
            System.out.println(+yearValues + " год является високосным");
        else
            System.out.println(+yearValues + " год не является високосным");
    }

    public static void defineSmartphone(int versionOS, int yearOfIssue) {
        if (versionOS == 0 && yearOfIssue >= 2023) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (versionOS == 0 && yearOfIssue < 2023) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (versionOS == 1 && yearOfIssue >= 2023) {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (versionOS == 1 && yearOfIssue < 2023) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("К сожалению для вашей системы нет приложения");
        }
    }

    public static int determineTheDeliveryTime(int a) {
        int distanceValue = 0;
        if (a > 100) {
            distanceValue = distanceValue - 1;
        }
        return distanceValue;
    }

    public static void consoleСompartment() {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        consoleСompartment();
        System.out.println("Задача №1");
        int yearValues = 800;
        yearCalculation(yearValues);
        consoleСompartment();

        System.out.println("Задача №2");
        int versionOS = 1;
        int yearOfIssue = 2022;
        defineSmartphone(versionOS, yearOfIssue);
        consoleСompartment();

        System.out.println("Задача №3");
        int distance = 100;
        int exception = determineTheDeliveryTime(distance);
        if (exception == -1) {
            System.out.println("Доставки нет");
        } else if (distance > 0 && distance <= 20) {
            System.out.println("Потребуется один сутки");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется двое суток");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется трое суток");
            consoleСompartment();
        }
    }
}

