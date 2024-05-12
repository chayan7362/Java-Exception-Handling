package Thread_Synchronization;


// Thread Synchronized using Synchronized Blocks

class Task  
{
    public void PrintNum1() 
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("PrintNum1 = "+i);
        }
    }
    public void printNum2()
    {
        for(int i=5;i>=1;i--)
        {
            System.out.println("PrintNum2 = "+i);
        }
    }
}

class ThreadOne extends Thread
{
    Task t1;
    public ThreadOne(Task t1)
    {
      this.t1=t1;  
    }
    @Override
    public void run()
    {
        synchronized(t1){
            t1.PrintNum1();
        }
    }
}
class ThreadTwo extends Thread
{
    Task t1;
    public ThreadTwo(Task t1)
    {
        this.t1=t1;
    }
    @Override
    public void run()
    {
        synchronized(t1) {
        t1.printNum2();
        }
    }
}

public class SynchronizedBlocks {
    public static void main(String[] args) {
        Task Task = new Task();
        ThreadOne t1 = new ThreadOne(Task);
        t1.start();
        ThreadTwo t2 = new ThreadTwo(Task);
        t2.start();
    }
}
