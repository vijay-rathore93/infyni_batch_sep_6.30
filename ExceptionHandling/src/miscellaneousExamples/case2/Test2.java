package miscellaneousExamples.case2;

public class Test2 {

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

        System.out.println("Vijay calling...");
        System.out.println("c:"+c);
    }
}
