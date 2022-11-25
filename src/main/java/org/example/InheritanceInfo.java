package org.example;

public class InheritanceInfo {
    public static void main(String[] args){
        Dog dog1 = new Dog();  //parent class object can refer to child class object
        dog1.name = "Pogo";
        dog1.hairColor = "Brown";
        System.out.println((dog1.getAnimalinfo()));
    }
}
