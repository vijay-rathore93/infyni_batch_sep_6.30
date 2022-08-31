package org.vijaycode.polymorphism.compileTime.case4;

public class Case4Test {

    public void m1(int a) {
        System.out.println("int parameter");
    }

    public void m1(int... a) {
        System.out.println(a);
        System.out.println("Var arg parameter");
    }

}

class Test4New {
    public static void main(String[] args) {
        Case4Test test=new Case4Test();
        test.m1();//var arg parameter
        test.m1(10,20,30);//var arg parameter
        test.m1(10); //int parameter(direct match)
    }
}

