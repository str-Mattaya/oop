public class TwoThread {

    public static void main(String[] args)
    {
        Counter c = new Counter();
        SumThread r1 = new SumThread(1, 1000, c);
        SumThread r2 = new SumThread(1001, 10000, c);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(c.getSum());
    }

}
