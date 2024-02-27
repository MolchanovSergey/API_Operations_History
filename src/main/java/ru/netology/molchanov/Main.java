package ru.netology.molchanov;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome, dear Man!\n");
        System.out.println("Please enter transaction parameters: id, amount, date.\n");
        System.out.println("For example: 3456723 24000,00 2024.02.24\n");


        int[] ints = new int[5];
        double[] doubles = new double[5];
        LocalDate[] dates = new LocalDate[5];

        int i = 0;

        while (i < 5) {

//            System.out.printf("Please enter transaction parameters: id, amount, date.\n");
//            System.out.printf("For example: 3456723 24000,00 2024.02.24\n");

            Scanner scanner = new Scanner(System.in);

            int id = scanner.nextInt();
            double sum = scanner.nextDouble();
            String dateString = scanner.nextLine().trim();

            var f = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate date = LocalDate.parse(dateString, f);

            ints[i] = id;
            doubles[i] = sum;
            dates[i] = date;

//            System.out.println("You enter: " + id + " " + sum + " " + date);
            i++;

        }
            System.out.println("Вы ввели транзакции:");
            for (int j = 0; j < 5; j++) {
                int ids = ints[j];
                double sums = doubles[j];
                LocalDate date_s = dates[j];
                System.out.println(ids + " " + sums + " " + date_s);
            }
    }

}



