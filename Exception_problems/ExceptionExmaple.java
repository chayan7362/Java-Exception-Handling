/**
 * ExceptionExmaple
 */
public class ExceptionExmaple {

    public static void test(int a) {
        try {
            int res=100/0;
            System.out.println(res);

        } 
        catch (ArithmeticException ae) 
        {
            ae.printStackTrace();
        }
    }
    public static void main(String[] args) {
        test(0);
        System.out.println("hello");
    }
}