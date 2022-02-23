package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("[FOR CLIENT:] Welcome to McJava! " +
                "\nWhat can we serve you today? (choose an option:)" +
                "\n1) Latte" +
                "\n2) Americano" +
                "\n3) Espresso" +
                "\n4) Double Espresso" +
                "\n5) Macchiato" +
                "\n6) Nothing, thanks! :)");

        // Declare necessary variable(s)
        int option;

        double balance = 12.33;

        String coffeeType = "";

        double price = 0;
        double tax = 0.25d;
        double profit = 0;

        boolean hasSteamedMilk = false;
        boolean hasFoam = false;
        boolean hasEspresso = false;
        boolean hasHotWater = false;
        int espressoOz = 0;

        // Input user value through Scanner
        Scanner scanner = new Scanner(System.in);

        // Initialize the variable using the input from Sacanner
        option = scanner.nextInt();

        // Write a switch statement using the inputed variable
        switch (option) {
            case 1:
                coffeeType = "Latte";
                price = 1.60d;
                hasEspresso = true;
                hasSteamedMilk = true;
                break;
            case 2:
                coffeeType = "Americano";
                price = 1.35d;
                hasEspresso = true;
                hasHotWater = true;
                break;
            case 3:
                coffeeType = "Espresso";
                price = 1.75d;
                espressoOz = 1;
                break;
            case 4:
                coffeeType = "Double Espresso";
                price = 2.50d;
                espressoOz = 2;
                break;
            case 5:
                coffeeType = "Macchiato";
                price = 2.00d;
                hasEspresso = true;
                hasFoam = true;
                break;
            case 6:
                System.out.println("Not a problem, have a great day! :)");
                break;
            default:
                System.out.println("Sorry, we don't serve that at the moment.");
        }

        // Continue program after the switch statement
        if (!coffeeType.equals("")) {
            String forClient = "[FOR CLIENT:] You ordered a " + coffeeType + "! Enjoy!";
            System.out.println(forClient);

            String forStaff = "\n[FOR STAFF:] Client #1 ordered a " + coffeeType + "." +
                    "\nIngredients:";
            if (hasEspresso) {
                forStaff += "\n- Espresso";
            }
            if (hasSteamedMilk) {
                forStaff += "\n- Steamed Milk";
            }
            if (hasFoam) {
                forStaff += "\n- Foam";
            }
            if (hasHotWater) {
                forStaff += "\n- Hot Water";
            }
            if (espressoOz > 0) {
                forStaff += "\n- " + espressoOz + "oz Espresso";
            }
            System.out.println(forStaff);

            profit = Math.round((price - (price * tax)) * 100) / 100.00;
            tax = Math.round((price * tax) * 100) / 100.00;
            String forAccounting = "\n[FOR ACCOUNTING:] Client #1 ordered a " + coffeeType + "." +
                    "\nPrice: \t\t\t\t$" + price +
                    "\nTax: \t\t\t\t$" + tax +
                    "\nProfit: \t\t\t$" + profit +
                    "\n------------------------------------" +
                    "\nStarting balance: \t$" + balance + " (+$" + profit + ")";
            balance += profit;
            forAccounting += "\nEnding balance: \t$" + balance;
            System.out.println(forAccounting);
        }
    }
}
