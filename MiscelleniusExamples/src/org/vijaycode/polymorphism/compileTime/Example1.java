package org.vijaycode.polymorphism.compileTime;

//in single file , we can not have two public classes,
// public class name within file must be same as file name.
public class Example1 {
    public  void m1(int x,int y){
        System.out.println("++++++2 parameter+++++++");
    }
    public  void m1(float x){
        System.out.println("++++++1 parameters with float type+++++++");
    }
    public  void m1(double x){
        System.out.println("++++++1 parameters with double type+++++++");
    }
    public  void m1(Double x){
        System.out.println("++++++1 parameters with double type wrapper+++++++");
    }
    public  void m1(Integer x,Integer y,Integer z){
        System.out.println("++++++3 parameters with wrapper+++++++");
    }

}



class ExampleTest{
    public static void main(String[] args) {
        Example1 example1=new Example1();
      //  example1.m1(1,2);
      //  example1.m1(1,2,3);
      //  example1.m1(new Integer(1),new Integer(2),new Integer(3));
      // example1.m1(2);

       // example1.m1(2.2);
       // example1.m1(2.2f);

        example1.m1(new Double(2.2));
    }
}
