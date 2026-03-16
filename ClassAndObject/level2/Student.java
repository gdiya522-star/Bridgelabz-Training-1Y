package gla.com.ClassAndObject.level2;

class Student {
    String name;
    int rollNumber;
    int marks;
    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Rahul";
        s1.rollNumber = 101;
        s1.marks = 82;

        s1.displayDetails();
    }
}
