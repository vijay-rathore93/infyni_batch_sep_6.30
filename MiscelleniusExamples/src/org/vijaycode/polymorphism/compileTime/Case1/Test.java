package org.vijaycode.polymorphism.compileTime.Case1;

public class Test{
    public void m1(int a){

      //  System.out.println(a);//ascii value

        System.out.println("int parameter");
    }
    public void m1(float a){
        System.out.println("float parameter");
    }
}

//Byte--->short--->int--->long---> float---> double

// char--->int--->long---> float---> double
class TestMain{
     public static void main(String[] args) {
         Test test=new Test();
         test.m1(12);// int parameter
         test.m1(12.5f); // float parameter
         test.m1('a'); // int parameter
         test.m1(10l); // float parameter
         /*test.m1(10.78);*/ //compilation...
     }

}