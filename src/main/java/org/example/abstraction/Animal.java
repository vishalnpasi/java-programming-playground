package org.example.abstraction;

public abstract  class Animal{
    public int val = 0;
    public abstract String getVoice();
    abstract String getType();
    public void showType(){
        if(this instanceof Dog) {
            System.out.println("Type: Dog : val:"+val);
        }
        else{
            System.out.println("Type: Cat");

        }
    }
}


