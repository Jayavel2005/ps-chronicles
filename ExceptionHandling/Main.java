package ExceptionHandling;

public class Main {
    static int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        try{
            System.out.println(divide(1,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Please type the input b as non zero value");
        }

    }
}
