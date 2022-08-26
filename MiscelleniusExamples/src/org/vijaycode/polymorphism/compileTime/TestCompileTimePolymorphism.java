package org.vijaycode.polymorphism.compileTime;

public class TestCompileTimePolymorphism {

    public static void main(String[] args) {

        CompileTimePolymorphism compileTimePolymorphism=new CompileTimePolymorphism();
        compileTimePolymorphism.m1();
        compileTimePolymorphism.m1(1,2.8F);
        compileTimePolymorphism.m1(1.1F,2);
    }
}
