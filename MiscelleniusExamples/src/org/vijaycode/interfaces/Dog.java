package org.vijaycode.interfaces;

public class Dog implements Animal,Animal1{
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    public void bark(){
        System.out.println("Dog barking......");
    }

    @Override
    public void printLegsCont() {
        System.out.println("Dog has four legs....");
    }

    @Override
    public void show() {

    }
}
