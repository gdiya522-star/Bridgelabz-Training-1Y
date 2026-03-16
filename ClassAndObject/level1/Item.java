package gla.com.ClassAndObject.level1;

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

 class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Item item = new Item(code, name, price);

        System.out.println("\nItem Details:");
        item.displayDetails();

        double total = item.calculateTotalCost(quantity);
        System.out.println("Total Cost: " + total);

        sc.close();
    }
}
