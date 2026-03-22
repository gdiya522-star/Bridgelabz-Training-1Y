package com.gla.Inheritance;

class Animals {
    String name;
    int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animals {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animals {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animals {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animals[] animals = {
                new Dog("Tommy", 3),
                new Cat("Kitty", 2),
                new Bird("Tweety", 1)
        };

        for (Animals a : animals) {
            a.makeSound();
        }
    }
}
