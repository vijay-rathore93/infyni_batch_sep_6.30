package org.vijaycode.polymorphism.compileTime.case6;

public class Animal {}
class Monkey extends Animal{}
//Animal animal=new Monkey();
class Test {
    public void m1(Animal animal) {
        System.out.println("Animal version");
    }
    public void m1(Monkey monkey) {
        System.out.println("Monkey version");
    }
}
class TestAnimal {
    public static void main(String[] args) {
        Test test=new Test();
        Animal animal=new Animal();
        test.m1(animal);// Animal version
        Monkey monkey=new Monkey();
        test.m1(monkey); // Monkey version
        Animal animal1=new Monkey();
        test.m1(animal1);  //Animal version
    }
}
