package miscellaneousExamples.case3;

public class Test3 {

    public static void main(String[] args) {
        int a=2;
        int b=0;
        int c = 0;
        try {
             c = a / b;
        }
        catch(NullPointerException nullPointerException){
            System.out.println("Error happened.."+nullPointerException.getMessage());
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("Error happened.."+indexOutOfBoundsException.getMessage());
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("Error happened.."+arithmeticException.getMessage());
        }

        System.out.println("Vijay calling...");
        System.out.println("c:"+c);
    }
}
