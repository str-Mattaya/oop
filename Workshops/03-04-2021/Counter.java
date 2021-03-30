public class Counter {

    private int num;
    private int initial;

    public Counter()
    {
        this(0);
    }

    public Counter(int initial)
    {
        this.initial = initial;
        this.num = initial;
    }

    public Counter add(int num)
    {
        this.num += num;
        return this;
    }

    public Counter reset()
    {
        this.num = this.initial;
        return this;
    }

    public int getValue()
    {
        return this.num;
    }

    public int getInitialValue()
    {
        return this.initial;
    }

}