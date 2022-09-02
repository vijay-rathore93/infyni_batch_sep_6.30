package miscellaneousExamples.case6;

public class Test6 {

    public static void main(String[] args) {
      int result=m1();
      System.out.println("result:" + result);
    }
    private static int m1(){
        int a = 2;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
            System.out.println("Vijay calling...");
            System.out.println("c:" + c);
            return 1;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Error happened.." + nullPointerException.getMessage());
            return 2;
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Error happened.." + indexOutOfBoundsException.getMessage());
            return 3;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("=====arithmeticException=====");
            System.out.println("Error happened.." + arithmeticException.getMessage());
            return 4;
        }
        finally{
            System.out.println("finally block called....");
            return 5;
        }
  }
}
