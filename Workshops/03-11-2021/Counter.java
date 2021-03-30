public class Counter {

    private int value;

    public Counter()
    {
        this.value = 0;
    }

    public Counter increase(int i)
    {
        this.value += i;
        return this;
    }

    public int getValue()
    {
        return this.value;
    }

    public Counter reset()
    {
        this.value = 0;
        return this;
    }

}
