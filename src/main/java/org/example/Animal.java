package org.example;

abstract  class Animal{
    abstract String getVoice();

}
class Dog extends Animal{
    public String getVoice(){
        return "BhoBho";
    }
}
