package gla.com.ClassAndObject.level1;

class Circle {

    double radius;


    double calculateArea() {
        return 3.14 * radius * radius;
    }
    double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.radius = 7;

        c1.display();
    }
}

