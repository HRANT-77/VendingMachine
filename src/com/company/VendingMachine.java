package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class VendingMachine {
    private static HashMap<ProductType, ArrayList<LinkedList<Product>>> hashMap;
    public static void builder() {
        hashMap = new HashMap<>();
        //region Adding Products
        ArrayList<LinkedList<Product>> arrayList = new ArrayList<>();
        LinkedList<Product> products = new LinkedList<>();
        for(int i = 0; i<10; i++) {
            products.add(new Pepsi());
        }
        arrayList.add(products);

        products = new LinkedList<>();

        for(int i = 0; i<10; i++) {
            products.add(new Fanta());
        }
        arrayList.add(products);

        products = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            products.add(new Sprite());
        }
        arrayList.add(products);
        hashMap.put(ProductType.DRINKS, arrayList);

        arrayList = new ArrayList<>();
        products = new LinkedList<>();
        for(int i = 0; i<10; i++){
            products.add(new Lays());
        }
        arrayList.add(products);
        products = new LinkedList<>();
        for(int i = 0; i<10; i++){
            products.add(new Doritos());
        }
        arrayList.add(products);
        products = new LinkedList<>();
        for(int i = 0; i<10; i++){
            products.add(new Pringles());
        }
        arrayList.add(products);
        hashMap.put(ProductType.CHIPS, arrayList);

        arrayList = new ArrayList<>();
        products = new LinkedList<>();
        for(int i = 0; i<10; i++){
            products.add(new Snickers());
        }
        arrayList.add(products);
        products = new LinkedList<>();
        for(int i = 0; i<10; i++){
            products.add(new Mars());
        }
        arrayList.add(products);
        products = new LinkedList<>();
        for(int i = 0; i<10; i++){
            products.add(new Twix());
        }
        arrayList.add(products);
        hashMap.put(ProductType.BAR, arrayList);
        //endregion
    }
    public static ArrayList<Product> getProduct(Command command) {
        if(command == null)
            return null;
        ArrayList<Product> products = new ArrayList<>();
        builder();
        if(command.getProdType()>=1 && command.getProdType()<=3) {
            if (command.getQuantity() <= hashMap.get(command.getProductType()).get(command.getProdType() - 1).size()) {
                for (int i = 0; i < command.getQuantity(); i++)
                    products.add(hashMap.get(command.getProductType()).get(command.getProdType() - 1).poll());
            }
            else {
                System.out.println("Required quantity is not contain in Vending Machine");
                System.out.println("You can order "+hashMap.get(command.getProductType()).get(command.getProdType() - 1).size()+" pieces");
            }
        }
        else {
            System.out.println("The wrong  number ");
        }
        return products;
    }
}