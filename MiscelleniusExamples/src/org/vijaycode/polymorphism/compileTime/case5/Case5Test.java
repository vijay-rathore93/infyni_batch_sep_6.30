package org.vijaycode.polymorphism.compileTime.case5;

public class Case5Test {
    public void m1(int i, float f) {
        System.out.println("int-float version");
    }


    public void m1(float i, int f) {
        System.out.println("float-int version");
    }
}

class Test5New {
    public static void main(String[] args) {
       /* Case5Test test=new Case5Test();
      test.m1(10,50.5f);
test.m1(50.5f,10);
test.m1(10,10);
test.m1(10.5f,10.5f);
     */
    }
}