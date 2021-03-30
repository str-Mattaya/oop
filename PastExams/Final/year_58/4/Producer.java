public class Producer extends Thread {

    private Queue queue;
    private int i;

    public Producer(Queue queue)
    {
        this.queue = queue;
        i = 1;
    }

    @Override
    public void run() {
        while(true)
        {
            synchronized (queue)
            {
                if(queue.getNum() != null)
                {
                    try
                    {
                        queue.wait();
                    }
                    catch (InterruptedException exception) { }
                }

                // Queue's enqueue(i) function
                queue.setNum(i);

                // notify Consumer side
                queue.notify();
                System.out.println("Put: " + i++);
                try { Thread.sleep(500); } catch (InterruptedException exc) { }
            }
        }
    }
}
