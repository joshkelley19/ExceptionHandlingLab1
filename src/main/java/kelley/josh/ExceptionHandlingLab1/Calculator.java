package kelley.josh.ExceptionHandlingLab1;

/**
 * Created by joshuakelley on 9/30/16.
 */
public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int subtract(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int divide(int a,int b) throws DivisionByZeroException{
        if(b==0){
            throw new DivisionByZeroException();
        }
        return a/b;
    }
    public static double squareRoot(int a) throws ComplexNumberException {
        if(Math.sqrt(a)<0){
            throw new ComplexNumberException();
        }
        return Math.sqrt(a);
    }
}
