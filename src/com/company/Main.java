package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String order = scanner.nextLine();

            Command command = converter(order);
            ArrayList<Product> products = VendingMachine.getProduct(command);

            if (products == null) {
                System.out.println("Number of row  is wrong");
            }
            else if (products.size() > 0) {
                System.out.println(products.size());
                System.out.println(products);
            }
    }
    public static Command converter(String commandLine) {
        String [] splitCommandLine = commandLine.split(":",3);

        String column = splitCommandLine[0];
        int ProdType = Integer.parseInt(splitCommandLine[1]);
        int quantity = Integer.parseInt(splitCommandLine[2]);

        Command command;

        if(column.equals("A")) {
            command = new Command(ProductType.DRINKS, ProdType, quantity);
        }
        else if(column.equals("B")) {
            command = new Command(ProductType.CHIPS, ProdType, quantity);
        }
        else if(column.equals("C")) {
            command = new Command(ProductType.BAR, ProdType, quantity);
        }
        else {
            command = null;
        }
        return command;
    }
}