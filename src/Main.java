public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Невозможно определить ОС");
        }

        System.out.println("Задача 2.");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        else {
            System.out.println("Невозможно определить ОС");
        }

        System.out.println("Задача 3.");
        // solution 1
        int year = 2021;
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            }
            else {
                System.out.println(year + " год не является високосным.");
            }
        }
        else {
            System.out.println("Понятие високосного года еще не введено.");
        }

        // solution 2
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 ==0)) {
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задача 4.");
        int deliveryDistance = 177;
        int daysForDelivery;
        if (deliveryDistance < 20) {
            daysForDelivery = 1;
            System.out.println("Потребуется дней: " + daysForDelivery);
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            daysForDelivery = 2;
            System.out.println("Потребуется дней: " + daysForDelivery);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysForDelivery = 3;
            System.out.println("Потребуется дней: " + daysForDelivery);
        }
        else {
            System.out.println("Нет доставки.");;
        }

        System.out.println("Задача 5.");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }

    }
}