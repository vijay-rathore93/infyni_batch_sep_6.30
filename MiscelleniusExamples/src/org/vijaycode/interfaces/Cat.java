package org.vijaycode.interfaces;

public class Cat implements Animal,Animal1{
    @Override
    public void eat() {
        System.out.println("Cat eating.......");
    }

    public void sound(){
        System.out.println("Cat Meow......");
    }

    @Override
    public void printLegsCont() {
        System.out.println("Cat has four legs....");
    }
}
