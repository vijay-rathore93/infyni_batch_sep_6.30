package org.vijaycode.inheritance.multilevel;

public class TestMultilevel {

    public static void main(String[] args) {
        DogBaby dogBaby=new DogBaby();
        dogBaby.weep();//Dog baby method
        dogBaby.bark();//animal class method
        dogBaby.eat();// animal class method
        dogBaby.running();//Dog class method
    }
}
