public class Main {
    public static void yearCalculation(int a) {
        int sum = a;
        System.out.println("Год "+sum);
        if (a % 4 == 0 && a !=100 || a ==400)
            System.out.println("Год високосный");
        else
            System.out.println("Обычный");
    }
    public static int defineSmartphone (int t, int y) {
        int tel = t;
        if (t == 0)
            System.out.println("У Вас iOS");
        else
            System.out.println("У Вас Android");
        int yer = y;
        if (y < 2023)
            System.out.println("Установите обычную версию");
        else
            System.out.println("Установите облегченную версию");
        return tel;
    }
    public static int determineTheDeliveryTime (int a) {
        int dis = a;
        if (a >0 && a < 20) {
            System.out.println("Сутки");
        } else if (a > 20 && a < 60) {
            System.out.println("двое суток");
        } else if (a > 60 && a < 100) {
            System.out.println("трое суток");
        } else {
            System.out.println("доставки нет");
        }
        return dis;

    }
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int a= 2024;
        yearCalculation(a);
        System.out.println("Задача №2");
        int t = 1;
        int y = 2022;
        defineSmartphone(t,y);
        System.out.println("Задача №3");
        int distance = 22;
        determineTheDeliveryTime(distance);

    }
}

