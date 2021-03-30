public class SumThread implements Runnable {

    private int start;
    private int end;
    private Counter c;

    public SumThread(int start, int end, Counter c)
    {
        this.start = start;
        this.end = end;
        this.c = c;
    }

    @Override
    public void run()
    {
        for(int i = start; i <= end; i++)
        {
            synchronized(this.c)
            {
                this.c.add(i);
            }
        }
    }

}

class Counter
{

    private int sum;

    public Counter()
    {
        this.sum = 0;
    }

    public void add(int num)
    {
        this.sum += num;
    }

    public int getSum()
    {
        return this.sum;
    }
}
