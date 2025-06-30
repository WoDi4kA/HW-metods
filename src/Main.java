import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void isLeapYear(int number) {
        if ((number % 4 == 0 || number % 100 == 0) && number % 400 != 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

    }

    public static void isItGoodDevise(short clientDeviseYear, int releaseYear) {
        int currentYear = 2025;
        if (releaseYear < currentYear) {
            if (clientDeviseYear == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (releaseYear == currentYear) {
            System.out.println("С устройством все в порядке");
        }

    }

    public static int deliveryBankCard(int distance) {
        int countOfDays = 0;
        if (distance <= 20) {
            countOfDays = 1;
        } else if (distance > 20 && distance <= 60) {
            countOfDays = 2;
        } else if (distance > 60 && distance < 100) {
            countOfDays = 3;
        } else if (distance >= 100) {
            countOfDays = 0;
        }

        return countOfDays;
    }

    public static void main(String[] args) {

        //Task#1

        int year = 2000;
        isLeapYear(year);

        System.out.println();

        //Task#2

        short clientDeviseYear = 0;
        int releaseYear = 2025;
        isItGoodDevise(clientDeviseYear, releaseYear);

        System.out.println();

        //Task#3

        int distance = 77;
        if (deliveryBankCard(distance) == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println(deliveryBankCard(distance));
        }

    }
}