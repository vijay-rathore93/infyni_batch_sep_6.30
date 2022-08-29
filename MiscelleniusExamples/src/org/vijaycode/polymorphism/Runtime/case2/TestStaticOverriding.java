package org.vijaycode.polymorphism.Runtime.case2;

public class TestStaticOverriding {

    public static void main(String[] args) {
        ParentA parentA=new ParentA();
        parentA.m1();
        ChildA childA=new ChildA();
        childA.m1();
        ParentA parentA2=new ChildA();
        parentA2.m1();
    }
}
