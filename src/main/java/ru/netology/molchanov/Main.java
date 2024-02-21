package ru.netology.molchanov;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome, Sergey Molchanov!\n");
        System.out.printf("Please enter transaction parameters: id, amount, date.\n");
        System.out.printf("For example: 3456723 24000,00 2024.02.24\n");

        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        double sum = scanner.nextDouble();
        String dateString = scanner.nextLine().trim();

        var f = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(dateString, f);

        System.out.println("You enter: " + id + " " + sum + " " + date);
    }
}



