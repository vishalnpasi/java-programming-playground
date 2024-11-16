package org.example.abstraction;

public class Dog extends Animal{
    public String getVoice(){
        return "BB";
    }
    @Override
    String getType() {
        return "";
    }
}
