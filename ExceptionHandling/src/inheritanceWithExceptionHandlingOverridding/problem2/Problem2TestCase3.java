package inheritanceWithExceptionHandlingOverridding.problem2;


import java.io.IOException;

class Parent {

    public void method() throws IOException {
        System.out.println("Parent class");
    }
}
class Child extends Parent {

    public void method() {
        System.out.println("Child");
    }
}
public class Problem2TestCase3 {

    public static void main(String[] args) {
        //Parent p = new Parent();
        //p.method();
    }
}
