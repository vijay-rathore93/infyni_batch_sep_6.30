package exceptionPropagation;

public class Case2UnCheckedException {
    public static void main(String[] args) {
        Test2 test=new Test2();
        // test.p();  ?
    }
}

class Test2 {
    /*void m() {
        throw new java.io.IOException("device error");//checked exception
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }*/
}
