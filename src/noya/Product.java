   package noya;

import java.util.Scanner;

public class Product {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Product ID", "Name", "Price", "Status", "TEP");
        
     
        Products[] products = new Products[100];
        int productCount = 0;

     
        Products pr1 = new Products();
        pr1.addprod(1011, "Soap", 20, 10, 200);
        pr1.viewprod();
        
        Products pr2 = new Products();
        pr2.addprod(1012, "Cards", 50, 0, 0);
        pr2.viewprod();

        System.out.println("Enter number of products: ");
        int nprod = getIntInput("Enter number of details: ");

        // Input details for each product
        for (int i = 0; i < nprod; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            int id = getIntInput("ID: ");
            String name = getStringInput("Name: ");
            int price = getIntInput("Price: ");
            int stock = getIntInput("Stock: ");
            int sold = getIntInput("Sold: ");
            
            Products product = new Products();
            product.addprod(id, name, price, stock, sold);
            products[productCount++] = product;
        }

       
        System.out.println("Product details:");
        System.out.printf("%-10s %-10s %-10s %-10s %-20s\n", "Product ID", "Name", "Price", "Stock", "Total");
        for (int i = 0; i < productCount; i++) {
            products[i].viewprod();
        }

        scanner.close();
    }

   
    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); 
        return scanner.nextLine();
    }
}

