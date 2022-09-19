package org.vijaycode.polymorphism.Runtime.example;

public class Test {

    public static void main(String[] args) {

        ParentClassA a=new ParentClassA();
      // a.setVARIBLE("Test");
        //Reference of parent class can hold the object of child class , we call as upcasting.
        ParentClassA a1=new B();
        /* a.m1(a);//parent method
         a1.m1(a);
       a.m1(null);*/
      //  a1.m1(null);//child
     //  a=a1;
//
//        //a=1000
//       //a1=2000;
//
//
       // a.m1(null);//child
//


        //assignments
       a1.m2(1,2,4);






    }
}


//