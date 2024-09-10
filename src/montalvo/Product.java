package montalvo;

import java.util.Scanner;

public class Product{
    
    public void manageProducts() {
        Scanner sc = new Scanner(System.in);
        Products[] productsArray = new Products[100];

        System.out.print("Enter number of products: ");
        int numProducts = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Stocks: ");
            int stocks = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            sc.nextLine(); 

            productsArray[i] = new Products();
            productsArray[i].addProducts(id, name, price, stocks, sold);
        }

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "NAME", "PRICE", "STOCKS", "SOLD", "PROFIT", "TOTAL VALUE", "STATUS");

        for (int i = 0; i < numProducts; i++) {
            productsArray[i].viewProducts();
        }

        sc.close();
    }
}