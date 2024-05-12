import java.util.Scanner;

/**
 * CustomiseException
 */
class RemockException extends Exception
{
    public RemockException(String msg)
    {
        super(msg);
    } 
}
public class CustomiseException 
{
    public void CheckingRating(int rating)
    {
        if(rating==1)
        {
            System.out.println("Pass");
        }
        else{
            try {
                throw new RemockException("Week in Coding");
            } catch (RemockException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Rating =");
        int n = sc.nextInt();
        CustomiseException ce = new CustomiseException();
        ce.CheckingRating(n);

        sc.close();
    }
}
