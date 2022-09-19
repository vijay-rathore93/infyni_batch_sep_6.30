package org.vijaycode.polymorphism.Runtime.case3;

public class TestCase {

    public static void main(String[] args) {
        Case3Parent case3Parent=new Case3Parent();
        case3Parent.m1();  //parent method
        Child3Parent child3Parent =new Child3Parent();
        child3Parent.m1(); //child method
        Case3Parent reference=new Child3Parent();
        reference.m1(); //child method
    }
}
