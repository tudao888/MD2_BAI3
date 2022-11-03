import java.util.Scanner;

public class chuyendoinhietdo {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Nhap vao do F:");
                double F = scanner.nextDouble();
                double C = (5.0 / 9) * (F - 32);
                System.out.println(F + "doF bang voi: " + C + "doC");
                break;
            case 2:
                System.out.println("Nhap vao do C:");
                double C1 = scanner.nextDouble();
                double F1 = (9.0 / 5) * C1 + 32;
                System.out.println(C1 + "doC bang voi: " + F1 + "doF");
                break;
            case 0:
                System.exit(0);

        }
    }
}
//package com.codegym;
//import java.util.Scanner;
//
//public class chuyendoinhietdo {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double fahrenheit;
//        double celsius;
//        int choice;
//
//        do {
//            System.out.println("Menu.");
//            System.out.println("1. Fahrenheit to Celsius");
//            System.out.println("2. Celsius to Fahrenheit");
//            System.out.println("0. Exit");
//            System.out.println("Enter your choice: ");
//            choice = input.nextInt();
//
//            switch (choice) {
//                case 1: {
//                    System.out.println("Enter fahrenheit: ");
//                    fahrenheit = input.nextDouble();
//                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
//                    break;
//                }
//                case 2:{
//                    System.out.println("Enter Celsius: ");
//                    celsius = input.nextDouble();
//                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
//                    break;
//                }
//                case 0:
//                    System.exit(0);
//            }
//        } while (choice != 0);
//    }
//
//    public static double celsiusToFahrenheit(double celsius) {
//        double fahrenheit = (9.0 / 5) * celsius + 32;
//        return fahrenheit;
//    }
//
//    public static double fahrenheitToCelsius(double fahrenheit) {
//        double celsius = (5.0 / 9) * (fahrenheit - 32);
//        return celsius;
//    }
//}
