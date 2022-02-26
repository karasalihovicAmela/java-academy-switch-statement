package com.company;

import java.util.Scanner;

public class Activity {

    public static void main(String[] args) {

        String color = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a color: ");

        color = scanner.nextLine();

        switch (color) {
            case "Yellow":
                System.out.println("You picked yellow!");
                break;
            case "Red":
                System.out.println("You picked red!");
                break;
            case "Green":
                System.out.println("You picked green!");
                break;
            case "Orange":
                System.out.println("You picked orange!");
                break;
            case "Blue":
                System.out.println("You picked blue!");
                break;
            default:
                System.out.println("We don't have that color!");
        }


        System.out.println("Write a month number: ");
        int year;
        year = scanner.nextInt();
        switch (year) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
        }

        System.out.println("Write two decimal numbers: ");
        double a = 0.0;
        double b = 0.0;

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        if ((a + b) > 10.0) {
            System.out.println(a * b);
        } else {
            System.out.println(a + b);
        }
    }

}
