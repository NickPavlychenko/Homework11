//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        leapYear(2021);
        System.out.println();
        System.out.println("Задание 2");
        deviceYear(2015, 1);
        System.out.println();
        System.out.println("Задание 3");
        calculateDeliveryDays(95);
    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void deviceYear(int deviceYear, int clientOS) {
        if (deviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите приложение для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите приложение для Android по ссылке.");
            }
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
            return -1;
        }
        int days = 1;
        if (deliveryDistance > 20) days++;
        if (deliveryDistance > 60) days++;
        System.out.println("Потребуется " + days + " дня на доставку.");
        return days;
    }
}