package org.vijaycode.interfaces;

public class Test {

    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.eat();
        dog.bark();
        dog.printLegsCont();
        System.out.println(dog.TYPE);

        Cat cat=new Cat();
        cat.eat();
        cat.sound();
        cat.printLegsCont();
        System.out.println(cat.TYPE);

    }


}
