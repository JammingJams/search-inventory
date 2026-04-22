package com.pluralsight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;



    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public float getPrice() {return this.price;}

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setPrice(float price) {this.price = price;}

    public String getInventory() {

        List<Product> inventoryList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;

            while((line = bufReader.readLine()) != null) {

                String[] tempArray = line.split("\\|");

                Product inventory = new Product(id, name, price);

                //try {
                //    inventory.set
                //}
                //catch (NumberFormatException)

            }
        }
        catch (IOException e) {

        }
        return "";
    }

}
