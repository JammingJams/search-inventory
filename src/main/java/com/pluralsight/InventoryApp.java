package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
public class InventoryApp {
    public static void main(String[] args) {

        //Similarally this code isn't necessary because it calls on teh method

        /*ArrayList<Product> inventory = getInventory();*/


        System.out.println("We carry the following inventory: ");
        Product.getInventory();
        //This code isn't necessary because method does this function!

/*        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }*/
    }
    //I decided not to make the method in main but in a separate Classes is that fine?

/*    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        // this method loads product objects into inventory
        // and its details are not shown
        return inventory;
    }*/
}
