package org.vijaycode.inheritance.hierarcical;

import org.vijaycode.inheritance.multilevel.Dog;

public class TestHierarcical {
    public static void main(String[] args) {

        System.out.println("Cat properties.....");
        Cat cat = new Cat();
        HierarcicalDog dog = new HierarcicalDog();

        cat.catSound();
        cat.eating();
        cat.sleeping();




        System.out.println("Dog properties.....");

        dog.dogSound();
        dog.eating();
        dog.sleeping();


    }
}
