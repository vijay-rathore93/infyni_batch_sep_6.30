package miscellaneousExamples.case9;


public class TestCase9 {

    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        m3();
    }

    public static void m3() {
        throw new RuntimeException("FileNot Found");
    }
}
