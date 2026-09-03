package com.assessment;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        String customerId = sc.nextLine();

        System.out.print("Enter Plan (Basic/Standard/Premium): ");
        String plan = sc.nextLine();

        System.out.print("Enter Data Usage (GB): ");
        double usage = sc.nextDouble();

        double planLimit = 0;
        double planRate = 0;
        double extraRate = 0;

        if (plan.equalsIgnoreCase("Basic")) {
            planLimit = 50;
            planRate = 499;
            extraRate = 10;
        } else if (plan.equalsIgnoreCase("Standard")) {
            planLimit = 100;
            planRate = 799;
            extraRate = 8;
        } else if (plan.equalsIgnoreCase("Premium")) {
            planLimit = 200;
            planRate = 1199;
            extraRate = 5;
        } else {
            System.out.println("Invalid Plan!");
            sc.close();
            return;
        }

        double extraCharge = 0;

        if (usage > planLimit) {
            double extraData = usage - planLimit;
            extraCharge = extraData * extraRate;
        }

        double totalBill = planRate + extraCharge;

        System.out.println("\n========== BILL DETAILS ==========");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Plan: " + plan);
        System.out.println("Data Usage: " + usage + " GB");
        System.out.println("Plan Limit: " + planLimit + " GB");
        System.out.println("Plan Charge: Rs." + planRate);
        System.out.println("Extra Usage Charge: Rs." + extraCharge);
        System.out.println("Total Monthly Bill: Rs." + totalBill);

        sc.close();
    }
}
