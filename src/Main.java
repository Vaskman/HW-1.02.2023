public class Main {
    public static void yearCalculation(int yearValues) {
        if (yearValues % 4 == 0 && yearValues != 100 || yearValues == 400)
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
        int distanceValue=0;
        if (a > 0 && a <= 20) {
            distanceValue = distanceValue + 1;}
        else if (a>20 && a<=60) {
            distanceValue = distanceValue + 2;
        } else if (a>60 && a<=100) {
            distanceValue=distanceValue+3;
        } else if (a > 100) {
            distanceValue=distanceValue+4;
        }
        return distanceValue;
    }
    public static void consoleСompartment() {
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        consoleСompartment();
        System.out.println("Задача №1");
        int yearValues = 2023;
        yearCalculation(yearValues);
        consoleСompartment();

        System.out.println("Задача №2");
        int versionOS = 1;
        int yearOfIssue = 2022;
        defineSmartphone(versionOS,yearOfIssue);
        consoleСompartment();

        System.out.println("Задача №3");
        int distance = 103;
        int l= determineTheDeliveryTime(distance);
        if (l == 1) {
            System.out.println("Потребуется дней "+l+" сутки");
        } else if (l==2) {
            System.out.println("Потребуется дней "+l+" суток");
        }else if (l==3) {
            System.out.println("Потребуется дней "+l+" суток");
        } else if (l==4) {
            System.out.println("Доставки нет");
        }
        consoleСompartment();
    }
}

