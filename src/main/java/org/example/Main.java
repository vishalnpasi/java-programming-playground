package org.example;


import org.example.abstraction.Animal;
import org.example.abstraction.Cat;
import org.example.abstraction.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java-Programming-playground");
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println("animal "+dog.getVoice());
        System.out.println("animal "+cat.getVoice());
        cat.showType();
        dog.showType();
    }
}