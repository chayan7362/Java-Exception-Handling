package Thread_Problems;

public class RunnableInterface implements Runnable
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
        RunnableInterface ri = new RunnableInterface();
        Thread t1 = new Thread(ri);
        t1.start();
    }
}
