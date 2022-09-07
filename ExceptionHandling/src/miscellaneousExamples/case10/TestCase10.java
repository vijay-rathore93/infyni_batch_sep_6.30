package miscellaneousExamples.case10;

public class TestCase10 {

   public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        m3();
    }

    public static void m3() throws RuntimeException{
        System.out.println("FileNot Found");
    }
}
