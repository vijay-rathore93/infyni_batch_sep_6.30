package org.vijaycode.polymorphism.compileTime.case2;

public class Case2Test {

    public static void main(String[] args) {
        TestCase2 test=new TestCase2();
        test.m1(new Object());
        test.m1("Vijay");
        test.m1(null);
    }
}
