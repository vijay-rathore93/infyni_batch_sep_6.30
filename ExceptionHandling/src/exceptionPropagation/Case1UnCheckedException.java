package exceptionPropagation;

public class Case1UnCheckedException {

    public static void main(String[] args) {
        Test test=new Test();
       // test.p();  ?
    }
}


class Test {
    /*void m() {
        System.out.println(" method m called");
        int data = 50 / 0;
    }

    void n() {
        System.out.println(" method n called");
        m();  //call2  m()
    }

    void p() {
        try {
            System.out.println(" method P called");
            n();// call 1  n()
        } catch (RuntimeException e) {
            System.out.println("exception handled in method P unchecked Exception");
        }
    }*/
}