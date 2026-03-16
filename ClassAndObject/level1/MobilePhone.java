package gla.com.ClassAndObject.level1;

class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

class Main {
    public static void main(String[] args) {

        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 75000);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 90000);

        System.out.println("Phone 1 Details:");
        phone1.displayDetails();

        System.out.println();

        System.out.println("Phone 2 Details:");
        phone2.displayDetails();
    }
}
