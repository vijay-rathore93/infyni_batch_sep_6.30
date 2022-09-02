package miscellaneousExamples.case1;

public class Test {

    public static void main(String[] args) {
        int a=2;
        int b=0;
        int c = 0;
        try {
             c = a / b;
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("Error happened.."+arithmeticException.getMessage());
        }

        System.out.println("Vijay calling...");
        System.out.println("c:"+c);
    }
}
