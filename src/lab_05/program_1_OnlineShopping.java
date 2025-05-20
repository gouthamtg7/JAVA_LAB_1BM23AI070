package lab_05;

import java.util.Vector;
import java.util.Scanner;

class Product {
        String name;
        Double price;
        String category;
        public Product (String name, Double price, String category){
            this.name = name;
            this.price = price;
            this.category = category;
        }
}

class OnlineShopping{
    public static void main(String[] args) {
       Vector<Product> Inventory;
       Inventory = new Vector<Product>();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to Online Shopping Manager! ");
       System.out.println("Add or Remove a product from the inventory? ");
       String operation  = scanner.nextLine();
       switch(operation){
           case "add":
               System.out.println("Enter the product name: ");
               String name = scanner.nextLine();
               System.out.println("Enter the product price: ");
               Double price = scanner.nextDouble();
               System.out.println("Enter the product category: ");
               String category = scanner.nextLine();
               addProduct(name, price, category);
               break;
               case "remove":
                   System.out.println("Enter the product name: ");
                   String name1 = scanner.nextLine();
                   removeProduct(Inventory, name1);
                   break;
       }
       System.out.println("Products : ");
       for(Product product : Inventory){
           System.out.println(product);
       }






    }

    public static void addProduct(String name, double price, String category){
        Product newProduct = new Product(name, price, category);
    }

    public static void removeProduct(Vector<Product> Inventory, String name){
        for(int i = 0; i<Inventory.size();i++) {
            if (Inventory.get(i).name.equals(name)) {
                Inventory.remove(i);
                return;
            }
        }
    }
}