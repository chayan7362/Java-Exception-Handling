package Thread_Problems;

public class ThreadClass extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    { 
        // Create object  // Tread
        ThreadClass tc = new ThreadClass();
        tc.start();
    }
}
