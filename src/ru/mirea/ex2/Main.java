package ru.mirea.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Date dateNow = new Date();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату и время в формате (дд.мм.гггг чч:мм:сс): ");

        String userInput = scanner.nextLine();
        scanner.close();

        try {
            Date dateInput = dateFormat.parse(userInput);

            if (dateNow.before(dateInput)) {
                System.out.println("Введенная дата и время позже текущей даты и времени.");
            } else if (dateNow.after(dateInput)) {
                System.out.println("Введенная дата и время раньше текущей даты и времени.");
            } else {
                System.out.println("Введенная дата и время совпадают с текущей датой и временем.");
            }
        } catch (Exception e) {
            System.out.println("Неверный формат даты и времени. Введите дату и время в правильном формате.");
        }
    }
}

