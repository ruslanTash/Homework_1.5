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
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2012;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        }
public static void task3(){
    System.out.println("Задача 3");
    int year = 2022;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        System.out.println(year + " год является высокосным");
    } else {
        System.out.println(year + " год не является высокосным");
    }

}
public static void task4(){
    System.out.println("Задача 4");
    int deliveryDistance = 95;
    int deliveryDays = 1;
if(deliveryDistance <= 100) {
    if (deliveryDistance > 20) {
        deliveryDays++;
    }
    if (deliveryDistance > 60) {
        deliveryDays++;
    }
    System.out.println("Для доставки на расстояние в пределах " + deliveryDistance + " км. потребуется дней: " + deliveryDays);
} else {
        System.out.println("Свыше 100 км. доставки нет!");
}
    }
public static void task5(){
//Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
//
//Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
//
//Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
    System.out.println("Задача 5");
    int monthNumber = 8;
    switch (monthNumber){
        case 1:
        case 2:
        case 12:
            System.out.println(monthNumber + " по счёту месяц относитсе к зиме");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println(monthNumber + " по счёту месяц относитсе к весне");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println(monthNumber + " по счёту месяц относитсе к лету");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println(monthNumber + " по счёту месяц относитсе к осени");
            break;
        default:
            System.out.println(monthNumber + " - такого месяца не существует");

    }
    }
}

