package org.vijaycode.polymorphism.compileTime;

public class CompileTimePolymorphism {

    public void m1(){
        System.out.println(" M1() printing.....");
    }

    public void m1(Integer a, Float b){
        System.out.println(" M1() printing with two argument.....");
    }


    public void m1(Float a, Integer b){
        System.out.println(" M1() printing with two argument.....");
    }
}
