class DemoThread extends Thread 
{
    @Override
    public void run()
    {
        System.out.println("Hello from Thread");
    }
}

class DemoRunnable implements Runnable 
{
    @Override
    public void run()
    {
        System.out.println("Hello from Runnable");
    }
}

public class Simple {

    public static void main(String[] args)
    {
        // thread
        DemoThread thread = new DemoThread();

        // runnable
        DemoRunnable runnable = new DemoRunnable();
        Thread runThread = new Thread(runnable);

        thread.start();
        runThread.start();
    }

}