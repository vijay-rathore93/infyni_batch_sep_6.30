package org.vijaycode.polymorphism.compileTime.case2;

public class Case2Test {

    public static void main(String[] args) {
        TestCase2 test=new TestCase2();
        test.m1(new Object());// object method call
        test.m1("Vijay");// String method call
        test.m1(null);// String method call
        test.m1(12);// Object method call
    }
}
//Byte--->short--->int--->long---> float---> double

// char--->int--->long---> float---> double