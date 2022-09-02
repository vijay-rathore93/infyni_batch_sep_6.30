package miscellaneousExamples.case4;

public class Test4 {

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
        catch(ArithmeticException arithmeticException){//execute
            System.out.println("=====arithmeticException=====");
            System.out.println("Error happened.."+arithmeticException.getMessage());
        }
        catch(RuntimeException runtimeException){
            System.out.println("=====runtimeException=====");
            System.out.println("Error happened.."+runtimeException.getMessage());
        }
        catch(Exception exception){
            System.out.println("=====exception=====");
            System.out.println("Error happened.."+exception.getMessage());
        }

        System.out.println("Vijay calling...");
        System.out.println("c:"+c);
    }
}
