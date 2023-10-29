package ru.mirea.ex4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год (YYYY): ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (MM): ");
        int month = scanner.nextInt();
        System.out.print("Введите число (DD): ");
        int day = scanner.nextInt();
        System.out.print("Введите часы (HH): ");
        int hour = scanner.nextInt();
        System.out.print("Введите минуты (mm): ");
        int minute = scanner.nextInt();
        scanner.close();

        String inputDateStr = String.format("%04d%02d%02d%02d%02d", year, month, day, hour, minute);

        try {
            Date date = dateFormat.parse(inputDateStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            System.out.println("Введенная дата и время: " + dateFormat.format(date));
            System.out.println("Календарь: " + calendar.getTime());
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, убедитесь, что введенные данные корректны.");
        }
    }
}

