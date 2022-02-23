package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("Hello, welcome to McJava Cafe!" +
                "\nWhat can we serve you today? (choose an option:)" +
                "\n1) Espresso" +
                "\n2) Double Espresso" +
                "\n3) Macchiato" +
                "\n4) Nothing, thank you! :)");

        // Declare a set of variables to store coffee data
        int option;

        boolean hasSteamedMilk = false;
        boolean hasFoam = false;
        boolean hasEspresso = false;
        boolean hasHotWater = false;
        int espressoOz = 0;

        String coffeeType = "";

        double balance = 0;
        double price = 0;

        // Create an instance of a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

        // Write a Switch statement that will evaluate the user input
        switch (option) {
            // Write cases for switch statement
            case 1:
                coffeeType = "Espresso";
                espressoOz = 1;
                hasEspresso = true;
                price = 1.4;
                break;
            case 2:
                coffeeType = "Double Espresso";
                espressoOz = 2;
                hasEspresso = true;
                hasFoam = true;
                price = 2.8;
                break;
            case 3:
                coffeeType = "Macchiato";
                hasSteamedMilk = true;
                hasEspresso = true;
                price = 2.0;
                break;
            case 4:
                System.out.println("Thank you, have a great day! :)");
                break;
            default:
                System.out.println("Sorry, we don't serve that here!");
        }

        if (!coffeeType.equals("")) {
            // Write the output of the program at the end (messages for CLIENT, STAFF and ACCOUNTING)
            System.out.println("[CLIENT:] Your order -> " + coffeeType + "" +
                    "\nThat would be $" + price + ", please.");

            String staff = "[STAFF:] Client's order (#1) -> " + coffeeType +
                    "\nIngredients:";

            if (hasEspresso) {
                staff += "\n- Espresso";
            }

            if (hasHotWater) {
                staff += "\n- Hot Water";
            }

            if(hasFoam){
                staff += "\n- Foam";
            }

            if(hasSteamedMilk){
                staff += "\n- Steamed Milk";
            }

            staff += espressoOz > 0 ? "\n- " + espressoOz + "oz Espresso" : "";

            System.out.println(staff);
        }
    }
}
