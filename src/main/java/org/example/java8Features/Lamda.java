package org.example.java8Features;

//Functionalities of Lambda Expression in Java
//Lambda Expressions implement the only abstract function and therefore implement functional interfaces lambda expressions are added in Java 8 and provide the below functionalities.
//
//Functional Interfaces: Lambda expressions implement single abstract methods of functional interfaces.
//Code as Data: Treat functionality as a method argument.
//Class Independence: Create functions without defining a class.
//Pass and Execute: Pass lambda expressions as objects and execute on demand.

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}
public class Lamda {
    public static void main(String []args) {
        FuncInterface obj = (int x) -> System.out.println("May Val:"+x);
        obj.abstractFun(10);
    }
}


