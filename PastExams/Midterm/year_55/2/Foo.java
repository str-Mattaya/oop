class Counter {

    private int num;
    private int initial;

    public Counter(int num)
    {
        this.num =  num;
        this.initial = num;
    }

    public void reset()
    {
        this.num = this.initial;
    }

    public void count()
    {
        num += 1;
    }

    public int getValue()
    {
        return this.num;
    }

    public int getThenCount()
    {
        return this.num++;
    }

    public int countThenGet()
    {
        return ++this.num;
    }
}

public class Foo {
    public static void main(String args[])
    {
        Counter c = new Counter(5);
        c.count();
        System.out.println(c.getValue());
        System.out.println(c.getThenCount());
        System.out.println(c.countThenGet());
        c.reset();
        System.out.println(c.getValue());
    }
}