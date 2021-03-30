public class Consumer extends Thread {

    private Queue queue;

    public Consumer(Queue queue)
    {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while(true)
        {
            synchronized (queue)
            {
                if(queue.getNum() == null)
                {
                    try
                    {
                        queue.wait();
                    }
                    catch (InterruptedException exception) { }
                }

                // Queue's dequeue() function
                i = queue.getNum();
                queue.setNum(null);

                // notify Producer side
                queue.notify();
                System.out.println("Got: " + i);
                try { Thread.sleep(1000); } catch (InterruptedException exc) { }
            }
        }
    }
}
