package ru.netology.molchanov;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);

        int i = 0;
//        Operation[] operations = new Operation[10]; // Массив для хранения данных по транзакциям
        Customer[] customers = new Customer[10];// Массив для хранения данных по клиентам
        int[][] statement = new int[10][10];// Массив для хранения принадлежности операции клиенту

        while (true) {
            System.out.println("Ввведите данные по клиенту: id ФИО через пробел");
            System.out.println("Пример ввода: 1 Иванов Иван Иванович");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println(Arrays.deepToString(customers));
                break;
            }


            String[] parts1 = input.split(" ");
            int id = Integer.parseInt(parts1[0]);
            String ferstname = String.format(parts1[2]);
            String secondname = String.format(parts1[1]);
            String midlname = String.format(parts1[3]);

//            Customer cust = new Customer(id, ferstname, secondname, midlname);
//            customers.add(cust);
            Customer cust = new Customer(id,
                    ferstname,
                    secondname,
                    midlname);
            customers[i] = cust;


//            ids[i] = id;
//            amounts[i] = amount;
//            dates[i] = date;
//            isFilled[i] = true;

            i++;
        }

        while (true) {
            System.out.println("Ввведите данные по транзакции: id amount date customer");
            System.out.println("Пример ввода: 3456723 24000,00 2024.02.24 1");
            String input = scanner.nextLine();
            List<Operation> operations = new ArrayList<>();
            if ("end".equals(input)) {
                System.out.println("All transactions:");
                for (Operation operation : operations) {
                    System.out.println(operation);
//                System.out.println(Arrays.deepToString(operations));
                break;
            }


            String[] parts = input.split(" ");
            int id = Integer.parseInt(parts[0]);
            double amount = Double.parseDouble(parts[1]);

            var f = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate date = LocalDate.parse(parts[2], f);

            int customer = Integer.parseInt(parts[3]);

            Operation op = new Operation(id, amount, date, customer);
            operations.add(op);

//            operations[i] = op;


//            ids[i] = id;
//            amounts[i] = amount;
//            dates[i] = date;
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
        for (Operation operation : operations) {
            if (operation != null && operation.getDate().isAfter(start_date) && operation.getDate().isBefore(finish_date)) {
                System.out.println(" " + operation.getDate() +
                        " " + operation.getAmount() +
                        " " + operation.getDate());
                }

//                int idd = operation.getId();
//                double sums = operation.getAmount();
//                LocalDate date_s = operation.getDate();
//                System.out.println(idd + " " + sums + " " + date_s);


            }
        }
    }
}
//
//}



//Path txt1 = Paths.get("D:\\Вебинар 8\\dot.point");
//
//// Запись
//        try (OutputStream fileOutputStream = Files.newOutputStream(txt1)) {
//Point p = new Point(5, 7);
//
//ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(p);
//        } catch (IOException e) {
//        throw new RuntimeException(e);
//        }
//
//                // Чтение
//                try (InputStream fileInputStream = Files.newInputStream(txt1)) {
//ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//Point p = (Point) objectInputStream.readObject();
//
//            System.out.println(p);
//        } catch (IOException | ClassNotFoundException e) {
//        throw new RuntimeException(e);
//        }
//
//public static class Point implements Serializable {
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    int x;
//    int y;
//
//    @Override
//    public String toString() {
//        return x + " " + y;
//    }
//}
