package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java-Programming-playground");
        Animal animal = new Animal() {
            @Override
            String getVoice() {
                return "";
            }
        };
    }
}