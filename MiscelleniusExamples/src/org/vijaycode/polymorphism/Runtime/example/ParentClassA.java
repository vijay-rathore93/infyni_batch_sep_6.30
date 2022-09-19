package org.vijaycode.polymorphism.Runtime.example;

public class ParentClassA {

    private  String  VARIBLE;

    public void m1(ParentClassA a){
       // System.out.println(a.VARIBLE);
        System.out.println("+" +
                "+++++ class A+++++++++++++++++++++++");
    }

    public void m2(Integer a,Integer b,Integer c){
        System.out.println("++++++ class A with 3 arguments+++++++++++++++++++++++");
    }

    public String getVARIBLE() {
        return VARIBLE;
    }

    public void setVARIBLE(String VARIBLE) {
        this.VARIBLE = VARIBLE;
    }
}
