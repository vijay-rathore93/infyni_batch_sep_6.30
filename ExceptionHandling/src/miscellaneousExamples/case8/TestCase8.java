package miscellaneousExamples.case8;

import java.io.FileNotFoundException;
import java.io.IOException;


public class TestCase8 {

    public static void main(String[] args) {
        try {
            m1();
        } catch (IOException e) {
            System.out.println("Handled Exception");
        }
    }
    //IOException is parent of FileNotFoundException
    public static void m1() throws IOException {
        m2();
    }

    public static void m2() throws IOException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
        throw new FileNotFoundException("FileNot Found");
    }
}
