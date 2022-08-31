package org.vijaycode.polymorphism.compileTime.case3;

public class Case3Test {

    public void m1(String a){
        System.out.println("String parameter");
    }

    public void m1(StringBuffer  a){
        System.out.println("StringBuffer parameter");
    }
}

class TestNew{
    public static void main(String[] args) {
      Case3Test test=new Case3Test();
        test.m1("Vijay");// String parameter
        test.m1(new StringBuffer("test"));//StringBuffer parameter
       //test.m1(null);// compilation error (ambiguity)
    }
}
