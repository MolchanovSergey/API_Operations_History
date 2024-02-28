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
        System.out.println("Hello and welcome, dear Man!");
//        System.out.println("Please enter transaction parameters: id, amount, date.");
//        System.out.println("For example: 3456723 24000,00 2024.02.24");
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int[] ids = new int[10];
//        boolean[] isFilled = new boolean[10];
        double[] amounts = new double[10];
        LocalDate[] dates = new LocalDate[10];


        while (true) {
            System.out.println("Please enter transaction parameters: id amount date");
            System.out.println("For example: 3456723 24000,00 2024.02.24");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }


            String[] parts = input.split(" ");
            int id = Integer.parseInt(parts[0]);
            double amount = Double.parseDouble(parts[1]);

            var f = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate date = LocalDate.parse(parts[2], f);

            ids[i] = id;
            amounts[i] = amount;
            dates[i] = date;
//            isFilled[i] = true;

            i++;
        }
//        System.out.println(Arrays.toString(dates));
//    }


//            int id = scanner.nextInt();
//            double sum = scanner.nextDouble();
//            String dateString = scanner.nextLine().trim();
//
//            var f = DateTimeFormatter.ofPattern("yyyy.MM.dd");
//            LocalDate date = LocalDate.parse(dateString, f);
//
//            ints[i] = id;
//            doubles[i] = sum;
//            dates[i] = date;
//
//
//            i++;
//
//        }
        System.out.println("Введите диапазон дат: 2022.01.01-2022.02.01");
        String input1 = scanner.nextLine();
        String[] parts2 = input1.split("-");

        var f = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate start_date = LocalDate.parse(parts2[0], f);
        LocalDate finish_date = LocalDate.parse(parts2[1], f);


        System.out.println("В выбранном промежутке времени найдены транзакции:");
        for (int j = 0; j < ids.length; j++) {
            if (dates[j].isAfter(start_date) && dates[j].isBefore(finish_date)) {

                int idd = ids[j];
                double sums = amounts[j];
                LocalDate date_s = dates[j];
                System.out.println(idd + " " + sums + " " + date_s);


            }
        }
    }
}
//
//}



