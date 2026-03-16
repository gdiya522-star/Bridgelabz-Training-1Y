package gla.com.ClassAndObject.level2;

import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
        System.out.println("Item added to cart.");
    }
    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

class ShoppingCartSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem cart = new CartItem();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        cart.addItem(name, price, quantity);

        System.out.println("\nCart Details:");
        cart.displayTotalCost();

        System.out.println("\nRemoving item from cart...");
        cart.removeItem();

        sc.close();
    }
}
