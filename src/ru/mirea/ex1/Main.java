package ru.mirea.ex1;

import java.text.ParsePosition;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        String name = "Пилия";

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date dateRecieved = format.parse("2023/09/01 00:00:00", new ParsePosition(0));

        Date dateSubmission = format.parse("2023/10/30 00:00:00", new ParsePosition(0));

        System.out.println("Фамилия разработчика: " + name);
        System.out.println("Дата и время получения задания: " + dateRecieved);
        System.out.println("Дата и время сдачи задания: " + dateSubmission);
    }
}

