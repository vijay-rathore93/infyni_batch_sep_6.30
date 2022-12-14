package exceptionPropagation;

import java.io.IOException;

public class Case2UnCheckedException {
    public static void main(String[] args) {
        Test2 test=new Test2();
          test.p();  //..?
    }
}

class Test2 {
    void m() throws Exception {
        throw new java.io.IOException("device error");//checked exception
    }

    void n() throws Exception {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handle::"+e.getMessage());
        }
    }
}
