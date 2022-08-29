package org.vijaycode.polymorphism.compileTime.Case1;

public class Test{
    public void m1(int a){
        System.out.println("int parameter");
    }
    public void m1(float a){
        System.out.println("float parameter");
    }
}
 class TestMain{
     public static void main(String[] args) {
         Test test=new Test();
         /*test.m1(12);
         test.m1(12.5f);
         test.m1('a');
         test.m1(10l);
         test.m1(10.78);*/
     }

}