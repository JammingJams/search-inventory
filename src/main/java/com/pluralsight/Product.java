package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private float price;
    public Product() {
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

    public static ArrayList<Product> getInventory() {

        List<Product> inventoryList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;

            while((line = bufReader.readLine()) != null) {

                String[] tempArray = line.split("\\|");

                Product inventory = new Product();

                try {
                    inventory.setId(Integer.parseInt(tempArray[0]));
                    inventory.setName(tempArray[1]);
                    inventory.setPrice((float) Double.parseDouble(tempArray[2]));


                }
                catch (NumberFormatException e) {e.printStackTrace();}

                inventoryList.add(inventory);
            }


            for(int x = 0; x < inventoryList.size(); x++ ) {
                System.out.printf("%d|%s|$%.2f\n",inventoryList.get(x).getId(), inventoryList.get(x).getName(), inventoryList.get(x).getPrice());
            }


        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return (ArrayList<Product>) inventoryList;
    }

}
